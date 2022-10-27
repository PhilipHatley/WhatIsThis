public abstract class AFuelCar extends ACar {

    int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);

        this.kmPrLitre = kmPrLitre;

    }

    public int getKmPrLitre() {;// should return how many kilometres the car can drive on 1 litre of fuel
        return kmPrLitre;
    }


    public abstract String getFuelType() ; // should return “Gasoline” or “Diesel”


    @Override
    public String toString() {
        return "AFuelCar{" + "get.kmPrLitre=" + kmPrLitre + ", registrationNumber='"
                + registrationNumber + '\'' + ", make='" + make + '\'' + ", model='" + model + '\''
                + ", numberOfDoors=" + numberOfDoors + '}';
    }
}

