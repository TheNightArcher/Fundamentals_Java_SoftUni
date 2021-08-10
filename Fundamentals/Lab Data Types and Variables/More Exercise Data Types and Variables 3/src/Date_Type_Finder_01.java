import java.util.Scanner;

public class Date_Type_Finder_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        while (!type.equals("End")){
            Scanner input = new Scanner(type);

            if (input.hasNextInt()){
                System.out.printf("%s is integer type%n",type);
            }else if (input.hasNextDouble()){
                System.out.printf("%s is floating point type%n",type);
            }else if (type.length() == 1){
                System.out.printf("%s is character type%n",type);
            }else if (input.hasNextBoolean()){
                System.out.printf("%s is boolean type%n",type);
            }else if (input.hasNext()){
                System.out.printf("%s is string type%n",type);
            }

            type = scanner.nextLine();
        }
    }
}
