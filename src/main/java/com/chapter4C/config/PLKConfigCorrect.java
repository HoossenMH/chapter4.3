package com.chapter4C.config;

import com.chapter4C.plk.corect.PizzaShop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Toshiba on 2016/03/27.
 */
@Configuration
public class PLKConfigCorrect {

    @Bean(name = "pizzaShop")
    public PizzaShop getPizzaShop() {
        return new PizzaShop();
    }

}
