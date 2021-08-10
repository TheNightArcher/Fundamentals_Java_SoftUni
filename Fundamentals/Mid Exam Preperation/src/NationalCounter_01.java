import java.util.Scanner;

public class NationalCounter_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());
        int peoplesWait = Integer.parseInt(scanner.nextLine());

        int workForOneHour = firstEmployee + secondEmployee + thirdEmployee;

        int counterHour = 0;


        while (peoplesWait > 0) {

            counterHour++;
            if (counterHour % 4 == 0) {
                counterHour++;
            }

            peoplesWait -= workForOneHour;

        }

        System.out.printf("Time needed: %dh.",counterHour);
    }
}
