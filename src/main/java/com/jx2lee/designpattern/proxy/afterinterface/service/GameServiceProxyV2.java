package com.jx2lee.designpattern.proxy.afterinterface.service;

public class GameServiceProxyV2 implements GameService{

    private GameService gameService;

    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();
        if (this.gameService == null) {
            this.gameService = new DefaultGameService();
        }
        gameService.startGame();
        System.out.println("System.currentTimeMillis() - before = " + (System.currentTimeMillis() - before));
    }
}
