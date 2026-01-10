public class Device {
    // 1.a Attributes
    protected String deviceName;
    protected String status; // only accepts ON or OFF
    protected String location;

    // 3. Static variable to count devices
    static int deviceCount = 0;

    // 1.b Constructors
    // Default constructor
    public Device() {
        this.deviceName = "Unknown";
        this.status = "OFF";
        this.location = "Unknown";
        deviceCount++; // Increment count
    }

    // Parameterized constructor
    public Device(String deviceName, String status, String location) {
        this.deviceName = deviceName;
        // Simple validation for status
        if (status.equals("ON") || status.equals("OFF")) {
            this.status = status;
        } else {
            this.status = "OFF"; // Default to OFF if invalid
        }
        this.location = location;
        deviceCount++; // Increment count
    }

    // 1.c Methods
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

    // 3. Static method to display total devices
    public static void showDeviceCount() {
        System.out.println("Total Devices Created: " + deviceCount);
    }
}