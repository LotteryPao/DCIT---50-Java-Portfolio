public class Thermostat extends Device {
    // 2.b.i Additional Attributes
    private double temperature;
    private String mode; // "cooling", "heating"

    // Constructor (Not explicitly asked for separate overloading in 2, but needed to make object)
    public Thermostat(String deviceName, String status, String location, double temperature, String mode) {
        super(deviceName, status, location);
        this.temperature = temperature;
        this.mode = mode;
    }

    // 2.b.ii Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Temperature: " + temperature + "C");
        System.out.println("Mode: " + mode);
        System.out.println("-------------------------");
    }

    // 5.a Overloaded setTemperature (accepts double temp)
    public void setTemperature(double temp) {
        this.temperature = temp;
        System.out.println(deviceName + " temperature set to " + temp + "C.");
    }

    // 5.b Overloaded setTemperature (accepts double temp and String mode)
    public void setTemperature(double temp, String mode) {
        this.temperature = temp;
        this.mode = mode;
        System.out.println(deviceName + " temperature set to " + temp + "C and mode to " + mode + ".");
    }
}