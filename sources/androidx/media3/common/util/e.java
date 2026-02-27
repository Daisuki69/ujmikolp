package androidx.media3.common.util;

import android.media.AudioFocusRequest;
import android.view.autofill.AutofillManager;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ AudioFocusRequest.Builder g(int i) {
        return new AudioFocusRequest.Builder(i);
    }

    public static /* synthetic */ AudioFocusRequest.Builder k(AudioFocusRequest audioFocusRequest) {
        return new AudioFocusRequest.Builder(audioFocusRequest);
    }

    public static /* bridge */ /* synthetic */ AutofillManager n(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class q() {
        return AutofillManager.class;
    }

    public static /* synthetic */ void s() {
    }
}
