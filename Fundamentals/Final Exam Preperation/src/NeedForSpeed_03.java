import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NeedForSpeed_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfCars = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> carKm = new TreeMap<>();
        Map<String, Integer> carFuel = new TreeMap<>();
        for (int i = 0; i < numberOfCars; i++) {
            String input = scanner.nextLine();
            String[] statsCar = input.split("\\|");
            String brandModel = statsCar[0];
            int km = Integer.parseInt(statsCar[1]);
            int fuel = Integer.parseInt(statsCar[2]);

            carKm.put(brandModel, km);
            carFuel.put(brandModel, fuel);
        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String[] inputCommands = input.split(" : ");
            String command = inputCommands[0];
            String car = inputCommands[1];

            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(inputCommands[2]);
                    int fuel = Integer.parseInt(inputCommands[3]);
                   int currentKm = carKm.get(car);
                   int currentFuel= carFuel.get(car);

                   if (currentFuel >= fuel){
                       int addedDistance = currentKm + distance;
                       carKm.put(car,addedDistance);
                       carFuel.put(car,currentFuel - fuel);
                       System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",car,distance,fuel);
                       if (addedDistance >= 100000){
                           System.out.printf("Time to sell the %s!%n",car);
                           carKm.remove(car);
                           carFuel.remove(car);
                       }
                   }else {
                           System.out.println("Not enough fuel to make that ride");
                   }
                    break;
                case "Refuel":
                    int fuelLiters = Integer.parseInt(inputCommands[2]);
                    int currentFuelLiters = carFuel.get(car);
                    int refuel = currentFuelLiters + fuelLiters;

                    if (refuel > 75){
                        refuel = 75;
                    }
                    carFuel.put(car,refuel);
                    System.out.printf("%s refueled with %d liters%n",car,refuel - currentFuelLiters);
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(inputCommands[2]);
                    int carCurrentKm = carKm.get(car);
                    int revertKm = carCurrentKm - kilometers;

                    if (revertKm < 10000){
                        revertKm = 10000;
                        carKm.put(car,revertKm);
                    }else {
                        carKm.put(car,revertKm);
                        System.out.printf("%s mileage decreased by %d kilometers%n",car,kilometers);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        carKm.entrySet().stream()
                .sorted((e1,e2) -> Integer.compare(e2.getValue(),e1.getValue()))
                .forEach(entry ->{
                    String carBrand = entry.getKey();
                    System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n ",entry.getKey(),entry.getValue(),carFuel.get(carBrand));


                });
    }
}
