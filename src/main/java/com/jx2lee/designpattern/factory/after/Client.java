package com.jx2lee.designpattern.factory.after;

import com.jx2lee.designpattern.factory.before.Ship;
import com.jx2lee.designpattern.factory.before.ShipFactory;

public class Client {
    public static void main(String[] args) {
        Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "jaejun.lee.1991@gmail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackShipFactory().orderShip("Blackship", "jaejun.lee.1991@gmail.com");
        System.out.println(blackship);
    }
}
