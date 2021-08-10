import java.util.*;

public class Orders_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        Map<String,Double> products = new LinkedHashMap<>();
        Map<String,Integer> rememberProduct = new LinkedHashMap<>();

        while (!input.equals("buy")){

            String[] inputDate = input.split(" ");
            String name = inputDate[0];
            double price = Double.parseDouble(inputDate[1]);
            int quality = Integer.parseInt(inputDate[2]);

            if (!products.containsKey(name)){
                products.put(name,price * quality);
                rememberProduct.put(name,quality);
            }else {
                rememberProduct.put(name,rememberProduct.get(name) + quality);
                products.put(name,rememberProduct.get(name) * price);
            }
            input = scanner.nextLine();
        }

        products.forEach((key,value) -> System.out.printf("%s -> %.2f%n",key,value));
    }
}
