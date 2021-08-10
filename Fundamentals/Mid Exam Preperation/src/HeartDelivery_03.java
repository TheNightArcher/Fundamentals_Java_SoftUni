import java.util.Arrays;
import java.util.Scanner;


public class HeartDelivery_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] houses = Arrays.stream(scanner.nextLine()
                .split("@")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        int currentHouse = 0;
        boolean isMadeIt = true;

        while (!input.equals("Love!")) {

            String[] commandDate = input.split("\\s+");

            int jump = Integer.parseInt(commandDate[1]);

            currentHouse += jump;

            if (currentHouse >= houses.length) {
                currentHouse = 0;
            }
            if (houses[currentHouse] != 0) {
                houses[currentHouse] -= 2;

                if (houses[currentHouse] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", currentHouse);
                }
            } else {
                System.out.printf("Place %d already had Valentine's day.%n", currentHouse);
            }
            input = scanner.nextLine();

        }

        System.out.printf("Cupid's last position was %d.%n", currentHouse);

        for (int house : houses) {
            if (house != 0) {
                isMadeIt = false;
                break;
            }
        }

        int counterLeft = 0;

        for (int house : houses) {

            if (house > 0) {
                counterLeft++;
            }
        }
        if (isMadeIt) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.%n", counterLeft);
        }
    }
}
