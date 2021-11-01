package com.jx2lee.designpattern.singleton.Settings;

public class SettingsV3 {
    /**
     * 가장 naive 한 방법
     * thread safe 하지 않음
     * why?
     * 2개 thread 가 if 문을 통과하는데
     * 첫번째 thread 가 인스턴스를 생성하기 전에 두번째 thread 도 if 문을 통과하면
     * 2개의 instance 가 생성된다.
     **/

    private static SettingsV3 instance;
    private SettingsV3() {}

    public static SettingsV3 getInstance() {
        if (instance == null) {
            instance = new SettingsV3();
        }

        return instance;
    }
}
