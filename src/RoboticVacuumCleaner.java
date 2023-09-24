public class RoboticVacuumCleaner extends VacuumCleaner{
    private double batteryLevel;

    public RoboticVacuumCleaner (String model, double dustCapacity, double batteryLevel){
        this.model = model;
        this.dustCapacity = dustCapacity;
        this.batteryLevel = batteryLevel;

    }

    public double recharge() {
        while (batteryLevel <= 1.00) {
            batteryLevel = batteryLevel + 0.01;
        }
        return batteryLevel;
    }
    public String getStatue(){
        return String.format("Model: '%s',DustCapacity: %f, BatteryLevel: %f",model,dustCapacity,batteryLevel);
    }
}
