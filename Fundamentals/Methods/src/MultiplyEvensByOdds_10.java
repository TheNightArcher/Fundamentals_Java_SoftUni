import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

       int sum =  getMultiplyMethods(numbers);
        System.out.println(sum);
    }

    private static int getMultiplyMethods(int numbers) {
       int evenSum =  methodOfEvens(Math.abs(numbers));
       int oddsSum =  methodOfOdds(Math.abs(numbers));

        return  evenSum * oddsSum;
    }

    private static int methodOfEvens(int numbers) {
        int sum = 0;

        while (numbers > 0){

            int lastDigit = numbers % 10;

            if (lastDigit % 2 == 0){
                sum += lastDigit;
            }
            numbers /= 10;
        }
        return sum;
    }

    private static int methodOfOdds(int numbers) {
         int sum = 0;
        while (numbers > 0){

            int lastDigit = numbers % 10;

            if (lastDigit % 2 != 0){
                sum += lastDigit;
            }
            numbers /= 10;
        }
        return sum;
    }
}

