package com.jx2lee.designpattern.proxy.afterinterface.service;

public class GameServiceProxyV1 implements GameService{

    private GameService gameService;

    public GameServiceProxyV1(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();
        gameService.startGame();
        System.out.println("System.currentTimeMillis() - before = " + (System.currentTimeMillis() - before));
    }
}
