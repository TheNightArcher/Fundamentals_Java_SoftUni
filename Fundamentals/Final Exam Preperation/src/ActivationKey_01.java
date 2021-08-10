import java.util.Scanner;

public class ActivationKey_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder key = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Generate")) {

            String[] inputCommand = input.split(">>>");
            String command = inputCommand[0];

            switch (command) {

                case "Contains":
                    String substring = inputCommand[1];
                    if (key.toString().contains(substring)) {
                        System.out.printf("%s contains %s%n", key, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String definition = inputCommand[1];
                    int beginIndex = Integer.parseInt(inputCommand[2]);
                    int endIndex = Integer.parseInt(inputCommand[3]);

                    for (int i = beginIndex; i < endIndex; i++) {
                        char currentChar = key.charAt(i);

                        if (definition.equals("Upper")) {
                            key.setCharAt(i, Character.toUpperCase(currentChar));
                        } else {
                            key.setCharAt(i, Character.toLowerCase(currentChar));
                        }
                    }
                    System.out.println(key);
                    break;
                case "Slice":
                    int startIndex = Integer.parseInt(inputCommand[1]);
                    int endingIndex = Integer.parseInt(inputCommand[2]);

                    key.delete(startIndex, endingIndex);
                    System.out.println(key);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", key);
    }
}
