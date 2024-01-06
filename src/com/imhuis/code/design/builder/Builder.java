package com.imhuis.code.design.builder;

/**
 * @author: imhuis
 * @date: 2023/8/23
 * @description: Builder 建造者模式，又称生成器模式
 *
 * Builder interface defines all possible ways to configure a product.
 * {@link StringBuilder}
 */
public interface Builder {

    void reset();

    void buildStepOne();

    void buildStepTwo();

    void buildStepThree();

    default Product getProduct() {
        return null;
    }
}
