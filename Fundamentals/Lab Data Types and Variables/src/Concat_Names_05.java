import java.util.Scanner;

public class Concat_Names_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in);

        char name = scanner.nextLine().charAt(0);
        char surname = scanner.nextLine().charAt(0);
        char something = scanner.nextLine().charAt(0);

        System.out.printf("%s%s%s",name,something,surname);
    }
}
