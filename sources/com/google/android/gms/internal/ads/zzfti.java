package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfti {
    private final String zza;
    private final long zzb;

    public zzfti() {
        this.zza = null;
        this.zzb = -1L;
    }

    @Nullable
    public final String zza() {
        return this.zza;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zza != null && this.zzb > 0;
    }

    public zzfti(String str, long j) {
        this.zza = str;
        this.zzb = j;
    }
}
