package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzyn {
    public final int zza;
    public final zzlo[] zzb;
    public final zzyf[] zzc;
    public final zzbm zzd;

    @Nullable
    public final Object zze;

    public zzyn(zzlo[] zzloVarArr, zzyf[] zzyfVarArr, zzbm zzbmVar, @Nullable Object obj) {
        int length = zzloVarArr.length;
        zzghc.zza(length == zzyfVarArr.length);
        this.zzb = zzloVarArr;
        this.zzc = (zzyf[]) zzyfVarArr.clone();
        this.zzd = zzbmVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(int i) {
        return this.zzb[i] != null;
    }

    public final boolean zzb(@Nullable zzyn zzynVar, int i) {
        return zzynVar != null && Objects.equals(this.zzb[i], zzynVar.zzb[i]) && Objects.equals(this.zzc[i], zzynVar.zzc[i]);
    }
}
