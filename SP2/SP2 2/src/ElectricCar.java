public class ElectricCar extends ACar {

    int batteryCapacity;
    int maxRange;
    int power;
    float kmL;
   

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange, int power) {
        super(registrationNumber, make, model, numberOfDoors);

        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
        this.power = power;
    }


    public int getBatteryCapacityKWh() { // returns the battery capacity in kilowatt-hours

        return batteryCapacity;

    }

    public int getMaxRangeKm() { // returns the maximum range in kilometres.

        return maxRange;
    }

    public int getWhPrKm(){ // returns the power consumption in watt hours per driven kilometre.

        return power;
    }


    @Override
    public int getRegistrationFee() {
        float kmL =(float)(power/91.25/100);
        if (kmL > 20) {
            return 330;
        }
        if (kmL > 15 && 20 > kmL) {
            return 1050;
        } else if (kmL > 10 && 15 > kmL) {
            return 2340;
        } else if (kmL > 5 && 10 > kmL) {
            return 5500;
        } else {
            return 10470;
        }

        
    }

    @Override
    public String toString() {
        return make + " " + model + ", Battery capCity: " + batteryCapacity +
                ", Max range: " + maxRange + ", WhPerKm: " + power + "." +
                " Registration number: " + registrationNumber + ". RegistrationFee: " + getRegistrationFee();
    }
    }


