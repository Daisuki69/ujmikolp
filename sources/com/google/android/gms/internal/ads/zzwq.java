package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzwq {
    public static final zzwq zza = new zzwq(new zzbf[0]);
    public final int zzb;
    private final zzgjz zzc;
    private int zzd;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
    }

    public zzwq(zzbf... zzbfVarArr) {
        this.zzc = zzgjz.zzr(zzbfVarArr);
        this.zzb = zzbfVarArr.length;
        int i = 0;
        while (i < this.zzc.size()) {
            int i4 = i + 1;
            for (int i6 = i4; i6 < this.zzc.size(); i6++) {
                if (((zzbf) this.zzc.get(i)).equals(this.zzc.get(i6))) {
                    zzds.zzf("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i4;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzwq.class == obj.getClass()) {
            zzwq zzwqVar = (zzwq) obj;
            if (this.zzb == zzwqVar.zzb && this.zzc.equals(zzwqVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.zzc.hashCode();
        this.zzd = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzbf zza(int i) {
        return (zzbf) this.zzc.get(i);
    }

    public final int zzb(zzbf zzbfVar) {
        int iIndexOf = this.zzc.indexOf(zzbfVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final zzgjz zzc() {
        return zzgjz.zzq(zzgkp.zzc(this.zzc, zzwp.zza));
    }
}
