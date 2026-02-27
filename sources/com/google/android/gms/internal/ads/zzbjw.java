package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbjw implements com.google.android.gms.ads.internal.overlay.zzz {
    boolean zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzc;
    final /* synthetic */ Map zzd;
    final /* synthetic */ Map zze;

    public zzbjw(zzbjy zzbjyVar, boolean z4, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, Map map2) {
        this.zzb = z4;
        this.zzc = zzaVar;
        this.zzd = map;
        this.zze = map2;
        Objects.requireNonNull(zzbjyVar);
        this.zza = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final void zza(boolean z4) {
        if (this.zza) {
            return;
        }
        if (z4 && this.zzb) {
            ((zzddz) this.zzc).zzdz();
        }
        this.zza = true;
        Map map = this.zzd;
        map.put((String) this.zze.get("event_id"), Boolean.valueOf(z4));
        ((zzbmh) this.zzc).zze("openIntentAsync", map);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final void zzb(int i) {
    }
}
