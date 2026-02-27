package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
final class zzgor implements Runnable {
    final Future zza;
    final zzgoq zzb;

    public zzgor(Future future, zzgoq zzgoqVar) {
        this.zza = future;
        this.zzb = zzgoqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thZza;
        Future future = this.zza;
        if ((future instanceof zzgpv) && (thZza = zzgpw.zza((zzgpv) future)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            this.zzb.zzb(zzgot.zzr(future));
        } catch (ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (Throwable th2) {
            this.zzb.zza(th2);
        }
    }

    public final String toString() {
        zzggy zzggyVarZzb = zzggz.zzb(this);
        zzggyVarZzb.zza(this.zzb);
        return zzggyVarZzb.toString();
    }
}
