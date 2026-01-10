public class LightBulb extends Device {
    
    private int brightnessLevel; 
    private String color;

    
    public LightBulb(String deviceName, String status, String location, int brightnessLevel, String color) {
        super(deviceName, status, location);
        this.brightnessLevel = brightnessLevel;
        this.color = color;
    }

    
    public LightBulb(String deviceName, String location) {
        super(deviceName, "OFF", location); 
        this.brightnessLevel = 50;
        this.color = "Warm White";
    }

    
    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Brightness: " + brightnessLevel + "%");
        System.out.println("Color: " + color);
        System.out.println("-------------------------");
    }

   
    public void adjustBrightness(int level) {
        if (level >= 0 && level <= 100) {
            this.brightnessLevel = level;
            System.out.println(deviceName + " brightness set to " + level + "%.");
        } else {
            System.out.println("Invalid brightness level. Must be 0-100.");
        }
    }
}


