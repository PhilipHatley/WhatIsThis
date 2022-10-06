package Task1;

    //1b

public class Driver {

    String name;
    int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //1g


    @Override
    public String   toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
