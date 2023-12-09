package com.paulofilipe.Itens;

import com.paulofilipe.Visitor;

public interface Item {
    void accept(Visitor visitor);
}
