package com.shop.Shelf;

import com.shop.position.impl.abst.AbstractPosition;

/**
 * Created by Станислав on 24.02.2018.
 */
public interface Shelft {

 public boolean put(AbstractPosition position);
 public AbstractPosition get(int index);
 public boolean checkAvalable(int index);


}
