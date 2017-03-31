package com.chapter4C.plk.violet;


import com.chapter4C.config.PLKConfigViolet;
import com.chapter4C.plk.corect.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Toshiba on 2016/03/27.
 */
public class VioletTest {

    private PizzaShop shop;
    private com.chapter4C.plk.corect.SmallBusiness business;

    private PizzaShop shopB;

    private ApplicationContext ctx;

    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(PLKConfigViolet.class);
        shop = (PizzaShop) ctx.getBean("pizzaShop");
        business = (com.chapter4C.plk.corect.PizzaShop) ctx.getBean("pizzaShop");

        shopB = new PizzaShop("Hasan","13",50);
    }

    @Test
    public void testName()
    {
        Assert.assertEquals("Hasan", shopB.getName());
    }

    @Test
    public void testRegNum()
    {
        Assert.assertEquals("13", shopB.getRegNum());
    }

    @Test
    public void testAmount()
    {
        Assert.assertEquals(50, shopB.getLoanAmount(),0.0f);
    }

    @Test
    public void testInterest()
    {
        Assert.assertEquals(2.5, shopB.interest(),0.0f);
    }


}

