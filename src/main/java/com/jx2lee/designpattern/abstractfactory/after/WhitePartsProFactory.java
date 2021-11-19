package com.jx2lee.designpattern.abstractfactory.after;

import com.jx2lee.designpattern.abstractfactory.before.Anchor;
import com.jx2lee.designpattern.abstractfactory.before.Wheel;

public class WhitePartsProFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
