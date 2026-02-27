package io.flutter.plugins.webviewflutter;

import e2.C1421c;
import io.flutter.plugins.webviewflutter.PigeonApiAndroidMessage;
import io.flutter.plugins.webviewflutter.PigeonApiCertificate;
import io.flutter.plugins.webviewflutter.PigeonApiCustomViewCallback;
import io.flutter.plugins.webviewflutter.PigeonApiDownloadListener;
import io.flutter.plugins.webviewflutter.PigeonApiGeolocationPermissionsCallback;
import io.flutter.plugins.webviewflutter.PigeonApiJavaScriptChannel;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettingsCompat;
import io.flutter.plugins.webviewflutter.PigeonApiWebViewFeature;
import pg.InterfaceC2040c;
import pg.InterfaceC2041d;

/* JADX INFO: renamed from: io.flutter.plugins.webviewflutter.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1644j implements InterfaceC2040c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17366b;

    public /* synthetic */ C1644j(Object obj, int i) {
        this.f17365a = i;
        this.f17366b = obj;
    }

    @Override // pg.InterfaceC2040c
    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
        switch (this.f17365a) {
            case 0:
                PigeonApiAndroidMessage.Companion.setUpMessageHandlers$lambda$1$lambda$0((PigeonApiAndroidMessage) this.f17366b, obj, (C1421c) interfaceC2041d);
                break;
            case 1:
                PigeonApiCertificate.Companion.setUpMessageHandlers$lambda$1$lambda$0((PigeonApiCertificate) this.f17366b, obj, (C1421c) interfaceC2041d);
                break;
            case 2:
                PigeonApiCustomViewCallback.Companion.setUpMessageHandlers$lambda$1$lambda$0((PigeonApiCustomViewCallback) this.f17366b, obj, (C1421c) interfaceC2041d);
                break;
            case 3:
                PigeonApiDownloadListener.Companion.setUpMessageHandlers$lambda$1$lambda$0((PigeonApiDownloadListener) this.f17366b, obj, (C1421c) interfaceC2041d);
                break;
            case 4:
                PigeonApiGeolocationPermissionsCallback.Companion.setUpMessageHandlers$lambda$1$lambda$0((PigeonApiGeolocationPermissionsCallback) this.f17366b, obj, (C1421c) interfaceC2041d);
                break;
            case 5:
                PigeonApiJavaScriptChannel.Companion.setUpMessageHandlers$lambda$1$lambda$0((PigeonApiJavaScriptChannel) this.f17366b, obj, (C1421c) interfaceC2041d);
                break;
            case 6:
                PigeonApiWebSettingsCompat.Companion.setUpMessageHandlers$lambda$1$lambda$0((PigeonApiWebSettingsCompat) this.f17366b, obj, (C1421c) interfaceC2041d);
                break;
            default:
                PigeonApiWebViewFeature.Companion.setUpMessageHandlers$lambda$1$lambda$0((PigeonApiWebViewFeature) this.f17366b, obj, (C1421c) interfaceC2041d);
                break;
        }
    }
}
