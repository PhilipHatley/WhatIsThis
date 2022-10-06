package Task3;

public class Customer {

    //3a

    String firstName;
    String lastName;
    String userName;
    int id;

    //3b

    public Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;

    }

    @Override
    public String toString() {
            return "Customer{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", userName='" + userName + '\'' +
                    '}';

    }
}
