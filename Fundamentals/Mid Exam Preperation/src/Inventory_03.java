import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_03 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        List<String> items = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());


        String input = scanner.nextLine();


        while (!input.equals("Craft!")) {

            String[] commandDate = input.split(" - ");
            String command = commandDate[0];
            String elements = commandDate[1];


            switch (command) {
                case "Collect":

                    if (items.contains(elements)) {
                        break;
                    } else {
                        items.add(elements);
                    }
                    break;
                case "Drop":
                    if (items.contains(elements)) {
                        items.remove(elements);
                    } else {
                        break;
                    }
                    break;
                case "Combine Items":
                    String oldItem = elements.split(":")[0];
                    String newItem = elements.split(":")[1];


                    if (items.contains(oldItem)) {

                      int index = items.indexOf(oldItem)+ 1;
                        items.add(index,newItem);
                    } else {
                        break;
                    }
                    break;
                case "Renew":
                   if (items.contains(elements)){
                       items.remove(elements);
                       items.add(elements);
                   }
                    break;
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < items.size() - 1; i++) {

            System.out.print(items.get(i) + ", ");
        }
        System.out.print(items.get(items.size() - 1));
    }
}
