package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgh implements zzfz {

    @Nullable
    private zzgy zzb;

    @Nullable
    private String zzc;
    private boolean zzf;
    private final zzgs zza = new zzgs();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzgh zzb(@Nullable String str) {
        this.zzc = str;
        return this;
    }

    public final zzgh zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final zzgh zzd(int i) {
        this.zze = i;
        return this;
    }

    public final zzgh zze(boolean z4) {
        this.zzf = true;
        return this;
    }

    public final zzgh zzf(@Nullable zzgy zzgyVar) {
        this.zzb = zzgyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzgl zza() {
        zzgl zzglVar = new zzgl(this.zzc, this.zzd, this.zze, this.zzf, false, this.zza, null, false, null);
        zzgy zzgyVar = this.zzb;
        if (zzgyVar != null) {
            zzglVar.zze(zzgyVar);
        }
        return zzglVar;
    }
}
