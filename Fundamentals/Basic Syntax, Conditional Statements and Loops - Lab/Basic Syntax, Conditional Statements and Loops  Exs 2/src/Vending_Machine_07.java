import java.util.Scanner;

public class Vending_Machine_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        double moneyInside = 0;


        while (!input.equals("Start")) {

            double money = Double.parseDouble(input);

            if (money == 2) {
                moneyInside += 2;
            } else if (money == 1) {
                moneyInside += 1;
            } else if (money == 0.5) {
                moneyInside += 0.50;
            } else if (money == 0.2) {
                moneyInside += 0.20;
            } else if (money == 0.1) {
                moneyInside += 0.10;
            } else {
                System.out.printf("Cannot accept %.2f%n", money);
            }

            input = scanner.nextLine();

        }

        input = scanner.nextLine();

        while (!input.equals("End")) {


            if ("Nuts".equals(input)) {
                if (moneyInside >= 2.0) {
                    moneyInside -= 2.0;
                    System.out.println("Purchased Nuts");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if ("Water".equals(input)) {
                if (moneyInside >= 0.70) {
                    moneyInside -= 0.70;
                    System.out.println("Purchased Water");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if ("Crisps".equals(input)) {
                if (moneyInside >= 1.50) {
                    moneyInside -= 1.50;
                    System.out.println("Purchased Crisps");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if ("Soda".equals(input)) {
                if (moneyInside >= 0.80) {
                    moneyInside -= 0.80;
                    System.out.println("Purchased Soda");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if ("Coke".equals(input)) {
                if (moneyInside >= 1.0) {
                    moneyInside -= 1.0;
                    System.out.println("Purchased Coke");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }

            input = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", moneyInside);

    }
}
