import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(" ");


        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();


        String firstString = input[0];
        String secondString = input[1];

        result1(firstString, first);
        result2(secondString, second);

        int sum = 0;

        if (first.size() >= second.size()) {
            for (int i = 0; i < first.size(); i++) {
                if (second.isEmpty()) {
                    sum += first.get(i);
                } else {
                    sum += first.get(i) * second.get(i);
                    first.remove(i);
                    second.remove(i);
                    i--;
                }
            }
        } else {
            for (int i = 0; i < second.size(); i++) {
                if (first.isEmpty()) {
                    sum += second.get(i);
                } else {
                    sum += first.get(i) * second.get(i);
                    first.remove(i);
                    second.remove(i);
                    i--;
                }
            }
        }

        System.out.println(sum);
    }

    private static void result1(String firstString, List<Integer> first) {

        for (char letter : firstString.toCharArray()) {
            first.add((int) letter);
        }
    }

    private static void result2(String secondString, List<Integer> second) {
        for (char letter : secondString.toCharArray()) {
            second.add((int) letter);
        }
    }
}

