package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfmk {
    private final zzfny zza;
    private final String zzb;
    private final zzflq zzc;
    private final String zzd = "Ad overlay";

    public zzfmk(View view, zzflq zzflqVar, @Nullable String str) {
        this.zza = new zzfny(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzflqVar;
    }

    public final zzfny zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzflq zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}
