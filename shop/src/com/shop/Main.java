package com.shop;

import com.shop.Shelf.Shelfs;
import com.shop.Shelf.Shelft;
import com.shop.bag.ATBPacket;
import com.shop.bag.Bag;
import com.shop.bag.BagImpl;
import com.shop.manager.ShopManager;
import com.shop.position.impl.Apple;
import com.shop.position.impl.Pen;

import java.util.Scanner;

/**
 * Created by cube on 21.02.2018.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bag bag;
       Shelfs shelaplle = new Shelfs();
      Shelfs shelpen = new Shelfs();
   //     shelpen.put(new Pen(10,"karandashik"));
    //    shelaplle.put(new Apple(25, "Iabloc"));

        System.out.println("S chem poidem vasia?");
        System.out.println("1: ATB power");
        System.out.println("2: Standart edition Galia");

        switch (scanner.nextInt()){
            case 1:
                bag = new ATBPacket();
                shelpen.put(new Pen(10,"karandashik"));
                shelaplle.put(new Apple(25, "Iabloc"));

                break;
            case 2:
                bag= new BagImpl();
                shelpen.put(new Pen(10,"karandashik"));
                shelaplle.put(new Apple(25, "Iabloc"));
                break;
            default:
                System.out.println("sho zirkaech? pognali s rukzacom");
                bag= new BagImpl();
        }
        while (true){
            System.out.println("Shito delaem desy?");
            System.out.println("1: go za pokupkami person-san");
            System.out.println("2: go na cassu");
            switch (scanner.nextInt()){
                case 1:
                  //  doPokupki(bag);
                    doPokupki(bag,shelaplle,shelpen);
                    break;
                case 2:
                    goNaCassu(bag);
                    break;
                default:
                    System.out.println("dich. ti vtiraech mne dich");
            }
        }
    }

    private static void doPokupki(Bag bag,Shelfs shelaplle,Shelfs shelpen){
        Scanner scanner = new Scanner(System.in);

        while(bag.getNotUsedSize() != 0){
            System.out.println("1:Pen");
            System.out.println("2:Apple");
            System.out.println("3:dumay");
            switch (scanner.nextInt()){
                case 1:
                  //  bag.add(new Pen(10,"karandashik"));
                    bag.add(shelpen.get(0));
                    break;
                case 2: bag.add(new Apple(25, "Iabloc")); break;
                case 3: return;
                default:
                    System.out.println("dich. ti vtiraech mne dich");
            }
        }
        System.out.println("Galia, I te sho grushick");
    }

    private static void goNaCassu(Bag bag){
        ShopManager babaGala = new ShopManager();
        try {
            babaGala.sum(bag);
            System.out.println("oi mama, hera tac dorogo");
            System.exit(0);
        } catch (InterruptedException e) {
            System.out.println("SCORUYY!!BABA GALA ");
        }
    }

}
