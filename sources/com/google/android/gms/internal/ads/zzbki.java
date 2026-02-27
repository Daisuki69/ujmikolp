package com.google.android.gms.internal.ads;

import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(api = 21)
public final class zzbki extends zzbkk {
    private final OnH5AdsEventListener zza;

    public zzbki(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbkl
    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
