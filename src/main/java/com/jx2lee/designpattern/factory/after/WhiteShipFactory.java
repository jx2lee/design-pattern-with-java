package com.jx2lee.designpattern.factory.after;

<<<<<<< HEAD
=======
import com.jx2lee.designpattern.factory.before.Ship;

>>>>>>> a7c86d9 (singleton 예제 시 생성된 데이터 삭제)
public class WhiteShipFactory implements ShipFactory{

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
