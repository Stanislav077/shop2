package com.shop.Shelf;

import com.shop.position.impl.Apple;
import com.shop.position.impl.abst.AbstractPosition;

/**
 * Created by Станислав on 24.02.2018.
 */
public class ShelftApple implements Shelft {

    private int SizeApleShelf;
    private Apple array []={};

    public ShelftApple(int sizeApleShelf, Apple[] array) {
        SizeApleShelf = sizeApleShelf;
        this.array = array;
    }

    @Override
    public boolean put(AbstractPosition position) {
        SizeApleShelf++;
       array[SizeApleShelf] =(Apple)position;
        return  true;
    }

    @Override
    public AbstractPosition get(int index) {
        SizeApleShelf--;
        return  array[SizeApleShelf];
    }

    @Override
    public boolean checkAvalable(int index) {
        if(SizeApleShelf>0){return  true;}else{return false;}
    }
}
