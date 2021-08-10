import java.util.Scanner;

public class Padawan_Equipment_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       double amountOfMoney = Double.parseDouble(scanner.nextLine());
       int countOfStudents = Integer.parseInt(scanner.nextLine());
       double priceOfLightsbers = Double.parseDouble(scanner.nextLine());
       double priceOfRobs = Double.parseDouble(scanner.nextLine());
       double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double bonusLightbers = Math.ceil( countOfStudents + countOfStudents * 0.10) * priceOfLightsbers;

        int freeBelts = countOfStudents;
        for (int i = 1; i <= countOfStudents ; i++) {
            if (i % 6 == 0){

                freeBelts -= 1;
            }
        }
        double sumOfBelts = freeBelts * priceOfBelts;

        double totalSum = bonusLightbers  + sumOfBelts + (priceOfRobs * countOfStudents);

        if (amountOfMoney >= totalSum){
            System.out.printf("The money is enough - it would cost %.2flv.",totalSum);
        }else {
            double neededMoney = totalSum - amountOfMoney;
            System.out.printf("George Lucas will need %.2flv more.",neededMoney);
        }
    }
}
