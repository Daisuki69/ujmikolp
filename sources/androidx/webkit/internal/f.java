package androidx.webkit.internal;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewPageBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebViewPageBoundaryInterface f8193b;

    public /* synthetic */ f(WebViewPageBoundaryInterface webViewPageBoundaryInterface, int i) {
        this.f8192a = i;
        this.f8193b = webViewPageBoundaryInterface;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8192a) {
            case 0:
                return WebNavigationClientAdapter.lambda$onFirstContentfulPaint$6(this.f8193b);
            case 1:
                return WebNavigationClientAdapter.lambda$onPageDeleted$3(this.f8193b);
            case 2:
                return WebNavigationClientAdapter.lambda$onPageLoadEventFired$4(this.f8193b);
            default:
                return WebNavigationClientAdapter.lambda$onPageDOMContentLoadedEventFired$5(this.f8193b);
        }
    }
}
