/**
Author: Nikolas Kovacs
Any project-wide variables are stored here
 */
public class SimSettings {
    public static final int DIMENSION = 700;
    public static final int NUM_ROADS = 10;
    public static final int ROAD_WIDTH = DIMENSION / 35;
    public static final int ROAD_SPACING = DIMENSION/(NUM_ROADS - 1) - ROAD_WIDTH / (NUM_ROADS + 1);
    public static final int TRUCK_SIZE = DIMENSION / 17;
    public static final int TRUCK_SPEED = 1; // unit = pixels per cycle (defined below)
    public static final int SIM_SPEED = 10; // unit = milliseconds: how often the cycle repeats (defined below)
    public static final int PIN_SIZE = DIMENSION / 25;
    public static final int NUMBER_OF_ORDERS = 100;
    public static final int NUM_HOUSES_PER_BLOCK = 10;
    public static final String SERVICE_CENTER = "550 5 St.";

    private static final int[] initial_truck_xy = new AddressConverter().convert(SERVICE_CENTER);
    public static final int INITIAL_TRUCK_X = initial_truck_xy[0];
    public static final int INITIAL_TRUCK_Y = initial_truck_xy[1];


    public static void cycle() {
        try
        {
            Thread.sleep(SIM_SPEED);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
