package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzemu implements zzgob {
    static final /* synthetic */ zzemu zza = new zzemu();

    private /* synthetic */ zzemu() {
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* synthetic */ S1.y zza(Object obj) {
        return ((Throwable) obj) instanceof TimeoutException ? zzgot.zza(new zzemx(Integer.toString(17))) : zzgot.zza(new zzemx(null));
    }
}
