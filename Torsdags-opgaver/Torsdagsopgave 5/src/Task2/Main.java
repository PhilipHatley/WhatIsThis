package Task2;

import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {


                //2g

                Room room1 = new Room(2, 1, 3);
                Room room2 = new Room(1, 2, 3);
                Room room3 = new Room(3, 2, 1);

                //2h

                ArrayList<Room> listOfRoom = new ArrayList<>();
                listOfRoom.add(room1);
                listOfRoom.add(room2);
                listOfRoom.add(room3);

                //2i

                Building alpha1 = new Building(3, 2, 3, 1);

                System.out.println(countLampsInBuilding(alpha));
                System.out.println(isNormal(alpha));
        }
                //2j

                public static int countLampsInBuilding (Building alpha) {
                int sum = 0;
                for (Room r : alpha.getRoom()) {
                        sum += r.getNumberLamps();
                }
                return sum;

        }

}

                //2k

                public static boolean isNormal(Building alpha) {
                int floors = alpha.getNumberOfFloors();
                int rooms = alpha.getRooms().size();

                if(floors > rooms) {
                        System.out.println("This is an odd building");
                        return false;
                }

                return true;
                }


                }
