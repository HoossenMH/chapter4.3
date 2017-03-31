package com.chapter4C.config;

import com.chapter4C.srp.violet.PizzaShop;
import com.chapter4C.srp.violet.TukShop;
import org.springframework.context.annotation.Bean;

/**
 * Created by Toshiba on 2016/03/27.
 */
public class ConfigViolet {

    @Bean(name = "pizzaShop")
    public PizzaShop getPizzaShop() {
        return new PizzaShop();
    }

    @Bean(name = "tukShop")
    public TukShop getTukShop() {
        return new TukShop();
    }
}
