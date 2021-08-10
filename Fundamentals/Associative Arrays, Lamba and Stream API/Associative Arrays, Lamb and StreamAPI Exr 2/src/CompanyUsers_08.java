import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> users = new TreeMap<>();

        while (!input.equals("End")) {

            String[] inputDate = input.split(" -> ");
            String company = inputDate[0];
            String id = inputDate[1];

            if (!users.containsKey(company)) {
                users.put(company, new ArrayList<>());
            }
            if (users.containsKey(company) && !users.get(company).contains(id)) {
                users.get(company).add(id);
            }

            input = scanner.nextLine();
        }

        users.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(userId -> System.out.printf("-- %s%n", userId));

        });
    }
}
