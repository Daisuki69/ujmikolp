package com.dynatrace.android.callback;

/* JADX INFO: loaded from: classes2.dex */
public class TextViewHelper {
    public static boolean isPasswordInputType(int i) {
        int i4 = i & 4095;
        return i4 == 129 || i4 == 225 || i4 == 18;
    }

    public static boolean isVisiblePasswordInputType(int i) {
        return (i & 4095) == 145;
    }
}
