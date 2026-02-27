package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbyr extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzbyv zza;

    public zzbyr(zzbyv zzbyvVar) {
        Objects.requireNonNull(zzbyvVar);
        this.zza = zzbyvVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzbyv zzbyvVar = this.zza;
        zzbcl zzbclVar = new zzbcl(zzbyvVar.zzy(), zzbyvVar.zzz().afmaVersion);
        synchronized (zzbyvVar.zzx()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzm();
                zzbco.zza(zzbyvVar.zzA(), zzbclVar);
            } catch (IllegalArgumentException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot config CSI reporter.", e);
            }
        }
    }
}
