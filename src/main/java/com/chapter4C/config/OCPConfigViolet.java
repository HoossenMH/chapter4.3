package com.chapter4C.config;

import com.chapter4C.ocp.violet.PizzaShop;
import com.chapter4C.ocp.violet.TukShop;
import com.chapter4C.ocp.violet.Interest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Toshiba on 2016/03/27.
 */
@Configuration
public class OCPConfigViolet {

    @Bean(name = "interest")
    public Interest getInterest() {
        return new Interest();
    }

    @Bean(name = "pizzaShop")
    public PizzaShop getPizzaShop() {
        return new PizzaShop();
    }

    @Bean(name = "tukShop")
    public TukShop getTukShop() {
        return new TukShop();
    }
}