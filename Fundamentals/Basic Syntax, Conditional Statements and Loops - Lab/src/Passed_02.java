import java.util.Scanner;

public class Passed_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double garde = Double.parseDouble(scanner.nextLine());

        if (garde>= 3.00){
            System.out.print("Passed!");
        }
    }
}
