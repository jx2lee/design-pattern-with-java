package com.jx2lee.designpattern.singleton.Settings;

public class SettingsV2 {

    private SettingsV2() {}

    public static SettingsV2 getInstance() {
        return new SettingsV2();
    }
}
