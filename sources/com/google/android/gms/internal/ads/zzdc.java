package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"InlinedApi"})
public final class zzdc {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    @Nullable
    public static String zza(byte[] bArr) {
        zzef zzefVar = new zzef(bArr);
        if (!zzh(zzefVar, 31)) {
            return null;
        }
        zzefVar.zzk(4);
        int iZzs = zzefVar.zzs();
        int iZzs2 = zzefVar.zzs();
        if (!zzh(zzefVar, 0)) {
            return null;
        }
        zzefVar.zzQ();
        String strZzK = zzefVar.zzK(4, StandardCharsets.UTF_8);
        if (strZzK.equals("mp4a")) {
            zzefVar.zzQ();
            zzefVar.zzk(2);
            zzee zzeeVar = new zzee();
            zzeeVar.zza(zzefVar);
            int iZzj = zzeeVar.zzj(5);
            if (iZzj == 31) {
                iZzj = zzeeVar.zzj(6) + 32;
            }
            StringBuilder sb2 = new StringBuilder(strZzK.length() + 4 + String.valueOf(iZzj).length());
            sb2.append(strZzK);
            sb2.append(".40.");
            sb2.append(iZzj);
            strZzK = sb2.toString();
        }
        Object[] objArr = {Integer.valueOf(iZzs), Integer.valueOf(iZzs2), strZzK};
        String str = zzeo.zza;
        return String.format(Locale.US, "iamf.%03X.%03X.%s", objArr);
    }

    public static String zzb(int i, int i4, int i6) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i6));
    }

    public static String zzc(int i, boolean z4, int i4, int i6, int[] iArr, int i10) {
        Object[] objArr = {zzc[i], Integer.valueOf(i4), Integer.valueOf(i6), Character.valueOf(true != z4 ? 'L' : 'H'), Integer.valueOf(i10)};
        String str = zzeo.zza;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i11 = 6;
        while (i11 > 0) {
            int i12 = i11 - 1;
            if (iArr[i12] != 0) {
                break;
            }
            i11 = i12;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i13])));
        }
        return sb2.toString();
    }

    public static String zzd(byte[] bArr) {
        int length = bArr.length;
        zzghc.zzd(length >= 17, "Invalid APV CSD length: %s", length);
        byte b8 = bArr[0];
        zzghc.zzd(b8 == 1, "Invalid APV CSD version: %s", b8);
        byte b10 = bArr[5];
        byte b11 = bArr[6];
        byte b12 = bArr[7];
        String str = zzeo.zza;
        Locale locale = Locale.US;
        StringBuilder sbU = We.s.u("apv1.apvf", b10, ".apvl", b11, ".apvb");
        sbU.append((int) b12);
        return sbU.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01e0, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e4, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f1, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01fe, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x020b, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0218, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0224, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0230, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x023c, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0248, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0254, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0260, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:145:0x026d A[PHI: r20
  0x026d: PHI (r20v13 int) = 
  (r20v1 int)
  (r20v2 int)
  (r20v3 int)
  (r20v4 int)
  (r20v5 int)
  (r20v6 int)
  (r20v7 int)
  (r20v8 int)
  (r20v9 int)
  (r20v10 int)
  (r20v11 int)
  (r20v14 int)
 binds: [B:143:0x0268, B:140:0x025c, B:137:0x0250, B:134:0x0244, B:131:0x0238, B:128:0x022c, B:125:0x0220, B:122:0x0213, B:119:0x0206, B:116:0x01f9, B:113:0x01ec, B:111:0x01e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x031d  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair zze(com.google.android.gms.internal.ads.zzu r22) {
        /*
            Method dump skipped, instruction units count: 2140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdc.zze(com.google.android.gms.internal.ads.zzu):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair zzf(java.lang.String r10, java.lang.String[] r11, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzh r12) {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdc.zzf(java.lang.String, java.lang.String[], com.google.android.gms.internal.ads.zzh):android.util.Pair");
    }

    public static byte[] zzg(byte[] bArr, int i, int i4) {
        byte[] bArr2 = new byte[i4 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i4);
        return bArr2;
    }

    private static boolean zzh(zzef zzefVar, int i) {
        if ((zzefVar.zzs() >> 3) != i) {
            return false;
        }
        zzefVar.zzQ();
        return true;
    }
}
