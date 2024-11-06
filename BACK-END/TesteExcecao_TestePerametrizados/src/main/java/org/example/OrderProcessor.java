package org.example;

public class OrderProcessor {

    public double processOrder(int quantidade, double preco) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade não pode ser negativa");
        }
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo");
        }
        return quantidade * preco;
    }
}
