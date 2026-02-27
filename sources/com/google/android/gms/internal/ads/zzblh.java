package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzblh implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbzm zza;
    final /* synthetic */ zzblj zzb;

    public zzblh(zzblj zzbljVar, zzbzm zzbzmVar) {
        this.zza = zzbzmVar;
        Objects.requireNonNull(zzbljVar);
        this.zzb = zzbljVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        try {
            this.zza.zzc(this.zzb.zzc().zzp());
        } catch (DeadObjectException e) {
            this.zza.zzd(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zza.zzd(new RuntimeException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i).length() + 23), "onConnectionSuspended: ", i)));
    }
}
