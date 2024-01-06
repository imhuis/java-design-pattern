package com.imhuis.code.design.factorymethod;

/**
 * @author: imhuis
 * @date: 2023/8/22
 * @description:
 */
public class FactoryImplA implements IFactory {

    @Override
    public IProduct createProduct() {
        return new ConcreteProductA();
    }
}
