package com.jx2lee.designpattern.singleton;

import com.jx2lee.designpattern.singleton.settings.*;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        SettingsV1 settingsV11 = new SettingsV1();
        SettingsV1 settingsV12 = new SettingsV1();

        System.out.println("settingsV11 == settingsV12 = " + (settingsV11 == settingsV12));
        System.out.println();

        SettingsV2 settingsV21 = SettingsV2.getInstance();
        SettingsV2 settingsV22 = SettingsV2.getInstance();

        System.out.println("settingsV21 == settingsV22 = " + (settingsV21==settingsV22));
        System.out.println();

        SettingsV3 settingsV31 = SettingsV3.getInstance();
        SettingsV3 settingsV32 = SettingsV3.getInstance();

        System.out.println("settingsV31 == settingsV32 = " + (settingsV31 == settingsV32));
        System.out.println();

        SettingsV4 settingsV41 = SettingsV4.getInstance();
        SettingsV4 settingsV42 = SettingsV4.getInstance();

        System.out.println("settingsV41 == settingsV42 = " + (settingsV41 == settingsV42));
        System.out.println();

        SettingsV5 settingsV51 = SettingsV5.getInstance();
        SettingsV5 settingsV52 = SettingsV5.getInstance();

        System.out.println("settingsV51 == settingsV52 = " + (settingsV51 == settingsV52));
        System.out.println();

        SettingsV6 settingsV61 = SettingsV6.getInstance();
        SettingsV6 settingsV62 = SettingsV6.getInstance();

        System.out.println("settingsV61 == settingsV62 = " + (settingsV61 == settingsV62));
        System.out.println();

        SettingsV7 settingsV71 = SettingsV7.getInstance();
        SettingsV7 settingsV72 = SettingsV7.getInstance();

        System.out.println("settingsV71 == settingsV72 = " + (settingsV71 == settingsV72));
        System.out.println();

        /**
         * singleton 패턴을 깨드리는 방법
         * #1. reflection API
         * #2. serializable & deserializable
         */

        SettingsV7 newSettings = SettingsV7.getInstance();

        try {
            Constructor<SettingsV7> constructors = SettingsV7.class.getDeclaredConstructor();
            constructors.setAccessible(true);
            SettingsV7 settingsV8 = constructors.newInstance();
            System.out.println("newSettings == breakSettings = " + (newSettings == settingsV8));
            System.out.println();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        SettingsV7 settingsV9 = null;
        try {
            try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("newSettings.obj"))) {
                out.writeObject(newSettings);
            }

            try (ObjectInput in = new ObjectInputStream(new FileInputStream("newSettings.obj"))) {
                settingsV9 = (SettingsV7) in.readObject();

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("newSettings == settingsV9 = " + (newSettings == settingsV9));
        System.out.println();

        /**
         * enum 을 통한 reflection API: new instance 생성 불가
         * 가장 간단하지만 완벽한 singleton
         * 단점
            * 미리 생성 (리소스)
            * 상속 불가능
         **/

        SettingsV8 settingsEnum = SettingsV8.INSTANCE;
        SettingsV8 settingsEnumTest = null;

        Constructor<?>[] declaredConstructors = SettingsV8.class.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            constructor.setAccessible(true);
            try {
                settingsEnumTest = (SettingsV8) constructor.newInstance("INSTANCE");
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        System.out.println("settingsEnumTest == settingsEnum " + (settingsEnumTest == settingsEnum));


    }
}
