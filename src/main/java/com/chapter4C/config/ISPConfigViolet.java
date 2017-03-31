package com.chapter4C.config;

import com.chapter4C.isp.violet.PizzaShop;
import com.chapter4C.isp.violet.TukShop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Toshiba on 2016/03/27.
 */
@Configuration
public class ISPConfigViolet {

    @Bean(name = "pizzaShop")
    public PizzaShop getPizzaShop() {
        return new PizzaShop();
    }

    @Bean(name = "tukShop")
    public TukShop getTukShop() {
        return new TukShop();
    }
}
