
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonGo_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        int valueOfRemovedElements = 0;

        while (!numbers.isEmpty()) {

            int index = Integer.parseInt(scanner.nextLine());

            int indexToRemove;

            if (index < 0) {
                indexToRemove = numbers.remove(0);
                valueOfRemovedElements += indexToRemove;
                numbers.add(0, numbers.get(numbers.size() - 1));
            } else if (index > numbers.size() - 1) {
                indexToRemove = numbers.remove(numbers.size() - 1);
                numbers.add(numbers.get(0));
                valueOfRemovedElements += indexToRemove;
            } else {
                indexToRemove = numbers.remove(index);
                valueOfRemovedElements += indexToRemove;
            }

            for (int i = 0; i < numbers.size(); i++) {

                if (numbers.get(i) <= indexToRemove) {
                    numbers.set(i, numbers.get(i) + indexToRemove);
                } else {
                    numbers.set(i, numbers.get(i) - indexToRemove);
                }
            }
        }

        System.out.println(valueOfRemovedElements);

    }
}
