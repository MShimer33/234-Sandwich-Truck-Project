/*
Made by: Michael Shimer
Testing class for AddressConverter class to test correct functionality
of the class as a whole, as well as the methods within it

Edits by:
*/
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class AddressConverterTest {
    
    private String address;
    private final AddressConverter converter = new AddressConverter();

    @Test
    public void testLetterStreetAddress() {
        address = "500 G St.";
        System.out.println("L: " + Arrays.toString(converter.convert(address)));
    }

    @Test
    public void testNumberStreetAddress() {
        address = "700 5 St.";
        System.out.println("N: " + Arrays.toString(converter.convert(address)));
    }

    @Test
    public void testSplitOrder() {
        address = "250 A st.";
        converter.convert(address);
        assertEquals("250 A st.", converter.getAddress());
    }

    @Test
    public void testSplitAddress() {
        address = "250 A st.";
        converter.convert(address);
        assertEquals(250, converter.getAddrNum());
        assertEquals("A", converter.getStreet());
    }
}
