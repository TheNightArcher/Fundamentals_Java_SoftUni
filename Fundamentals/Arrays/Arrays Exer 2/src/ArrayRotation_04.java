import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int rotations = Integer.parseInt(scanner.nextLine());

        String[] numbers = input.split(" ");

        for (int i = 0; i < rotations; i++) {

            String firstElement = numbers[0];


            for (int element = 0; element < numbers.length - 1; element++) {

                numbers[element] = numbers[element + 1];
            }

            numbers[numbers.length - 1]= firstElement;
        }
        System.out.println(String.join(" ",numbers));
    }
}
