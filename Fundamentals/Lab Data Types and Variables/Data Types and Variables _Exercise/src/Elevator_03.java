import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peoples = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int counterTimes = 0;

        while (peoples > 0) {
            peoples -= capacity;
            counterTimes++;
        }


        System.out.print(counterTimes);
    }
}
