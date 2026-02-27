package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class zzwi {
    private final Random zza;
    private final int[] zzb;
    private final int[] zzc;

    public zzwi(int i) {
        this(0, new Random());
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final int zzb(int i) {
        int i4 = this.zzc[i] + 1;
        int[] iArr = this.zzb;
        if (i4 < iArr.length) {
            return iArr[i4];
        }
        return -1;
    }

    public final int zzc(int i) {
        int i4 = this.zzc[i] - 1;
        if (i4 >= 0) {
            return this.zzb[i4];
        }
        return -1;
    }

    public final int zzd() {
        int[] iArr = this.zzb;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int zze() {
        int[] iArr = this.zzb;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final zzwi zzf(int i, int i4) {
        int[] iArr = new int[i4];
        int[] iArr2 = new int[i4];
        int i6 = 0;
        while (i6 < i4) {
            Random random = this.zza;
            iArr[i6] = random.nextInt(this.zzb.length + 1);
            int i10 = i6 + 1;
            int iNextInt = random.nextInt(i10);
            iArr2[i6] = iArr2[iNextInt];
            iArr2[iNextInt] = i6;
            i6 = i10;
        }
        Arrays.sort(iArr);
        int[] iArr3 = this.zzb;
        int[] iArr4 = new int[iArr3.length + i4];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < iArr3.length + i4; i13++) {
            if (i11 >= i4 || i12 != iArr[i11]) {
                int i14 = i12 + 1;
                int i15 = iArr3[i12];
                iArr4[i13] = i15;
                if (i15 >= 0) {
                    iArr4[i13] = i15 + i4;
                }
                i12 = i14;
            } else {
                iArr4[i13] = iArr2[i11];
                i11++;
            }
        }
        return new zzwi(iArr4, new Random(this.zza.nextLong()));
    }

    public final zzwi zzg(int i, int i4) {
        int[] iArr = this.zzb;
        int[] iArr2 = new int[iArr.length - i4];
        int i6 = 0;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 < 0 || i11 >= i4) {
                int i12 = i10 - i6;
                if (i11 >= 0) {
                    i11 -= i4;
                }
                iArr2[i12] = i11;
            } else {
                i6++;
            }
        }
        return new zzwi(iArr2, new Random(this.zza.nextLong()));
    }

    public final zzwi zzh() {
        return new zzwi(0, new Random(this.zza.nextLong()));
    }

    private zzwi(int i, Random random) {
        this(new int[0], random);
    }

    private zzwi(int[] iArr, Random random) {
        this.zzb = iArr;
        this.zza = random;
        this.zzc = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.zzc[iArr[i]] = i;
        }
    }
}
