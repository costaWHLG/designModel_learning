package com.costa.design.model.strategy.duck.behavior.impl;

import com.costa.design.model.strategy.duck.behavior.QuackBehavior;

/**
 * @author：costa
 * @date：Created in 2022/4/16 15:12
 */
public class QuackMute implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我不会叫");
    }
}
