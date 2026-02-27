package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzgnq extends zzgns {
    public zzgnq(S1.y yVar, zzgob zzgobVar) {
        super(yVar, zzgobVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgns
    public final /* synthetic */ void zze(Object obj) {
        zzk((S1.y) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgns
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzgob zzgobVar = (zzgob) obj;
        S1.y yVarZza = zzgobVar.zza(obj2);
        zzghc.zzl(yVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgobVar);
        return yVarZza;
    }
}
