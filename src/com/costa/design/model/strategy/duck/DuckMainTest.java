package com.costa.design.model.strategy.duck;

import com.costa.design.model.strategy.duck.behavior.impl.FlyNoWay;
import com.costa.design.model.strategy.duck.impl.MallardDuck;

/**
 * 测试Main方法类
 *
 * @author：costa
 * @date：Created in 2022/4/16 14:54
 */
public class DuckMainTest {

    static volatile  Duck Mallard = new MallardDuck();
    public static void main(String[] args) {
        Mallard.performFly();
        Mallard.performSound();

        //假设鸭子受伤了，动态变化其
        System.out.println("***我的翅膀受伤了***");

        Mallard.setFlyBehavior(new FlyNoWay());
        Mallard.performFly();
    }
}
