package com.google.android.gms.internal.vision;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcy<T> implements Serializable {
    public static <T> zzcy<T> zza(T t5) {
        return new zzdd(zzde.zza(t5));
    }

    public static <T> zzcy<T> zzc() {
        return zzcv.zza;
    }

    public abstract boolean zza();

    public abstract T zzb();
}
