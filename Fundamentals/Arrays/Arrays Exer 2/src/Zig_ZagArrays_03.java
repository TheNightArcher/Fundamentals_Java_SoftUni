import java.util.Scanner;

public class Zig_ZagArrays_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[times];
        int[] array2 = new int[times];

        for (int i = 0; i < times; i++) {
            String numbers = scanner.nextLine();
            int firstNumber = Integer.parseInt(numbers.split(" ")[0]);
            int secondNumber = Integer.parseInt(numbers.split(" ")[1]);


            if ((i + 1) % 2 == 0) {
                array1[i] = secondNumber;
                array2[i] = firstNumber;
            } else {
                array1[i] = firstNumber;
                array2[i] = secondNumber;

            }
        }

        for (int holder : array1) {
            System.out.print(holder + " ");
        }
        System.out.println();
        for (int holder : array2) {
            System.out.print(holder + " ");
        }


    }
}
