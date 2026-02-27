package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzftz implements zzgob {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzfuc zzb;

    public zzftz(zzfuc zzfucVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzfucVar);
        this.zzb = zzfucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* bridge */ /* synthetic */ S1.y zza(Object obj) throws Exception {
        return this.zzb.zzg().zzb(this.zza);
    }
}
