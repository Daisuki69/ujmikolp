package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgjp {
    private static final zzgjp zza = new zzgjn();
    private static final zzgjp zzb = new zzgjo(-1);
    private static final zzgjp zzc = new zzgjo(1);

    public /* synthetic */ zzgjp(byte[] bArr) {
    }

    public static zzgjp zzg() {
        return zza;
    }

    public abstract zzgjp zza(Object obj, Object obj2, Comparator comparator);

    public abstract zzgjp zzb(int i, int i4);

    public abstract zzgjp zzc(boolean z4, boolean z5);

    public abstract zzgjp zzd(boolean z4, boolean z5);

    public abstract int zze();
}
