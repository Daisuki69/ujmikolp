package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfc extends zzfb {
    public static int zza(int i, int i4, int i6) {
        if (i4 <= 1073741823) {
            return Math.min(Math.max(i, i4), 1073741823);
        }
        throw new IllegalArgumentException(zzdg.zza("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i4), 1073741823));
    }
}
