import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();


        while (!command.equals("End")) {

            String[] date = command.split("\\s+");

            String commandOperation = date[0];

            if (commandOperation.equals("Add")) {
                int addNumber = Integer.parseInt(date[1]);
                numbers.add(addNumber);
            } else if (commandOperation.equals("Insert")) {
                int insertNumber = Integer.parseInt(date[1]);
                int insertIndex = Integer.parseInt(date[2]);

                if (isValidIndex(insertIndex, numbers.size())) {
                    numbers.add(insertIndex, insertNumber);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (commandOperation.equals("Remove")) {
                int removedIndex = Integer.parseInt(date[1]);
                if (isValidIndex(removedIndex, numbers.size())) {
                    numbers.remove(removedIndex);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (commandOperation.equals("Shift")) {
                int countTimes = Integer.parseInt(date[2]);
                String typeShift = date[1];

                if (typeShift.equals("left")) {
                    shiftLeft(numbers, countTimes);
                } else if (typeShift.equals("right")) {
                    shiftRight(numbers, countTimes);
                }

            }


            command = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static boolean isValidIndex(int insertIndex, int size) {

        return insertIndex >= 0 && insertIndex <= size - 1;
    }

    private static void shiftLeft(List<Integer> numbers, int countTimes) {

        for (int i = 0; i < countTimes; i++) {

            int firstElement = numbers.get(0);
            numbers.add(firstElement);
            numbers.remove(0);

        }
    }

    private static void shiftRight(List<Integer> numbers, int countTimes) {

        for (int i = 0; i < countTimes; i++) {

            int lastElement = numbers.get(numbers.size() - 1);
            numbers.add(0, lastElement);
            numbers.remove(numbers.size() - 1);

        }
    }


}
