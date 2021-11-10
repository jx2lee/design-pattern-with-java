package com.jx2lee.designpattern.factory.afteruseabstract;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }
    void sendEmailTo(String email, Ship ship);
    Ship createShip();
    void validate(String name, String email);
    void prepareFor(String name);
}
