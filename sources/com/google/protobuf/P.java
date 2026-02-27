package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O f10063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O f10064b;

    static {
        O o8 = null;
        try {
            o8 = (O) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f10063a = o8;
        f10064b = new O();
    }
}
