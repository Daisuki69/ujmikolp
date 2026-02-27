package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzban implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbap zza;

    public zzban(zzbap zzbapVar) {
        Objects.requireNonNull(zzbapVar);
        this.zza = zzbapVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        zzbap zzbapVar = this.zza;
        synchronized (zzbapVar.zzh()) {
            try {
            } catch (DeadObjectException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                this.zza.zzg();
            }
            if (zzbapVar.zzi() != null) {
                zzbapVar.zzk(zzbapVar.zzi().zzq());
                this.zza.zzh().notifyAll();
            } else {
                this.zza.zzh().notifyAll();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzbap zzbapVar = this.zza;
        synchronized (zzbapVar.zzh()) {
            zzbapVar.zzk(null);
            zzbapVar.zzh().notifyAll();
        }
    }
}
