package com.chapter4C.plk.corect;

/**
 * Created by Toshiba on 2016/03/27.
 */
public abstract class SmallBusiness {

    public String getName(PizzaShop shop) {
        return shop.getName(shop);
    }

    public String getRegNum(PizzaShop shop) {
        return shop.getRegNum(shop);
    }

    public double getLoanAmount(PizzaShop shop) {
        return shop.getLoanAmount(shop);
    }

    public abstract double interest(PizzaShop shop);
}