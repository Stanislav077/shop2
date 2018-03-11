package com.shop.position.impl;

import com.shop.position.Position;
import com.shop.position.impl.abst.AbstractPosition;

/**
 * Created by cube on 21.02.2018.
 */
public class Pen extends AbstractPosition {
    public Pen(double price, String name) {
        super(price, name);
    }

    @Override
    public int compareTo(Position o) {
        return name.compareTo(o.getName());
    }
}
