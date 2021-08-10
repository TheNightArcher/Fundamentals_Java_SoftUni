public class Vehicle {

    double maxSpeed;    // Максимална скорост
    double price;       // Цена
    Vehicle () {}       // Стойностите съдържани в нашите методи
    Vehicle (double maxSpeed, double price) {
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public void setSpeed(double maxSpeed) // Използваме метода за достъп setSpeed за да зададем максималната скорост.
    {
        this.maxSpeed = maxSpeed;
    }
    public void setPrice(double price)      // Използваме метода за достъп set за да зададем цената.
    {
        this.price = price;
    }



    public double getSpeed()    // Метод за достъп.
    {
        return maxSpeed;        // Връща максималната скорост на превозното средство.
    }
    public double getPrice()                //Метод за достъп.
    {
        return price;                   // Връща цената на превозното средство.
    }
    @Override           //Предефиниран метод toString()
    public String toString() //Символно представяне
    {
        return "максималната скорост на автомобила е " + getSpeed() + " с цена " + getPrice() + " лв.";// Отпечатва скоростта и цената.
    }

}
