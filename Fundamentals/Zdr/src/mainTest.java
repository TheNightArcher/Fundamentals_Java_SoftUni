public class mainTest {

    public static void main(String[] args) {


        Vehicle[] Vehicle = {new Vehicle(180, 20000), // Максимална скорост и цената на превозното средство.
                new Car(" Opel Astra ", +1600, 200, 25000)}; // Марка на автомобила(Опел Астра),обем на двигателя, максимална скорост, цена.


        for (int i = 0; i < Vehicle.length; i++) // Когато дължината на нашия масив превиши стойността на нашия цикъл
        {
            System.out.println(Vehicle[i]);  //  Принтираме превозното средство.
        }
    }

}
