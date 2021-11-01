package com.jx2lee.designpattern.singleton.Settings;

public class SettingsV5 {
    /**
     * eager initialization: 이른 초기화
     * thread safe!
     * 단점
        * instance 를 만드는 작업이 굉장히 무거운 경우나
        * 생성하는 시점에 굳이 사용하지 않아도 되는 경우 불필요한 리소스 발생
     **/

    private static final SettingsV5 INSTANCE = new SettingsV5();
    private SettingsV5() {}

    public static SettingsV5 getInstance() {
        return INSTANCE;
    }
}
