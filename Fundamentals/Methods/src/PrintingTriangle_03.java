import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printPyramid(number);
    }

    private static void printPyramid(int number) {
        printTopHalf(number);
        printBottomHalf(number);
    }

    private static void printTopHalf(int number) {

        for (int i = 1; i < number; i++) {
            singleLine(i);
        }
    }

    private static void singleLine (int length){
        for (int i = 1; i <= length ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printBottomHalf(int number) {
        for (int i = number; i >= 1 ; i--) {
            singleLine(i);
        }
    }
}
