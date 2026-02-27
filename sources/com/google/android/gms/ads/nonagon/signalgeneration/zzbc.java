package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzhpx;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbc implements zzhpx {
    private final zzay zza;

    private zzbc(zzay zzayVar) {
        this.zza = zzayVar;
    }

    public static zzbc zza(zzay zzayVar) {
        return new zzbc(zzayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}
