package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.ads.AbstractC1173g;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
final class zzea {
    public static int zza(int i, int i4, int i6) {
        return (i & (~i6)) | (i4 & i6);
    }

    public static int zzb(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    public static Object zza(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(AbstractC1173g.q(52, i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static int zza(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & 65535;
        }
        return ((int[]) obj)[i];
    }

    public static void zza(Object obj, int i, int i4) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i4;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i4;
        } else {
            ((int[]) obj)[i] = i4;
        }
    }

    public static int zza(@NullableDecl Object obj, @NullableDecl Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, @NullableDecl Object[] objArr2) {
        int i4;
        int i6;
        int iZza = zzec.zza(obj);
        int i10 = iZza & i;
        int iZza2 = zza(obj3, i10);
        if (iZza2 == 0) {
            return -1;
        }
        int i11 = ~i;
        int i12 = iZza & i11;
        int i13 = -1;
        while (true) {
            i4 = iZza2 - 1;
            i6 = iArr[i4];
            if ((i6 & i11) == i12 && zzcz.zza(obj, objArr[i4]) && (objArr2 == null || zzcz.zza(obj2, objArr2[i4]))) {
                break;
            }
            int i14 = i6 & i;
            if (i14 == 0) {
                return -1;
            }
            i13 = i4;
            iZza2 = i14;
        }
        int i15 = i6 & i;
        if (i13 == -1) {
            zza(obj3, i10, i15);
            return i4;
        }
        iArr[i13] = zza(iArr[i13], i15, i);
        return i4;
    }
}
