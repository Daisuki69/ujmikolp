package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfmm {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzfmm zza = new zzfmm();
    private Context zzb;

    private zzfmm() {
    }

    public static zzfmm zza() {
        return zza;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zzb = context != null ? context.getApplicationContext() : null;
    }
}
