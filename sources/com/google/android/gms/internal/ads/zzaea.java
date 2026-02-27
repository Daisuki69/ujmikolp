package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaea {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzaea(int i, byte[] bArr, int i4, int i6) {
        this.zza = i;
        this.zzb = bArr;
        this.zzc = i4;
        this.zzd = i6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaea.class == obj.getClass()) {
            zzaea zzaeaVar = (zzaea) obj;
            if (this.zza == zzaeaVar.zza && this.zzc == zzaeaVar.zzc && this.zzd == zzaeaVar.zzd && Arrays.equals(this.zzb, zzaeaVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        return ((((Arrays.hashCode(this.zzb) + (i * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
