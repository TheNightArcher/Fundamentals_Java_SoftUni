import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        int smallestNumbers = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < smallestNumbers; i++) {

            System.out.print(firstList.get(i) + " " + secondList.get(i) + " ");
        }

        printRest(firstList, smallestNumbers);
        printRest(secondList, smallestNumbers);
    }


    private static void printRest(List<Integer> list, int left) {
        for (int i = left; i < list.size(); i++) {

            System.out.print(list.get(i) + " ");
        }
    }
}
