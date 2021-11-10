package com.jx2lee.designpattern.factory.afteruseabstract;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
