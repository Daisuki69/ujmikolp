package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbao implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbap zza;

    public zzbao(zzbap zzbapVar) {
        Objects.requireNonNull(zzbapVar);
        this.zza = zzbapVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zzbap zzbapVar = this.zza;
        synchronized (zzbapVar.zzh()) {
            try {
                zzbapVar.zzk(null);
                if (zzbapVar.zzi() != null) {
                    zzbapVar.zzj(null);
                }
                zzbapVar.zzh().notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
