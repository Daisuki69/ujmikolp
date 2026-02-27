package com.google.android.gms.internal.vision;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdi {
    public static <T> zzdf<T> zza(zzdf<T> zzdfVar) {
        return ((zzdfVar instanceof zzdk) || (zzdfVar instanceof zzdh)) ? zzdfVar : zzdfVar instanceof Serializable ? new zzdh(zzdfVar) : new zzdk(zzdfVar);
    }

    public static <T> zzdf<T> zza(@NullableDecl T t5) {
        return new zzdj(t5);
    }
}
