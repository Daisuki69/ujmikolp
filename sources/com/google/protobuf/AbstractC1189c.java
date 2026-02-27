package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1189c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f10081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f10082b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f10081a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f10082b = cls2 != null;
    }

    public static boolean a() {
        return (f10081a == null || f10082b) ? false : true;
    }
}
