package CicloDeVida;

public class DatabaseConnection {

    private boolean conectado = false;

    public void connect() {
        conectado = true;
        System.out.println("Conectado ao banco de dados");
    }
    public void disconnect() {
        conectado = false;
        System.out.println("Desconectado do banco de dados");
    }

    public boolean isconectado(){
        return conectado;
    }
}
