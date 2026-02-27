package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzbcp {
    public static boolean zza(@Nullable zzbcx zzbcxVar, @Nullable zzbcu zzbcuVar, String... strArr) {
        if (zzbcuVar == null) {
            return false;
        }
        zzbcxVar.zzb(zzbcuVar, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), strArr);
        return true;
    }
}
