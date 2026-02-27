package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzw {

    @Nullable
    public final String zza;
    public final String zzb;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzw(@Nullable String str, String str2) {
        this.zza = zzeo.zzh(str);
        this.zzb = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzw.class == obj.getClass()) {
            zzw zzwVar = (zzw) obj;
            if (Objects.equals(this.zza, zzwVar.zza) && Objects.equals(this.zzb, zzwVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() * 31;
        String str = this.zza;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
