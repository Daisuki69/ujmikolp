package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbsl extends zzbhj {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbsl(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbhk
    public final void zze(zzbhq zzbhqVar) {
        this.zza.onNativeAdLoaded(new zzbsg(zzbhqVar));
    }
}
