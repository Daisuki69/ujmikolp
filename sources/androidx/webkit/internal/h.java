package androidx.webkit.internal;

import android.webkit.ValueCallback;
import androidx.webkit.PrerenderOperationCallback;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PrerenderOperationCallback f8197b;

    public /* synthetic */ h(PrerenderOperationCallback prerenderOperationCallback, int i) {
        this.f8196a = i;
        this.f8197b = prerenderOperationCallback;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.f8196a) {
            case 0:
                this.f8197b.onPrerenderActivated();
                break;
            case 1:
                WebViewProviderAdapter.lambda$prerenderUrlAsync$3(this.f8197b, (Throwable) obj);
                break;
            case 2:
                this.f8197b.onPrerenderActivated();
                break;
            default:
                WebViewProviderAdapter.lambda$prerenderUrlAsync$1(this.f8197b, (Throwable) obj);
                break;
        }
    }
}
