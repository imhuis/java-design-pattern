package com.imhuis.code.design.factory.simplefactory;

import com.imhuis.code.design.factory.IProduct;

/**
 * @author: imhuis
 * @date: 2024/1/7
 * @description:
 */
public class SimpleProduct implements IProduct {
    @Override
    public void trade() {
        System.out.println("simple factory pattern");
    }
}
