package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzejl implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzbzm zza;
    final /* synthetic */ zzfcu zzb;
    final /* synthetic */ zzfcj zzc;
    final /* synthetic */ zzejs zzd;
    final /* synthetic */ zzejn zze;

    public zzejl(zzejn zzejnVar, zzbzm zzbzmVar, zzfcu zzfcuVar, zzfcj zzfcjVar, zzejs zzejsVar) {
        this.zza = zzbzmVar;
        this.zzb = zzfcuVar;
        this.zzc = zzfcjVar;
        this.zzd = zzejsVar;
        Objects.requireNonNull(zzejnVar);
        this.zze = zzejnVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
        zzejs zzejsVar = this.zzd;
        this.zza.zzc(this.zze.zzd().zza(this.zzb, this.zzc, view, zzejsVar));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
    }
}
