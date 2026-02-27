package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfl {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i) {
        int i4;
        synchronized (zzc) {
            int i6 = 0;
            int i10 = 0;
            while (i6 < i) {
                while (true) {
                    try {
                        if (i6 >= i - 2) {
                            i6 = i;
                            break;
                        }
                        int i11 = i6 + 1;
                        if (bArr[i6] == 0 && bArr[i11] == 0 && bArr[i6 + 2] == 3) {
                            break;
                        }
                        i6 = i11;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i6 < i) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i10) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i10] = i6;
                    i6 += 3;
                    i10++;
                }
            }
            i4 = i - i10;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = zzd[i14] - i12;
                System.arraycopy(bArr, i12, bArr, i13, i15);
                int i16 = i13 + i15;
                int i17 = i16 + 1;
                bArr[i16] = 0;
                i13 = i16 + 2;
                bArr[i17] = 0;
                i12 += i15 + 3;
            }
            System.arraycopy(bArr, i12, bArr, i13, i4 - i13);
        }
        return i4;
    }

    public static int zzb(zzu zzuVar) {
        String str = zzuVar.zzo;
        if (Objects.equals(str, "video/avc")) {
            return 1;
        }
        return (Objects.equals(str, MimeTypes.VIDEO_H265) || zzar.zze(zzuVar.zzk, MimeTypes.VIDEO_H265)) ? 2 : 0;
    }

    public static boolean zzc(byte[] bArr, int i, int i4, zzu zzuVar) {
        String str = zzuVar.zzo;
        if (Objects.equals(str, "video/avc")) {
            byte b8 = bArr[4];
            if (((b8 & 96) >> 5) != 0) {
                return true;
            }
            int i6 = b8 & 31;
            return (i6 == 1 || i6 == 9 || i6 == 14) ? false : true;
        }
        if (Objects.equals(str, MimeTypes.VIDEO_H265)) {
            zzez zzezVarZzk = zzk(new zzfm(bArr, 4, i4 + 4));
            int i10 = zzezVarZzk.zza;
            if (i10 == 35) {
                return false;
            }
            return (i10 <= 14 && i10 % 2 == 0 && zzezVarZzk.zzc == zzuVar.zzF + (-1)) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0235 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016c A[PHI: r2
  0x016c: PHI (r2v6 int) = (r2v4 int), (r2v3 int) binds: [B:87:0x0171, B:83:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016f A[PHI: r2
  0x016f: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v7 int) binds: [B:74:0x0156, B:76:0x015a, B:78:0x015e, B:80:0x0162, B:82:0x0166, B:84:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzfk zzd(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfl.zzd(byte[], int, int):com.google.android.gms.internal.ads.zzfk");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x05f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzfi zze(byte[] r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 2155
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfl.zze(byte[], int, int):com.google.android.gms.internal.ads.zzfi");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzff zzf(byte[] r36, int r37, int r38, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzfi r39) {
        /*
            Method dump skipped, instruction units count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfl.zzf(byte[], int, int, com.google.android.gms.internal.ads.zzfi):com.google.android.gms.internal.ads.zzff");
    }

    public static zzfj zzg(byte[] bArr, int i, int i4) {
        zzfm zzfmVar = new zzfm(bArr, 4, i4);
        int iZzg = zzfmVar.zzg();
        int iZzg2 = zzfmVar.zzg();
        zzfmVar.zza();
        return new zzfj(iZzg, iZzg2, zzfmVar.zze());
    }

    public static int zzh(byte[] bArr, int i, int i4, boolean[] zArr) {
        int i6 = i4 - i;
        zzghc.zzh(i6 >= 0);
        if (i6 == 0) {
            return i4;
        }
        if (zArr[0]) {
            zzi(zArr);
            return i - 3;
        }
        if (i6 > 1 && zArr[1] && bArr[i] == 1) {
            zzi(zArr);
            return i - 2;
        }
        if (i6 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            zzi(zArr);
            return i - 1;
        }
        int i10 = i4 - 1;
        int i11 = i + 2;
        while (i11 < i10) {
            byte b8 = bArr[i11];
            if ((b8 & 254) == 0) {
                int i12 = i11 - 2;
                if (bArr[i12] == 0 && bArr[i11 - 1] == 0 && b8 == 1) {
                    zzi(zArr);
                    return i12;
                }
                i11 = i12;
            }
            i11 += 3;
        }
        zArr[0] = i6 <= 2 ? !(i6 != 2 ? !(zArr[1] && bArr[i10] == 1) : !(zArr[2] && bArr[i4 + (-2)] == 0 && bArr[i10] == 1)) : bArr[i4 + (-3)] == 0 && bArr[i4 + (-2)] == 0 && bArr[i10] == 1;
        zArr[1] = i6 <= 1 ? zArr[2] && bArr[i10] == 0 : bArr[i4 + (-2)] == 0 && bArr[i10] == 0;
        zArr[2] = bArr[i10] == 0;
        return i4;
    }

    public static void zzi(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    @Nullable
    public static String zzj(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i4 = zzgjz.zzd;
                zzgjw zzgjwVar = new zzgjw();
                int i6 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i6 >= length2) {
                        break;
                    }
                    int iZzh = zzh(bArr, i6, length2, zArr);
                    if (iZzh != length2) {
                        zzgjwVar.zzf(Integer.valueOf(iZzh));
                    }
                    i6 = iZzh + 3;
                }
                zzgjz zzgjzVarZzi = zzgjwVar.zzi();
                for (int i10 = 0; i10 < zzgjzVarZzi.size(); i10++) {
                    if (((Integer) zzgjzVarZzi.get(i10)).intValue() + 3 < length) {
                        zzfm zzfmVar = new zzfm(bArr, ((Integer) zzgjzVarZzi.get(i10)).intValue() + 3, length);
                        zzez zzezVarZzk = zzk(zzfmVar);
                        if (zzezVarZzk.zza == 33 && zzezVarZzk.zzb == 0) {
                            zzfmVar.zzb(4);
                            int iZzf = zzfmVar.zzf(3);
                            zzfmVar.zza();
                            zzfa zzfaVarZzl = zzl(zzfmVar, true, iZzf, null);
                            return zzdc.zzc(zzfaVarZzl.zza, zzfaVarZzl.zzb, zzfaVarZzl.zzc, zzfaVarZzl.zzd, zzfaVarZzl.zze, zzfaVarZzl.zzf);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static zzez zzk(zzfm zzfmVar) {
        zzfmVar.zza();
        return new zzez(zzfmVar.zzf(6), zzfmVar.zzf(6), zzfmVar.zzf(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzfa zzl(com.google.android.gms.internal.ads.zzfm r18, boolean r19, int r20, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzfa r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L41
            r2 = 2
            int r2 = r0.zzf(r2)
            boolean r7 = r0.zze()
            r8 = 5
            int r8 = r0.zzf(r8)
            r9 = r6
            r10 = r9
        L1e:
            r11 = 32
            if (r9 >= r11) goto L2e
            boolean r11 = r0.zze()
            if (r11 == 0) goto L2b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L2b:
            int r9 = r9 + 1
            goto L1e
        L2e:
            r9 = r6
        L2f:
            if (r9 >= r3) goto L3a
            int r11 = r0.zzf(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L2f
        L3a:
            r12 = r2
        L3b:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L55
        L41:
            if (r2 == 0) goto L4f
            int r3 = r2.zza
            boolean r7 = r2.zzb
            int r8 = r2.zzc
            int r10 = r2.zzd
            int[] r4 = r2.zze
            r12 = r3
            goto L3b
        L4f:
            r16 = r4
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
        L55:
            int r17 = r0.zzf(r5)
            r2 = r6
        L5a:
            if (r6 >= r1) goto L6f
            boolean r3 = r0.zze()
            if (r3 == 0) goto L64
            int r2 = r2 + 88
        L64:
            boolean r3 = r0.zze()
            if (r3 == 0) goto L6c
            int r2 = r2 + 8
        L6c:
            int r6 = r6 + 1
            goto L5a
        L6f:
            r0.zzb(r2)
            if (r1 <= 0) goto L79
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.zzb(r5)
        L79:
            com.google.android.gms.internal.ads.zzfa r11 = new com.google.android.gms.internal.ads.zzfa
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfl.zzl(com.google.android.gms.internal.ads.zzfm, boolean, int, com.google.android.gms.internal.ads.zzfa):com.google.android.gms.internal.ads.zzfa");
    }

    private static int zzm(int i, int i4, int i6, int i10) {
        int i11 = 2;
        if (i4 != 1 && i4 != 2) {
            i11 = 1;
        }
        return i - ((i6 + i10) * i11);
    }

    private static int zzn(int i, int i4, int i6, int i10) {
        return i - ((i6 + i10) * (i4 == 1 ? 2 : 1));
    }

    private static void zzo(zzfm zzfmVar) {
        int iZzg = zzfmVar.zzg() + 1;
        zzfmVar.zzb(8);
        for (int i = 0; i < iZzg; i++) {
            zzfmVar.zzg();
            zzfmVar.zzg();
            zzfmVar.zza();
        }
        zzfmVar.zzb(20);
    }
}
