package com.jx2lee.designpattern.singleton;

import com.jx2lee.designpattern.singleton.Settings.*;

public class Main {
    public static void main(String[] args) {
        SettingsV1 settingsV11 = new SettingsV1();
        SettingsV1 settingsV12 = new SettingsV1();

        System.out.println("settingsV11 != settingsV12 = " + (settingsV11 != settingsV12));
        System.out.println();

        SettingsV2 settingsV21 = SettingsV2.getInstance();
        SettingsV2 settingsV22 = SettingsV2.getInstance();

        System.out.println("settingsV21 != settingsV22 = " + (settingsV21!=settingsV22));
        System.out.println();

        SettingsV3 settingsV31 = SettingsV3.getInstance();
        SettingsV3 settingsV32 = SettingsV3.getInstance();

        System.out.println("settingsV31 != settingsV32 = " + (settingsV31 != settingsV32));
        System.out.println();

        SettingsV4 settingsV41 = SettingsV4.getInstance();
        SettingsV4 settingsV42 = SettingsV4.getInstance();

        System.out.println("settingsV41 != settingsV42 = " + (settingsV41 != settingsV42));
        System.out.println();

        SettingsV5 settingsV51 = SettingsV5.getInstance();
        SettingsV5 settingsV52 = SettingsV5.getInstance();

        System.out.println("settingsV51 != settingsV52 = " + (settingsV51 != settingsV52));
        System.out.println();

        SettingsV6 settingsV61 = SettingsV6.getInstance();
        SettingsV6 settingsV62 = SettingsV6.getInstance();

        System.out.println("settingsV61 != settingsV62 = " + (settingsV61 != settingsV62));
        System.out.println();

        SettingsV7 settingsV71 = SettingsV7.getInstance();
        SettingsV7 settingsV72 = SettingsV7.getInstance();

        System.out.println("settingsV71 != settingsV72 = " + (settingsV71 != settingsV72));
        System.out.println();
    }
}
