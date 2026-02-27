package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzah {
    public static final zzah zza = new zzah(new zzag());

    @Nullable
    public final Uri zzb = null;

    @Nullable
    public final String zzc = null;

    @Nullable
    public final Bundle zzd = null;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    private zzah(zzag zzagVar) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        Uri uri = ((zzah) obj).zzb;
        return true;
    }

    public final int hashCode() {
        return 0;
    }
}
