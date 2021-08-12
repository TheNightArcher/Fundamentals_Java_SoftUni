import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counts = Integer.parseInt(scanner.nextLine());

        String regex = "@#+(?<text>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < counts; i++) {

            String codes = scanner.nextLine();
            StringBuilder numbersHolder = new StringBuilder();
            Matcher matcher = pattern.matcher(codes);

            if (matcher.find()){
                String barcode = matcher.group("text");

                for (char digit: barcode.toCharArray()) {

                    if (Character.isDigit(digit)){
                        numbersHolder.append(digit);
                    }
                }
                if (numbersHolder.toString().isEmpty()){
                    System.out.println("Product group: 00");
                }else {
                    System.out.printf("Product group: %s%n",numbersHolder);
                }

            }else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
