package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzauj implements zzfpf {
    final /* synthetic */ zzfoh zza;

    public zzauj(zzfoh zzfohVar) {
        this.zza = zzfohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpf
    public final void zza(int i, long j) {
        this.zza.zzb(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfpf
    public final void zzb(int i, long j, String str) {
        this.zza.zzf(i, System.currentTimeMillis() - j, str);
    }
}
