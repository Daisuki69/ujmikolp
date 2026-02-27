package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.media3.common.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagy {
    public byte[] zzO;
    public zzaec zzU;
    public boolean zzW;
    public zzaeb zzY;
    public zzu zzZ;
    public boolean zza;
    public int zzaa;
    private int zzab;
    public String zzb;
    public String zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public boolean zzh;
    public byte[] zzi;
    public zzaea zzj;
    public byte[] zzk;
    public zzp zzl;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = -1;
    public int zzr = 0;
    public int zzs = -1;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public float zzv = 0.0f;
    public byte[] zzw = null;
    public int zzx = -1;
    public boolean zzy = false;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = -1;
    public int zzC = 1000;
    public int zzD = 200;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public float zzN = -1.0f;
    public int zzP = 1;
    public int zzQ = -1;
    public int zzR = 8000;
    public long zzS = 0;
    public long zzT = 0;
    public boolean zzV = false;
    public boolean zzX = true;
    private String zzac = "eng";

    private static Pair zzf(zzef zzefVar) throws zzas {
        try {
            zzefVar.zzk(16);
            long jZzA = zzefVar.zzA();
            if (jZzA == 1482049860) {
                return new Pair(MimeTypes.VIDEO_DIVX, null);
            }
            if (jZzA == 859189832) {
                return new Pair(MimeTypes.VIDEO_H263, null);
            }
            if (jZzA != 826496599) {
                zzds.zzc("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair(MimeTypes.VIDEO_UNKNOWN, null);
            }
            int iZzg = zzefVar.zzg() + 20;
            byte[] bArrZzi = zzefVar.zzi();
            while (true) {
                int length = bArrZzi.length;
                if (iZzg >= length - 4) {
                    throw zzas.zzb("Failed to find FourCC VC1 initialization data", null);
                }
                int i = iZzg + 1;
                if (bArrZzi[iZzg] == 0 && bArrZzi[i] == 0 && bArrZzi[iZzg + 2] == 1 && bArrZzi[iZzg + 3] == 15) {
                    return new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(bArrZzi, iZzg, length)));
                }
                iZzg = i;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzas.zzb("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzas {
        int i;
        int i4;
        try {
            if (bArr[0] != 2) {
                throw zzas.zzb("Error parsing vorbis codec private", null);
            }
            int i6 = 0;
            int i10 = 1;
            while (true) {
                int i11 = bArr[i10];
                i10++;
                i = i11 & 255;
                if (i != 255) {
                    break;
                }
                i6 += 255;
            }
            int i12 = i6 + i;
            int i13 = 0;
            while (true) {
                int i14 = bArr[i10];
                i10++;
                i4 = i14 & 255;
                if (i4 != 255) {
                    break;
                }
                i13 += 255;
            }
            int i15 = i13 + i4;
            if (bArr[i10] != 1) {
                throw zzas.zzb("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, i10, bArr2, 0, i12);
            int i16 = i10 + i12;
            if (bArr[i16] != 3) {
                throw zzas.zzb("Error parsing vorbis codec private", null);
            }
            int i17 = i16 + i15;
            if (bArr[i17] != 5) {
                throw zzas.zzb("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i17;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i17, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzas.zzb("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzef zzefVar) throws zzas {
        try {
            int iZzu = zzefVar.zzu();
            if (iZzu == 1) {
                return true;
            }
            if (iZzu == 65534) {
                zzefVar.zzh(24);
                if (zzefVar.zzD() == zzagz.zzf.getMostSignificantBits()) {
                    if (zzefVar.zzD() == zzagz.zzf.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzas.zzb("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] zzi(String str) throws zzas {
        byte[] bArr = this.zzk;
        if (bArr != null) {
            return bArr;
        }
        throw zzas.zzb("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzacx r19, int r20) throws com.google.android.gms.internal.ads.zzas {
        /*
            Method dump skipped, instruction units count: 1866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagy.zza(com.google.android.gms.internal.ads.zzacx, int):void");
    }

    public final /* synthetic */ void zzb() {
        this.zzY.getClass();
    }

    public final /* synthetic */ int zzc() {
        return this.zzab;
    }

    public final /* synthetic */ void zzd(int i) {
        this.zzab = i;
    }

    public final /* synthetic */ void zze(String str) {
        this.zzac = str;
    }
}
