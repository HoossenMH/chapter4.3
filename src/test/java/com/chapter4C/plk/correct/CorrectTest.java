package com.chapter4C.plk.correct;

import com.chapter4C.config.PLKConfigCorrect;
import com.chapter4C.plk.corect.PizzaShop;
import com.chapter4C.plk.corect.SmallBusiness;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Toshiba on 2016/03/27.
 */
public class CorrectTest {

    private PizzaShop shop;
    private SmallBusiness business;

    private PizzaShop shopB;

    private ApplicationContext ctx;

    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(PLKConfigCorrect.class);
        shop = (PizzaShop) ctx.getBean("pizzaShop");
        business = (PizzaShop) ctx.getBean("pizzaShop");

        shopB = new PizzaShop("Hasan","13",50);
    }

    @Test
    public void testName()
    {
        Assert.assertEquals("Hasan", shopB.getName(shop));
    }

    @Test
    public void testRegNum()
    {
        Assert.assertEquals("13", shopB.getRegNum(shop));
    }

    @Test
    public void testAmount()
    {
        Assert.assertEquals(50, shopB.getLoanAmount(shop),0.0f);
    }

    @Test
    public void testInterest()
    {
        Assert.assertEquals(2.5, shopB.interest(shop),0.0f);
    }


}
