
public class Main {

    public static void main(String[] args) {

        Car c1 = new GasolineCar("DS55672", "Audi", "A6", 5, 22);

        Car c2 = new DieselCar("MS57672", "BWM", "Z4", 3,18,true);

        Car c3 = new ElectricCar("ES57672", "Ford", "Mustang", 3,75,300,600);


        System.out.println(" ");
        System.out.println(c1);
        FleetOfCars fleet = new FleetOfCars();
        fleet.addCar(c1);

        System.out.println(" ");
        System.out.println(c2);
        FleetOfCars f = new FleetOfCars();
        f.addCar(c2);

        System.out.println(" ");
        System.out.println(c3);
        FleetOfCars f2 = new FleetOfCars();
        f2.addCar(c3);



        }



}