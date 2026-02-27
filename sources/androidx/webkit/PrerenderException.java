package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.WebViewCompat;

/* JADX INFO: loaded from: classes2.dex */
@WebViewCompat.ExperimentalUrlPrerender
public class PrerenderException extends Exception {
    public PrerenderException(@NonNull String str, @Nullable Throwable th2) {
        super(str, th2);
    }
}
