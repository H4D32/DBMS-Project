package t3.db61b;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class TableTest {
    /**
     * Rigorous Test :-)
     */
    public Table table = new Table(new String[] { "Student", "Mentor", "School" });

    @Test
    public void Test_writeTable() {
        table.add(new Row(new String[] { "Alex", "Bob", "SDS" }));
        table.add(new Row(new String[] { "Charlie", "Diana", "SSE" }));
        table.writeTable(new String("student"));
    }

    @Test
    public void Test_print() {
        table.add(new Row(new String[] { "Alex", "Bob", "SDS" }));
        table.add(new Row(new String[] { "Charlie", "Diana", "SSE" }));
        table.print();
    }

    @Test
    public void Test_readTable() {
        table.add(new Row(new String[] { "Alex", "Bob", "SDS" }));
        table.add(new Row(new String[] { "Charlie", "Diana", "SSE" }));
        table.writeTable(new String("Student"));
        Table new_table = Table.readTable(new String("Student"));
        new_table.print();
    }

    @Test
    public void Test_columns() {
        table.add(new Row(new String[] { "Alex", "Bob", "SDS" }));
        table.add(new Row(new String[] { "Charlie", "Diana", "SSE" }));
        assertEquals(3, table.columns());
        Table new_table = new Table(new String[] { "A_Test", "B_Test" });
        assertEquals(2, new_table.columns());
    }

    @Test
    public void Test_getTitle() {
        assertEquals("Student", table.getTitle(0));
        assertEquals("School", table.getTitle(2));
    }

    @Test
    public void Test_findColumn() {
        assertEquals(1, table.findColumn("Mentor"));
        assertEquals(2, table.findColumn("School"));
    }

    @Test
    public void Test_size() {
        table.add(new Row(new String[] { "Alex", "Bob", "SDS" }));
        assertEquals(1, table.size());
        table.add(new Row(new String[] { "Charlie", "Diana", "SSE" }));
        assertEquals(2, table.size());
    }

    @Test
    public void Test_add() {
        table.add(new Row(new String[] { "Test", "Add", "Success" }));
        table.add(new Row(new String[] { "Print", "To", "Check" }));
        table.print();
    }
}
