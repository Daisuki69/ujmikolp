package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzapf implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzaph zzc;

    public zzapf(zzaph zzaphVar, String str, long j) {
        this.zza = str;
        this.zzb = j;
        Objects.requireNonNull(zzaphVar);
        this.zzc = zzaphVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaph zzaphVar = this.zzc;
        zzaphVar.zzx().zza(this.zza, this.zzb);
        zzaphVar.zzx().zzb(zzaphVar.toString());
    }
}
