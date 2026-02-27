package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f10053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I f10054b;

    static {
        I i = null;
        try {
            i = (I) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f10053a = i;
        f10054b = new I();
    }
}
