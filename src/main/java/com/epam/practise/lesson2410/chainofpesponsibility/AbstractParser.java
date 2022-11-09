package com.epam.practise.lesson2410.chainofpesponsibility;

import com.epam.composite.UnitComposite;

import java.awt.*;

public abstract class AbstractParser {
    protected AbstractParser successor;

    public AbstractParser getSuccessor() {
        return successor;
    }

    public void setSuccessor(AbstractParser successor) {
        this.successor = successor;
    }

    public abstract UnitComposite parse(String str);
}
