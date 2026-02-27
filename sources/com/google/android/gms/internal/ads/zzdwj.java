package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzdwj extends AdListener {
    final /* synthetic */ zzdwp zza;

    public zzdwj(zzdwp zzdwpVar) {
        Objects.requireNonNull(zzdwpVar);
        this.zza = zzdwpVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zza.zzg(zzdwp.zzm(loadAdError));
    }
}
