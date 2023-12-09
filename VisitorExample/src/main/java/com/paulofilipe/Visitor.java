package com.paulofilipe;

public interface Visitor {
    void visit(Livro livro);

    void visit(Doce doce);

    void visit(Videogame videogame);
}