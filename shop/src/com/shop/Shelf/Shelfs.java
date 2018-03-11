package com.shop.Shelf;

import com.shop.position.impl.abst.AbstractPosition;

import java.util.ArrayList;

/**
 * Created by Станислав on 03.03.2018.
 */
public class Shelfs <T1> {


    private int SizeShelf;
 //   private T1 array []= (T1[]) new Object[]{};
    ArrayList<T1> list = new ArrayList();

    public boolean put(AbstractPosition position) {
        SizeShelf++;
       // array[SizeShelf] =(T1)position;
        list.add((T1)position);
        return  true;
    }
    public AbstractPosition get(int index) {
        SizeShelf--;
        list.remove(SizeShelf);
        return (AbstractPosition) list.get(SizeShelf);
    }

    public boolean checkAvalable(int index) {
        if(SizeShelf>0){return  true;}else{return false;}
    }
}
