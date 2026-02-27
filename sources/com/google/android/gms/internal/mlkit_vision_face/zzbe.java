package com.google.android.gms.internal.mlkit_vision_face;

import We.s;

/* JADX INFO: loaded from: classes3.dex */
final class zzbe {
    public static int zza(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    public static int zzb(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i4;
        int i6;
        int iZza = zzbf.zza(obj);
        int i10 = iZza & i;
        int iZzc = zzc(obj3, i10);
        if (iZzc != 0) {
            int i11 = ~i;
            int i12 = iZza & i11;
            int i13 = -1;
            while (true) {
                i4 = iZzc - 1;
                i6 = iArr[i4];
                if ((i6 & i11) != i12 || !zzx.zza(obj, objArr[i4]) || (objArr2 != null && !zzx.zza(obj2, objArr2[i4]))) {
                    int i14 = i6 & i;
                    if (i14 == 0) {
                        break;
                    }
                    i13 = i4;
                    iZzc = i14;
                } else {
                    break;
                }
            }
            int i15 = i6 & i;
            if (i13 == -1) {
                zze(obj3, i10, i15);
                return i4;
            }
            iArr[i13] = (i15 & i) | (iArr[i13] & i11);
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
