import java.util.*;

public class LegendaryFarming_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new TreeMap<>();
        Map<String, Integer> junk = new TreeMap<>();

        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        boolean isFounded = false;

        while (!isFounded) {

            String[] products = scanner.nextLine().split(" ");

            for (int i = 0; i < products.length; i += 2) {

                int quantity = Integer.parseInt(products[i]);
                String material = products[i + 1].toLowerCase();

                switch (material) {
                    case "shards":
                    case "fragments":
                    case "motes":

                        int currentQuantity = materials.get(material);
                        materials.put(material, currentQuantity + quantity);


                        if (materials.get(material) >= 250) {
                            switch (material) {
                                case "shards":
                                    materials.put(material, materials.get(material) - 250);
                                    System.out.println("Shadowmourne obtained!");
                                    isFounded = true;
                                    i += products.length;
                                    break;
                                case "fragments":
                                    materials.put(material, materials.get(material) - 250);
                                    System.out.println("Valanyr obtained!");
                                    isFounded = true;
                                    i += products.length;
                                    break;
                                case "motes":
                                    materials.put(material, materials.get(material) - 250);
                                    System.out.println("Dragonwrath obtained!");
                                    isFounded = true;
                                    i += products.length;
                                    break;
                            }
                            break;
                        }

                        break;
                    default:
                        if (!junk.containsKey(material)) {
                            junk.put(material, quantity);
                        } else {
                            int currentQuantityJunk = junk.get(material);
                            junk.put(material, currentQuantityJunk + quantity);
                        }
                        break;
                }
            }

        }
        materials.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        for (var item : junk.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue());
        }
    }
}
