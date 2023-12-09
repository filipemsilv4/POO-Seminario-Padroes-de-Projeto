package com.paulofilipe;

public class ShoppingCartVisitor implements Visitor {
    @Override
    public void visit(Livro livro) {
        System.out.println("Livro: " + livro.getNome()
                + ", Preço: " + String.format("%.2f", livro.getPreco()));
    }

    @Override
    public void visit(Doce doce) {
        // Prints the name and calories of the candy
        System.out.println("Doce: " + doce.getNome()
                + ", Calorias: " + doce.getCalorias()
                + ", Preço: " + String.format("%.2f", doce.getPreco()));
    }

    @Override
    public void visit(Videogame videogame) {
        // Prints the name and price of the videogame
        System.out.println("Videogame: " + videogame.getNome()
                + ", Ano de lançamento: " + videogame.getAnoLancamento()
                + ", Fabricante: " + videogame.getFabricante()
                + ", Preço: " + String.format("%.2f", videogame.getPreco()));
    }
}
