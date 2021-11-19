package com.jx2lee.designpattern.factory.after;

import com.jx2lee.designpattern.factory.before.Ship;

public class WhiteShipFactory implements ShipFactory{

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
