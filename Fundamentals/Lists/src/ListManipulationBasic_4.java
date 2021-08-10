import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasic_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> listNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String commands = scanner.nextLine();



        while (!commands.equals("end")){

            String[]  commandDate = commands.split("\\s+");
            String commandName = commandDate[0];


            switch (commandName){
                case "Add":
                    int addNumber = Integer.parseInt(commandDate[1]);
                    listNumbers.add(addNumber);
                    break;
                case "Remove":
                    int removeNumber = Integer.parseInt(commandDate[1]);
                    listNumbers.remove(Integer.valueOf(removeNumber));
                    break;
                case "RemoveAt":
                    int removeAtIndex = Integer.parseInt(commandDate[1]);
                    listNumbers.remove(removeAtIndex);
                    break;
                case "Insert":
                    int putTheNumber = Integer.parseInt(commandDate[1]);
                    int indexSet = Integer.parseInt(commandDate[2]);
                    listNumbers.add(indexSet , putTheNumber);
                    break;
            }

            commands = scanner.nextLine();
        }

        for (int number : listNumbers  ) {

            System.out.print(number + " ");
        }
    }
}
