package com.jx2lee.designpattern.factory.after;

import com.jx2lee.designpattern.factory.before.Ship;

public class BlackShip extends Ship {
    public BlackShip() {
        setName("blackship");
        setLogo("⚓");
        setColor("black");
    }
}
