package com.imhuis.code.design.simplefactory;

import com.imhuis.code.design.factorymethod.ConcreteProductA;
import com.imhuis.code.design.factorymethod.ConcreteProductB;
import com.imhuis.code.design.factorymethod.IProduct;

/**
 * @author: imhuis
 * @date: 2023/8/9
 * @description:
 */
public abstract class FactoryCreator {

    // 简单工厂模式
    static IProduct createProduct(String type) {
        switch (type) {
            case "one":
                return new ConcreteProductA();
            case "two":
                return new ConcreteProductB();
        }
        return null;
    }


    public static void main(String[] args) {

    }
}
