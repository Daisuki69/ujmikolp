package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzazq {
    final long zza;
    final String zzb;
    final int zzc;

    public zzazq(long j, String str, int i) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzazq)) {
            return false;
        }
        zzazq zzazqVar = (zzazq) obj;
        return zzazqVar.zza == this.zza && zzazqVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
