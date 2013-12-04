/**
 * @author Austin Herr
 * @version 1.0
 * The Plane class that represents a two dimensional array of passengers
 */
import java.util.Scanner;
public class Plane {
    
    // instantiates a grid of passengers
    Passenger[][] plane = new Passenger[10][3];
    //scanner to read from the keyboard
    Scanner scan = new Scanner(System.in);
    //calls other methods from the Plane class
    
    public Plane()
    {
        initialize();
        
    }
    /**
     * Initializes each of the cells in the Plane array to a "dummy" passenger
     */
    public void initialize()
    {
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                plane[i][j] = new Passenger();
            }
        }
    }
    
    /**
     * Method that makes a reservation in the plane
     * @param n the name of the passenger
     * @param a the address of the passenger
     * @param p the phone number of the passenger
     * @param r the row of the plane
     * @param c the column of the plane
     */
    public void makeReservation(String n, String a, String p, int r, int c)
    {
        if(plane[r][c].getName() == "dummy")
        {
            plane [r][c] = new Passenger (n, a, p);
        }
    }
    /**
     * Method that cancels any reservation
     * @param r the row of the plane
     * @param c the column of the plane
     */
    public void cancelReservation(int r, int c)
    {
        plane[r][c] = new Passenger();
    }
    /**
     * Method that checks for a reservation in a certain seat and returns the name
     * @return info the persons name in the seat
     * @param r the row of the plane
     * @param c the column of the plane
     */
    public String checkReservation(int r, int c)
    {
        String result = "";
        result = plane[r][c].toString();
        return result;
    }
    /**
     * Method that checks if the seat is empty or not
     * @return isIt true or false if the seat is empty or not
     * @param r the row of the plane
     * @param c the column of the plane
     */
    public Boolean ifSeatEmpty(int r, int c)
    {
        Boolean isIt = false;
        if(plane[r][c].getName() == "dummy")
        {
            isIt = true;
        }
        return isIt;
    }
    /**
     * Method that checks if the name given is on the plane
     * @return isIt returns true or false if the person is on the plane or not
     * @param name the name of the passenger
     */
    public Boolean nameCheck(String name)
    {
        Boolean isIt = false;
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(plane[i][j].getName().equals(name))
                {
                    isIt = true;
                }
            }
        }
        return isIt;
    }
    /**
     * Method that searches for a passenger that the user identifies
     * @return result the passenger info
     * @param name the passengers name
     */
    public String searchPassenger(String name)
    {
        String result = "";
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(plane[i][j].getName().equals(name))
                {
                    result = plane[i][j].toString() + "Row:" + i + " Seat:" + j;
                }
            }
        }
        return result;
    }
    
}
