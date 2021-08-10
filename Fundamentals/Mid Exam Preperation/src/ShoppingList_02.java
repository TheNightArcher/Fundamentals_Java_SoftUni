import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> products = Arrays.stream(scanner.nextLine()
                .split("!")).collect(Collectors.toList());

        String input = scanner.nextLine();


        while (!input.equals("Go Shopping!")) {

            String[] commandDate = input.split("\\s+");
            String command = commandDate[0];
            String item = commandDate[1];

            switch (command) {

                case "Urgent":
                    if (!products.contains(item)) {
                        products.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    if (products.contains(item)) {
                        products.remove(item);
                    }
                    break;
                case "Correct":
                    String oldItem =commandDate[1];
                    String newItem = commandDate[2];
                    int index = products.indexOf(oldItem) + 1;
                    if (products.contains(oldItem)) {
                        products.add(index, newItem);
                        products.remove(oldItem);
                    }
                    break;
                case "Rearrange":
                    if (products.contains(item)) {
                        products.remove(item);
                        products.add(item);
                    }
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < products.size() - 1; i++) {
            System.out.print(products.get(i) + ", ");
        }
        System.out.print(products.get(products.size() - 1));
    }
}
