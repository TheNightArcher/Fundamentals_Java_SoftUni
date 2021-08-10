public class Car extends Vehicle {  //Клас кола продължение на превозни средства

    String model;
    double volume;

    Car() {
    }                           // Стойностите съдържани в нашите методи

    Car(String model, double volume, double maxSpeed, double price) {

        super(maxSpeed, price);             //Достъп до членове и конструктори от супер клас

        this.model = model;                 //Модел на автомобила
        this.volume = volume;               //Обем на двигателя

    }


    public void setModel(String model) {
        this.model = model;
    }   //Задава модела на автомобила

    public void setVolume(double volume) {
        this.volume = volume;
    }   //Задава стойността на обема на автомобила



    public String getModel()       //Метод за достъп до модел на автомобила
    {
        return model;                  //Връща модела на автомобила
    }

    public double getVolume()     //Метод за достъп до обема на двигателя
    {
        return volume;                 //Връща стойността на обема на двигателя от Main класа
    }

    @Override   //Предефиниран метод toString()

    public String toString() {
        return "кола модел" + getModel() + " с обем " + getVolume() + " с максималната скорост на автомобила е " + getSpeed() + " с цена " + getPrice() + " лв.";

        //Отпечатва стойностите на модела на автомобила, обема на двигателя, максималната скорост и цената
    }


}
