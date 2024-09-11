package org.example;

public class DatabaseUtils {
    private boolean connected = false;
    public void connect(){
        connected = true;
        System.out.println("Conectado ao Banco de Dados");
    }
    public void disconnect(){
        connected = false;
        System.out.println("Desconectado do Banco de Dados");
    }
    public boolean isConnected(){
        return connected;
    }
}

