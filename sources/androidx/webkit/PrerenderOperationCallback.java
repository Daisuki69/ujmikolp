package androidx.webkit;

import androidx.webkit.WebViewCompat;

/* JADX INFO: loaded from: classes2.dex */
@WebViewCompat.ExperimentalUrlPrerender
public interface PrerenderOperationCallback {
    void onError(PrerenderException prerenderException);

    void onPrerenderActivated();
}
