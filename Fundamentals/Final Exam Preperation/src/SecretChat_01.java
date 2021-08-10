import java.util.Scanner;

public class SecretChat_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Reveal")){
            String[] inputCommand = input.split(":|:");
            String command= inputCommand[0];

            switch (command){
                case "InsertSpace":
                    int index = Integer.parseInt(inputCommand[1]);
                    text.insert(index," ");
                    System.out.println(text);
                    break;
                case "Reverse":
                    String substring = inputCommand[1];

                    if (text.toString().contains(substring)){
                        StringBuilder newString = new StringBuilder();
                        newString.append(substring);
                        newString.reverse();
                       
                    }
                    break;
                case "ChangeAll":
                    break;
            }


            input = scanner.nextLine();
        }
    }
}
