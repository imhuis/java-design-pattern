package com.imhuis.code.design.factory.abstractfactory;

/**
 * @author: imhuis
 * @date: 2023/8/22
 * @description: 抽象工厂
 */
public interface AbstractFactory {

    ConcreteProductC createProductC();
    ConcreteProductD createProductD();
}
