package com.jx2lee.designpattern.singleton.settings;

public class SettingsV6 {
    /**
     * double-checked locking
     * synchronized 키워드를 분기에 작성하여 double checking 하는 방법
     * 매번 동기화 작업을 진행하지 않아 효율적
     * 단점
        * 코드 복잡도 증가
     **/

    private static volatile SettingsV6 instance;
    private SettingsV6() {}

    public static SettingsV6 getInstance() {
        if (instance == null) {
            synchronized (SettingsV6.class) {
                if (instance == null) {
                    instance = new SettingsV6();
                }
            }
        }
        return instance;
    }
}
