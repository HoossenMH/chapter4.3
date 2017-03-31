package com.chapter4C.isp.correct;

import com.chapter4C.config.ISPConfigCorrect;
import com.chapter4C.srp.correct.PizzaShop;
import com.chapter4C.srp.correct.TukShop;
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
    private TukShop shop2;


    private com.chapter4C.srp.correct.PizzaShop shopB;
    private TukShop shopB2;

    private ApplicationContext ctx;

    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(ISPConfigCorrect.class);
        shop = (com.chapter4C.srp.correct.PizzaShop) ctx.getBean("pizzaShop");
        shop2 = (TukShop) ctx.getBean("tukShop");

        shopB = new PizzaShop("Hasan","13",50);
        shopB2 = new TukShop("Hoossen","123",50);
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

    @Test
    public void testName2()
    {
        Assert.assertEquals("Hasan", shopB2.getName());
    }

    @Test
    public void testRegNum2()
    {
        Assert.assertEquals("13", shopB2.getRegNum());
    }

    @Test
    public void testAmount2()
    {
        Assert.assertEquals(50, shopB2.getLoanAmount(),0.0f);
    }

    @Test
    public void testInterest2()
    {
        Assert.assertEquals(2.5, shopB2.interest(),0.0f);
    }

}
