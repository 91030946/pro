package packer;

/**
 *
 * @author suprina
 */
public class Address {
    private String street;
    private String suburb;
    private String city;
    private String postcode;
    private Coordinates coordinates;
    
    /**
     * @param street street 
     * @param suburb suburb
     * @param city city
     * @param postcode postcode
     * @param coordinates coordinates
     */

    public Address(String street, String suburb, String city, String postcode, Coordinates coordinates) {
        this.street = street;
        this.suburb = suburb;
        this.city = city;
        this.postcode = postcode;
        this.coordinates = coordinates;
    }
/**
 * @return address
 */
    public String toString() {
        return 
                street + "\n" + //street name
                suburb + "\n" + //suburb name
                city + "\n" + //city name
                postcode; //postcode name
    }
    /**
     * @return the coordinates
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }

    
}
