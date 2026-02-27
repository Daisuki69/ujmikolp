package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzgnj extends zzgnl {
    public zzgnj(S1.y yVar, Class cls, zzgob zzgobVar) {
        super(yVar, cls, zzgobVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgnl
    public final /* synthetic */ void zze(Object obj) {
        zzk((S1.y) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgnl
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th2) throws Exception {
        zzgob zzgobVar = (zzgob) obj;
        S1.y yVarZza = zzgobVar.zza(th2);
        zzghc.zzl(yVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgobVar);
        return yVarZza;
    }
}
