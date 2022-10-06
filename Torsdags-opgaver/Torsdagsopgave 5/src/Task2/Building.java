package Task2;

import java.util.ArrayList;

public class Building {


    //2d
    private final ArrayList<Room> Room;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private int isOfficeBuilding;

    //2e

    public Building(ArrayList<Room> room, int numberOfBathrooms, int numberOfFloors, int isOfficeBuilding) {
        Room = room;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    //2f

    public ArrayList<Room> getRoom() {
        return Room;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getIsOfficeBuilding() {
        return isOfficeBuilding;
    }


}
