import java.util.Scanner;

public class Convert_M_to_Km_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int meters = Integer.parseInt(scanner.nextLine());

        double convertor = (double) meters / 1000;

        System.out.printf("%.2f",convertor);
    }
}
