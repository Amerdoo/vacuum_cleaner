import java.util.Scanner;

public class Main {
    public static void menu(String[] options) {
        for (int i = 0; i < options.length ; i++){
            System.out.println(options[i]);
        }
        System.out.print("Choose action : ");
    }

    public static void main(String[] args) {
        String[] options = {
                "1. Turn On 1",
                "2. Clean 2",
                "3. Turn Off 3",
                "4. Get Statue 4",
                "5. Exit 5",
        };
        Scanner scanner = new Scanner(System.in);

        int option;
        RoboticVacuumCleaner roboticVacuumCleaner = new RoboticVacuumCleaner("iRobot Roomba 694",600,100);

        while (true){
            menu(options);
            option = scanner.nextInt();

            switch (option){
                case 1:
                    roboticVacuumCleaner.turnOn();
                    break;
                case 2:
                    roboticVacuumCleaner.clean();
                    break;
                case 3:
                    roboticVacuumCleaner.turnOff();
                    break;
                case 4:
                    System.out.println(roboticVacuumCleaner.getStatue());
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}