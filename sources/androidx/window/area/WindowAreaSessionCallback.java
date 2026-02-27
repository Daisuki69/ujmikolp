package androidx.window.area;

import androidx.window.core.ExperimentalWindowApi;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
public interface WindowAreaSessionCallback {
    void onSessionEnded(Throwable th2);

    void onSessionStarted(WindowAreaSession windowAreaSession);
}
