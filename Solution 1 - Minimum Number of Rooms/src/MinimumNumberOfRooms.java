public class MinimumNumberOfRooms {

    // Minimum Needed: 2 Classrooms
    public static int [][] times1 = {
            {30, 75},
            {0, 50},
            {60, 150}
    };

    // Minimum Needed: 2 Classrooms
    public static int [][] times2 = {
            {0, 50},
            {50, 80},
            {80,150},
            {70,100},
            {60, 70},
            {50, 60}
    };

    //Minimum Needed: 1 Classroom
    public static int [][] times3 = {
            {50, 100},
            {0, 50},
            {100, 150}
    };

    //Minimum Needed: 3 Rooms
    public static int [][] times4 = {
            {50, 100},
            {0, 50},
            {100, 150},
            {50, 100},
            {0, 50},
            {100, 150},
            {0, 125}
    };


    public static int minNumRooms(int [][] timeArray){

        int roomsNeeded = 0;
        int netRoomsNeeded = 0;

        int [] timeCounter = new int[1440];

        for(int [] times : timeArray){
            timeCounter[times[0]] += 1;
            timeCounter[times[1]] -= 1;
        }
        for(int time: timeCounter){
            netRoomsNeeded += time;
            if(netRoomsNeeded > roomsNeeded){
                roomsNeeded = netRoomsNeeded;
            }
        }

        return roomsNeeded;
    }



    public static void main(String [] args){

        System.out.printf("The number of rooms needed for set 1 is: %d\n", minNumRooms(times1));

        System.out.printf("The number of rooms needed for set 2 is: %d\n", minNumRooms(times2));

        System.out.printf("The number of rooms needed for set 3 is: %d\n", minNumRooms(times3));

        System.out.printf("The number of rooms needed for set 4 is: %d\n", minNumRooms(times4));

    }

}
