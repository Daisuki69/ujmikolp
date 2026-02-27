package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfkq {
    private final String zza;

    @Nullable
    private final AdFormat zzb;

    @Nullable
    private String zzc;

    public zzfkq(String str, @Nullable AdFormat adFormat) {
        this.zza = str;
        this.zzb = adFormat;
    }

    public final zzfkq zza(String str) {
        this.zzc = str;
        return this;
    }

    public final /* synthetic */ String zzb() {
        return this.zza;
    }

    public final /* synthetic */ AdFormat zzc() {
        return this.zzb;
    }

    public final /* synthetic */ String zzd() {
        return this.zzc;
    }
}
