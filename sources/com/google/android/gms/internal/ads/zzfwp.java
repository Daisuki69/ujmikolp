package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzfwp implements zzgob {
    final /* synthetic */ zzfwr zza;

    public zzfwp(zzfwr zzfwrVar) {
        Objects.requireNonNull(zzfwrVar);
        this.zza = zzfwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* bridge */ /* synthetic */ S1.y zza(Object obj) throws Exception {
        zzfwn zzfwnVar = (zzfwn) obj;
        if (zzfwnVar != null) {
            return zzgot.zza(zzfwnVar);
        }
        zzfwr zzfwrVar = this.zza;
        zzfwrVar.zza().zzb(51);
        return zzfwrVar.zzc(2);
    }
}
