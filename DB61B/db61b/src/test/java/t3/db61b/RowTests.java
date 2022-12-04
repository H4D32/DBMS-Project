package t3.db61b;

import org.junit.Test;
import static org.junit.Assert.*;

/** Tests Basic functionality */
public class RowTests {

    @Test
    public void testRow() {
    /* Run the unit tests in this file. */
        Row r = new Row(new String[] {"Alae", "First", "Test","Size 4"});
        assertEquals(4, r.size());
    }

    @Test
    public void testRow2() {
    /* Run the unit tests in this file. */
        Row r = new Row(new String[] {});
        assertEquals(0, r.size());
    }
    // Need to Separate another test for get and equals
    
    
}