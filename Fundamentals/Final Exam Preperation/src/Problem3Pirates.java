import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem3Pirates {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Integer> cityPopulation = new TreeMap<>();
        Map<String, Integer> cityGold = new TreeMap<>();
        while (!input.equals("Sail")) {

            String[] cities = input.split("[|]{2}");
            String cityName = cities[0];
            int population = Integer.parseInt(cities[1]);
            int gold = Integer.parseInt(cities[2]);

            cityPopulation.putIfAbsent(cityName, 0);
            int currentPopulation = cityPopulation.get(cityName);
            cityPopulation.put(cityName, currentPopulation + population);

            cityGold.putIfAbsent(cityName, 0);
            int currentGold = cityGold.get(cityName);
            cityGold.put(cityName, currentGold + gold);

            input = scanner.nextLine();
        }
        String secondInput = scanner.nextLine();
        while (!secondInput.equals("End")) {
            String[] commandInput = secondInput.split("=>");
            String command = commandInput[0];
            String town = commandInput[1];

            switch (command) {
                case "Plunder":
                    int people = Integer.parseInt(commandInput[2]);
                    int gold = Integer.parseInt(commandInput[3]);

                    int leftPeoples = cityPopulation.get(town) - people;
                    cityPopulation.put(town, leftPeoples);

                    int leftGold = cityGold.get(town) - gold;
                    cityGold.put(town, leftGold);

                    if (leftPeoples > 0 && leftGold > 0) {
                        System.out.printf("%s plundered! %s gold stolen, %s citizens killed.%n", town, gold, people);
                    } else {
                        cityPopulation.remove(town);
                        cityGold.remove(town);
                        System.out.printf("%s plundered! %s gold stolen, %s citizens killed.%n", town, gold, people);
                        System.out.printf("%s has been wiped off the map!%n", town);
                    }
                    break;
                case "Prosper":
                    int amountGold = Integer.parseInt(commandInput[2]);

                    if (amountGold < 0){
                        System.out.println("Gold added cannot be a negative number!");
                    }else {
                        int currentGold = cityGold.get(town);
                        cityGold.put(town,currentGold + amountGold);
                        int newBalance = cityGold.get(town);

                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",amountGold,town,newBalance);
                    }
                    break;
            }
            secondInput = scanner.nextLine();
        }
        System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",cityGold.size());

        cityGold.entrySet().stream()
                .sorted((t1,t2) -> Integer.compare(t2.getValue(),t1.getValue()))
                .forEach(town ->{
                    String townName = town.getKey();
                    System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",town.getKey(),cityPopulation.get(townName),town.getValue());
                });
    }
}
