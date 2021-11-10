package com.jx2lee.designpattern.singleton.settings;

import java.io.Serializable;

public class SettingsV7 implements Serializable {
    /**
     * static inner class: 권장하는 방법
     * thread safe & lazy loading (원하는 시점에 생성 및 사용)
     **/
    private SettingsV7() {}

    private static class SettingHolder {
        private static final SettingsV7 INSTANCE =new SettingsV7();
    }

    public static SettingsV7 getInstance() {
        return SettingHolder.INSTANCE;
    }

    // deserialization 시 readResolve 함수를 실행
    // 직렬 & 역직렬화 사용 시 singleton 패턴을 깨트리지 않는 방법 중 하나
    protected Object readResolve() {
        return getInstance();
    }
}
