package com.jx2lee.designpattern.factory.after;

<<<<<<< HEAD
=======
import com.jx2lee.designpattern.factory.before.Ship;
import com.jx2lee.designpattern.factory.before.ShipFactory;

>>>>>>> a7c86d9 (singleton 예제 시 생성된 데이터 삭제)
public class Client {
    public static void main(String[] args) {
        Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "jaejun.lee.1991@gmail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackShipFactory().orderShip("Blackship", "jaejun.lee.1991@gmail.com");
        System.out.println(blackship);
    }
}
