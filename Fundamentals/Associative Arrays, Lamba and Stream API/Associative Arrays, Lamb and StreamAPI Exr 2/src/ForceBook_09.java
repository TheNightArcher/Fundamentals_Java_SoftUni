import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> forceBook = new TreeMap<>();

        while (!input.equals("Lumpawaroo")) {

            if (input.contains("|")) {
                String sideForce = input.split("\\s+\\|\\s+")[0];
                String userForce = input.split("\\s+\\|\\s+")[1];

                forceBook.putIfAbsent(sideForce, new ArrayList<>());

                boolean isExist = false;

                for (List<String> list : forceBook.values()) {

                    if (list.contains(userForce)) {
                        isExist = true;
                        break;
                    }
                }

                if (!isExist) {
                    forceBook.get(sideForce).add(userForce);
                }

            } else if (input.contains("->")) {
                String userForce = input.split("\\s+->\\s+")[0];
                String sideForce = input.split("\\s+->\\s+")[1];

                forceBook.forEach((key, value) -> value.remove(userForce));

                forceBook.putIfAbsent(sideForce,new ArrayList<>());

                forceBook.get(sideForce).add(userForce);
                System.out.printf("%s joins the %s side!%n",userForce,sideForce);
            }
            input = scanner.nextLine();
        }

        forceBook.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 0)
                .sorted((e1,e2) -> Integer.compare(e2.getValue().size(),e1.getValue().size()))
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n",entry.getKey(),entry.getValue().size());
                    entry.getValue().stream().sorted().forEach(list -> System.out.printf("! %s%n",list));
                });
    }
}
