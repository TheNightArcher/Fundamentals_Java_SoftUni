import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        while ( 0 < firstDeck.size() &&  0 < secondDeck.size() ){



            if (firstDeck.get(0) > secondDeck.get(0)){
                firstDeck.add(firstDeck.get(0));
                firstDeck.remove(0);

                firstDeck.add(secondDeck.get(0));
                secondDeck.remove(0);
            }else if (secondDeck.get(0) > firstDeck.get(0)){
                secondDeck.add(secondDeck.get(0));
                secondDeck.remove(0);

                secondDeck.add(firstDeck.get(0));
                firstDeck.remove(0);
            }else {
                firstDeck.remove(0);
                secondDeck.remove(0);
            }
        }

        int sum = 0;
        if (firstDeck.size() > secondDeck.size()){
            for (int number: firstDeck) {
                sum += number;
            }
            System.out.printf("First player wins! Sum: %d",sum);
        }else {
            for (int number: secondDeck) {
                sum += number;
            }
            System.out.printf("Second player wins! Sum: %d",sum);
        }
    }

}
