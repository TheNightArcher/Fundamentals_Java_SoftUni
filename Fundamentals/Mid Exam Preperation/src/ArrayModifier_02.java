
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();


        while (!input.equals("end")) {

            String[] commandDate = input.split(" ");
            String command = commandDate[0];

            if (command.equals("decrease")) {
                for (int i = 0; i < numbers.size(); i++) {

                    numbers.set(i, numbers.get(i) - 1);
                }

            }else {
                int firstIndex = Integer.parseInt(commandDate[1]);
                int secondIndex = Integer.parseInt(commandDate[2]);


                switch (command) {
                    case "swap":
                        int currentIndex = numbers.get(firstIndex);
                        numbers.set(firstIndex, numbers.get(secondIndex));
                        numbers.set(secondIndex, currentIndex);

                        break;
                    case "multiply":
                        int multiply = numbers.get(firstIndex) * numbers.get(secondIndex);
                        numbers.set(firstIndex, multiply);
                        break;
                }
            }


            input = scanner.nextLine();
        }

        for (int i = 0; i < numbers.size() - 1; i++) {

            System.out.print(numbers.get(i) + ", ");
        }
        for (int i = numbers.size() - 1; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
        }
    }
}
