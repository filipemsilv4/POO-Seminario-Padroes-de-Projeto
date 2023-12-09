package com.paulofilipe;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitor();
        ArrayList<Item> itens = new ArrayList<>();

        itens.add(new Livro("Design Patterns", BigDecimal.valueOf(100)));
        itens.add(new Doce("Bolo de chocolate", 200, BigDecimal.valueOf(10)));
        itens.add(new Videogame("PS5", 2020, "Sony", BigDecimal.valueOf(4000)));

        for (Item item : itens) item.accept(visitor);
    }
}