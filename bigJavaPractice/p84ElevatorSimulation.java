import java.util.Scanner;

public class p84ElevatorSimulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Floor number: ");
        // when putting the next, dont orget to put int double, etc -> nextInt
        int floor = scan.nextInt();

        // adjust floor, for people think floor 13 is bad luck

        int actualFloor;
        if (floor >= 13) {
            actualFloor = floor - 1;
        } else {
            actualFloor = floor;
        }

        System.out.println("The elevator will travel to the actual floor " + actualFloor);

        scan.close();
    }
}
