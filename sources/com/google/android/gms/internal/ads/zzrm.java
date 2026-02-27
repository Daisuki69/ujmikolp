package com.google.android.gms.internal.ads;

import androidx.media3.common.PlaybackException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzrm extends IOException {
    public final int zza;

    public zzrm(Throwable th2, int i) {
        super(th2);
        this.zza = PlaybackException.ERROR_CODE_DRM_SCHEME_UNSUPPORTED;
    }
}
