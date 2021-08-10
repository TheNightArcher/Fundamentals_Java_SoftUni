import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double number = Double.parseDouble(scanner.nextLine());
        double pow = Double.parseDouble(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(Math.pow(number,pow)));
    }

}
