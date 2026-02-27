package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfj implements Runnable {
    final /* synthetic */ zzfk zza;

    public zzfj(zzfk zzfkVar) {
        Objects.requireNonNull(zzfkVar);
        this.zza = zzfkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar = this.zza;
        if (zzfkVar.zzL() != null) {
            try {
                zzfkVar.zzL().zzc(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
