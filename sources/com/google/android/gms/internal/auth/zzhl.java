package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes3.dex */
final class zzhl extends zzhk {
    @Override // com.google.android.gms.internal.auth.zzhk
    public final int zza(int i, byte[] bArr, int i4, int i6) {
        while (i4 < i6 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 >= i6) {
            return 0;
        }
        while (i4 < i6) {
            int i10 = i4 + 1;
            byte b8 = bArr[i4];
            if (b8 >= 0) {
                i4 = i10;
            } else {
                if (b8 < -32) {
                    if (i10 >= i6) {
                        return b8;
                    }
                    if (b8 >= -62) {
                        i4 += 2;
                        if (bArr[i10] > -65) {
                        }
                    }
                    return -1;
                }
                if (b8 >= -16) {
                    if (i10 >= i6 - 2) {
                        return zzhm.zza(bArr, i10, i6);
                    }
                    int i11 = i4 + 2;
                    byte b10 = bArr[i10];
                    if (b10 <= -65) {
                        if ((((b10 + 112) + (b8 << 28)) >> 30) == 0) {
                            int i12 = i4 + 3;
                            if (bArr[i11] <= -65) {
                                i4 += 4;
                                if (bArr[i12] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                if (i10 >= i6 - 1) {
                    return zzhm.zza(bArr, i10, i6);
                }
                int i13 = i4 + 2;
                byte b11 = bArr[i10];
                if (b11 > -65 || (b8 == -32 && b11 < -96)) {
                    return -1;
                }
                if (b8 == -19 && b11 >= -96) {
                    return -1;
                }
                i4 += 3;
                if (bArr[i13] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
