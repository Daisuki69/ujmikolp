package com.google.android.gms.internal.measurement;

import N1.o;
import N1.s;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpu implements o {
    private static final zzpu zza = new zzpu();
    private final o zzb = new s(new zzpw());

    public static boolean zza() {
        zza.get().zza();
        return true;
    }

    public static boolean zzb() {
        return zza.get().zzb();
    }

    public static boolean zzc() {
        return zza.get().zzc();
    }

    public static boolean zzd() {
        return zza.get().zzd();
    }

    @Override // N1.o
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzpv get() {
        return (zzpv) this.zzb.get();
    }
}
