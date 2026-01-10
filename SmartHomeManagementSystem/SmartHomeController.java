public class SmartHomeController {
    private Device[] deviceList;

    // 7.a Accepts device array as parameter
    public SmartHomeController(Device[] devices) {
        this.deviceList = devices;
    }

    // 7.b Method to turn ALL devices ON
    public void turnAllOn() {
        System.out.println("\n--- Turning ALL Devices ON ---");
        for (Device d : deviceList) {
            d.turnOn();
        }
    }

    // 7.b Method to turn ALL devices OFF
    public void turnAllOff() {
        System.out.println("\n--- Turning ALL Devices OFF ---");
        for (Device d : deviceList) {
            d.turnOff();
        }
    }
}