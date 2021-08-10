import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peoples = Integer.parseInt(scanner.nextLine());

        Map<String,String> registered = new LinkedHashMap<>();

        for (int i = 0; i < peoples; i++) {

            String input = scanner.nextLine();
            String[] commandDate = input.split(" ");

            String command = commandDate[0];
            String name = commandDate[1];


            switch (command){
                case "register":
                    String licenseNumber = commandDate[2];
                    if (!registered.containsKey(name)){
                        registered.put(name,licenseNumber);
                        System.out.printf("%s registered %s successfully%n",name,licenseNumber);
                    }else {
                        System.out.printf("ERROR: already registered with plate number %s%n",licenseNumber);
                    }
                    break;
                case "unregister":
                    if (registered.containsKey(name)){
                        registered.remove(name);
                        System.out.printf("%s unregistered successfully%n",name);
                    }else {
                        System.out.printf("ERROR: user %s not found%n",name);
                    }
                    break;
            }
        }
        registered.forEach((key1, value) -> System.out.println(key1 + " => " + value));
    }
}
