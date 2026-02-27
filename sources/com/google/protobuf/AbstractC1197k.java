package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1197k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1196j f10104a = new C1196j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1196j f10105b;

    static {
        C1196j c1196j = null;
        try {
            c1196j = (C1196j) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f10105b = c1196j;
    }
}
