package com.jx2lee.designpattern.proxy.afterinterface.service;

public class DefaultGameService implements GameService{

    @Override
    public void startGame() throws InterruptedException {
        System.out.println("게임이 시작되었습니다.");
        Thread.sleep(1000L);
    }
}
