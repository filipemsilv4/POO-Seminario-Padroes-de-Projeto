package com.paulofilipe;

import java.math.BigDecimal;

public class Videogame implements Item{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    private final String nome;
    private final int anoLancamento;
    private final String fabricante;
    private final BigDecimal preco;

    public Videogame(String nome, int anoLancamento, String fabricante, BigDecimal preco) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getFabricante() {
        return fabricante;
    }

    public BigDecimal getPreco() {
        return preco;
    }
}
