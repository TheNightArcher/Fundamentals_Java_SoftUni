import java.util.Scanner;

public class Triangle_of_Number_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        short n = Short.parseShort(scanner.nextLine());

        for (short i = 1; i <= n; i++) {

            for (short j = 1; j <= i ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


    }
}
