
/**
 * Passenger class that represents either a "dummy" passenger or a passenger with a reservation
 */
public class Passenger {
	//variables that represent the name, address, and phone number of the passenger
	private String name;
	private String address;
	private String phoneNumber;
	/**
	 * Method that creates a Passenger if the name, address, and phone number are given
	 * @param _name the name of the passenger
	 * @param _address the address of the passenger
	 * @param _phoneNumber the phone number of the passenger
	 * 
	 */
	public Passenger(String _name, String _address, String _phoneNumber)
	{
	    name = _name;
	    address = _address;
	    phoneNumber = _phoneNumber;
	}
	/**
	 * Creates a "dummy" passenger which acts as a placeholder in the array of Passengers
	 */
	public Passenger()
	{
	    name = "dummy";
	    address = " ";
	    phoneNumber = " ";
	}
	/**
	 * Method that returns the name of the passenger
	 * @return name the name of the passenger
	 */
	public String getName ()
	{
		return name;
	}
	/**
	 * Method that returns the address of the passenger
	 * @return address the address of the passenger
	 */
	public String getAddress ()
	{
		return address;
	}
	/**
	 * Method that returne the phone number of the passenger
	 * @return phoneNumber the phone number of the passenger
	 */
	public String getPhoneNumber ()
	{
		return phoneNumber;
	}
	public String toString()
	{
	    String result = name + "\n" + address + "\n" + phoneNumber;
	    return result;
	}

}
