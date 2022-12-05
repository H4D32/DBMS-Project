package t3.db61b;

import org.junit.Test;
import static org.junit.Assert.*;

/** Tests Basic functionality */
public class RowTests {

    @Test
    public void testRowSize() {
    /* Run the unit tests in this file. */
        Row r = new Row(new String[] {"Alae", "First", "Test","Size 4"});
        assertEquals(4, r.size());
    }

    @Test
    public void testRowSizeEmpty() {
    /* Run the unit tests in this file. */
        Row r = new Row(new String[] {});
        assertEquals(0, r.size());
    }

    @Test
    public void testRowGet() {
    /* Run the unit tests in this file. */
        Row r = new Row(new String[] {"Easy", "Get", "Test"});
        assertEquals("Get", r.get(1));
    }

    @Test
    public void testRowEquals() {
    /* Run the unit tests in this file. */
    Row r = new Row(new String[] {"Easy", "Equals", "Test"});
    Row r1 = new Row(new String[] {"Easy", "Equals", "Test"});
    Row r2 = new Row(new String[] {"Basic"});
    Row r3= new Row(new String[] {"Easy", "Equal", "Test"});
    assertTrue(r.equals(r1));
    assertFalse(r.equals(r2));
    assertFalse(r.equals(r3));
    }
    
}