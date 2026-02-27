package io.flutter.plugin.common;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17174b;

    public FlutterException(String str, String str2, Object obj) {
        super(str2);
        this.f17173a = str;
        this.f17174b = obj;
    }
}
