import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();


        while (!input.equals("Done")) {

            String[] inputCommand = input.split("\\s+");
            String command = inputCommand[0];

            switch (command) {
                case "TakeOdd":
                    int counter = 0;
                    for (int i = 0; i < text.length(); i++) {
                        counter++;
                        if (counter % 2 != 0) {
                            text.deleteCharAt(i);
                            i--;
                        }
                    }
                    System.out.println(text);
                    break;
                case "Cut":
                    int startingIndex = Integer.parseInt(inputCommand[1]);
                    int length = Integer.parseInt(inputCommand[2]);
                    text.delete(startingIndex, startingIndex + length);
                    System.out.println(text);
                    break;
                case "Substitute":
                    String currentSymbol = inputCommand[1];
                    String newSymbol = inputCommand[2];

                    if (text.toString().contains(currentSymbol)){
                       String newText = text.toString().replaceAll(currentSymbol,newSymbol);
                       text.delete(0,text.length());
                       text.append(newText);
                        System.out.println(text);
                    }else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your password is: %s",text);
    }
}
