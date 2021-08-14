import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Finish")) {

            String[] inputSplit = input.split("\\s+");

            String command = inputSplit[0];

            switch (command) {
                case "Replace":
                    String currentString = inputSplit[1];
                    String newString = inputSplit[2];
                    text = new StringBuilder(text.toString().replaceAll(currentString, newString));
                    System.out.println(text);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(inputSplit[1]);
                    int endIndex = Integer.parseInt(inputSplit[2]);
                    if (startIndex >= 0 && startIndex < text.length() && endIndex >= 0 && endIndex < text.length()) {
                        text.delete(startIndex, endIndex + 1);
                        System.out.println(text);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    String makeText = inputSplit[1];
                    String newText = "";
                    if (makeText.equals("Upper")) {
                        newText = text.toString().toUpperCase();
                        text.delete(0, text.length());
                        text.append(newText);
                        System.out.println(text);
                    } else if (makeText.equals("Lower")) {
                        newText = text.toString().toLowerCase();
                        text.delete(0, text.length());
                        text.append(newText);
                        System.out.println(text);
                    }
                    break;
                case "Check":
                    String chek = inputSplit[1];
                    if (text.toString().contains(chek)) {
                        System.out.printf("Message contains %s%n", chek);
                    } else {
                        System.out.printf("Message doesn't contain %s%n", chek);
                    }
                    break;
                case "Sum":
                    int startIndexSum = Integer.parseInt(inputSplit[1]);
                    int endIndexSum = Integer.parseInt(inputSplit[2]);
                    int sum = 0;
                   if (startIndexSum >= 0 && startIndexSum < text.length() && endIndexSum >= 0 && endIndexSum < text.length()){
                       for (int i = startIndexSum; i <= endIndexSum; i++) {
                           char currentWord = text.charAt(i);
                           sum += currentWord;
                       }
                       System.out.println(sum);
                   }else {
                       System.out.println("Invalid indices!");
                   }

                    break;
            }

            input = scanner.nextLine();
        }
    }
}
