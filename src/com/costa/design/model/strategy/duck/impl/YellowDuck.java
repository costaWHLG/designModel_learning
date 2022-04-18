package com.costa.design.model.strategy.duck.impl;

import com.costa.design.model.strategy.duck.Duck;

/**
 * @author：costa
 * @date：Created in 2022/4/16 15:04
 */
public class YellowDuck extends Duck {
    @Override
    public void display() {
        System.out.println("我有一只小黄鸭");
    }
}
