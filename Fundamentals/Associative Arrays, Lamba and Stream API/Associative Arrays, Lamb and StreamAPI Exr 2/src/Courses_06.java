import java.util.*;

public class Courses_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!input.equals("end")) {

            String[] commandDate = input.split(" : ");
            String course = commandDate[0];
            String peoples = commandDate[1];

            if (!courses.containsKey(course)) {
                courses.put(course, new ArrayList<>());
            }

            courses.get(course).add(peoples);

            input = scanner.nextLine();
        }

        courses.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().stream().sorted().forEach(studentName -> System.out.println("-- " + studentName));
                });
    }
}
