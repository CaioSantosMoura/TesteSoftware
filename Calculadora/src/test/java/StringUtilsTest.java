import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {

    private StringUtils stringUtils;

    @Before
    public void setUp(){
        stringUtils = new StringUtils();
    }
    @Test
    public void testIsPalindrome(){
        assertTrue(stringUtils.isPalindrome("ovo"));
        assertTrue(stringUtils.isPalindrome("subi no onibus"));
        assertFalse(stringUtils.isPalindrome("Nathan"));
        assertFalse(stringUtils.isPalindrome(""));
    }

    @Test
    public void testReverse(){
        assertEquals("aruomsotnassodoiac", stringUtils.reverse("Caio dos Santos Moura"));
    }

    @Test
    public void testUpperCase(){
        assertEquals("SUBI NO ONIBUS NATAN", stringUtils.toUpperCase("subi no onibus natan"));
    }



}
