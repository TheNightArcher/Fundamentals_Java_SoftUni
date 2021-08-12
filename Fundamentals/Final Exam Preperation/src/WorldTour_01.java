import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Travel")) {

            String[] inputCommand = input.split(":");
            String command = inputCommand[0];

            switch (command) {
                case "Add Stop":
                    int insertIndex = Integer.parseInt(inputCommand[1]);
                    String destination = inputCommand[2];

                    if (insertIndex >= 0 && insertIndex < text.length()) {
                        text.insert(insertIndex, destination);
                    }
                    System.out.println(text);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(inputCommand[1]);
                    int endIndex = Integer.parseInt(inputCommand[2]);
                    if (startIndex >= 0 && startIndex <= text.length() && endIndex >= 0 && endIndex < text.length()) {
                        text.delete(startIndex, endIndex + 1);
                    }
                    System.out.println(text);
                    break;
                case "Switch":
                    String oldDestination = inputCommand[1];
                    String newDestination = inputCommand[2];

                    String newText = text.toString().replaceAll(oldDestination, newDestination);
                    text.delete(0, text.length());
                    text.append(newText);
                    System.out.println(text);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", text);
    }
}
