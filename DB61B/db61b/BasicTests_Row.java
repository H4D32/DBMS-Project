package db61b;

import org.junit.Test;
import static org.junit.Assert.*;

/** Tests Basic functionality */
public class BasicTests_Row {

    @Test
    public void testRow() {
    /* Run the unit tests in this file. */
        Row r = new Row(new String[] {"Alae", "First", "Test","Size 4"});
        assertEquals(4, r.size());
    }
    // Need to Separate another test for get and equals

    public static void main(String... args) {
        System.exit(ucb.junit.textui.runClasses(BasicTests_Row.class));
    }
}       
