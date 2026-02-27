package androidx.browser.trusted;

import android.os.Bundle;
import androidx.browser.trusted.TrustedWebActivityDisplayMode;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static TrustedWebActivityDisplayMode a(Bundle bundle) {
        return bundle.getInt(TrustedWebActivityDisplayMode.KEY_ID) != 1 ? new TrustedWebActivityDisplayMode.DefaultMode() : TrustedWebActivityDisplayMode.ImmersiveMode.fromBundle(bundle);
    }
}
