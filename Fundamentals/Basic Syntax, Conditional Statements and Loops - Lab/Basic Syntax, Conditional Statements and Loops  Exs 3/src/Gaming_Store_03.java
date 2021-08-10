import java.util.Scanner;

public class Gaming_Store_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());

        String game = "";
        double spend = 0;
        boolean isHere = false;

        if (money > 0) {
            double price = 0;
            String gamesName = scanner.nextLine();
            while (!gamesName.equals("Game Time") && money > 0) {

                if ("OutFall 4".equals(gamesName)) {
                    price = 39.99;
                    isHere = true;
                } else if ("CS: OG".equals(gamesName)) {
                    price = 15.99;
                    isHere = true;
                } else if ("Zplinter Zell".equals(gamesName)) {
                    price = 19.99;
                    isHere = true;
                } else if ("Honored 2".equals(gamesName)) {
                    price = 59.99;
                    isHere = true;
                } else if ("RoverWatch".equals(gamesName)) {
                    price = 29.99;
                    isHere = true;
                } else if ("RoverWatch Origins Edition".equals(gamesName)) {
                    price = 39.99;
                    isHere = true;
                }else {
                    isHere = false;
                }

                if (!isHere) {
                    System.out.println("Not Found ");
                } else if (price > money) {
                    System.out.println("Too Expensive");
                } else if (money <= 0) {
                    System.out.println("Out of money!");
                }else {
                    money -= price;
                    spend +=price;
                    System.out.printf("Bought %s%n",gamesName);
                }

                gamesName = scanner.nextLine();
            }
        }
        if (money <= 0){
            System.out.println("Out of money!");
        }else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",spend,money);
        }
    }
}
