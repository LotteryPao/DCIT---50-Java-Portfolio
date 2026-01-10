public class LightBulb extends Device {
    // 2.a.i Additional Attributes
    private int brightnessLevel; // 0-100
    private String color;

    // 4.a Constructor with full parameters
    public LightBulb(String deviceName, String status, String location, int brightnessLevel, String color) {
        super(deviceName, status, location);
        this.brightnessLevel = brightnessLevel;
        this.color = color;
    }

    // 4.b Constructor with just Name and Location (defaults brightness to 50, color to Warm White)
    public LightBulb(String deviceName, String location) {
        super(deviceName, "OFF", location); // Default status usually OFF
        this.brightnessLevel = 50;
        this.color = "Warm White";
    }

    // 2.a.ii Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the parent method first
        System.out.println("Brightness: " + brightnessLevel + "%");
        System.out.println("Color: " + color);
        System.out.println("-------------------------");
    }

    // 2.a.iii Method to change brightness
    public void adjustBrightness(int level) {
        if (level >= 0 && level <= 100) {
            this.brightnessLevel = level;
            System.out.println(deviceName + " brightness set to " + level + "%.");
        } else {
            System.out.println("Invalid brightness level. Must be 0-100.");
        }
    }
}

