package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zztk {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i, zztj zztjVar) throws zzve {
        int iZzj = zzj(bArr, i, zztjVar);
        int i4 = zztjVar.zza;
        if (i4 < 0) {
            throw new zzve("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i4 > bArr.length - iZzj) {
            throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i4 == 0) {
            zztjVar.zzc = zztu.zzb;
            return iZzj;
        }
        zztjVar.zzc = zztu.zzj(bArr, iZzj, i4);
        return iZzj + i4;
    }

    public static int zzb(int i, byte[] bArr, int i4, int i6, zzus zzusVar, zzuu zzuuVar, zzwv zzwvVar, zztj zztjVar) throws IOException {
        zzum zzumVar = zzusVar.zzb;
        zzxg zzxgVar = zzuuVar.zzd.zzb;
        Object objValueOf = null;
        if (zzxgVar == zzxg.zzn) {
            zzj(bArr, i4, zztjVar);
            throw null;
        }
        switch (zzxgVar.ordinal()) {
            case 0:
                i4 += 8;
                objValueOf = Double.valueOf(Double.longBitsToDouble(zzq(bArr, i4)));
                break;
            case 1:
                i4 += 4;
                objValueOf = Float.valueOf(Float.intBitsToFloat(zzc(bArr, i4)));
                break;
            case 2:
            case 3:
                i4 = zzm(bArr, i4, zztjVar);
                objValueOf = Long.valueOf(zztjVar.zzb);
                break;
            case 4:
            case 12:
                i4 = zzj(bArr, i4, zztjVar);
                objValueOf = Integer.valueOf(zztjVar.zza);
                break;
            case 5:
            case 15:
                i4 += 8;
                objValueOf = Long.valueOf(zzq(bArr, i4));
                break;
            case 6:
            case 14:
                i4 += 4;
                objValueOf = Integer.valueOf(zzc(bArr, i4));
                break;
            case 7:
                i4 = zzm(bArr, i4, zztjVar);
                objValueOf = Boolean.valueOf(zztjVar.zzb != 0);
                break;
            case 8:
                i4 = zzh(bArr, i4, zztjVar);
                objValueOf = zztjVar.zzc;
                break;
            case 9:
                int iZzd = zzd(zzwe.zza().zzb(zzuuVar.zzc.getClass()), bArr, i4, i6, ((i >>> 3) << 3) | 4, zztjVar);
                zzumVar.zzg(zzuuVar.zzd, zztjVar.zzc);
                return iZzd;
            case 10:
                int iZze = zze(zzwe.zza().zzb(zzuuVar.zzc.getClass()), bArr, i4, i6, zztjVar);
                zzumVar.zzg(zzuuVar.zzd, zztjVar.zzc);
                return iZze;
            case 11:
                i4 = zza(bArr, i4, zztjVar);
                objValueOf = zztjVar.zzc;
                break;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 16:
                i4 = zzj(bArr, i4, zztjVar);
                objValueOf = Integer.valueOf(zzty.zzb(zztjVar.zza));
                break;
            case 17:
                i4 = zzm(bArr, i4, zztjVar);
                objValueOf = Long.valueOf(zzty.zzc(zztjVar.zzb));
                break;
        }
        zzumVar.zzg(zzuuVar.zzd, objValueOf);
        return i4;
    }

    public static int zzc(byte[] bArr, int i) {
        int i4 = bArr[i] & 255;
        int i6 = bArr[i + 1] & 255;
        int i10 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i6 << 8) | i4 | (i10 << 16);
    }

    public static int zzd(zzwh zzwhVar, byte[] bArr, int i, int i4, int i6, zztj zztjVar) throws IOException {
        Object objZze = zzwhVar.zze();
        int iZzn = zzn(objZze, zzwhVar, bArr, i, i4, i6, zztjVar);
        zzwhVar.zzf(objZze);
        zztjVar.zzc = objZze;
        return iZzn;
    }

    public static int zze(zzwh zzwhVar, byte[] bArr, int i, int i4, zztj zztjVar) throws IOException {
        Object objZze = zzwhVar.zze();
        int iZzo = zzo(objZze, zzwhVar, bArr, i, i4, zztjVar);
        zzwhVar.zzf(objZze);
        zztjVar.zzc = objZze;
        return iZzo;
    }

    public static int zzf(zzwh zzwhVar, int i, byte[] bArr, int i4, int i6, zzvb zzvbVar, zztj zztjVar) throws IOException {
        int iZze = zze(zzwhVar, bArr, i4, i6, zztjVar);
        zzvbVar.add(zztjVar.zzc);
        while (iZze < i6) {
            int iZzj = zzj(bArr, iZze, zztjVar);
            if (i != zztjVar.zza) {
                break;
            }
            iZze = zze(zzwhVar, bArr, iZzj, i6, zztjVar);
            zzvbVar.add(zztjVar.zzc);
        }
        return iZze;
    }

    public static int zzg(byte[] bArr, int i, zzvb zzvbVar, zztj zztjVar) throws IOException {
        zzux zzuxVar = (zzux) zzvbVar;
        int iZzj = zzj(bArr, i, zztjVar);
        int i4 = zztjVar.zza + iZzj;
        while (iZzj < i4) {
            iZzj = zzj(bArr, iZzj, zztjVar);
            zzuxVar.zzf(zztjVar.zza);
        }
        if (iZzj == i4) {
            return iZzj;
        }
        throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzh(byte[] bArr, int i, zztj zztjVar) throws zzve {
        int iZzj = zzj(bArr, i, zztjVar);
        int i4 = zztjVar.zza;
        if (i4 < 0) {
            throw new zzve("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i4 == 0) {
            zztjVar.zzc = "";
            return iZzj;
        }
        zztjVar.zzc = new String(bArr, iZzj, i4, zzvc.zza);
        return iZzj + i4;
    }

    public static int zzi(int i, byte[] bArr, int i4, int i6, zzww zzwwVar, zztj zztjVar) throws zzve {
        if ((i >>> 3) == 0) {
            throw new zzve("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i & 7;
        if (i10 == 0) {
            int iZzm = zzm(bArr, i4, zztjVar);
            zzwwVar.zzj(i, Long.valueOf(zztjVar.zzb));
            return iZzm;
        }
        if (i10 == 1) {
            zzwwVar.zzj(i, Long.valueOf(zzq(bArr, i4)));
            return i4 + 8;
        }
        if (i10 == 2) {
            int iZzj = zzj(bArr, i4, zztjVar);
            int i11 = zztjVar.zza;
            if (i11 < 0) {
                throw new zzve("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i11 > bArr.length - iZzj) {
                throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i11 == 0) {
                zzwwVar.zzj(i, zztu.zzb);
            } else {
                zzwwVar.zzj(i, zztu.zzj(bArr, iZzj, i11));
            }
            return iZzj + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw new zzve("Protocol message contained an invalid tag (zero).");
            }
            zzwwVar.zzj(i, Integer.valueOf(zzc(bArr, i4)));
            return i4 + 4;
        }
        int i12 = (i & (-8)) | 4;
        zzww zzwwVarZzf = zzww.zzf();
        int i13 = zztjVar.zze + 1;
        zztjVar.zze = i13;
        zzr(i13);
        int i14 = 0;
        while (true) {
            if (i4 >= i6) {
                break;
            }
            int iZzj2 = zzj(bArr, i4, zztjVar);
            int i15 = zztjVar.zza;
            if (i15 == i12) {
                i14 = i15;
                i4 = iZzj2;
                break;
            }
            i4 = zzi(i15, bArr, iZzj2, i6, zzwwVarZzf, zztjVar);
            i14 = i15;
        }
        zztjVar.zze--;
        if (i4 > i6 || i14 != i12) {
            throw new zzve("Failed to parse the message.");
        }
        zzwwVar.zzj(i, zzwwVarZzf);
        return i4;
    }

    public static int zzj(byte[] bArr, int i, zztj zztjVar) {
        int i4 = i + 1;
        byte b8 = bArr[i];
        if (b8 < 0) {
            return zzk(b8, bArr, i4, zztjVar);
        }
        zztjVar.zza = b8;
        return i4;
    }

    public static int zzk(int i, byte[] bArr, int i4, zztj zztjVar) {
        byte b8 = bArr[i4];
        int i6 = i4 + 1;
        int i10 = i & 127;
        if (b8 >= 0) {
            zztjVar.zza = i10 | (b8 << 7);
            return i6;
        }
        int i11 = i10 | ((b8 & 127) << 7);
        int i12 = i4 + 2;
        byte b10 = bArr[i6];
        if (b10 >= 0) {
            zztjVar.zza = i11 | (b10 << 14);
            return i12;
        }
        int i13 = i11 | ((b10 & 127) << 14);
        int i14 = i4 + 3;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zztjVar.zza = i13 | (b11 << 21);
            return i14;
        }
        int i15 = i13 | ((b11 & 127) << 21);
        int i16 = i4 + 4;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zztjVar.zza = i15 | (b12 << 28);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                zztjVar.zza = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    public static int zzl(int i, byte[] bArr, int i4, int i6, zzvb zzvbVar, zztj zztjVar) {
        zzux zzuxVar = (zzux) zzvbVar;
        int iZzj = zzj(bArr, i4, zztjVar);
        zzuxVar.zzf(zztjVar.zza);
        while (iZzj < i6) {
            int iZzj2 = zzj(bArr, iZzj, zztjVar);
            if (i != zztjVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zztjVar);
            zzuxVar.zzf(zztjVar.zza);
        }
        return iZzj;
    }

    public static int zzm(byte[] bArr, int i, zztj zztjVar) {
        long j = bArr[i];
        int i4 = i + 1;
        if (j >= 0) {
            zztjVar.zzb = j;
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
        zztjVar.zzb = j6;
        return i6;
    }

    public static int zzn(Object obj, zzwh zzwhVar, byte[] bArr, int i, int i4, int i6, zztj zztjVar) throws IOException {
        int i10 = zztjVar.zze + 1;
        zztjVar.zze = i10;
        zzr(i10);
        int iZzc = ((zzvz) zzwhVar).zzc(obj, bArr, i, i4, i6, zztjVar);
        zztjVar.zze--;
        zztjVar.zzc = obj;
        return iZzc;
    }

    public static int zzo(Object obj, zzwh zzwhVar, byte[] bArr, int i, int i4, zztj zztjVar) throws IOException {
        int iZzk = i + 1;
        int i6 = bArr[i];
        if (i6 < 0) {
            iZzk = zzk(i6, bArr, iZzk, zztjVar);
            i6 = zztjVar.zza;
        }
        int i10 = iZzk;
        if (i6 < 0 || i6 > i4 - i10) {
            throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i11 = zztjVar.zze + 1;
        zztjVar.zze = i11;
        zzr(i11);
        int i12 = i10 + i6;
        zzwhVar.zzh(obj, bArr, i10, i12, zztjVar);
        zztjVar.zze--;
        zztjVar.zzc = obj;
        return i12;
    }

    public static int zzp(int i, byte[] bArr, int i4, int i6, zztj zztjVar) throws zzve {
        if ((i >>> 3) == 0) {
            throw new zzve("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i & 7;
        if (i10 == 0) {
            return zzm(bArr, i4, zztjVar);
        }
        if (i10 == 1) {
            return i4 + 8;
        }
        if (i10 == 2) {
            return zzj(bArr, i4, zztjVar) + zztjVar.zza;
        }
        if (i10 != 3) {
            if (i10 == 5) {
                return i4 + 4;
            }
            throw new zzve("Protocol message contained an invalid tag (zero).");
        }
        int i11 = (i & (-8)) | 4;
        int i12 = 0;
        while (i4 < i6) {
            i4 = zzj(bArr, i4, zztjVar);
            i12 = zztjVar.zza;
            if (i12 == i11) {
                break;
            }
            i4 = zzp(i12, bArr, i4, i6, zztjVar);
        }
        if (i4 > i6 || i12 != i11) {
            throw new zzve("Failed to parse the message.");
        }
        return i4;
    }

    public static long zzq(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    private static void zzr(int i) throws zzve {
        if (i >= zzb) {
            throw new zzve("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
