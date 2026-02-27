package com.appsflyer.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class AFg1xSDK {
    public static final Object AFInAppEventParameterName = new Object();
    public static int AFInAppEventType;
    public static int valueOf;
    public static int values;

    public static void AFKeystoreWrapper(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i4 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i4;
        }
    }

    public static int valueOf(int i) {
        int[][] iArr = AFf1gSDK.AFKeystoreWrapper.valueOf;
        return ((iArr[0][i >>> 24] + iArr[1][(i >>> 16) & 255]) ^ iArr[2][(i >>> 8) & 255]) + iArr[3][i & 255];
    }
}
