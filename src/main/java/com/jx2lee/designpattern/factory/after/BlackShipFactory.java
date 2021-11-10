package com.jx2lee.designpattern.factory.after;

import com.jx2lee.designpattern.factory.before.Ship;

public class BlackShipFactory implements ShipFactory{
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
