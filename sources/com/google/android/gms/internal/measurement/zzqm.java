package com.google.android.gms.internal.measurement;

import N1.o;
import N1.s;

/* JADX INFO: loaded from: classes3.dex */
public final class zzqm implements o {
    private static final zzqm zza = new zzqm();
    private final o zzb = new s(new zzqo());

    public static boolean zza() {
        return zza.get().zza();
    }

    public static long zzb() {
        return zza.get().zzb();
    }

    public static double zzc() {
        return zza.get().zzc();
    }

    public static long zzd() {
        return zza.get().zzd();
    }

    public static long zze() {
        return zza.get().zze();
    }

    public static String zzf() {
        return zza.get().zzf();
    }

    @Override // N1.o
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzqn get() {
        return (zzqn) this.zzb.get();
    }
}
