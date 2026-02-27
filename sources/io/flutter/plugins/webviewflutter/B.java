package io.flutter.plugins.webviewflutter;

import kotlin.jvm.functions.Function1;
import pg.InterfaceC2041d;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class B implements InterfaceC2041d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f17331b;

    public /* synthetic */ B(int i, Function1 function1) {
        this.f17330a = i;
        this.f17331b = function1;
    }

    @Override // pg.InterfaceC2041d
    public final void reply(Object obj) {
        switch (this.f17330a) {
            case 0:
                PigeonApiX509Certificate.pigeon_newInstance$lambda$0(this.f17331b, "dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance", obj);
                break;
            default:
                PigeonApiWebChromeClient.onJsConfirm$lambda$9(this.f17331b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm", obj);
                break;
        }
    }
}
