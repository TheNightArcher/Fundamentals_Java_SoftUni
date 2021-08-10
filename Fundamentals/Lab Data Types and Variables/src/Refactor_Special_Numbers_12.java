import java.util.Scanner;

public class Refactor_Special_Numbers_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbersWeHave = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;
        int currentNumber = 0;


        for (int i = 1; i <= numbersWeHave; i++) {
            currentNumber = i;
            while (i > 0) {
                totalSum += i % 10;
                i = i / 10;
            }
            i = currentNumber;
           if (totalSum == 5 || totalSum == 7 || totalSum == 11){
               System.out.printf("%d -> True%n", i);
           }else {
               System.out.printf("%d -> False%n", i);
           }
            totalSum = 0;

        }
    }
}
