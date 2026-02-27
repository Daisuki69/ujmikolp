package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzgog extends zzgpa {
    private final Executor zza;
    final /* synthetic */ zzgoh zzb;

    public zzgog(zzgoh zzgohVar, Executor executor) {
        Objects.requireNonNull(zzgohVar);
        this.zzb = zzgohVar;
        executor.getClass();
        this.zza = executor;
    }

    public abstract void zzb(Object obj);

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final boolean zzd() {
        return this.zzb.isDone();
    }

    public final void zze() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e) {
            this.zzb.zzb(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final void zzf(Object obj) {
        this.zzb.zzD(null);
        zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final void zzg(Throwable th2) {
        zzgoh zzgohVar = this.zzb;
        zzgohVar.zzD(null);
        if (th2 instanceof ExecutionException) {
            zzgohVar.zzb(((ExecutionException) th2).getCause());
        } else if (th2 instanceof CancellationException) {
            zzgohVar.cancel(false);
        } else {
            zzgohVar.zzb(th2);
        }
    }
}
