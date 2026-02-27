package io.flutter.plugins.webviewflutter;

import bj.C1037h;
import io.flutter.plugins.webviewflutter.PigeonApiCookieManager;
import io.flutter.plugins.webviewflutter.PigeonApiWebView;
import io.flutter.plugins.webviewflutter.ResultCompat;
import kotlin.jvm.functions.Function1;
import pg.InterfaceC2041d;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17370b;

    public /* synthetic */ l(Object obj, int i) {
        this.f17369a = i;
        this.f17370b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17369a) {
            case 0:
                return PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$6$lambda$5$lambda$4((InterfaceC2041d) this.f17370b, (C1037h) obj);
            case 1:
                return PigeonApiWebView.Companion.setUpMessageHandlers$lambda$28$lambda$27$lambda$26((InterfaceC2041d) this.f17370b, (C1037h) obj);
            default:
                return ResultCompat.Companion.asCompatCallback$lambda$0((Function1) this.f17370b, (C1037h) obj);
        }
    }
}
