package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzwv {
    public final long zza;
    public final long zzb;

    public zzwv(long j, long j6) {
        this.zza = j;
        this.zzb = j6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwv)) {
            return false;
        }
        zzwv zzwvVar = (zzwv) obj;
        return this.zza == zzwvVar.zza && this.zzb == zzwvVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
