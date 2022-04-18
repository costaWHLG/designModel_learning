package com.costa.design.model.strategy.duck.behavior.impl;

import com.costa.design.model.strategy.duck.behavior.FlyBehavior;

/**
 * @author：costa
 * @date：Created in 2022/4/16 15:01
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我用翅膀飞");
    }
}
