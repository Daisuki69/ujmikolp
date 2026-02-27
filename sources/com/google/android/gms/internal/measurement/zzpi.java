package com.google.android.gms.internal.measurement;

import N1.o;
import N1.s;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpi implements o {
    private static final zzpi zza = new zzpi();
    private final o zzb = new s(new zzpk());

    public static boolean zza() {
        return zza.get().zza();
    }

    public static boolean zzb() {
        return zza.get().zzb();
    }

    @Override // N1.o
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzpj get() {
        return (zzpj) this.zzb.get();
    }
}
