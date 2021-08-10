import java.util.Scanner;

public class Sum_Digits_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int numbers = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (numbers > 0) {
            int lastDigit = numbers % 10;
            sum += lastDigit;
            numbers /= 10;
        }
        System.out.println(sum);
    }

}
