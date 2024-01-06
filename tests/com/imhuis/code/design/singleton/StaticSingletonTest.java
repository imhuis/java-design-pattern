package com.imhuis.code.design.singleton;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author: imhuis
 * @date: 2024/1/6
 * @description:
 */
public class StaticSingletonTest {

    @Test
    public void TestStaticSingleton() {
        StaticSingleton instance1 = StaticSingleton.getInstance();
        StaticSingleton instance2 = StaticSingleton.getInstance();
        Assert.assertEquals(true, instance1 == instance2);
    }
}
