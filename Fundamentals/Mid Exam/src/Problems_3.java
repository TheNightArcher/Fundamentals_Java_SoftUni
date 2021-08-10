import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problems_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> chat = new ArrayList<>();

        while (!input.equals("end")){

            String[] commandDate = input.split(" ");
            String command = commandDate[0];
            String message = commandDate[1];

            switch (command){
                case "Chat":
                    chat.add(message);
                    break;
                case "Delete":
                    if (chat.contains(message)){
                        chat.remove(message);
                    }
                    break;
                case "Edit":
                    String newMassage = commandDate[2];
                    int index = chat.indexOf(message);
                    if (chat.contains(message)){
                        chat.set(index,newMassage);
                    }
                    break;
                case "Pin":
                   if (chat.contains(message)){
                       chat.remove(message);
                       chat.add(message);
                   }
                    break;
                case "Spam":

                    for (String word: commandDate) {
                        chat.add(word);
                    }
                    chat.remove(command);
                    break;
            }

            input = scanner.nextLine();
        }
        for (String words: chat) {
            System.out.println(words);
        }
    }
}
