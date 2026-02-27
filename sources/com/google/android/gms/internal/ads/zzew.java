package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzew implements zzan {
    public final float zza;
    public final float zzb;

    public zzew(@FloatRange(from = -90.0d, to = 90.0d) float f, @FloatRange(from = -180.0d, to = 180.0d) float f3) {
        boolean z4 = false;
        if (f >= -90.0f && f <= 90.0f && f3 >= -180.0f && f3 <= 180.0f) {
            z4 = true;
        }
        zzghc.zzb(z4, "Invalid latitude or longitude");
        this.zza = f;
        this.zzb = f3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzew.class == obj.getClass()) {
            zzew zzewVar = (zzew) obj;
            if (this.zza == zzewVar.zza && this.zzb == zzewVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.zza) + 527;
        return Float.floatToIntBits(this.zzb) + (iFloatToIntBits * 31);
    }

    public final String toString() {
        float f = this.zza;
        int length = String.valueOf(f).length();
        float f3 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 26 + String.valueOf(f3).length());
        sb2.append("xyz: latitude=");
        sb2.append(f);
        sb2.append(", longitude=");
        sb2.append(f3);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzan
    public final /* synthetic */ void zza(zzal zzalVar) {
        AbstractC1174h.a(this, zzalVar);
    }
}
