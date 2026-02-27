package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdt {
    private int zza;
    private long[] zzb;

    public zzdt() {
        throw null;
    }

    public final void zza(long j) {
        int i = this.zza;
        long[] jArr = this.zzb;
        if (i == jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.zzb;
        int i4 = this.zza;
        this.zza = i4 + 1;
        jArr2[i4] = j;
    }

    public final void zzb(long[] jArr) {
        int i = this.zza;
        int length = jArr.length;
        int i4 = i + length;
        long[] jArr2 = this.zzb;
        int length2 = jArr2.length;
        if (i4 > length2) {
            this.zzb = Arrays.copyOf(jArr2, Math.max(length2 + length2, i4));
        }
        System.arraycopy(jArr, 0, this.zzb, this.zza, length);
        this.zza = i4;
    }

    public final long zzc(int i) {
        if (i >= 0 && i < this.zza) {
            return this.zzb[i];
        }
        int i4 = this.zza;
        throw new IndexOutOfBoundsException(androidx.media3.datasource.cache.c.n(new StringBuilder(String.valueOf(i).length() + 24 + String.valueOf(i4).length()), "Invalid index ", i, ", size is ", i4));
    }

    public final int zzd() {
        return this.zza;
    }

    public zzdt(int i) {
        this.zzb = new long[i];
    }
}
