import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Racer_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> racers = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        Map<String, Integer> racerResult = new LinkedHashMap<>();

        String input = scanner.nextLine();

        String regexName = "[A-Za-z]+";
        String regexNumbers = "[0-9]";

        Pattern patternName = Pattern.compile(regexName);
        Pattern patternNumbers = Pattern.compile(regexNumbers);

        while (!input.equals("end of race")) {

            Matcher matcher = patternName.matcher(input);
            Matcher matcherNum = patternNumbers.matcher(input);

            StringBuilder name = new StringBuilder();
            int km = 0;

            while (matcher.find()) {

                name.append(matcher.group());
            }
            while (matcherNum.find()) {
                km += Integer.parseInt(matcherNum.group());
            }
            if (racers.contains(name.toString())) {
                racerResult.putIfAbsent(name.toString(), 0);
                int currentKm = racerResult.get(name.toString());
                racerResult.put(name.toString(), currentKm + km);
            }
            input = scanner.nextLine();
        }

        List<String> winners = new ArrayList<>();

        racerResult.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .limit(3).forEach(entry -> winners.add(entry.getKey()));

        System.out.printf("1st place: %s%n",winners.get(0));
        System.out.printf("2nd place: %s%n",winners.get(1));
        System.out.printf("3rd place: %s%n",winners.get(2));
    }
}
