package com.paulofilipe;

import java.math.BigDecimal;

public class Doce implements Item{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    private final String nome;
    private final int calorias;
    private final BigDecimal preco;

    public Doce(String nome, int calorias, BigDecimal preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getCalorias() {
        return calorias;
    }

    public BigDecimal getPreco() {
        return preco;
    }
}
