public class HandheldVacuumCleaner extends VacuumCleaner{
    private double cordLength;

    public HandheldVacuumCleaner (String model, double dustCapacity, double cordLength){
        this.model = model;
        this.dustCapacity = dustCapacity;
        this.cordLength = cordLength;

    }

    public double extendCord(double length){
        cordLength = length + cordLength;
        return cordLength;
    }
    public String getStatue(){
        return String.format("Model: '%s',DustCapacity: %f, CordLength: %f",model,dustCapacity,cordLength);
    }
}
