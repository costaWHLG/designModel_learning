package com.costa.design.model.strategy.duck.impl;

import com.costa.design.model.strategy.duck.Duck;
import com.costa.design.model.strategy.duck.behavior.FlyBehavior;
import com.costa.design.model.strategy.duck.behavior.QuackBehavior;
import com.costa.design.model.strategy.duck.behavior.impl.FlyWithWings;
import com.costa.design.model.strategy.duck.behavior.impl.Quack;

/**
 * 鸭子对象
 * 所有对象共有的行为，比如外观（鸭子的样子各有不同）、游泳（假设鸭子都会游泳，该行为的简单描述是一致的，思考：如果要分不同的游泳方式呢？）
 * ---1、如果高度一致，直接在超类实现，比如游泳
 *     （如果要分不同的游泳方式，个人认为可以在swim方法里面设置不同的对象，见下方的SwimBehavior注释代码）
 * ---2、如果高度不一致，使用继承，比如外观。（本例子默认为这种行为不会重复，每种鸭子外观都不一样）
 * 但是针对飞行和叫声的行为，
 * ---橡胶模型鸭不会叫也不会飞；玩具鸭可能有几种，有的会飞有的不会飞，有的会叫有的不会叫；红头鸭、绿头鸭、小黄鸭的叫声一样
 * 这类变化行为的表现不确定，如果直接使用继承，明显会造成代码冗余
 * @author：costa
 * @date：Created in 2022/4/16 11:31
 */
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("我有一个红脑袋");
    }
}
