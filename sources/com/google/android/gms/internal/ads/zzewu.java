package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzewu {
    private final zzbuv zza;
    private final int zzb;

    public zzewu(zzbuv zzbuvVar, int i) {
        this.zza = zzbuvVar;
        this.zzb = i;
    }

    public final String zza() {
        return this.zza.zzd;
    }

    public final String zzb() {
        return zzghs.zza(this.zza.zza.getString("ms"));
    }

    @Nullable
    public final PackageInfo zzc() {
        return this.zza.zzf;
    }

    public final List zzd() {
        return this.zza.zze;
    }

    public final String zze() {
        return this.zza.zzh;
    }

    public final int zzf() {
        return this.zzb;
    }

    public final boolean zzg() {
        return this.zza.zzk;
    }

    public final boolean zzh() {
        return this.zza.zzl;
    }

    public final int zzi() {
        Bundle bundle = this.zza.zza.getBundle("extras");
        if (bundle != null && !bundle.isEmpty()) {
            switch (bundle.getString("query_info_type", "")) {
            }
            return -1;
        }
        return -1;
    }

    public final int zzj() {
        return this.zza.zzo;
    }
}
