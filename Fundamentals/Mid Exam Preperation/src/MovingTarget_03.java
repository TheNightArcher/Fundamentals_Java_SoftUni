import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = scanner.nextLine();


        while (!input.equals("End")) {

            String[] commandDate = input.split("\\s+");

            String command = commandDate[0];
            int target = Integer.parseInt(commandDate[1]);
            int radius = Integer.parseInt(commandDate[2]);

            switch (command) {
                case "Shoot":
                    if (target < targets.size() && target>=0) {

                        if (targets.get(target) > radius) {
                            targets.set(target, targets.get(target) - radius);
                        } else {
                            targets.remove(target);
                        }
                    }
                    break;
                case "Add":
                    if (target < targets.size() && target>=0) {
                        targets.add(target, radius);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    if (!targets.isEmpty()) {
                        if (target - radius >= 0 && target +radius < targets.size()) {
                            int indexToRemove=target-radius;
                            for (int i = 0; i < 2*radius+1; i++) {
                                targets.remove(indexToRemove);
                            }
                        } else {
                            System.out.println("Strike missed!");

                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.print(targets.get(0));

        for (int i = 1; i < targets.size(); i++) {

            System.out.print("|" + targets.get(i));
        }
    }
}
