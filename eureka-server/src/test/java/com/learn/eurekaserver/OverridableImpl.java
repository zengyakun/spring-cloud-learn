package com.learn.eurekaserver;

/**
 * @author sunli
 * @create 2017-12-18 15:59
 */

public class OverridableImpl implements Defaulable {
    @Override
    public String notRequired() {
        return "Overridden implementation";
    }
}
