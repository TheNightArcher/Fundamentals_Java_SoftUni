import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printNxN(number);
    }

    private static void printNxN(int number ){

        for (int i = 0; i < number; i++) {

            for (int j = 1; j < number; j++) {
                System.out.print(number + " ");
            }
            System.out.println(number);
        }
    }
}
