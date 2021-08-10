import java.util.Scanner;

public class Water_Overflow_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());

        int sumLiters = 0;
        int totalLiters = 0;

        for (int i = 0; i < times; i++) {

            int pourLiters = Integer.parseInt(scanner.nextLine());

            sumLiters += pourLiters;

            if (sumLiters <= 255) {
                totalLiters += pourLiters;
            } else {
                System.out.println("Insufficient capacity!");
                sumLiters -= pourLiters;
            }

        }
        System.out.println(totalLiters);
    }
}
