package com.imhuis.code.design.factorymethod;

/**
 * @author: imhuis
 * @date: 2023/8/22
 * @description: Concrete Creator
 */
public class ConcreteCreatorB extends FactoryCreator {

    @Override
    IProduct createProduct() {
        return new ConcreteProductB();
    }
}
