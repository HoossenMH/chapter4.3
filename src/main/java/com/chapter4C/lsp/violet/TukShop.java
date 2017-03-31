package com.chapter4C.lsp.violet;

/**
 * Created by Toshiba on 2016/03/27.
 */
public class TukShop extends SmallBusiness{

    private String name;
    private String regNum;
    private double loanAmount;

    public TukShop()
    {}

    public TukShop(String nm, String regNum, double amount)
    {
        name = nm;
        this.regNum = regNum;
        loanAmount = amount;
    }

    public String getName()
    {
        return name;
    }

    public String getRegNum()
    {
        return regNum;
    }

    public double getLoanAmount()
    {
        return loanAmount;
    }

    @Override
    public double interest()
    {
        return loanAmount * 0.10;
    }

    @Override
    public double tax()
    {
        return 0;
    }
}