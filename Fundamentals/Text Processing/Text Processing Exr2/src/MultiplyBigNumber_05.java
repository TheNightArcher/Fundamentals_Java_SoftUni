import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        BigInteger firstNumber = scanner.nextBigInteger();
        BigInteger secondNumber = scanner.nextBigInteger();


        BigInteger result = firstNumber.multiply(secondNumber);

        System.out.println(result);
    }
}
