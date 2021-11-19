package com.jx2lee.designpattern.abstractfactory.before;

import com.jx2lee.designpattern.factory.afteruseabstract.DefaultShipFactory;
import com.jx2lee.designpattern.factory.afteruseabstract.Ship;
import com.jx2lee.designpattern.factory.afteruseabstract.WhiteShip;

public class WhiteshipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
