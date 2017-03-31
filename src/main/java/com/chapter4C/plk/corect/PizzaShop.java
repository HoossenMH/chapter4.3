package com.chapter4C.plk.corect;

/**
 * Created by Toshiba on 2016/03/27.
 */
public class PizzaShop extends SmallBusiness {

    private String name;
    private String regNum;
    private double loanAmount;

    public PizzaShop()
    {}

    public PizzaShop(String nm, String regNum, double amount)
    {
        name = nm;
        this.regNum = regNum;
        loanAmount = amount;
    }

    public String getName(PizzaShop shop)
    {
        return shop.name;
    }

    public String getRegNum(PizzaShop shop)
    {
        return shop.regNum;
    }

    public double getLoanAmount(PizzaShop shop)
    {
        return shop.loanAmount;
    }

    public double interest(PizzaShop shop)
    {
        return shop.loanAmount * 0.05;
    }

}