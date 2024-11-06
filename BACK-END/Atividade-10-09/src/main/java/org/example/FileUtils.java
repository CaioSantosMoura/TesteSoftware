package org.example;

public class FileUtils {

    public void openConnection(){
        System.out.println("Conexão com Sistema de Arquivos Aberta.");
    }

    public void closeConnection(){
        System.out.println("Conexão com Sistema de Aquivos Fechada.");
    }

    public String createFile(String fileName){
        System.out.println("Arquivo " + fileName + " Criado.");
        return fileName;
    }
    public boolean deleteFile(String fileName){
        System.out.println("Arquivo " + fileName + " Deletado.");
        return true;
    }
}
