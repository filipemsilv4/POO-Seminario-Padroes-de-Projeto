package com.paulofilipe;

public class ShoppingCartVisitor implements Visitor {
    @Override
    public void visit(Livro livro) {
        // Prints the name and price of the book with 2 decimal places
        System.out.println("Livro: " + livro.getNome() + ", Preço: " + String.format("%.2f", livro.getPreco()));
    }
}
