package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class zzhg extends zzhh {
    public zzhg(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(zzj(obj, j));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(zzi(obj, j));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final void zzc(Object obj, long j, boolean z4) {
        if (zzhi.zza) {
            zzhi.zzi(obj, j, z4);
        } else {
            zzhi.zzj(obj, j, z4);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final void zzd(Object obj, long j, double d10) {
        zzn(obj, j, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final void zze(Object obj, long j, float f) {
        zzm(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final boolean zzf(Object obj, long j) {
        return zzhi.zza ? zzhi.zzq(obj, j) : zzhi.zzr(obj, j);
    }
}
