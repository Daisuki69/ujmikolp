package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.media3.extractor.WavUtil;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzaod {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] zzc = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean zza(zzacv zzacvVar) throws IOException {
        zzef zzefVar = new zzef(8);
        int i = zzaoc.zza(zzacvVar, zzefVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        zzacvVar.zzi(zzefVar.zzi(), 0, 4);
        zzefVar.zzh(0);
        int iZzB = zzefVar.zzB();
        if (iZzB == 1463899717) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzB).length() + 23);
        sb2.append("Unsupported form type: ");
        sb2.append(iZzB);
        zzds.zze("WavHeaderReader", sb2.toString());
        return false;
    }

    public static zzaob zzb(zzacv zzacvVar) throws IOException {
        byte[] bArr;
        int i;
        byte[] bArr2;
        zzef zzefVar = new zzef(16);
        long j = zzd(WavUtil.FMT_FOURCC, zzacvVar, zzefVar).zzb;
        zzghc.zzh(j >= 16);
        zzacvVar.zzi(zzefVar.zzi(), 0, 16);
        zzefVar.zzh(0);
        int iZzu = zzefVar.zzu();
        int iZzu2 = zzefVar.zzu();
        int iZzI = zzefVar.zzI();
        int iZzI2 = zzefVar.zzI();
        int iZzu3 = zzefVar.zzu();
        int iZzu4 = zzefVar.zzu();
        int i4 = ((int) j) - 16;
        if (i4 > 0) {
            bArr = new byte[i4];
            zzacvVar.zzi(bArr, 0, i4);
            if (iZzu == 65534) {
                if (i4 == 24) {
                    zzef zzefVar2 = new zzef(bArr);
                    zzefVar2.zzu();
                    int iZzu5 = zzefVar2.zzu();
                    if (iZzu5 != 0 && iZzu5 != iZzu4) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzu4).length() + String.valueOf(iZzu5).length() + 33 + 19);
                        androidx.media3.datasource.cache.c.y(sb2, "validBits ( ", iZzu5, ")  != bitsPerSample( ", iZzu4);
                        sb2.append(") are not supported");
                        throw zzas.zzc(sb2.toString());
                    }
                    int iZzI3 = zzefVar2.zzI();
                    if ((iZzI3 >> 18) != 0) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(iZzI3).length() + 21);
                        sb3.append("invalid channel mask ");
                        sb3.append(iZzI3);
                        throw zzas.zzc(sb3.toString());
                    }
                    if (iZzI3 != 0 && Integer.bitCount(iZzI3) != iZzu2) {
                        int iBitCount = Integer.bitCount(iZzI3);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(iBitCount).length() + 46 + String.valueOf(iZzI3).length());
                        sb4.append("invalid number of channels (");
                        sb4.append(iBitCount);
                        sb4.append(") in channel mask ");
                        sb4.append(iZzI3);
                        throw zzas.zzc(sb4.toString());
                    }
                    iZzu = zzefVar2.zzu();
                    byte[] bArr3 = new byte[14];
                    zzefVar2.zzm(bArr3, 0, 14);
                    if (!Arrays.equals(bArr3, zzb) && !Arrays.equals(bArr3, zzc)) {
                        throw zzas.zzc("invalid wav format extension guid");
                    }
                } else {
                    bArr2 = bArr;
                    i = 65534;
                }
            }
            zzacvVar.zzf((int) (zzacvVar.zzm() - zzacvVar.zzn()));
            return new zzaob(i, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2);
        }
        bArr = zzeo.zzb;
        i = iZzu;
        bArr2 = bArr;
        zzacvVar.zzf((int) (zzacvVar.zzm() - zzacvVar.zzn()));
        return new zzaob(i, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2);
    }

    public static Pair zzc(zzacv zzacvVar) throws IOException {
        zzacvVar.zzl();
        zzaoc zzaocVarZzd = zzd(1684108385, zzacvVar, new zzef(8));
        zzacvVar.zzf(8);
        return Pair.create(Long.valueOf(zzacvVar.zzn()), Long.valueOf(zzaocVarZzd.zzb));
    }

    private static zzaoc zzd(int i, zzacv zzacvVar, zzef zzefVar) throws IOException {
        zzaoc zzaocVarZza = zzaoc.zza(zzacvVar, zzefVar);
        while (true) {
            int i4 = zzaocVarZza.zza;
            if (i4 == i) {
                return zzaocVarZza;
            }
            androidx.media3.datasource.cache.c.x(new StringBuilder(String.valueOf(i4).length() + 28), "Ignoring unknown WAV chunk: ", i4, "WavHeaderReader");
            long j = zzaocVarZza.zzb;
            long j6 = 8 + j;
            if ((1 & j) != 0) {
                j6 = 9 + j;
            }
            if (j6 > 2147483647L) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 40);
                sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(i4);
                throw zzas.zzc(sb2.toString());
            }
            zzacvVar.zzf((int) j6);
            zzaocVarZza = zzaoc.zza(zzacvVar, zzefVar);
        }
    }
}
