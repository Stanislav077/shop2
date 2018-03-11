package com.shop.Shelf;

import com.shop.position.impl.Pen;
import com.shop.position.impl.abst.AbstractPosition;

/**
 * Created by Станислав on 24.02.2018.
 */
public class ShelftPen implements Shelft {

    private int SizePenShelf;
    private Pen array []={};

    public ShelftPen(int sizePenShelf, Pen[] array) {
        SizePenShelf = sizePenShelf;
        this.array = array;
    }

    @Override
    public boolean put(AbstractPosition position) {
       SizePenShelf++;
        array[SizePenShelf] =(Pen)position;
        return  true;
    }

    @Override
    public AbstractPosition get(int index) {
        SizePenShelf--;
        return  array[SizePenShelf];
    }

    @Override
    public boolean checkAvalable(int index) {
        if(SizePenShelf>0){return  true;}else{return false;}
    }
}
