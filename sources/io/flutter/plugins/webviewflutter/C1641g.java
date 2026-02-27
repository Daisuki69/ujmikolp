package io.flutter.plugins.webviewflutter;

import androidx.datastore.preferences.core.MutablePreferences;
import bj.C1037h;
import io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.flutter.plugins.webviewflutter.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1641g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17359b;

    public /* synthetic */ C1641g(long j, int i) {
        this.f17358a = i;
        this.f17359b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17358a) {
            case 0:
                return AndroidWebkitLibraryPigeonProxyApiRegistrar.AnonymousClass1.onFinalize$lambda$0(this.f17359b, (C1037h) obj);
            default:
                ((MutablePreferences) obj).set(z2.h.f21362b, Long.valueOf(this.f17359b));
                return null;
        }
    }
}
