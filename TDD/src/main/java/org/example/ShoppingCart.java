package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> itens;

    public ShoppingCart(){
        this.itens = new ArrayList<>();
    }

    public void addItem(Item item) {
        itens.add(item);
    }

    public int getItemCount() {
        return itens.size();
    }

    public double calculateTotal() {
        return itens.stream().mapToDouble(Item::getPreco).sum();
    }
}
