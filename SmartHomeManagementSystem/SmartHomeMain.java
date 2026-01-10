public class SmartHomeMain {
    public static void main(String[] args) {
        System.out.println("=== Smartify PH System Start ===\n");

        
        LightBulb bulb1 = new LightBulb("Living Room Light", "Living Room"); // Uses the 4.b constructor
        Thermostat thermo1 = new Thermostat("Master AC", "OFF", "Master Bedroom", 24.0, "cooling");
        Thermostat thermo2 = new Thermostat("Heater 1", "ON", "Bathroom", 30.0, "heating");

       
        Device[] myDevices = {bulb1, thermo1, thermo2};

        
        Device.showDeviceCount(); 
        System.out.println("-------------------------");

        
        System.out.println("Displaying Device Information:");
        for (int i = 0; i < myDevices.length; i++) {
            myDevices[i].displayInfo();
        }

       
        bulb1.adjustBrightness(75);
        thermo1.setTemperature(18.0);
        thermo2.setTemperature(22.0, "cooling");

        
        SmartHomeController controller = new SmartHomeController(myDevices);
        
       
        controller.turnAllOn();
        
        
        System.out.println("\nUpdated Status:");
        for(Device d : myDevices) {
            d.displayInfo();
        }
    }

}
