package com.imhuis.code.design.adapter.clazz;

/**
 * @author: imhuis
 * @date: 2024/1/6
 * @description: 220v -> 5v
 */
public class VoltageAdapter extends Voltage_220V implements Voltage_5V {

    @Override
    public int output_5V() {
        int src = voltage_220v();
        int det = src / 44;
        return det;
    }
}
