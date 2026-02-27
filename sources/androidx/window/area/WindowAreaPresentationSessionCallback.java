package androidx.window.area;

import androidx.window.core.ExperimentalWindowApi;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
public interface WindowAreaPresentationSessionCallback {
    void onContainerVisibilityChanged(boolean z4);

    void onSessionEnded(Throwable th2);

    void onSessionStarted(WindowAreaSessionPresenter windowAreaSessionPresenter);
}
