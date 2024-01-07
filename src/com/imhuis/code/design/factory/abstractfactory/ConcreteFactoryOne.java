package com.imhuis.code.design.factory.abstractfactory;

/**
 * @author: imhuis
 * @date: 2023/8/23
 * @description:
 */
public class ConcreteFactoryOne implements AbstractFactory {

    @Override
    public ConcreteProductC createProductC() {
        return new ConcreteProductC();
    }

    @Override
    public ConcreteProductD createProductD() {
        return new ConcreteProductD();
    }
}
