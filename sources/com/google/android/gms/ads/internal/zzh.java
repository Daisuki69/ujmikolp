package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfpf;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzh implements zzfpf {
    final /* synthetic */ zzk zza;

    public zzh(zzk zzkVar) {
        Objects.requireNonNull(zzkVar);
        this.zza = zzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpf
    public final void zza(int i, long j) {
        this.zza.zzo().zzb(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfpf
    public final void zzb(int i, long j, String str) {
        this.zza.zzo().zzf(i, System.currentTimeMillis() - j, str);
    }
}
