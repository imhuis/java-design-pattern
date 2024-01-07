package com.imhuis.code.design.factory;

/**
 * @author: imhuis
 * @date: 2023/8/9
 * @description: Concrete Products 具体产品
 */
public class ConcreteProductB implements IProduct {

    @Override
    public void trade() {
        System.out.println("ConcreteProductB");
    }
}
