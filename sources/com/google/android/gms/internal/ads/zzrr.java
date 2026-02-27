package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.common.PlaybackException;

/* JADX INFO: loaded from: classes3.dex */
final class zzrr implements zzru {
    @Override // com.google.android.gms.internal.ads.zzru
    @Nullable
    public final zzrn zza(@Nullable zzrp zzrpVar, zzu zzuVar) {
        if (zzuVar.zzs == null) {
            return null;
        }
        return new zzrv(new zzrm(new zzrx(1), PlaybackException.ERROR_CODE_DRM_SCHEME_UNSUPPORTED));
    }

    @Override // com.google.android.gms.internal.ads.zzru
    public final int zzb(zzu zzuVar) {
        return zzuVar.zzs != null ? 1 : 0;
    }
}
