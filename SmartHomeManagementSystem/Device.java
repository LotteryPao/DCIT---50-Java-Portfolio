public class Device {
   
    protected String deviceName;
    protected String status; 
    protected String location;

    
    static int deviceCount = 0;

   
    public Device() {
        this.deviceName = "Unknown";
        this.status = "OFF";
        this.location = "Unknown";
        deviceCount++; 

    
    public Device(String deviceName, String status, String location) {
        this.deviceName = deviceName;
        
        if (status.equals("ON") || status.equals("OFF")) {
            this.status = status;
        } else {
            this.status = "OFF"; 
        }
        this.location = location;
        deviceCount++; 
    }

    
    public void turnOn() {
        this.status = "ON";
        System.out.println(deviceName + " is now ON.");
    }

    public void turnOff() {
        this.status = "OFF";
        System.out.println(deviceName + " is now OFF.");
    }

    public void displayInfo() {
        System.out.println("Device Name: " + deviceName);
        System.out.println("Status: " + status);
        System.out.println("Location: " + location);
    }

    
    public static void showDeviceCount() {
        System.out.println("Total Devices Created: " + deviceCount);
    }

}
