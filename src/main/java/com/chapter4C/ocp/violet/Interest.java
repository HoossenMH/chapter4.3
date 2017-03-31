package com.chapter4C.ocp.violet;

/**
 * Created by Toshiba on 2016/03/27.
 */
public class Interest {

    public double interest(Object business){

        if(business instanceof PizzaShop){

            PizzaShop shop = (PizzaShop) business;
            return shop.getLoanAmount() * 0.05;
        }
        else{

            TukShop shop2 = (TukShop) business;
            return shop2.getLoanAmount() * 0.10;
        }
    }
}
