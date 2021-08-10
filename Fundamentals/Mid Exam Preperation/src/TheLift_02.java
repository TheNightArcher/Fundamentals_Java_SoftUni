
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peoplesWAit = Integer.parseInt(scanner.nextLine());

        List<Integer> lift = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        for (int i = 0; i < lift.size(); i++) {

            int peoplesInCabin = lift.get(i);
            int freeSpace = 4 - peoplesInCabin;


            if (peoplesInCabin == 4) {
                continue;
            }

            if (freeSpace >= peoplesWAit) {
                lift.set(i, peoplesWAit);
                peoplesWAit = 0;
                break;
            }

            lift.set(i, 4);
            peoplesWAit -= freeSpace;
        }

        boolean isFreeSpace = false;
        for (int peoples : lift) {
            if (peoples < 4) {
                isFreeSpace = true;
                break;
            }
        }

        if (isFreeSpace) {
            System.out.println("The lift has empty spots!");
        } else if (peoplesWAit != 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n",peoplesWAit);
        }

        for (int cabins : lift) {
            System.out.print(cabins + " ");
        }
    }
}
