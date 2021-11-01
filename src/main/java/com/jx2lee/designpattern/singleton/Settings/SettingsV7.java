package com.jx2lee.designpattern.singleton.Settings;

public class SettingsV7 {
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
}
