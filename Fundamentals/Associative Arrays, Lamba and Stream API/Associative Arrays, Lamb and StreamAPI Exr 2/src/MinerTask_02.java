import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> material = new LinkedHashMap<>();

        while (!input.equals("stop")) {

            int quantity = Integer.parseInt(scanner.nextLine());

            if (!material.containsKey(input)){
                material.put(input,quantity);
            }else {
                int currentQuantity = material.get(input);
                material.put(input,currentQuantity + quantity);
            }

            input = scanner.nextLine();
        }

        material.forEach((key,value) -> System.out.println(key + " -> " + value));
    }
}
