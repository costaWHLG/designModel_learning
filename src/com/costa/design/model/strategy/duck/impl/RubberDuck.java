package com.costa.design.model.strategy.duck.impl;

import com.costa.design.model.strategy.duck.Duck;

/**
 * 橡皮鸭
 * @author：costa
 * @date：Created in 2022/4/16 14:57
 */
public class RubberDuck extends Duck {

    @Override
    public void display() {
        System.out.println("我有一只橡皮鸭");
    }
}
