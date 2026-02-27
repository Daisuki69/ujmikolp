package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class zzwz implements zzyf {
    protected final zzbf zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzu[] zzd;
    private int zze;

    public zzwz(zzbf zzbfVar, int[] iArr, int i) {
        int length = iArr.length;
        zzghc.zzh(length > 0);
        zzbfVar.getClass();
        this.zza = zzbfVar;
        this.zzb = length;
        this.zzd = new zzu[length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            this.zzd[i4] = zzbfVar.zza(iArr[i4]);
        }
        Arrays.sort(this.zzd, zzwy.zza);
        this.zzc = new int[this.zzb];
        for (int i6 = 0; i6 < this.zzb; i6++) {
            this.zzc[i6] = zzbfVar.zzb(this.zzd[i6]);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzwz zzwzVar = (zzwz) obj;
            if (this.zza.equals(zzwzVar.zza) && Arrays.equals(this.zzc, zzwzVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.zzc) + (System.identityHashCode(this.zza) * 31);
        this.zze = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final zzbf zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final zzu zzb(int i) {
        return this.zzd[i];
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final zzu zzc() {
        return this.zzd[0];
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final int zze() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final int zzf(int i) {
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final int zzg(int i) {
        for (int i4 = 0; i4 < this.zzb; i4++) {
            if (this.zzc[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final int zzh() {
        return this.zzc[0];
    }
}
