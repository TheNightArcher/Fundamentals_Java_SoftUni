import java.util.Arrays;
import java.util.List;

import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<String> rooms = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        int health = 100;
        int coins = 0;
        int counterRoom = 0;
        boolean isAlive = true;

        for (String room : rooms) {

            counterRoom++;

            String[] commandDate = room.split("\\s+");

            String command = commandDate[0];
            int amount = Integer.parseInt(commandDate[1]);

            if (command.equals("potion")) {
                int currentHealth = health;
                health += amount;
                if (health > 100) {
                    health = 100;
                    int addedHealth = 100 - currentHealth;

                    System.out.printf("You healed for %d hp.%n", addedHealth);
                } else {
                    System.out.printf("You healed for %d hp.%n", amount);
                }
                System.out.printf("Current health: %d hp.%n", health);
            } else if (command.equals("chest")) {
                coins += amount;
                System.out.printf("You found %d bitcoins.%n", amount);
            } else {
                if (health > amount) {
                    System.out.printf("You slayed %s.%n", command);
                    health -= amount;
                } else {
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d", counterRoom);
                    isAlive = false;
                    break;
                }
            }
        }

        if (isAlive){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n",coins);
            System.out.printf("Health: %d",health);
        }
    }
}
