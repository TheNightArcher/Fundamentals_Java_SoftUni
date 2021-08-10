import java.util.Scanner;

public class Refactor_Volume_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double lenght = Double.parseDouble(scanner.nextLine());
        double  width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double totalVolume = (lenght * width * height) / 3;

        System.out.printf("Length: Width: Height: Pyramid Volume: %.2f",totalVolume);




    }
}
