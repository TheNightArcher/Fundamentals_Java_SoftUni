import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<String> books = Arrays.stream(scanner.nextLine().split(" \\| "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Stop!")) {

            String[] commandDate = input.split("\\s+");
            String command = commandDate[0];
            String name = commandDate[1];


            switch (command) {
                case "Join":
                    if (!books.contains(name)) {
                        books.add(name);
                    }
                    break;
                case "Drop":
                    if (books.contains(name)) {
                        books.remove(name);
                    }
                    break;
                case "Replace":
                    String newName = commandDate[2];
                    if (books.contains(name) && !books.contains(newName)) {
                        int index = books.indexOf(name);
                        books.set(index, newName);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (String book : books) {
            System.out.print(book + " ");
        }
    }
}
