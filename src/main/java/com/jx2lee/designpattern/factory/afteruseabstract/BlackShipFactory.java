package com.jx2lee.designpattern.factory.afteruseabstract;

public class BlackShipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
