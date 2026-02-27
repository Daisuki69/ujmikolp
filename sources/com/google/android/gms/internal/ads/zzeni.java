package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeni implements zzeun {
    private final Bundle zza;

    @VisibleForTesting
    public zzeni(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (bundle.isEmpty()) {
            return;
        }
        zzcuuVar.zza.putBundle("installed_adapter_data", bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* synthetic */ void zzb(Object obj) {
        q.a(this, obj);
    }
}
