package com.imhuis.code.design.builder;

/**
 * @author: imhuis
 * @date: 2024/1/6
 * @description: 指挥者
 */
public class Director {

    public void constructProduct(Builder builder) {
        builder.buildStepOne();
        builder.buildStepTwo();
        builder.buildStepThree();
    }
}
