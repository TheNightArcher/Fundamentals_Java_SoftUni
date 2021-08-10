import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        int getTheMidIndex = numbers.size() / 2;

        double leftRacerTime = 0;
        double rightRacerTime = 0;
        for (int i = 0; i < getTheMidIndex; i++) {

            if (numbers.get(i) == 0) {
                leftRacerTime *= 0.8;
            }else {
                leftRacerTime +=numbers.get(i);
            }

        }

        for (int i = numbers.size() - 1; i > getTheMidIndex; i--) {
            if (numbers.get(i) == 0) {
                rightRacerTime *= 0.8;
            }else {
                rightRacerTime +=numbers.get(i);
            }
        }

        if (leftRacerTime < rightRacerTime){
            System.out.printf("The winner is left with total time: %.1f",leftRacerTime);
        }else {
            System.out.printf("The winner is right with total time: %.2f",rightRacerTime);
        }

    }
}
