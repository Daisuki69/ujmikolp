package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcve implements zzhpx {
    private final zzcvb zza;

    private zzcve(zzcvb zzcvbVar) {
        this.zza = zzcvbVar;
    }

    public static zzcve zzc(zzcvb zzcvbVar) {
        return new zzcve(zzcvbVar);
    }

    @Nullable
    public final Bundle zza() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}
