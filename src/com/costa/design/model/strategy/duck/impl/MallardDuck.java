package com.costa.design.model.strategy.duck.impl;

import com.costa.design.model.strategy.duck.Duck;
import com.costa.design.model.strategy.duck.behavior.impl.FlyWithWings;
import com.costa.design.model.strategy.duck.behavior.impl.Quack;

/**
 * 绿头鸭
 * @author：costa
 * @date：Created in 2022/4/16 15:06
 */
public class MallardDuck extends Duck {
    public  MallardDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("我有一只绿头鸭");
    }
}
