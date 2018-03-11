package com.shop.bag;

import com.shop.position.Position;

import java.util.ArrayList;

/**
 * Created by cube on 21.02.2018.
 */
public class BagImpl implements Bag {
    private static final int SIZE = 10;

  //  private Position[] positions =  new Position[SIZE];

    ArrayList<Position> list = new ArrayList(SIZE);
    private int realIndex =0;
    private int iteratorIndex = 0;

    @Override
    public int getNotUsedSize() {
        return SIZE - realIndex;
    }

    public void add(Position position){
       // positions[realIndex++] = position;
        list.add(position);
    }

    public boolean haveNext(){

        return iteratorIndex<realIndex;
    }

    public Position next(){
      return  list.get(iteratorIndex++);
       // return positions[iteratorIndex++];
    }

    public void initIterator(){
        iteratorIndex = 0;
    }
}
