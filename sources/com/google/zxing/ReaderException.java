package com.google.zxing;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ReaderException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f10139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final StackTraceElement[] f10140b;

    static {
        f10139a = System.getProperty("surefire.test.class.path") != null;
        f10140b = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
