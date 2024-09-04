import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class TestList {
    private List<String> list;
    private ListUtils listUtils;

    @Before
    public void setUp(){
        list = new ArrayList<>();
        listUtils = new ListUtils();
    }

    @Test
    public void testAddToList(){
        listUtils.addToList(list, "item1");
        assertEquals(1, list.size());

        assertTrue(list.contains("item1"));

        listUtils.addToList(list, "item2");
        assertEquals(2, list.size());
    }
    @Test
    public void testRemoveFromList(){
        list.add("item1");
        listUtils.removeFromList(list, "item1");

        assertFalse(list.contains("item1"));
        assertEquals(0, list.size());
    }
    @Test
    public void testContainsFromList(){
        list.add("item1");
        assertTrue(listUtils.findInList(list, "item1"));
    }

}
