package com.paulofilipe;

import java.math.BigDecimal;

public class Livro implements Item {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    private final String nome;
    private final BigDecimal preco;

    public Livro(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }
}