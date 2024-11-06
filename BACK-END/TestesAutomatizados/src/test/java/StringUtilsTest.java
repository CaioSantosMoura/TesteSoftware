import org.example.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    private StringUtils stringUtils;
    @BeforeEach

    public void setUp() {
        stringUtils = new StringUtils();
    }

    @Test
    public void testReverseWithValidString() {
        // Arrange
        String input = "hello";
        // Act
        String result = stringUtils.reverse(input);
        // Assert
        assertEquals("olleh", result, "A inversão de 'hello' deve resultar em " +
                "'olleh'");
    }
    @Test
    public void testReverseWithEmptyString() {
        // Arrange
        String input = "";
        // Act
        String result = stringUtils.reverse(input);
        // Assert
        assertEquals("", result, "A inversão de uma string vazia deve resultar " +
                "em uma string vazia");
    }
    @Test
    public void testIsPalindromeWithPalindromeString() {
        // Arrange
        String input = "madam";
        // Act
        boolean result = stringUtils.isPalindrome(input);
        // Assert
        assertTrue(result, "A string 'madam' deve ser identificada como um palíndromo");
    }

    @Test
    public void testIsPalindromeWithNonPalindromeString() {
        // Arrange
        String input = "hello";
        // Act
        boolean result = stringUtils.isPalindrome(input);
        // Assert
        assertFalse(result, "A string 'hello' não deve ser identificada como um palíndromo");
    }

    @Test
    public void testIsPalindromeWithSpacesAndCapitalLetters() {
        // Arrange
        String input = "A man a plan a canal Panama";
        // Act
        boolean result = stringUtils.isPalindrome(input);
        // Assert
        assertTrue(result, "A frase 'A man a plan a canal Panama' deve ser " +
                "identificada como um palíndromo ignorando espaços e letras maiúsculas");
    }
}