import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train01 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

            int maxPassengers = Integer.parseInt(scanner.nextLine());

            String input = scanner.nextLine();

            while (!input.equals("end")) {

                String[] date = input.split("\\s+");
                String nameDate = date[0];

                if (nameDate.equals("Add")) {
                    int addNumber = Integer.parseInt(date[1]);
                    numbers.add(addNumber);
                } else {
                    int passengers = Integer.parseInt(date[0]);
                    for (int i = 0; i < numbers.size(); i++) {

                        if (numbers.get(i) + passengers <= maxPassengers) {

                            int combineNumbers = numbers.get(i) + passengers;
                            numbers.set(i, combineNumbers);
                            break;
                        }
                    }
                }

                input = scanner.nextLine();
            }
        for (int number : numbers ) {
            System.out.print(number + " ");
        }

        }

}
