package com.paulofilipe;

import com.paulofilipe.Visitor;

public interface Item {
    void accept(Visitor visitor);
}
