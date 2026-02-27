package io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import androidx.annotation.NonNull;
import bj.C1037h;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public class DownloadListenerProxyApi extends PigeonApiDownloadListener {

    public static class DownloadListenerImpl implements DownloadListener {
        private final DownloadListenerProxyApi api;

        public DownloadListenerImpl(@NonNull DownloadListenerProxyApi downloadListenerProxyApi) {
            this.api = downloadListenerProxyApi;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit lambda$onDownloadStart$0(C1037h c1037h) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDownloadStart$1(String str, String str2, String str3, String str4, long j) {
            this.api.onDownloadStart(this, str, str2, str3, str4, j, new C1640f(2));
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(@NonNull final String str, @NonNull final String str2, @NonNull final String str3, @NonNull final String str4, final long j) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17362a.lambda$onDownloadStart$1(str, str2, str3, str4, j);
                }
            });
        }
    }

    public DownloadListenerProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiDownloadListener
    @NonNull
    public DownloadListener pigeon_defaultConstructor() {
        return new DownloadListenerImpl(this);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiDownloadListener
    @NonNull
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
