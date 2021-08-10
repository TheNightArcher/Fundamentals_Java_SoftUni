import java.util.*;

public class HouseParty_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int numberOfPeoples = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();

        for (int i = 0; i < numberOfPeoples; i++) {

            String command = scanner.nextLine();

            String[] token = command.split("\\s+");

            String name = token[0];

            if (token[2].equals("going!")) {
                if (names.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    names.add(name);
                }
            } else if (token[2].equals("not")) {
                if (names.contains(name)) {
                    names.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }

        printList(names);
    }

    private static void printList(List<String> names) {

        for (String name : names  ) {
            System.out.println(name);
        }
    }
}
