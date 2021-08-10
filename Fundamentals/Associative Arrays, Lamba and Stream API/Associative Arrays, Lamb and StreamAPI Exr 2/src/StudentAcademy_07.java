import java.util.*;

public class StudentAcademy_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        Map<String, Double> studentGrade = new LinkedHashMap<>();

        for (int i = 0; i < rows; i++) {

            String name = scanner.nextLine();
            double garde = Double.parseDouble(scanner.nextLine());


            if (!studentGrade.containsKey(name)) {
                studentGrade.put(name, garde);
            } else {

                double average = studentGrade.get(name);
                studentGrade.put(name, (average + garde) / 2);

            }
        }
        studentGrade.entrySet().stream()
                .sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue())).filter(entry -> entry.getValue() >= 4.50)
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }
}
