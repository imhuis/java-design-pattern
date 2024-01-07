package com.imhuis.code.design.factory.simplefactory;

import com.imhuis.code.design.factory.IProduct;

/**
 * @author: imhuis
 * @date: 2024/1/7
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        IProduct p = SimpleFactoryCreator.createProduct("one");
        System.out.println(p);
    }
}
