package com.jx2lee.designpattern.singleton.Settings;

public class SettingsV4 {
    /**
     * synchronized 키워드 사용
     * 단점
        * 동기화 작업으로 성능 저하 우려
        * 동기화 작업은 조금은 무거움 (lock)
     **/

    private static SettingsV4 instance;
    private SettingsV4() {}

    public static synchronized SettingsV4 getInstance() {
        if (instance == null) {
            instance = new SettingsV4();
        }

        return instance;
    }
}
