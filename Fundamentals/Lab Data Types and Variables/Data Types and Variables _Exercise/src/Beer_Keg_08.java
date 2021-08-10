import java.util.Scanner;

public class Beer_Keg_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersOfKegs = Integer.parseInt(scanner.nextLine());

        String bigKegName = "";
        double maxKeg = Double.MIN_VALUE;

        for (int i = 0; i < numbersOfKegs; i++) {

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double radiusSum = Math.PI * Math.pow(radius,2) * height;


            if (radiusSum > maxKeg){
                maxKeg = radiusSum;
                bigKegName = model;
            }

        }
        System.out.println(bigKegName);

    }
}
