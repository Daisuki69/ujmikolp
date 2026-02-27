package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbl {
    public final int zza;
    private final zzbf zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final boolean[] zze;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public zzbl(zzbf zzbfVar, boolean z4, int[] iArr, boolean[] zArr) {
        int i = zzbfVar.zza;
        this.zza = i;
        zzghc.zza(i == iArr.length && i == zArr.length);
        this.zzb = zzbfVar;
        this.zzc = z4 && i > 1;
        this.zzd = (int[]) iArr.clone();
        this.zze = (boolean[]) zArr.clone();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbl.class == obj.getClass()) {
            zzbl zzblVar = (zzbl) obj;
            if (this.zzc == zzblVar.zzc && this.zzb.equals(zzblVar.zzb) && Arrays.equals(this.zzd, zzblVar.zzd) && Arrays.equals(this.zze, zzblVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() * 31;
        int[] iArr = this.zzd;
        int iHashCode2 = Arrays.hashCode(iArr) + ((iHashCode + (this.zzc ? 1 : 0)) * 31);
        return Arrays.hashCode(this.zze) + (iHashCode2 * 31);
    }

    public final zzu zza(int i) {
        return this.zzb.zza(i);
    }

    public final boolean zzb() {
        for (boolean z4 : this.zze) {
            if (z4) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(int i) {
        return this.zze[i];
    }

    public final int zzd() {
        return this.zzb.zzc;
    }
}
