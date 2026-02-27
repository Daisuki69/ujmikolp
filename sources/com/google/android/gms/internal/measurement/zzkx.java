package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzkx {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i, zzkw zzkwVar) {
        int i4 = i + 1;
        byte b8 = bArr[i];
        if (b8 < 0) {
            return zzb(b8, bArr, i4, zzkwVar);
        }
        zzkwVar.zza = b8;
        return i4;
    }

    public static int zzb(int i, byte[] bArr, int i4, zzkw zzkwVar) {
        byte b8 = bArr[i4];
        int i6 = i4 + 1;
        int i10 = i & 127;
        if (b8 >= 0) {
            zzkwVar.zza = i10 | (b8 << 7);
            return i6;
        }
        int i11 = i10 | ((b8 & 127) << 7);
        int i12 = i4 + 2;
        byte b10 = bArr[i6];
        if (b10 >= 0) {
            zzkwVar.zza = i11 | (b10 << 14);
            return i12;
        }
        int i13 = i11 | ((b10 & 127) << 14);
        int i14 = i4 + 3;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzkwVar.zza = i13 | (b11 << 21);
            return i14;
        }
        int i15 = i13 | ((b11 & 127) << 21);
        int i16 = i4 + 4;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzkwVar.zza = i15 | (b12 << 28);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                zzkwVar.zza = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    public static int zzc(byte[] bArr, int i, zzkw zzkwVar) {
        long j = bArr[i];
        int i4 = i + 1;
        if (j >= 0) {
            zzkwVar.zzb = j;
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
        zzkwVar.zzb = j6;
        return i6;
    }

    public static int zzd(byte[] bArr, int i) {
        int i4 = bArr[i] & 255;
        int i6 = bArr[i + 1] & 255;
        int i10 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i6 << 8) | i4 | (i10 << 16);
    }

    public static long zze(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static int zzf(byte[] bArr, int i, zzkw zzkwVar) throws zzmr {
        int i4;
        int iZza = zza(bArr, i, zzkwVar);
        int i6 = zzkwVar.zza;
        if (i6 < 0) {
            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i6 == 0) {
            zzkwVar.zzc = "";
            return iZza;
        }
        int i10 = zzos.zza;
        int length = bArr.length;
        if ((((length - iZza) - i6) | iZza | i6) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZza), Integer.valueOf(i6)));
        }
        int i11 = iZza + i6;
        char[] cArr = new char[i6];
        int i12 = 0;
        while (iZza < i11) {
            byte b8 = bArr[iZza];
            if (!zzoq.zza(b8)) {
                break;
            }
            iZza++;
            cArr[i12] = (char) b8;
            i12++;
        }
        int i13 = i12;
        while (iZza < i11) {
            int i14 = iZza + 1;
            byte b10 = bArr[iZza];
            if (zzoq.zza(b10)) {
                cArr[i13] = (char) b10;
                i13++;
                iZza = i14;
                while (iZza < i11) {
                    byte b11 = bArr[iZza];
                    if (zzoq.zza(b11)) {
                        iZza++;
                        cArr[i13] = (char) b11;
                        i13++;
                    }
                }
            } else {
                if (b10 < -32) {
                    if (i14 >= i11) {
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    i4 = i13 + 1;
                    iZza += 2;
                    zzoq.zzb(b10, bArr[i14], cArr, i13);
                } else if (b10 < -16) {
                    if (i14 >= i11 - 1) {
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    i4 = i13 + 1;
                    int i15 = iZza + 2;
                    iZza += 3;
                    zzoq.zzc(b10, bArr[i14], bArr[i15], cArr, i13);
                } else {
                    if (i14 >= i11 - 2) {
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    byte b12 = bArr[i14];
                    int i16 = iZza + 3;
                    byte b13 = bArr[iZza + 2];
                    iZza += 4;
                    zzoq.zzd(b10, b12, b13, bArr[i16], cArr, i13);
                    i13 += 2;
                }
                i13 = i4;
            }
        }
        zzkwVar.zzc = new String(cArr, 0, i13);
        return i11;
    }

    public static int zzg(byte[] bArr, int i, zzkw zzkwVar) throws zzmr {
        int iZza = zza(bArr, i, zzkwVar);
        int i4 = zzkwVar.zza;
        if (i4 < 0) {
            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i4 > bArr.length - iZza) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i4 == 0) {
            zzkwVar.zzc = zzlh.zzb;
            return iZza;
        }
        zzkwVar.zzc = zzlh.zzh(bArr, iZza, i4);
        return iZza + i4;
    }

    public static int zzh(zznx zznxVar, byte[] bArr, int i, int i4, zzkw zzkwVar) throws IOException {
        Object objZza = zznxVar.zza();
        int iZzj = zzj(objZza, zznxVar, bArr, i, i4, zzkwVar);
        zznxVar.zzj(objZza);
        zzkwVar.zzc = objZza;
        return iZzj;
    }

    public static int zzi(zznx zznxVar, byte[] bArr, int i, int i4, int i6, zzkw zzkwVar) throws IOException {
        Object objZza = zznxVar.zza();
        int iZzk = zzk(objZza, zznxVar, bArr, i, i4, i6, zzkwVar);
        zznxVar.zzj(objZza);
        zzkwVar.zzc = objZza;
        return iZzk;
    }

    public static int zzj(Object obj, zznx zznxVar, byte[] bArr, int i, int i4, zzkw zzkwVar) throws IOException {
        int iZzb = i + 1;
        int i6 = bArr[i];
        if (i6 < 0) {
            iZzb = zzb(i6, bArr, iZzb, zzkwVar);
            i6 = zzkwVar.zza;
        }
        int i10 = iZzb;
        if (i6 < 0 || i6 > i4 - i10) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i11 = zzkwVar.zze + 1;
        zzkwVar.zze = i11;
        zzq(i11);
        int i12 = i10 + i6;
        zznxVar.zzi(obj, bArr, i10, i12, zzkwVar);
        zzkwVar.zze--;
        zzkwVar.zzc = obj;
        return i12;
    }

    public static int zzk(Object obj, zznx zznxVar, byte[] bArr, int i, int i4, int i6, zzkw zzkwVar) throws IOException {
        int i10 = zzkwVar.zze + 1;
        zzkwVar.zze = i10;
        zzq(i10);
        int iZzh = ((zznp) zznxVar).zzh(obj, bArr, i, i4, i6, zzkwVar);
        zzkwVar.zze--;
        zzkwVar.zzc = obj;
        return iZzh;
    }

    public static int zzl(int i, byte[] bArr, int i4, int i6, zzmo zzmoVar, zzkw zzkwVar) {
        zzmg zzmgVar = (zzmg) zzmoVar;
        int iZza = zza(bArr, i4, zzkwVar);
        zzmgVar.zzh(zzkwVar.zza);
        while (iZza < i6) {
            int iZza2 = zza(bArr, iZza, zzkwVar);
            if (i != zzkwVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zzkwVar);
            zzmgVar.zzh(zzkwVar.zza);
        }
        return iZza;
    }

    public static int zzm(byte[] bArr, int i, zzmo zzmoVar, zzkw zzkwVar) throws IOException {
        zzmg zzmgVar = (zzmg) zzmoVar;
        int iZza = zza(bArr, i, zzkwVar);
        int i4 = zzkwVar.zza + iZza;
        while (iZza < i4) {
            iZza = zza(bArr, iZza, zzkwVar);
            zzmgVar.zzh(zzkwVar.zza);
        }
        if (iZza == i4) {
            return iZza;
        }
        throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzn(zznx zznxVar, int i, byte[] bArr, int i4, int i6, zzmo zzmoVar, zzkw zzkwVar) throws IOException {
        int iZzh = zzh(zznxVar, bArr, i4, i6, zzkwVar);
        zzmoVar.add(zzkwVar.zzc);
        while (iZzh < i6) {
            int iZza = zza(bArr, iZzh, zzkwVar);
            if (i != zzkwVar.zza) {
                break;
            }
            iZzh = zzh(zznxVar, bArr, iZza, i6, zzkwVar);
            zzmoVar.add(zzkwVar.zzc);
        }
        return iZzh;
    }

    public static int zzo(int i, byte[] bArr, int i4, int i6, zzoj zzojVar, zzkw zzkwVar) throws zzmr {
        if ((i >>> 3) == 0) {
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i & 7;
        if (i10 == 0) {
            int iZzc = zzc(bArr, i4, zzkwVar);
            zzojVar.zzk(i, Long.valueOf(zzkwVar.zzb));
            return iZzc;
        }
        if (i10 == 1) {
            zzojVar.zzk(i, Long.valueOf(zze(bArr, i4)));
            return i4 + 8;
        }
        if (i10 == 2) {
            int iZza = zza(bArr, i4, zzkwVar);
            int i11 = zzkwVar.zza;
            if (i11 < 0) {
                throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i11 > bArr.length - iZza) {
                throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i11 == 0) {
                zzojVar.zzk(i, zzlh.zzb);
            } else {
                zzojVar.zzk(i, zzlh.zzh(bArr, iZza, i11));
            }
            return iZza + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw new zzmr("Protocol message contained an invalid tag (zero).");
            }
            zzojVar.zzk(i, Integer.valueOf(zzd(bArr, i4)));
            return i4 + 4;
        }
        int i12 = (i & (-8)) | 4;
        zzoj zzojVarZzb = zzoj.zzb();
        int i13 = zzkwVar.zze + 1;
        zzkwVar.zze = i13;
        zzq(i13);
        int i14 = 0;
        while (true) {
            if (i4 >= i6) {
                break;
            }
            int iZza2 = zza(bArr, i4, zzkwVar);
            int i15 = zzkwVar.zza;
            if (i15 == i12) {
                i14 = i15;
                i4 = iZza2;
                break;
            }
            i4 = zzo(i15, bArr, iZza2, i6, zzojVarZzb, zzkwVar);
            i14 = i15;
        }
        zzkwVar.zze--;
        if (i4 > i6 || i14 != i12) {
            throw new zzmr("Failed to parse the message.");
        }
        zzojVar.zzk(i, zzojVarZzb);
        return i4;
    }

    public static int zzp(int i, byte[] bArr, int i4, int i6, zzkw zzkwVar) throws zzmr {
        if ((i >>> 3) == 0) {
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i & 7;
        if (i10 == 0) {
            return zzc(bArr, i4, zzkwVar);
        }
        if (i10 == 1) {
            return i4 + 8;
        }
        if (i10 == 2) {
            return zza(bArr, i4, zzkwVar) + zzkwVar.zza;
        }
        if (i10 != 3) {
            if (i10 == 5) {
                return i4 + 4;
            }
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i11 = (i & (-8)) | 4;
        int i12 = 0;
        while (i4 < i6) {
            i4 = zza(bArr, i4, zzkwVar);
            i12 = zzkwVar.zza;
            if (i12 == i11) {
                break;
            }
            i4 = zzp(i12, bArr, i4, i6, zzkwVar);
        }
        if (i4 > i6 || i12 != i11) {
            throw new zzmr("Failed to parse the message.");
        }
        return i4;
    }

    private static void zzq(int i) throws zzmr {
        if (i >= zzb) {
            throw new zzmr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
