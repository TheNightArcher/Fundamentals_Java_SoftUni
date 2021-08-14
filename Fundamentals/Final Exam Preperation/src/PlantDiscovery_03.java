import java.util.*;

public class PlantDiscovery_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countOfPlant = Integer.parseInt(scanner.nextLine());

        Map<String, PlantDate> currentPlants = new HashMap<>();

        for (int i = 0; i < countOfPlant; i++) {
            String plantKind = scanner.nextLine();
            String[] plantSplit = plantKind.split("<->");
            String name = plantSplit[0];
            int rarity = Integer.parseInt(plantSplit[1]);
            PlantDate newPlant = new PlantDate(new ArrayList<>(), rarity);
            currentPlants.put(name, newPlant);
        }

        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String[] inputSpilt = input.split(": | - ");
            String command = inputSpilt[0];
            String plantName = inputSpilt[1];

            if (!currentPlants.containsKey(plantName)){
                input = scanner.nextLine();
                System.out.println("error");
                continue;
            }

            switch (command) {

                case "Rate":
                    int rate = Integer.parseInt(inputSpilt[2]);
                    currentPlants.get(plantName).addRating(rate);
                    break;
                case "Update":
                    int rarity = Integer.parseInt(inputSpilt[2]);
                    currentPlants.get(plantName).setRarity(rarity);
                    break;
                case "Reset":
                    currentPlants.get(plantName).removeAll();
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        currentPlants.entrySet().stream().sorted((e1, e2) -> {
            int result = Integer.compare(e2.getValue().getRarity(), e1.getValue().getRarity());
            if (result == 0) {
                result = Double.compare(e2.getValue().getAve(), e2.getValue().getAve());
            }
            return result;
        }).forEach(entry -> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue().getRarity(), entry.getValue().getAve()));
    }
}

class PlantDate {
    private int rarity;
    private final List<Integer> ratings;

    public PlantDate(List<Integer> ratings, int rarity) {
        this.rarity = rarity;
        this.ratings = ratings;
    }

    public void addRating(int rating) {
        ratings.add(rating);
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public void removeAll() {
        ratings.clear();
    }

    public int getRarity() {
        return rarity;
    }

    public double getAve() {

        double average = 0;

        for (Integer rating : this.ratings) {
            average += rating;
        }

        if (average == 0) {
            return 0;
        } else {
            return average / ratings.size();
        }
    }
}
