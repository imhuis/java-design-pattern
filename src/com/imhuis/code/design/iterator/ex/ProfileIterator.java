package com.imhuis.code.design.iterator.ex;

/**
 * @author: imhuis
 * @date: 2024/1/4
 * @description:
 */
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();


}
