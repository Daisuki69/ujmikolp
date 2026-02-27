package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.webkit.WebViewCompat;

/* JADX INFO: loaded from: classes2.dex */
@WebViewCompat.ExperimentalAsyncStartUp
public interface BlockingStartUpLocation {
    @NonNull
    String getStackInformation();
}
