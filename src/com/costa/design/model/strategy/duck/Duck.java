package com.costa.design.model.strategy.duck;

import com.costa.design.model.strategy.duck.behavior.FlyBehavior;
import com.costa.design.model.strategy.duck.behavior.QuackBehavior;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 鸭子对象
 * 所有对象共有的行为，比如外观（鸭子的样子各有不同）、游泳（假设鸭子都会游泳，该行为的描述是一致的）
 * ---1、如果高度一致，直接在超类实现，比如游泳
 * ---2、如果高度不一致，使用继承，比如外观。（本例子默认为这种行为不会重复，每种鸭子外观都不一样）
 * 但是针对飞行和叫声的行为，
 * ---橡胶模型鸭不会叫也不会飞；玩具鸭可能有几种，有的会飞有的不会飞，有的会叫有的不会叫；红头鸭、绿头鸭、小黄鸭的叫声一样
 * 这类变化行为的表现不确定，如果直接使用继承，明显会造成代码冗余
 * @author：costa
 * @date：Created in 2022/4/16 14:50
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    /* 要分不同的游泳方式,这样只用
    SwimBehavior swimBehavior;

    public void setSwimBehavior(SwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }

    public void swim(){
        swimBehavior.swim();
    }*/

    /**
     * FlyBehavior和 QuackBehavior为类的属性，本身是动态的，通过setter方法
     * 如果不提供setter方法，你就得在实现类
     * public XXXDuck(){
     *     flyBehavior= new FlyBehaviorImpl1();
     *     quackBehavior=new QuackBehaviorImpl1();
     * }
     * 这样一来在XXXDuck的代码里面设置了具体实现 FlyBehaviorImpl1和QuackBehaviorImpl1,且flyBehavior和quackBehavior未被封装,
     *
     * 如果提供setter方法,就可以再运行时去动态设置flyBehavior和quackBehavior，扩展性无疑更强
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    //所有鸭子对象都会游泳（本书作者认为不会游泳就不叫鸭子了O(∩_∩)O哈哈~）
    public void swim(){
        System.out.println("我在游泳");
    }

    //所有鸭子对象都有外观，且每个对象的外观基本都不同，可以使用继承
    public abstract void display();

    //飞行方式->Interface FlyBehavior
    public void performFly(){
        flyBehavior.fly();

    }

    //鸭子叫的方式->Interface QuackBehavior
    public void performSound(){
        quackBehavior.quack();
    }
}
