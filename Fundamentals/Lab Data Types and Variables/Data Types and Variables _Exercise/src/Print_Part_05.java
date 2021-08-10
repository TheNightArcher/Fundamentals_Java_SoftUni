import java.util.Scanner;

public class Print_Part_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startingChar = Integer.parseInt(scanner.nextLine());
        int endingChar = Integer.parseInt(scanner.nextLine());

        for (int i = startingChar; i <=endingChar ; i++) {
            System.out.printf("%c ",i);
        }
    }
}
