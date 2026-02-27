package androidx.core.view.accessibility;

import android.media.session.MediaSessionManager;
import android.text.PrecomputedText;
import android.webkit.TracingConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ MediaSessionManager.RemoteUserInfo d(int i, int i4, String str) {
        return new MediaSessionManager.RemoteUserInfo(str, i, i4);
    }

    public static /* synthetic */ TracingConfig.Builder k() {
        return new TracingConfig.Builder();
    }

    public static /* bridge */ /* synthetic */ boolean y(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
