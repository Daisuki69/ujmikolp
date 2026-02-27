package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdoa extends zzdnl implements zzddz {
    private zzddz zza;

    @Override // com.google.android.gms.internal.ads.zzddz
    public final synchronized void zzdV() {
        zzddz zzddzVar = this.zza;
        if (zzddzVar != null) {
            zzddzVar.zzdV();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final synchronized void zzdz() {
        zzddz zzddzVar = this.zza;
        if (zzddzVar != null) {
            zzddzVar.zzdz();
        }
    }

    public final synchronized void zzn(com.google.android.gms.ads.internal.client.zza zzaVar, zzbib zzbibVar, com.google.android.gms.ads.internal.overlay.zzq zzqVar, zzbid zzbidVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar, zzddz zzddzVar) throws Throwable {
        try {
            try {
                zzm(zzaVar, zzbibVar, zzqVar, zzbidVar, zzacVar);
                this.zza = zzddzVar;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }
}
