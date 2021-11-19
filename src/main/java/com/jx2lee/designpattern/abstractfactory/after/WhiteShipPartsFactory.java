package com.jx2lee.designpattern.abstractfactory.after;

import com.jx2lee.designpattern.abstractfactory.before.Anchor;
import com.jx2lee.designpattern.abstractfactory.before.Wheel;
import com.jx2lee.designpattern.abstractfactory.before.WhiteAnchor;
import com.jx2lee.designpattern.abstractfactory.before.WhiteWheel;

public class WhiteShipPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
