package io.flutter.plugins.webviewflutter;

import android.webkit.ValueCallback;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.flutter.plugins.webviewflutter.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1642h implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f17361b;

    public /* synthetic */ C1642h(int i, Function1 function1) {
        this.f17360a = i;
        this.f17361b = function1;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.f17360a) {
            case 0:
                ResultCompat.success((Boolean) obj, this.f17361b);
                break;
            default:
                ResultCompat.success((String) obj, this.f17361b);
                break;
        }
    }
}
