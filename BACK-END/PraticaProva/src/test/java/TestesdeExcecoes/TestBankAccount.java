package TestesdeExcecoes;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestBankAccount {

    private static BankAccount bankAccount;

    @BeforeAll
    public static void init() {
        bankAccount = new BankAccount(1000.0);
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Teste Iniciado");
    }

    @Test
    public void testRetirarDinheiro() throws Exception {
        bankAccount.withdraw(500.0);
        assertEquals(500.0, bankAccount.getBalance());
    }

    @Test
    public void testException() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> bankAccount.withdraw(1001.0));
        assertEquals("Saldo insuficiente", exception.getMessage());
    }

    @AfterEach
    public void afterEachTest() {
        System.out.println("Teste concluido");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("Testes finalizados!!");
    }
}
