import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();


        while (!input.equals("end")) {

            String[] date = input.split("\\s+");

            String nameDate = date[0];

            if (nameDate.equals("Delete")) {
                int deletedNumber = Integer.parseInt(date[1]);
                numbers.removeIf(x -> x == deletedNumber);

            } else if (nameDate.equals("Insert")) {
                int insertNumber = Integer.parseInt(date[1]);
                int insertIndex = Integer.parseInt(date[2]);

                numbers.add(insertIndex, insertNumber);
            }

            input = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }

}
