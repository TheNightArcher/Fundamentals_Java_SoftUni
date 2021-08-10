import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] date = input.split(" ");

            String nameDate = date[0];

            switch (nameDate) {
                case "Contains":
                    int containsNumber = Integer.parseInt(date[1]);

                    if (numbers.contains(containsNumber)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String type = date[1];
                    printNumbers(type, numbers);
                    break;
                case "Get":
                    int sum = 0;
                    for (int number : numbers) {
                        sum += number;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String operator = date[1];
                    int number = Integer.parseInt(date[2]);
                    findTheMethod(operator, number, numbers);
                    break;
            }


            input = scanner.nextLine();

        }
    }

    private static void printNumbers(String type, List<Integer> numbers) {

        if (type.equals("even")) {
            for (Integer number : numbers) {

                if (number % 2 == 0) {
                    System.out.print(number + " ");
                }
            }
            System.out.println();
        } else if (type.equals("odd")) {
            for (Integer number : numbers) {

                if (number % 2 != 0) {
                    System.out.print(number + " ");
                }
            }
            System.out.println();
        }
    }

    private static void findTheMethod(String operator, int number, List<Integer> numbers) {

        String outFilter = "";
        switch (operator) {
            case "<":
                for (int currentNumber : numbers) {
                    if (currentNumber < number) {
                        System.out.print(currentNumber + " ");
                    }
                }
                break;
            case ">":
                for (int currentNumber : numbers) {
                    if (currentNumber > number) {
                        System.out.print(currentNumber + " ");
                    }
                }
                break;
            case "<=":
                for (int currentNumber : numbers) {
                    if (currentNumber <= number) {
                        System.out.print(currentNumber + " ");
                    }
                }
                break;
            case ">=":
                for (int currentNumber : numbers) {
                    if (currentNumber >= number) {
                        System.out.print(currentNumber + " ");
                    }
                }
                break;
        }
        System.out.println(outFilter);
    }
}
