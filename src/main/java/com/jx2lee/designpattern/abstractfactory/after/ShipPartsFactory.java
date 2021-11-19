package com.jx2lee.designpattern.abstractfactory.after;

import com.jx2lee.designpattern.abstractfactory.before.Anchor;
import com.jx2lee.designpattern.abstractfactory.before.Wheel;

public interface ShipPartsFactory {
    Anchor createAnchor();
    Wheel createWheel();
}
