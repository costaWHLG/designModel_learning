package com.costa.design.model.strategy.duck;

import com.costa.design.model.strategy.duck.behavior.impl.FlyNoWay;
import com.costa.design.model.strategy.duck.behavior.impl.FlyWithWings;
import com.costa.design.model.strategy.duck.impl.MallardDuck;

/**
 * 测试Main方法类
 *
 * @author：costa
 * @date：Created in 2022/4/16 14:54
 */
public class DuckMainTest {
    public static void main(String[] args) {
        Duck Mallard = new MallardDuck();
        Mallard.performFly();
        Mallard.performSound();

        System.out.println("***我的翅膀受伤了***");

        Mallard.setFlyBehavior(new FlyNoWay());
        Mallard.performFly();
    }
}
