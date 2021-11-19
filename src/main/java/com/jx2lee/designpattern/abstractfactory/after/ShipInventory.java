package com.jx2lee.designpattern.abstractfactory.after;

import com.jx2lee.designpattern.factory.afteruseabstract.Ship;
import com.jx2lee.designpattern.factory.afteruseabstract.ShipFactory;

public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhitePartsProFactory());
        // ShipFactory shipFactory = new WhiteshipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println("ship.getAnchor().getClass() = " + ship.getAnchor().getClass());
        System.out.println("ship.getWheel().getClass() = " + ship.getWheel().getClass());
    }
}
