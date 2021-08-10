import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());


        System.out.printf("%.2f", printFactorial(a) / printFactorial(b));
    }

    private static double printFactorial(double a) {

        double factor = 1;
        for (double i = a; i >= 1; i--) {

            factor *= i;
        }
        return factor;
    }

}
