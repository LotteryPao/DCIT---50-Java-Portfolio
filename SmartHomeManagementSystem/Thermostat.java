public class Thermostat extends Device {
   
    private double temperature;
    private String mode; 

   
    public Thermostat(String deviceName, String status, String location, double temperature, String mode) {
        super(deviceName, status, location);
        this.temperature = temperature;
        this.mode = mode;
    }

    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Temperature: " + temperature + "C");
        System.out.println("Mode: " + mode);
        System.out.println("-------------------------");
    }

    
    public void setTemperature(double temp) {
        this.temperature = temp;
        System.out.println(deviceName + " temperature set to " + temp + "C.");
    }

   
    public void setTemperature(double temp, String mode) {
        this.temperature = temp;
        this.mode = mode;
        System.out.println(deviceName + " temperature set to " + temp + "C and mode to " + mode + ".");
    }

}
