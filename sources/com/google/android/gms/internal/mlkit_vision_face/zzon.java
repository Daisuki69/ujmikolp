package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzon {

    @Nullable
    private static zzom zza;

    public static synchronized zzoc zza(zznt zzntVar) {
        try {
            if (zza == null) {
                zza = new zzom(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (zzoc) zza.get(zzntVar);
    }

    public static synchronized zzoc zzb(String str) {
        return zza(zznt.zzd(str).zzd());
    }
}
