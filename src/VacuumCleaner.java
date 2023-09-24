public class VacuumCleaner {
    protected String model;
    private boolean isOn;
    protected double dustCapacity;

    public void turnOn(){
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }
    public String clean(){
        if (isOn == false){
            System.out.println("");
        }
        else {
            int i = 0;
            while (i <= 100) {
                System.out.println(i + "%");
                i++;
            }
            System.out.println("clean is Completed!");
        }
        return "clean is Completed!";
    }
}
