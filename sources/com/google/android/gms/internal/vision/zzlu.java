package com.google.android.gms.internal.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzlu<T, B> {
    public abstract B zza();

    public abstract T zza(B b8);

    public abstract void zza(B b8, int i, int i4);

    public abstract void zza(B b8, int i, long j);

    public abstract void zza(B b8, int i, zzht zzhtVar);

    public abstract void zza(B b8, int i, T t5);

    public abstract void zza(T t5, zzmr zzmrVar) throws IOException;

    public abstract void zza(Object obj, T t5);

    public abstract boolean zza(zzld zzldVar);

    public final boolean zza(B b8, zzld zzldVar) throws IOException {
        int iZzb = zzldVar.zzb();
        int i = iZzb >>> 3;
        int i4 = iZzb & 7;
        if (i4 == 0) {
            zza(b8, i, zzldVar.zzg());
            return true;
        }
        if (i4 == 1) {
            zzb(b8, i, zzldVar.zzi());
            return true;
        }
        if (i4 == 2) {
            zza((Object) b8, i, zzldVar.zzn());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw zzjk.zzf();
            }
            zza((Object) b8, i, zzldVar.zzj());
            return true;
        }
        B bZza = zza();
        int i6 = 4 | (i << 3);
        while (zzldVar.zza() != Integer.MAX_VALUE && zza((Object) bZza, zzldVar)) {
        }
        if (i6 != zzldVar.zzb()) {
            throw zzjk.zze();
        }
        zza(b8, i, zza(bZza));
        return true;
    }

    public abstract T zzb(Object obj);

    public abstract void zzb(B b8, int i, long j);

    public abstract void zzb(T t5, zzmr zzmrVar) throws IOException;

    public abstract void zzb(Object obj, B b8);

    public abstract B zzc(Object obj);

    public abstract T zzc(T t5, T t10);

    public abstract void zzd(Object obj);

    public abstract int zze(T t5);

    public abstract int zzf(T t5);
}
