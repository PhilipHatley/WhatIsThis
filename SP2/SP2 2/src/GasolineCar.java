public class GasolineCar extends AFuelCar {


    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int km) {
        super(registrationNumber, make, model, numberOfDoors, km);
    }

    public String getFuelType() {
        return "Gasolin";
    }


    @Override
    public int getRegistrationFee() {

        if (kmPrLitre > 20) {
            return 330;
        }
        if (kmPrLitre > 15 && 20 > kmPrLitre) {
            return 1050;
        } else if (kmPrLitre > 10 && 15 > kmPrLitre) {
            return 2340;
        } else if (kmPrLitre > 5 && 10 > kmPrLitre) {
            return 5500;
        } else {
            return 10470;
        }

    }
    @Override
    public String toString() {
        return make + " " + model + ", Fuel type: " + getFuelType() + ". Registration number: " + registrationNumber + ". RegistrationFee: " + getRegistrationFee();
    }
}
