import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteCalculadora {

    @Test
    public void testSoma(){
        Assert.assertEquals(10.0, Calculadora.soma(2,8), 0);
    }

    @Test
    public void testSubtracao(){
        assertEquals(10.0, Calculadora.subtracao(12,2), 0);
    }

    @Test
    public void testMultiplicacao(){
        assertEquals(10.0, Calculadora.multiplicacao(5,2), 0);
    }

    @Test
    public void testDivisao(){
        assertEquals(10.0, Calculadora.divisao(100,10), 0);
    }

    @Test
    public void testPotencia(){
        assertEquals(144.0, Calculadora.potencia(12,2), 0);
    }
}
