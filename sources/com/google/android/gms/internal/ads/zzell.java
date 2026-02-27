package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzell implements zzcyj {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zza.set(zzdtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzezq.zza(this.zza, new zzezp() { // from class: com.google.android.gms.internal.ads.zzelk
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdt) obj).zze(zztVar);
            }
        });
    }
}
