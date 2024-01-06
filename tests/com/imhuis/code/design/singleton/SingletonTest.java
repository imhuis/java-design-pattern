package com.imhuis.code.design.singleton;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author: imhuis
 * @date: 2024/1/6
 * @description:
 */
public class SingletonTest {

    @Test
    public void TestSingleton() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Assert.assertEquals(true, instance1 == instance2);
    }
}
