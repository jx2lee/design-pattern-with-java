package com.jx2lee.designpattern.proxy.before;

public class GameService {

    public void startGame() throws InterruptedException {
        System.out.println("게임이 시작되었습니다.");
        Thread.sleep(1000L);
    }
}
