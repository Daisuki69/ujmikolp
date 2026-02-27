package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagr implements zzan {
    public final float zza;
    public final int zzb;

    public zzagr(float f, int i) {
        this.zza = f;
        this.zzb = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagr.class == obj.getClass()) {
            zzagr zzagrVar = (zzagr) obj;
            if (this.zza == zzagrVar.zza && this.zzb == zzagrVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.zza) + 527) * 31) + this.zzb;
    }

    public final String toString() {
        float f = this.zza;
        int length = String.valueOf(f).length();
        int i = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 47 + String.valueOf(i).length());
        sb2.append("smta: captureFrameRate=");
        sb2.append(f);
        sb2.append(", svcTemporalLayerCount=");
        sb2.append(i);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzan
    public final /* synthetic */ void zza(zzal zzalVar) {
        AbstractC1174h.a(this, zzalVar);
    }
}
