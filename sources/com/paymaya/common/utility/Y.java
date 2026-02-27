package com.paymaya.common.utility;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y f10455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Y f10456b;
    public static final Y c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Y f10457d;
    public static final Y e;
    public static final /* synthetic */ Y[] f;

    static {
        Y y7 = new Y("SEND_MONEY", 0);
        f10455a = y7;
        Y y10 = new Y("INSTAPAY", 1);
        f10456b = y10;
        Y y11 = new Y("QRPH_MERCHANT", 2);
        c = y11;
        Y y12 = new Y("QRPH_MERCHANT_OFF_US", 3);
        f10457d = y12;
        Y y13 = new Y("UNKNOWN", 4);
        e = y13;
        f = new Y[]{y7, y10, y11, y12, y13};
    }

    public static Y valueOf(String str) {
        return (Y) Enum.valueOf(Y.class, str);
    }

    public static Y[] values() {
        return (Y[]) f.clone();
    }
}
