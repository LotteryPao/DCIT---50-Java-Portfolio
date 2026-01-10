public class SmartHomeController {
    private Device[] deviceList;

   
    public SmartHomeController(Device[] devices) {
        this.deviceList = devices;
    }

    
    public void turnAllOn() {
        System.out.println("\n--- Turning ALL Devices ON ---");
        for (Device d : deviceList) {
            d.turnOn();
        }
    }

   
    public void turnAllOff() {
        System.out.println("\n--- Turning ALL Devices OFF ---");
        for (Device d : deviceList) {
            d.turnOff();
        }
    }

}
