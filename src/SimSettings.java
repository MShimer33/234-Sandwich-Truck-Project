/*
Author: Nikolas Kovacs
Any project-wide variables are stored here
 */
public class SimSettings {
    public static final int DIMENSION = 700;
    public static final int NUM_ROADS = 10;
    public static final int ROAD_WIDTH = DIMENSION / 35;
    public static final int ROAD_SPACING = DIMENSION/(NUM_ROADS - 1) - ROAD_WIDTH / (NUM_ROADS + 1);
    public static final int TRUCK_SIZE = DIMENSION / 17;

    // Truck begins at the intersection of roads E5
    public static final int INITIAL_TRUCK_X = ROAD_SPACING * 4; // Road E
    public static final int INITIAL_TRUCK_Y = ROAD_SPACING * 5; // Road 5
}
