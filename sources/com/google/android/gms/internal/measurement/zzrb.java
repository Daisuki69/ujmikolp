package com.google.android.gms.internal.measurement;

import N1.o;
import N1.s;

/* JADX INFO: loaded from: classes3.dex */
public final class zzrb implements o {
    private static final zzrb zza = new zzrb();
    private final o zzb = new s(new zzrd());

    public static boolean zza() {
        zza.get().zza();
        return true;
    }

    public static boolean zzb() {
        return zza.get().zzb();
    }

    @Override // N1.o
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzrc get() {
        return (zzrc) this.zzb.get();
    }
}
