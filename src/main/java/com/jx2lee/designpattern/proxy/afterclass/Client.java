package com.jx2lee.designpattern.proxy.afterclass;

import com.jx2lee.designpattern.proxy.afterclass.service.GameServiceProxy;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        GameServiceProxy gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
