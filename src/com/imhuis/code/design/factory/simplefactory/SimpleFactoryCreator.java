package com.imhuis.code.design.factory.simplefactory;

import com.imhuis.code.design.factory.IProduct;

/**
 * @author: imhuis
 * @date: 2023/8/9
 * @description:
 */
public abstract class SimpleFactoryCreator {

    // 简单工厂模式
    static IProduct createProduct(String type) {
        switch (type) {
            case "one":
                return new SimpleProduct();
        }
        return null;
    }

}
