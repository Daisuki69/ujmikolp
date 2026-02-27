package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzyi {
    private final int[] zza;
    private final zzwq[] zzb;
    private final int[] zzc;
    private final int[][][] zzd;
    private final zzwq zze;

    @VisibleForTesting
    public zzyi(String[] strArr, int[] iArr, zzwq[] zzwqVarArr, int[] iArr2, int[][][] iArr3, zzwq zzwqVar) {
        this.zza = iArr;
        this.zzb = zzwqVarArr;
        this.zzd = iArr3;
        this.zzc = iArr2;
        this.zze = zzwqVar;
    }

    public final int zza(int i) {
        return this.zza[i];
    }

    public final zzwq zzb(int i) {
        return this.zzb[i];
    }

    public final int zzc(int i, int i4, int i6) {
        return this.zzd[i][i4][i6];
    }

    public final int zzd(int i, int i4, boolean z4) {
        zzwq[] zzwqVarArr = this.zzb;
        int i6 = zzwqVarArr[i].zza(i4).zza;
        int[] iArr = new int[i6];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i6; i12++) {
            if ((this.zzd[i][i4][i12] & 7) == 4) {
                iArr[i11] = i12;
                i11++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i11);
        String str = null;
        int i13 = 0;
        int iMin = 16;
        boolean z5 = false;
        while (i10 < iArrCopyOf.length) {
            String str2 = zzwqVarArr[i].zza(i4).zza(iArrCopyOf[i10]).zzo;
            int i14 = i13 + 1;
            if (i13 == 0) {
                str = str2;
            } else {
                z5 |= !Objects.equals(str, str2);
            }
            iMin = Math.min(iMin, this.zzd[i][i4][i10] & 24);
            i10++;
            i13 = i14;
        }
        return z5 ? Math.min(iMin, this.zzc[i]) : iMin;
    }

    public final zzwq zze() {
        return this.zze;
    }
}
