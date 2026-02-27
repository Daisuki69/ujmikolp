package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzax {
    public static int zza(int i, byte[] bArr, int i4, int i6, zzay zzayVar) throws zzco {
        if ((i >>> 3) == 0) {
            throw zzco.zzbm();
        }
        int i10 = i & 7;
        if (i10 == 0) {
            return zzb(bArr, i4, zzayVar);
        }
        if (i10 == 1) {
            return i4 + 8;
        }
        if (i10 == 2) {
            return zza(bArr, i4, zzayVar) + zzayVar.zzfd;
        }
        if (i10 != 3) {
            if (i10 == 5) {
                return i4 + 4;
            }
            throw zzco.zzbm();
        }
        int i11 = (i & (-8)) | 4;
        int i12 = 0;
        while (i4 < i6) {
            i4 = zza(bArr, i4, zzayVar);
            i12 = zzayVar.zzfd;
            if (i12 == i11) {
                break;
            }
            i4 = zza(i12, bArr, i4, i6, zzayVar);
        }
        if (i4 > i6 || i12 != i11) {
            throw zzco.zzbo();
        }
        return i4;
    }

    public static int zzb(byte[] bArr, int i, zzay zzayVar) {
        int i4 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzayVar.zzfe = j;
            return i4;
        }
        int i6 = i + 2;
        byte b8 = bArr[i4];
        long j6 = (j & 127) | (((long) (b8 & 127)) << 7);
        int i10 = 7;
        while (b8 < 0) {
            int i11 = i6 + 1;
            byte b10 = bArr[i6];
            i10 += 7;
            j6 |= ((long) (b10 & 127)) << i10;
            b8 = b10;
            i6 = i11;
        }
        zzayVar.zzfe = j6;
        return i6;
    }

    public static int zzc(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int zzd(byte[] bArr, int i, zzay zzayVar) throws IOException {
        int iZza = zza(bArr, i, zzayVar);
        int i4 = zzayVar.zzfd;
        if (i4 == 0) {
            zzayVar.zzff = "";
            return iZza;
        }
        int i6 = iZza + i4;
        if (!zzff.zze(bArr, iZza, i6)) {
            throw zzco.zzbp();
        }
        zzayVar.zzff = new String(bArr, iZza, i4, zzci.UTF_8);
        return i6;
    }

    public static double zze(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzd(bArr, i));
    }

    public static float zzf(byte[] bArr, int i) {
        return Float.intBitsToFloat(zzc(bArr, i));
    }

    public static int zza(int i, byte[] bArr, int i4, int i6, zzcn<?> zzcnVar, zzay zzayVar) {
        zzch zzchVar = (zzch) zzcnVar;
        int iZza = zza(bArr, i4, zzayVar);
        while (true) {
            zzchVar.zzac(zzayVar.zzfd);
            if (iZza >= i6) {
                break;
            }
            int iZza2 = zza(bArr, iZza, zzayVar);
            if (i != zzayVar.zzfd) {
                break;
            }
            iZza = zza(bArr, iZza2, zzayVar);
        }
        return iZza;
    }

    public static int zzc(byte[] bArr, int i, zzay zzayVar) {
        int iZza = zza(bArr, i, zzayVar);
        int i4 = zzayVar.zzfd;
        if (i4 == 0) {
            zzayVar.zzff = "";
            return iZza;
        }
        zzayVar.zzff = new String(bArr, iZza, i4, zzci.UTF_8);
        return iZza + i4;
    }

    public static long zzd(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int zze(byte[] bArr, int i, zzay zzayVar) {
        int iZza = zza(bArr, i, zzayVar);
        int i4 = zzayVar.zzfd;
        if (i4 == 0) {
            zzayVar.zzff = zzbb.zzfi;
            return iZza;
        }
        zzayVar.zzff = zzbb.zzb(bArr, iZza, i4);
        return iZza + i4;
    }

    public static int zza(int i, byte[] bArr, int i4, int i6, zzey zzeyVar, zzay zzayVar) throws IOException {
        if ((i >>> 3) == 0) {
            throw zzco.zzbm();
        }
        int i10 = i & 7;
        if (i10 == 0) {
            int iZzb = zzb(bArr, i4, zzayVar);
            zzeyVar.zzb(i, Long.valueOf(zzayVar.zzfe));
            return iZzb;
        }
        if (i10 == 1) {
            zzeyVar.zzb(i, Long.valueOf(zzd(bArr, i4)));
            return i4 + 8;
        }
        if (i10 == 2) {
            int iZza = zza(bArr, i4, zzayVar);
            int i11 = zzayVar.zzfd;
            zzeyVar.zzb(i, i11 == 0 ? zzbb.zzfi : zzbb.zzb(bArr, iZza, i11));
            return iZza + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw zzco.zzbm();
            }
            zzeyVar.zzb(i, Integer.valueOf(zzc(bArr, i4)));
            return i4 + 4;
        }
        zzey zzeyVarZzeb = zzey.zzeb();
        int i12 = (i & (-8)) | 4;
        int i13 = 0;
        while (true) {
            if (i4 >= i6) {
                break;
            }
            int iZza2 = zza(bArr, i4, zzayVar);
            i13 = zzayVar.zzfd;
            if (i13 == i12) {
                i4 = iZza2;
                break;
            }
            i4 = zza(i13, bArr, iZza2, i6, zzeyVarZzeb, zzayVar);
        }
        if (i4 > i6 || i13 != i12) {
            throw zzco.zzbo();
        }
        zzeyVar.zzb(i, zzeyVarZzeb);
        return i4;
    }

    public static int zza(int i, byte[] bArr, int i4, zzay zzayVar) {
        int i6;
        int i10 = i & 127;
        int i11 = i4 + 1;
        byte b8 = bArr[i4];
        if (b8 >= 0) {
            i6 = b8 << 7;
        } else {
            int i12 = i10 | ((b8 & 127) << 7);
            int i13 = i4 + 2;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                zzayVar.zzfd = i12 | (b10 << 14);
                return i13;
            }
            i10 = i12 | ((b10 & 127) << 14);
            i11 = i4 + 3;
            byte b11 = bArr[i13];
            if (b11 >= 0) {
                i6 = b11 << 21;
            } else {
                int i14 = i10 | ((b11 & 127) << 21);
                int i15 = i4 + 4;
                byte b12 = bArr[i11];
                if (b12 >= 0) {
                    zzayVar.zzfd = i14 | (b12 << 28);
                    return i15;
                }
                int i16 = i14 | ((b12 & 127) << 28);
                while (true) {
                    int i17 = i15 + 1;
                    if (bArr[i15] >= 0) {
                        zzayVar.zzfd = i16;
                        return i17;
                    }
                    i15 = i17;
                }
            }
        }
        zzayVar.zzfd = i10 | i6;
        return i11;
    }

    public static int zza(byte[] bArr, int i, zzay zzayVar) {
        int i4 = i + 1;
        byte b8 = bArr[i];
        if (b8 < 0) {
            return zza(b8, bArr, i4, zzayVar);
        }
        zzayVar.zzfd = b8;
        return i4;
    }

    public static int zza(byte[] bArr, int i, zzcn<?> zzcnVar, zzay zzayVar) throws IOException {
        zzch zzchVar = (zzch) zzcnVar;
        int iZza = zza(bArr, i, zzayVar);
        int i4 = zzayVar.zzfd + iZza;
        while (iZza < i4) {
            iZza = zza(bArr, iZza, zzayVar);
            zzchVar.zzac(zzayVar.zzfd);
        }
        if (iZza == i4) {
            return iZza;
        }
        throw zzco.zzbl();
    }
}
