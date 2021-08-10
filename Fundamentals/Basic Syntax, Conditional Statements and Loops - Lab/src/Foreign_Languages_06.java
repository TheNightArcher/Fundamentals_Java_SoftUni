import java.util.Scanner;

public class Foreign_Languages_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        String language = "";

        switch (country) {
            case "England":
            case "USA":
                language = "English";
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                language = "Spanish";
                break;

            default:{
                System.out.print("unknown");
            }

        }
        System.out.print(language);
    }
}
