import java.util.ArrayList;
import java.util.List;

abstract class Device {
    private boolean isPoweredOn;
    private String deviceName;

    public Device(String deviceName) {
        this.deviceName = deviceName;
        this.isPoweredOn = false;
    }

    public void turnOn() {
        this.isPoweredOn = true;
        System.out.println(deviceName + " is now ON.");
        showStatus();
    }

    public void turnOff() {
        this.isPoweredOn = false;
        System.out.println(deviceName + " is now OFF.");
    }

    public boolean isPoweredOn() {
        return isPoweredOn;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public abstract void showStatus();

    public static void manageAllDevices(List<Device> devices, boolean turnOn) {
        System.out.println("\n--- Master Control: Switching All Devices " + (turnOn ? "ON" : "OFF") + " ---");
        for (Device d : devices) {
            if (turnOn) {
                d.turnOn();
            } else {
                d.turnOff();
            }
        }
    }

    public static void countPoweredOnDevices(List<Device> devices) {
        int count = 0;
        for (Device d : devices) {
            if (d.isPoweredOn()) {
                count++;
            }
        }
        System.out.println("\n--- Status Report ---");
        System.out.println("Total devices currently powered ON: " + count);
    }
}

class AirConditioner extends Device {
    private int fanSpeed;
    private int temperature;

    public AirConditioner(int fanSpeed, int temperature) {
        super("Air Conditioner");
        this.fanSpeed = fanSpeed;
        this.temperature = temperature;
    }

    @Override
    public void showStatus() {
        if (isPoweredOn()) {
            System.out.println("  -> [Status] Fan Speed: " + fanSpeed + " | Temp: " + temperature + "°C");
        }
    }

    public void setDetails(int fanSpeed, int temperature) {
        this.fanSpeed = fanSpeed;
        this.temperature = temperature;
        if (isPoweredOn()) {
            System.out.println("  -> [Update] AC settings changed.");
            showStatus();
        }
    }
}

class LampShade extends Device {
    private int brightness;
    private String lightColor;

    public LampShade(int brightness, String lightColor) {
        super("Lamp Shade");
        this.brightness = brightness;
        this.lightColor = lightColor;
    }

    public LampShade(LampShade other) {
        super("Lamp Shade (Copy)");
        this.brightness = other.brightness;
        this.lightColor = other.lightColor;
    }

    @Override
    public void showStatus() {
        if (isPoweredOn()) {
            System.out.println("  -> [Status] Brightness: " + brightness + "% | Color: " + lightColor);
        }
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        if (isPoweredOn()) showStatus();
    }
}

class Television extends Device {
    private int channel;
    private int volume;

    public Television(int channel, int volume) {
        super("Television");
        this.channel = channel;
        this.volume = volume;
    }

    @Override
    public void showStatus() {
        if (isPoweredOn()) {
            System.out.println("  -> [Status] Channel: " + channel + " | Volume: " + volume + "%");
        }
    }

    public void setChannel(int channel) {
        this.channel = channel;
        if (isPoweredOn()) showStatus();
    }
}

class MicrowaveOven extends Device {
    private int timer;
    private int temperature;

    public MicrowaveOven() {
        super("Microwave Oven");
        this.timer = 0;
        this.temperature = 100;
    }

    @Override
    public void showStatus() {
        if (isPoweredOn()) {
            System.out.println("  -> [Status] Timer: " + timer + " mins | Temp: " + temperature + "°C");
        }
    }

    public void setTimer(int timer) {
        this.timer = timer;
        if (isPoweredOn()) showStatus();
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        
        Device ac = new AirConditioner(3, 24);
        LampShade lamp1 = new LampShade(100, "Yellow");
        LampShade lamp2 = new LampShade(lamp1);
        Device tv = new Television(1, 10);
        MicrowaveOven microwave = new MicrowaveOven();

        List<Device> smartDevices = new ArrayList<>();
        smartDevices.add(ac);
        smartDevices.add(lamp1);
        smartDevices.add(lamp2);
        smartDevices.add(tv);
        smartDevices.add(microwave);

        Device.manageAllDevices(smartDevices, true);
        Device.countPoweredOnDevices(smartDevices);

        System.out.println("\n--- Testing Individual Adjustments ---");
        if (ac instanceof AirConditioner) {
            ((AirConditioner) ac).setDetails(5, 18);
        }
        
        lamp1.setBrightness(50);

        Device.manageAllDevices(smartDevices, false);
        Device.countPoweredOnDevices(smartDevices);
    }
}