package com.imhuis.code.design.factorymethod;

/**
 * @author: imhuis
 * @date: 2023/8/9
 * @description: Concrete Products
 */
public class ConcreteProductB implements IProduct {

    @Override
    public void trade() {
        System.out.println("ConcreteProductB");
    }
}
