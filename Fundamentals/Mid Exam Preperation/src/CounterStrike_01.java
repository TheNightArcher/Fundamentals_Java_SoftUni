import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        String distanceOfEnemy = scanner.nextLine();


        int counter = 0;
        boolean isEnd = true;
        while (!distanceOfEnemy.equals("End of battle")) {

            int currentDistance = Integer.parseInt(distanceOfEnemy);

            if (energy >= currentDistance) {
                energy -= currentDistance;
                counter++;

                if (counter % 3 == 0) {
                    energy += counter;
                }
            } else {
                isEnd = false;
                break;
            }
            distanceOfEnemy = scanner.nextLine();
        }

        if (isEnd){
            System.out.printf("Won battles: %d. Energy left: %d",counter,energy);
        }else {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",counter,energy);
        }
    }
}
