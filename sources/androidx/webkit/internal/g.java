package androidx.webkit.internal;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebViewNavigationBoundaryInterface f8195b;

    public /* synthetic */ g(WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface, int i) {
        this.f8194a = i;
        this.f8195b = webViewNavigationBoundaryInterface;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8194a) {
            case 0:
                return WebNavigationClientAdapter.lambda$onNavigationStarted$0(this.f8195b);
            case 1:
                return WebNavigationClientAdapter.lambda$onNavigationRedirected$1(this.f8195b);
            default:
                return WebNavigationClientAdapter.lambda$onNavigationCompleted$2(this.f8195b);
        }
    }
}
