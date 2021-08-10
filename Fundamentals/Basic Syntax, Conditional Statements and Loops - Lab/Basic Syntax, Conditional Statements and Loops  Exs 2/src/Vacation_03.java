import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfGroup = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        switch (typeGroup) {
            case "Students":
                if (day.equals("Friday")) {
                    price += 8.45;
                } else if (day.equals("Saturday")) {
                    price += 9.80;
                } else if (day.equals("Sunday")) {
                    price += 10.46;
                }

                if (numberOfGroup >= 30) {
                    price -= price * 0.15;
                }

                break;
            case "Business":

                if (numberOfGroup >= 100){
                    numberOfGroup -= 10;
                }
                if (day.equals("Friday")) {
                    price += 10.90;
                } else if (day.equals("Saturday")) {
                    price += 15.60;
                } else if (day.equals("Sunday")) {
                    price += 16;
                }
                break;
            case "Regular":
                if (day.equals("Friday")) {
                    price += 15;
                } else if (day.equals("Saturday")) {
                    price += 20;
                } else if (day.equals("Sunday")) {
                    price += 22.50;
                }

                if ( numberOfGroup >= 10 && numberOfGroup<= 20){
                    price -= price * 0.05;

                }
                break;
        }

        price *= numberOfGroup;

        System.out.printf("Total price: %.2f",price);
    }
}
