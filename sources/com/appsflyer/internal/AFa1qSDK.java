package com.appsflyer.internal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class AFa1qSDK {

    public enum AFa1vSDK {
        NONE,
        FIRST,
        ALL
    }

    public enum AFa1wSDK {
        UNKNOWN("uk"),
        ACCELEROMETER("am"),
        MAGNETOMETER("mm"),
        RESERVED("rs"),
        GYROSCOPE("gs");

        String AFKeystoreWrapper;

        AFa1wSDK(String str) {
            this.AFKeystoreWrapper = str;
        }
    }

    public enum AFa1xSDK {
        UNKNOWN(0),
        ACCELEROMETER(1),
        MAGNETOMETER(2),
        RESERVED(3),
        GYROSCOPE(4);

        private int afDebugLog;

        AFa1xSDK(int i) {
            this.afDebugLog = i;
        }
    }

    public static List<BigDecimal> AFInAppEventParameterName(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Float f = (Float) arrayList.get(0);
        Float f3 = (Float) arrayList.get(1);
        Float f7 = (Float) arrayList.get(2);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(f.toString())));
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(f3.toString())));
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(f7.toString())));
        return arrayList2;
    }
}
