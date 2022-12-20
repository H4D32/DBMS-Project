package t3.db61b;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

/**
 * Basic tests for different select cases
 */
public class SelectTest {
    /**
     * Rigorous Test :-)
     */
    public Table table = new Table(new String[] { "ID", "Student", "Mentor", "School" });
    public Table table2 = new Table(new String[] { "ID", "Course", "Grade" });

    @Test
    public void selectSingleNoCond() {
        table.add(new Row(new String[] { "1", "Alex", "Bob", "SDS" }));
        table.add(new Row(new String[] { "2", "Charlie", "Diana", "SSE" }));
        assertEquals(3, table.findColumn("School"));
        List<String> columnNames = new ArrayList<>();
        columnNames.add("Student");
        columnNames.add("School");
        Table selected = table.select(columnNames);
        assertEquals(1, selected.findColumn("School"));
        for (Row r : selected) {
            assertEquals(2, r.size());
        }
        selected.print();
    }

    @Test
    public void Test_selectWithConditions() {
        Table student = new Table(new String[] { "name", "score" });
        student.add(new Row(new String[] { "Alex", "60" }));
        student.add(new Row(new String[] { "Candy", "20" }));
        student.add(new Row(new String[] { "Duke", "100" }));
        Column col1 = new Column("score", student);
        Column col2 = new Column("name", student);
        Condition con1 = new Condition(col1, ">", "50");
        Condition con2 = new Condition(col2, "<", "Bob");
        List<String> columnNames = new ArrayList<>();
        columnNames.add("score");
        columnNames.add("name");
        List<Condition> conditions = new ArrayList<>();
        conditions.add(con1);
        conditions.add(con2);
        Table selected = student.select(columnNames, conditions);
        selected.print();
    }

    @Test
    public void selectDoubleNoCond() {
        table.add(new Row(new String[] { "1", "Alex", "Bob", "SDS" }));
        table.add(new Row(new String[] { "2", "Charlie", "Diana", "SSE" }));
        table2.add(new Row(new String[] { "1", "Math", "A" }));
        table2.add(new Row(new String[] { "1", "Phy", "B" }));
        table2.add(new Row(new String[] { "1", "Chem", "C" }));
        table2.add(new Row(new String[] { "2", "Math", "B+" }));
        table2.add(new Row(new String[] { "2", "Phy", "B-" }));
        table2.add(new Row(new String[] { "2", "Csc", "A-" }));
        List<String> columnNames = new ArrayList<>();
        columnNames.add("Student");
        columnNames.add("Course");
        columnNames.add("Grade");
        Table selected = table.select(table2, columnNames);
        assertEquals(2, selected.findColumn("Grade"));
        for (Row r : selected) {
            assertEquals(3, r.size());
        }
        selected.print();
    }

    @Test
    public void selectDoubleWithCond() {
        table.add(new Row(new String[] { "1", "Alex", "Bob", "SDS" }));
        table.add(new Row(new String[] { "2", "Charlie", "Diana", "SSE" }));
        table2.add(new Row(new String[] { "1", "Math", "A" }));
        table2.add(new Row(new String[] { "1", "Phy", "B" }));
        table2.add(new Row(new String[] { "1", "Chem", "C" }));
        table2.add(new Row(new String[] { "2", "Math", "B+" }));
        table2.add(new Row(new String[] { "2", "Phy", "B-" }));
        table2.add(new Row(new String[] { "2", "Csc", "A-" }));
        List<String> columnNames = new ArrayList<>();
        columnNames.add("Student");
        columnNames.add("Course");
        columnNames.add("Grade");
        List<Condition> conditions = new ArrayList<>();
        Column col1 = new Column("School", table);
        Condition con1 = new Condition(col1, "=", "SDS");
        conditions.add(con1);
        Table selected = table.select(table2, columnNames,conditions);
        selected.print();
    }
}