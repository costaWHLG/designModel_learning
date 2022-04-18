package com.costa.design.model.strategy.duck.behavior.impl;

import com.costa.design.model.strategy.duck.behavior.QuackBehavior;

/**
 * @author：costa
 * @date：Created in 2022/4/16 15:14
 */
public class QuackSpeaker implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我用扬声器叫");
    }
}
