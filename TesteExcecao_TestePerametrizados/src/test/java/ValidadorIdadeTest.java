import org.example.ValidadorIdade;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidadorIdadeTest {

    ValidadorIdade validadorIdade = new ValidadorIdade();

    @ParameterizedTest
    @CsvSource({
            "11, False",
            "59, True",
            "18, True",
            "22, True",
            "12, False",
            "-5, False"
    })

    public void testValidadorDeIdade(int idade, boolean expected){
        assertEquals(expected, validadorIdade.isMaiorDeIdade(idade));
    }
}
