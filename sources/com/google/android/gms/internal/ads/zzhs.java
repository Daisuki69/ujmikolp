package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhs {
    public final String zza;
    public final zzu zzb;
    public final zzu zzc;
    public final int zzd;
    public final int zze;

    public zzhs(String str, zzu zzuVar, zzu zzuVar2, int i, int i4) {
        boolean z4;
        if (i != 0) {
            z4 = false;
            if (i4 == 0) {
                i4 = 0;
                z4 = true;
            }
        } else {
            z4 = true;
        }
        zzghc.zza(z4);
        zzghc.zza(true ^ TextUtils.isEmpty(str));
        this.zza = str;
        this.zzb = zzuVar;
        zzuVar2.getClass();
        this.zzc = zzuVar2;
        this.zzd = i;
        this.zze = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhs.class == obj.getClass()) {
            zzhs zzhsVar = (zzhs) obj;
            if (this.zzd == zzhsVar.zzd && this.zze == zzhsVar.zze && this.zza.equals(zzhsVar.zza) && this.zzb.equals(zzhsVar.zzb) && this.zzc.equals(zzhsVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd + 527;
        String str = this.zza;
        int iHashCode = str.hashCode() + (((i * 31) + this.zze) * 31);
        int iHashCode2 = this.zzb.hashCode() + (iHashCode * 31);
        return this.zzc.hashCode() + (iHashCode2 * 31);
    }
}
