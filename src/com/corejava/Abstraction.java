package com.corejava;

public abstract class Abstraction {

    abstract public void mobileCall(long fromNumber, long toNumber);
}

class AbstractionImp extends Abstraction {

    @Override
    public void mobileCall(long fromNumber, long toNumber) {
        System.out.println("Connected to Tower..");
    }
}

class AbstractMain {
    public static void main(String[] args) {
        Abstraction abstraction = new AbstractionImp();
        abstraction.mobileCall(9935469345L, 7814565475L);
    }
}
