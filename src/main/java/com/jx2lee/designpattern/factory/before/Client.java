package com.jx2lee.designpattern.factory.before;

public class Client {
    public static void main(String[] args) {
        Ship whiteship = ShipFactory.orderShip("Whiteship", "jaejun.lee.1991@gmail.com");
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("Blackship", "jaejun.lee.1991@gmail.com");
        System.out.println(blackship);
    }
}
