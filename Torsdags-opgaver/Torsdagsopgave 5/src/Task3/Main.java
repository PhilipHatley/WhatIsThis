package Task3;
import java.util.ArrayList;

public class Main {

    //3.c
    public static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        customers.add(new Customer("Frede", "Fredesen", "Freddy", 1));
        customers.add(new Customer("Klaus", "Klausen", "Klau", 2));
        customers.add(new Customer("Bent", "Bentsen", "Bente", 3));
        customers.add(new Customer("Ralf", "Ralfsen", "Ralle", 4));
        customers.add(new Customer("Morten", "Mortensen", "Morte", 5));
        customers.add(new Customer("Victor", "Victorsen", "Viggo", 6));

        printCustomers();
    }

    //3.d Skriv en metode i Main kaldet printCustomers(), hvor du printer alle kunderne ud
    //ved at gennemløbe 'customers' med et ’for each’ loop.
    // Test metoden fra main ved at kalde den.
    public static void printCustomers() {
        for (Customer c : customers) {
            System.out.println(c);

        }
    }
}