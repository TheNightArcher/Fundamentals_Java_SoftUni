import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0 ; i--) {

            password += username.charAt(i);
        }

        for (int i = 1; i <= 4 ; i++) {

            String inputUsername = scanner.nextLine();

            if (inputUsername.equals(password)){
                System.out.printf("User %s logged in.",username);
                break;
            }else if (i > 3){
                System.out.printf("User %s blocked!",username);
                break;
            }else {
                System.out.printf("Incorrect password. Try again.%n");
            }
        }

    }
}


