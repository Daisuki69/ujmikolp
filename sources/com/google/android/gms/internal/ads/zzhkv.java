package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzhkv {
    private static volatile int zza = 100;

    public abstract void zza(Object obj, int i, long j);

    public abstract void zzb(Object obj, int i, int i4);

    public abstract void zzc(Object obj, int i, long j);

    public abstract void zzd(Object obj, int i, zzhhb zzhhbVar);

    public abstract void zze(Object obj, int i, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract Object zzh(Object obj);

    public abstract void zzi(Object obj, Object obj2);

    public abstract void zzj(Object obj);

    public final boolean zzk(Object obj, zzhkf zzhkfVar, int i) throws IOException {
        int iZzc = zzhkfVar.zzc();
        int i4 = iZzc >>> 3;
        int i6 = iZzc & 7;
        if (i6 == 0) {
            zza(obj, i4, zzhkfVar.zzh());
            return true;
        }
        if (i6 == 1) {
            zzc(obj, i4, zzhkfVar.zzj());
            return true;
        }
        if (i6 == 2) {
            zzd(obj, i4, zzhkfVar.zzq());
            return true;
        }
        if (i6 != 3) {
            if (i6 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new zzhiw("Protocol message end-group tag did not match expected tag.");
            }
            if (i6 != 5) {
                throw new zzhiv("Protocol message tag had invalid wire type.");
            }
            zzb(obj, i4, zzhkfVar.zzk());
            return true;
        }
        Object objZzf = zzf();
        int i10 = i4 << 3;
        int i11 = i + 1;
        if (i11 >= zza) {
            throw new zzhiw("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzhkfVar.zzb() != Integer.MAX_VALUE && zzk(objZzf, zzhkfVar, i11)) {
        }
        if ((i10 | 4) != zzhkfVar.zzc()) {
            throw new zzhiw("Protocol message end-group tag did not match expected tag.");
        }
        zze(obj, i4, zzg(objZzf));
        return true;
    }
}
