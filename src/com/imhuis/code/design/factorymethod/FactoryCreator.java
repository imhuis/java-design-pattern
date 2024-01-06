package com.imhuis.code.design.factorymethod;

import java.util.Calendar;

/**
 * @author: imhuis
 * @date: 2023/8/9
 * @description: Creator
 *
 * @See Calendar#getInstance()
 */
public abstract class FactoryCreator {

    /*
    实现类不一定每次调用都创建新实例，工厂方法也可以返回缓存、对象池或其他来源的已有对象
     */
    abstract IProduct createProduct();

    public static void main(String[] args) {
        Calendar.getInstance();
    }
}
