package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeht {

    @Nullable
    private zzehk zza;

    public zzeht() {
    }

    public static zzeht zza(zzehk zzehkVar) {
        return new zzeht(zzehkVar);
    }

    public final zzehk zzb(Clock clock, zzehm zzehmVar, zzeee zzeeeVar, zzfjv zzfjvVar) {
        zzehk zzehkVar = this.zza;
        return zzehkVar != null ? zzehkVar : new zzehk(clock, zzehmVar, zzeeeVar, zzfjvVar);
    }

    private zzeht(zzehk zzehkVar) {
        this.zza = zzehkVar;
    }
}
