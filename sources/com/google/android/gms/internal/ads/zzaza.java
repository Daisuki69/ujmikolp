package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzaza implements Runnable {
    final /* synthetic */ zzazb zza;

    public zzaza(zzazb zzazbVar) {
        Objects.requireNonNull(zzazbVar);
        this.zza = zzazbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzazb zzazbVar = this.zza;
        synchronized (zzazbVar.zzf()) {
            if (zzazbVar.zzg().get() && zzazbVar.zzh()) {
                zzazbVar.zzg().set(false);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App went background");
                Iterator it = zzazbVar.zzi().iterator();
                while (it.hasNext()) {
                    try {
                        ((zzazc) it.next()).zza(false);
                    } catch (Exception e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                    }
                }
            } else {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App is still foreground");
            }
        }
    }
}
