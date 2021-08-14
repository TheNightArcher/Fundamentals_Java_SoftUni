import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Decode")) {
            String[] inputSplit = input.split("\\|");
            String command = inputSplit[0];

            switch (command) {
                case "Move":
                    int moveIndex = Integer.parseInt(inputSplit[1]);

                        StringBuilder movedText = new StringBuilder();
                        for (int i = 0; i < moveIndex; i++) {
                            char symbol = text.charAt(i);
                            movedText.append(symbol);
                        }
                        text.delete(0, moveIndex);
                        text.append(movedText);

                    break;
                case "Insert":
                    int index = Integer.parseInt(inputSplit[1]);
                    String insertStr = inputSplit[2];

                        text.insert(index , insertStr);

                    break;
                case "ChangeAll":
                    String oldString = inputSplit[1];
                    String newString = inputSplit[2];

                   text = new StringBuilder(text.toString().replace(oldString,newString));
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", text);
    }
}
