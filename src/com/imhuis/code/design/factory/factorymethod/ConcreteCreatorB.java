package com.imhuis.code.design.factory.factorymethod;

import com.imhuis.code.design.factory.ConcreteProductB;
import com.imhuis.code.design.factory.IProduct;

/**
 * @author: imhuis
 * @date: 2023/8/22
 * @description: Concrete Creator 创建者
 */
public class ConcreteCreatorB extends FactoryCreator {

    @Override
    IProduct createProduct() {
        return new ConcreteProductB();
    }
}
