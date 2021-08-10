import java.util.Scanner;

public class CalculateArea_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double area = printTheArea(width,length);

        System.out.printf("%.0f",area);
    }

    private static double printTheArea(double width, double length) {
        return width * length;
    }
}
