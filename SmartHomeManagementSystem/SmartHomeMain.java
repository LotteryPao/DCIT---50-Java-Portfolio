public class SmartHomeMain {
    public static void main(String[] args) {
        System.out.println("=== Smartify PH System Start ===\n");

        // 6.a Create 1 instance of LightBulb and 2 instances of Thermostat
        // Using the different constructors we made
        LightBulb bulb1 = new LightBulb("Living Room Light", "Living Room"); // Uses the 4.b constructor
        Thermostat thermo1 = new Thermostat("Master AC", "OFF", "Master Bedroom", 24.0, "cooling");
        Thermostat thermo2 = new Thermostat("Heater 1", "ON", "Bathroom", 30.0, "heating");

        // 6.b Create an array of devices
        Device[] myDevices = {bulb1, thermo1, thermo2};

        // Display static count (Req 3)
        Device.showDeviceCount(); 
        System.out.println("-------------------------");

        // 6.b Iterate through devices and display info
        System.out.println("Displaying Device Information:");
        for (int i = 0; i < myDevices.length; i++) {
            myDevices[i].displayInfo();
        }

        // Testing specific methods (Optional but good for checking logic)
        bulb1.adjustBrightness(75);
        thermo1.setTemperature(18.0);
        thermo2.setTemperature(22.0, "cooling");

        // 7. Using the SmartHomeController
        SmartHomeController controller = new SmartHomeController(myDevices);
        
        // Turn everything ON
        controller.turnAllOn();
        
        // Show status update
        System.out.println("\nUpdated Status:");
        for(Device d : myDevices) {
            d.displayInfo();
        }
    }
}