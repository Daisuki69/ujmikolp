package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzetg implements zzeun {

    @Nullable
    private final Bundle zza;

    public zzetg(@Nullable Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (bundle != null) {
            zzcuuVar.zza.putAll(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = this.zza;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (bundle != null) {
            zzcuuVar.zzb.putAll(bundle);
        }
    }
}
