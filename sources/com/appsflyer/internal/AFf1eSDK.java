package com.appsflyer.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1eSDK {
    public static int AFInAppEventType;
    public static final Object valueOf = new Object();
    public static int values;

    public static char[] values(long j, char[] cArr, int i) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i4 = 0;
        int i6 = 4;
        for (int i10 = 0; i10 < cArr.length; i10++) {
            if ((((j >>> i10) & 1) != i || i4 >= 4) && i6 < length) {
                cArr2[i6] = cArr[i10];
                i6++;
            } else {
                cArr2[i4] = cArr[i10];
                i4++;
            }
        }
        return cArr2;
    }
}
