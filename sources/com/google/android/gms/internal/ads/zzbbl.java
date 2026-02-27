package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbbl {
    final /* synthetic */ zzbbm zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzbbl(zzbbm zzbbmVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzbbmVar);
        this.zza = zzbbmVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzc() {
        try {
            zzbbm zzbbmVar = this.zza;
            if (zzbbmVar.zzb) {
                zzbbmVar.zza.zzh(this.zzb);
                zzbbmVar.zza.zzi(0);
                zzbbmVar.zza.zzj(this.zzc);
                zzbbmVar.zza.zzg(null);
                zzbbmVar.zza.zzf();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Clearcut log failed", e);
        }
    }

    public final synchronized void zza() {
        this.zza.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    public final zzbbl zzb(int i) {
        this.zzc = i;
        return this;
    }
}
