package com.jx2lee.designpattern.proxy.afterinterface;

import com.jx2lee.designpattern.proxy.afterinterface.service.DefaultGameService;
import com.jx2lee.designpattern.proxy.afterinterface.service.GameServiceProxyV1;
import com.jx2lee.designpattern.proxy.afterinterface.service.GameServiceProxyV2;

public class Client {
    public static void main(String[] args) {

        GameServiceProxyV1 gameServiceV1 = new GameServiceProxyV1(new DefaultGameService());
        try {
            gameServiceV1.startGame();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        GameServiceProxyV2 gameServiceV2 = new GameServiceProxyV2();
        try {
            gameServiceV2.startGame();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
