package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
final class zzfot implements zzfow {
    private static final zzast zza;

    static {
        zzarw zzarwVarZzi = zzast.zzi();
        zzarwVarZzi.zzo(ExifInterface.LONGITUDE_EAST);
        zza = (zzast) zzarwVarZzi.zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzfow
    public final zzast zza() {
        return zza;
    }
}
