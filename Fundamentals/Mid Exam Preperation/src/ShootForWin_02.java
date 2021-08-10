import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForWin_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Integer> targets = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        String command = scanner.nextLine();
        int counter = 0;

        while (!command.equals("End")) {

            int index = Integer.parseInt(command);

            if (index <= targets.size() - 1) {
                int getValue = targets.get(index);

                for (int i = 0; i < targets.size(); i++) {

                    if (targets.get(i) > getValue) {
                        targets.set(i, targets.get(i) - getValue);
                    } else {
                        if (targets.get(i) == -1) {
                            continue;
                        }
                        targets.set(i, targets.get(i) + getValue);
                    }

                }
                targets.set(index, -1);
                counter++;
            }


            command = scanner.nextLine();
        }

        StringBuilder print = new StringBuilder();

        for (int i : targets) {
            print.append(i).append(" ");
        }


        System.out.print("Shot targets: " + counter + " " + "-> " + print);

    }


}
