package com.paulofilipe;

import com.paulofilipe.Itens.Doce;
import com.paulofilipe.Itens.Livro;
import com.paulofilipe.Itens.Videogame;

public interface Visitor {
    void visit(Livro livro);

    void visit(Doce doce);

    void visit(Videogame videogame);
}