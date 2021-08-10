public class Student_02 {

    private String firstName;
    private String secondName;
    private int age;
    private String town;


    public Student_02(String firstName, String secondName, int age, String town) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.town = town;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {

        return firstName + " " + secondName + " is " + age + " years old";
    }
}
