package com.jx2lee.designpattern.factory.after;

import com.jx2lee.designpattern.factory.before.Ship;

public class WhiteShip extends Ship {
    public WhiteShip() {
        setName("whiteship");
        setLogo("\uD83D\uDEE5️");
        setColor("white");
    }
}
