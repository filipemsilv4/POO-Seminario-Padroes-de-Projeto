package com.paulofilipe;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitor();
        Livro livro = new Livro("Design Patterns", BigDecimal.valueOf(100));
        livro.accept(visitor);
    }
}