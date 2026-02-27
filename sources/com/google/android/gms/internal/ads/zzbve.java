package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbve extends zzbvg {
    private final String zza;
    private final int zzb;

    public zzbve(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbve)) {
            return false;
        }
        zzbve zzbveVar = (zzbve) obj;
        if (Objects.equal(this.zza, zzbveVar.zza)) {
            if (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzbveVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final int zzc() {
        return this.zzb;
    }
}
