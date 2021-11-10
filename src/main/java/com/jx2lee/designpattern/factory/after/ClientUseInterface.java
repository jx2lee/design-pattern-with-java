package com.jx2lee.designpattern.factory.after;

public class ClientUseInterface {
    public static void main(String[] args) {
        ClientUseInterface clientUseInterface = new ClientUseInterface();
        clientUseInterface.print(new WhiteShipFactory(),"Whiteship", "jaejun.lee.1991@gmail.com");
        clientUseInterface.print(new BlackShipFactory(),"Blackship", "jaejun.lee.1991@gmail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
