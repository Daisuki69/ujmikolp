package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsv {

    @Nullable
    private static zzsv zza;

    private zzsv() {
    }

    public static synchronized zzsv zza() {
        try {
            if (zza == null) {
                zza = new zzsv();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }

    public static void zzb() {
        zzsu.zza();
    }
}
