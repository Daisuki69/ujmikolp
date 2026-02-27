package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzgpq extends zzgpa {
    final /* synthetic */ zzgps zza;
    private final zzgoa zzb;

    public zzgpq(zzgps zzgpsVar, zzgoa zzgoaVar) {
        Objects.requireNonNull(zzgpsVar);
        this.zza = zzgpsVar;
        this.zzb = zzgoaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzgoa zzgoaVar = this.zzb;
        S1.y yVarZza = zzgoaVar.zza();
        zzghc.zzl(yVarZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgoaVar);
        return yVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final /* synthetic */ void zzf(Object obj) {
        this.zza.zzk((S1.y) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final void zzg(Throwable th2) {
        this.zza.zzb(th2);
    }
}
