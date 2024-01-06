package com.imhuis.code.design.abstractfactory;

/**
 * @author: imhuis
 * @date: 2023/8/23
 * @description:
 */
public class ConcreteFactoryTwo implements AbstractFactory {

    @Override
    public ConcreteProductC createProductC() {
        return new ConcreteProductC();
    }

    @Override
    public ConcreteProductD createProductD() {
        return new ConcreteProductD();
    }
}
