package com.costa.design.model.strategy.duck.impl;

import com.costa.design.model.strategy.duck.Duck;

/**
 * @author：costa
 * @date：Created in 2022/4/16 15:05
 */
public class WoodDuck extends Duck {
    @Override
    public void display() {
        System.out.println("我有一只木头鸭");
    }
}
