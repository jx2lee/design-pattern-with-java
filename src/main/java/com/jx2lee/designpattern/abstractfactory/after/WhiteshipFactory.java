package com.jx2lee.designpattern.abstractfactory.after;

import com.jx2lee.designpattern.factory.afteruseabstract.DefaultShipFactory;
import com.jx2lee.designpattern.factory.afteruseabstract.Ship;
import com.jx2lee.designpattern.factory.afteruseabstract.WhiteShip;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
