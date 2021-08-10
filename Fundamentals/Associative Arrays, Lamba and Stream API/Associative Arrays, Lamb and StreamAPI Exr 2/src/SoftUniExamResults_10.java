import java.util.*;

public class SoftUniExamResults_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> personScore = new TreeMap<>();
        Map<String, Integer> languageSubmissions = new TreeMap<>();

        while (!input.equals("exam finished")) {

            String[] inputDate = input.split("-");

            String name = inputDate[0];
            String language = inputDate[1];

            if (language.equals("banned")) {
                personScore.remove(name);
            } else {
                int points = Integer.parseInt(inputDate[2]);

                personScore.putIfAbsent(name, points);
                int currentScore = personScore.get(name);
                if (points > currentScore) {
                    personScore.put(name, points);
                }

                languageSubmissions.putIfAbsent(language, 0);
                int currentSubmission = languageSubmissions.get(language);
                languageSubmissions.put(language, currentSubmission + 1);
            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        personScore.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .forEach(entry -> System.out.printf("%s | %d%n", entry.getKey(), entry.getValue()));
        System.out.println("Submissions:");
        languageSubmissions.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .forEach(entry -> System.out.printf("%s - %d%n", entry.getKey(), entry.getValue()));
    }
}
