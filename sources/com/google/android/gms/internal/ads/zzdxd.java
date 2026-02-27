package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzdxd implements zzgob {
    static final /* synthetic */ zzdxd zza = new zzdxd();

    private /* synthetic */ zzdxd() {
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* synthetic */ S1.y zza(Object obj) {
        Throwable cause = (ExecutionException) obj;
        if (cause.getCause() != null) {
            cause = cause.getCause();
        }
        return zzgot.zzc(cause);
    }
}
