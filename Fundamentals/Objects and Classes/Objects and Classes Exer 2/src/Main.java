import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int peoples = Integer.parseInt(scanner.nextLine());
        List<OpinionPoll_03> person = new ArrayList<>();


        for (int i = 0; i < peoples; i++) {

            String input = scanner.nextLine();
            String[] splitInput = input.split("\\s+");
            String name = splitInput[0];
            int age = Integer.parseInt(splitInput[1]);


            OpinionPoll_03 persons = new OpinionPoll_03(name, age);
            if (persons.getAge() > 30) {
                person.add(persons);
            }
        }

        person.sort(Comparator.comparing(OpinionPoll_03::getName));

        for (OpinionPoll_03 people : person) {

            System.out.println(people.getName() + " - " + people.getAge());
        }
    }
}
