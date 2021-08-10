import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]+)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> products = new ArrayList<>();
        double totalPrice = 0;

        while (!input.equals("Purchase")) {

            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double result = quantity * price;
                products.add(furniture);
                totalPrice += result;
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        products.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
