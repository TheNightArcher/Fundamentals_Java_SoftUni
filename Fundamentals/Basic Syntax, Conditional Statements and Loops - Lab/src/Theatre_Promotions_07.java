import java.util.Scanner;

public class Theatre_Promotions_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int agePerson = Integer.parseInt(scanner.nextLine());

        int price = -1;

        switch (typeOfDay) {

            case "Weekday":
                if (0 <= agePerson && agePerson <= 18) {
                    price = 12;
                } else if (18 < agePerson && agePerson <= 64) {
                    price = 18;
                } else if (64 < agePerson && agePerson <= 122) {
                    price = 12;
                }

                break;
            case "Weekend":
                if (0 <= agePerson && agePerson <= 18) {
                    price = 15;
                } else if (18 < agePerson && agePerson <= 64) {
                    price = 20;
                } else if (64 < agePerson && agePerson <= 122) {
                    price = 15;
                }
                break;
            case "Holiday":
                if (0 <= agePerson && agePerson <= 18) {
                    price = 5;
                } else if (18 < agePerson && agePerson <= 64) {
                    price = 12;
                } else if (64 < agePerson && agePerson <= 122) {
                    price = 10;
                }
                break;
        }

        if (price == -1) {
            System.out.println("Error!");

        } else {
            System.out.printf("%d$", price);
        }
    }
}
