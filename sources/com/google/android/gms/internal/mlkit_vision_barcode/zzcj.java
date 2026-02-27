package com.google.android.gms.internal.mlkit_vision_barcode;

import We.s;

/* JADX INFO: loaded from: classes3.dex */
final class zzcj {
    public static int zza(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    public static int zzb(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i4;
        int i6;
        int iZza = zzck.zza(obj);
        int i10 = iZza & i;
        int iZzc = zzc(obj3, i10);
        if (iZzc != 0) {
            int i11 = ~i;
            int i12 = iZza & i11;
            int i13 = -1;
            while (true) {
                i4 = iZzc - 1;
                int i14 = iArr[i4];
                i6 = i14 & i;
                if ((i14 & i11) != i12 || !zzax.zza(obj, objArr[i4]) || (objArr2 != null && !zzax.zza(obj2, objArr2[i4]))) {
                    if (i6 == 0) {
                        break;
                    }
                    i13 = i4;
                    iZzc = i6;
                } else {
                    break;
                }
            }
            if (i13 == -1) {
                zze(obj3, i10, i6);
                return i4;
            }
            iArr[i13] = (iArr[i13] & i11) | (i6 & i);
            return i4;
        }
        return -1;
    }

    public static int zzc(Object obj, int i) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static Object zzd(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(s.f(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static void zze(Object obj, int i, int i4) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i4;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i4;
        } else {
            ((int[]) obj)[i] = i4;
        }
    }
}
