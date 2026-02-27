package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.mp4.Atom;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.work.WorkInfo;
import com.dynatrace.android.agent.Global;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzahy {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        String str = zzeo.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i) {
        return (i >> 24) & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0129, code lost:
    
        r14 = androidx.media3.common.C.TIME_UNSET;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0d61  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0d63  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0f0a  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0f0e  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0fc4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b9 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List zzb(com.google.android.gms.internal.ads.zzet r92, com.google.android.gms.internal.ads.zzadk r93, long r94, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzp r96, boolean r97, boolean r98, com.google.android.gms.internal.ads.zzggr r99, boolean r100) throws com.google.android.gms.internal.ads.zzas {
        /*
            Method dump skipped, instruction units count: 4045
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahy.zzb(com.google.android.gms.internal.ads.zzet, com.google.android.gms.internal.ads.zzadk, long, com.google.android.gms.internal.ads.zzp, boolean, boolean, com.google.android.gms.internal.ads.zzggr, boolean):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzao zzc(com.google.android.gms.internal.ads.zzeu r14) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahy.zzc(com.google.android.gms.internal.ads.zzeu):com.google.android.gms.internal.ads.zzao");
    }

    public static zzex zzd(zzef zzefVar) {
        long jZzD;
        long jZzD2;
        zzefVar.zzh(8);
        if (zza(zzefVar.zzB()) == 0) {
            jZzD = zzefVar.zzz();
            jZzD2 = zzefVar.zzz();
        } else {
            jZzD = zzefVar.zzD();
            jZzD2 = zzefVar.zzD();
        }
        return new zzex(jZzD, jZzD2, zzefVar.zzz());
    }

    @Nullable
    public static zzao zze(zzet zzetVar) {
        zzer zzerVar;
        zzeu zzeuVarZzc = zzetVar.zzc(Atom.TYPE_hdlr);
        zzeu zzeuVarZzc2 = zzetVar.zzc(Atom.TYPE_keys);
        zzeu zzeuVarZzc3 = zzetVar.zzc(Atom.TYPE_ilst);
        if (zzeuVarZzc != null && zzeuVarZzc2 != null && zzeuVarZzc3 != null && zzi(zzeuVarZzc.zza) == 1835299937) {
            zzef zzefVar = zzeuVarZzc2.zza;
            zzefVar.zzh(12);
            int iZzB = zzefVar.zzB();
            String[] strArr = new String[iZzB];
            for (int i = 0; i < iZzB; i++) {
                int iZzB2 = zzefVar.zzB();
                zzefVar.zzk(4);
                strArr[i] = zzefVar.zzK(iZzB2 - 8, StandardCharsets.UTF_8);
            }
            zzef zzefVar2 = zzeuVarZzc3.zza;
            zzefVar2.zzh(8);
            ArrayList arrayList = new ArrayList();
            while (zzefVar2.zzd() > 8) {
                int iZzB3 = zzefVar2.zzB() + zzefVar2.zzg();
                int iZzB4 = zzefVar2.zzB() - 1;
                if (iZzB4 < 0 || iZzB4 >= iZzB) {
                    androidx.media3.datasource.cache.c.x(new StringBuilder(String.valueOf(iZzB4).length() + 41), "Skipped metadata with unknown key index: ", iZzB4, "BoxParsers");
                } else {
                    String str = strArr[iZzB4];
                    while (true) {
                        int iZzg = zzefVar2.zzg();
                        if (iZzg >= iZzB3) {
                            zzerVar = null;
                            break;
                        }
                        int iZzB5 = zzefVar2.zzB();
                        if (zzefVar2.zzB() == 1684108385) {
                            int iZzB6 = zzefVar2.zzB();
                            int iZzB7 = zzefVar2.zzB();
                            int i4 = iZzB5 - 16;
                            byte[] bArr = new byte[i4];
                            zzefVar2.zzm(bArr, 0, i4);
                            zzerVar = new zzer(str, bArr, iZzB7, iZzB6);
                            break;
                        }
                        zzefVar2.zzh(iZzg + iZzB5);
                    }
                    if (zzerVar != null) {
                        arrayList.add(zzerVar);
                    }
                }
                zzefVar2.zzh(iZzB3);
            }
            if (!arrayList.isEmpty()) {
                return new zzao(arrayList);
            }
        }
        return null;
    }

    public static void zzf(zzef zzefVar) {
        int iZzg = zzefVar.zzg();
        zzefVar.zzk(4);
        if (zzefVar.zzB() != 1751411826) {
            iZzg += 4;
        }
        zzefVar.zzh(iZzg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04b3 A[PHI: r29
  0x04b3: PHI (r29v8 long) = (r29v0 long), (r29v0 long), (r29v10 long), (r29v10 long), (r29v10 long), (r29v10 long) binds: [B:156:0x0400, B:158:0x0404, B:160:0x043a, B:162:0x0440, B:164:0x0446, B:166:0x044d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r34v10 */
    /* JADX WARN: Type inference failed for: r34v11 */
    /* JADX WARN: Type inference failed for: r34v4 */
    /* JADX WARN: Type inference failed for: r34v5 */
    /* JADX WARN: Type inference failed for: r34v6 */
    /* JADX WARN: Type inference failed for: r34v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzaiv zzg(com.google.android.gms.internal.ads.zzais r43, com.google.android.gms.internal.ads.zzet r44, com.google.android.gms.internal.ads.zzadk r45, boolean r46) throws com.google.android.gms.internal.ads.zzas {
        /*
            Method dump skipped, instruction units count: 1720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahy.zzg(com.google.android.gms.internal.ads.zzais, com.google.android.gms.internal.ads.zzet, com.google.android.gms.internal.ads.zzadk, boolean):com.google.android.gms.internal.ads.zzaiv");
    }

    @Nullable
    private static zzao zzh(zzef zzefVar) {
        short sZzv = zzefVar.zzv();
        zzefVar.zzk(2);
        String strZzK = zzefVar.zzK(sZzv, StandardCharsets.UTF_8);
        int iMax = Math.max(strZzK.lastIndexOf(43), strZzK.lastIndexOf(45));
        try {
            return new zzao(androidx.media3.common.C.TIME_UNSET, new zzew(Float.parseFloat(strZzK.substring(0, iMax)), Float.parseFloat(strZzK.substring(iMax, strZzK.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int zzi(zzef zzefVar) {
        zzefVar.zzh(16);
        return zzefVar.zzB();
    }

    private static String zzj(byte[] bArr, int i, int i4) {
        zzghc.zzh(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i6 = 0; i6 < bArr.length - 3; i6 += 4) {
            int iZze = zzgne.zze(bArr[i6], bArr[i6 + 1], bArr[i6 + 2], bArr[i6 + 3]);
            String str = zzeo.zza;
            int i10 = ((iZze >> 8) & 255) + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            int i11 = (iZze >> 16) & 255;
            int iMax = Math.max(0, Math.min(((i10 * 14075) / 10000) + i11, 255)) << 16;
            int i12 = (iZze & 255) + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            arrayList.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(((i12 * 17790) / 10000) + i11, 255)) | iMax | (Math.max(0, Math.min((i11 - ((i12 * 3455) / 10000)) - ((i10 * 7169) / 10000), 255)) << 8))));
        }
        String strZzd = zzggw.zzd(arrayList, ", ");
        StringBuilder sb2 = new StringBuilder(androidx.media3.datasource.cache.c.b(androidx.media3.datasource.cache.c.b(String.valueOf(i).length() + 7, 10, String.valueOf(i4)), 1, strZzd));
        sb2.append("size: ");
        sb2.append(i);
        sb2.append("x");
        sb2.append(i4);
        return We.s.q(sb2, "\npalette: ", strZzd, Global.NEWLINE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzh zzk(com.google.android.gms.internal.ads.zzef r15) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahy.zzk(com.google.android.gms.internal.ads.zzef):com.google.android.gms.internal.ads.zzh");
    }

    private static zzh zzl(zzef zzefVar) {
        zzg zzgVar = new zzg();
        byte[] bArrZzi = zzefVar.zzi();
        zzee zzeeVar = new zzee(bArrZzi, bArrZzi.length);
        zzeeVar.zzf(zzefVar.zzg() * 8);
        zzeeVar.zzo(1);
        int iZzj = zzeeVar.zzj(8);
        for (int i = 0; i < iZzj; i++) {
            zzeeVar.zzo(1);
            int iZzj2 = zzeeVar.zzj(8);
            for (int i4 = 0; i4 < iZzj2; i4++) {
                zzeeVar.zzh(6);
                boolean zZzi = zzeeVar.zzi();
                zzeeVar.zzg();
                zzeeVar.zzo(11);
                zzeeVar.zzh(4);
                int iZzj3 = zzeeVar.zzj(4) + 8;
                zzgVar.zze(iZzj3);
                zzgVar.zzf(iZzj3);
                zzeeVar.zzo(1);
                if (zZzi) {
                    int iZzj4 = zzeeVar.zzj(8);
                    int iZzj5 = zzeeVar.zzj(8);
                    zzeeVar.zzo(1);
                    boolean zZzi2 = zzeeVar.zzi();
                    zzgVar.zza(zzh.zzb(iZzj4));
                    zzgVar.zzb(true != zZzi2 ? 2 : 1);
                    zzgVar.zzc(zzh.zzc(iZzj5));
                }
            }
        }
        return zzgVar.zzg();
    }

    private static ByteBuffer zzm() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    @Nullable
    private static Pair zzn(zzet zzetVar) {
        zzeu zzeuVarZzc = zzetVar.zzc(Atom.TYPE_elst);
        if (zzeuVarZzc == null) {
            return null;
        }
        zzef zzefVar = zzeuVarZzc.zza;
        zzefVar.zzh(8);
        int iZza = zza(zzefVar.zzB());
        int iZzH = zzefVar.zzH();
        long[] jArr = new long[iZzH];
        long[] jArr2 = new long[iZzH];
        for (int i = 0; i < iZzH; i++) {
            jArr[i] = iZza == 1 ? zzefVar.zzJ() : zzefVar.zzz();
            jArr2[i] = iZza == 1 ? zzefVar.zzD() : zzefVar.zzB();
            if (zzefVar.zzv() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzefVar.zzk(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093 A[PHI: r22
  0x0093: PHI (r22v4 int) = (r22v3 int), (r22v6 int) binds: [B:31:0x0097, B:25:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzo(com.google.android.gms.internal.ads.zzef r30, int r31, int r32, int r33, int r34, @androidx.annotation.Nullable java.lang.String r35, boolean r36, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzp r37, com.google.android.gms.internal.ads.zzahu r38, int r39) throws com.google.android.gms.internal.ads.zzas {
        /*
            Method dump skipped, instruction units count: 1516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahy.zzo(com.google.android.gms.internal.ads.zzef, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzp, com.google.android.gms.internal.ads.zzahu, int):void");
    }

    private static zzahp zzp(zzef zzefVar, int i) {
        zzefVar.zzh(i + 12);
        zzefVar.zzk(1);
        zzs(zzefVar);
        zzefVar.zzk(2);
        int iZzs = zzefVar.zzs();
        if ((iZzs & 128) != 0) {
            zzefVar.zzk(2);
        }
        if ((iZzs & 64) != 0) {
            zzefVar.zzk(zzefVar.zzs());
        }
        if ((iZzs & 32) != 0) {
            zzefVar.zzk(2);
        }
        zzefVar.zzk(1);
        zzs(zzefVar);
        String strZzf = zzar.zzf(zzefVar.zzs());
        if (MimeTypes.AUDIO_MPEG.equals(strZzf) || MimeTypes.AUDIO_DTS.equals(strZzf) || MimeTypes.AUDIO_DTS_HD.equals(strZzf)) {
            return new zzahp(strZzf, null, -1L, -1L);
        }
        zzefVar.zzk(4);
        long jZzz = zzefVar.zzz();
        long jZzz2 = zzefVar.zzz();
        zzefVar.zzk(1);
        int iZzs2 = zzs(zzefVar);
        long j = jZzz2;
        byte[] bArr = new byte[iZzs2];
        zzefVar.zzm(bArr, 0, iZzs2);
        if (j <= 0) {
            j = -1;
        }
        return new zzahp(strZzf, bArr, j, jZzz > 0 ? jZzz : -1L);
    }

    private static zzahn zzq(zzef zzefVar, int i) {
        zzefVar.zzh(i + 8);
        zzefVar.zzk(4);
        return new zzahn(zzefVar.zzz(), zzefVar.zzz());
    }

    @Nullable
    private static Pair zzr(zzef zzefVar, int i, int i4) throws zzas {
        Integer num;
        zzait zzaitVar;
        Pair pairCreate;
        int i6;
        int i10;
        Integer num2;
        boolean z4;
        int iZzg = zzefVar.zzg();
        while (iZzg - i < i4) {
            zzefVar.zzh(iZzg);
            int iZzB = zzefVar.zzB();
            zzacy.zza(iZzB > 0, "childAtomSize must be positive");
            if (zzefVar.zzB() == 1936289382) {
                int i11 = iZzg + 8;
                int i12 = 0;
                int i13 = -1;
                Integer numValueOf = null;
                String strZzK = null;
                while (i11 - iZzg < iZzB) {
                    zzefVar.zzh(i11);
                    int iZzB2 = zzefVar.zzB();
                    int iZzB3 = zzefVar.zzB();
                    if (iZzB3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzefVar.zzB());
                    } else if (iZzB3 == 1935894637) {
                        zzefVar.zzk(4);
                        strZzK = zzefVar.zzK(4, StandardCharsets.UTF_8);
                    } else if (iZzB3 == 1935894633) {
                        i13 = i11;
                        i12 = iZzB2;
                    }
                    i11 += iZzB2;
                }
                byte[] bArr = null;
                if (androidx.media3.common.C.CENC_TYPE_cenc.equals(strZzK) || androidx.media3.common.C.CENC_TYPE_cbc1.equals(strZzK) || androidx.media3.common.C.CENC_TYPE_cens.equals(strZzK) || androidx.media3.common.C.CENC_TYPE_cbcs.equals(strZzK)) {
                    zzacy.zza(numValueOf != null, "frma atom is mandatory");
                    zzacy.zza(i13 != -1, "schi atom is mandatory");
                    int i14 = i13 + 8;
                    while (true) {
                        if (i14 - i13 >= i12) {
                            num = numValueOf;
                            zzaitVar = null;
                            break;
                        }
                        zzefVar.zzh(i14);
                        int iZzB4 = zzefVar.zzB();
                        if (zzefVar.zzB() == 1952804451) {
                            int iZza = zza(zzefVar.zzB());
                            zzefVar.zzk(1);
                            if (iZza == 0) {
                                zzefVar.zzk(1);
                                i10 = 0;
                                i6 = 0;
                            } else {
                                int iZzs = zzefVar.zzs();
                                i6 = iZzs & 15;
                                i10 = (iZzs & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                            }
                            if (zzefVar.zzs() == 1) {
                                num2 = numValueOf;
                                z4 = true;
                            } else {
                                num2 = numValueOf;
                                z4 = false;
                            }
                            int iZzs2 = zzefVar.zzs();
                            byte[] bArr2 = new byte[16];
                            zzefVar.zzm(bArr2, 0, 16);
                            if (z4 && iZzs2 == 0) {
                                int iZzs3 = zzefVar.zzs();
                                byte[] bArr3 = new byte[iZzs3];
                                zzefVar.zzm(bArr3, 0, iZzs3);
                                bArr = bArr3;
                            }
                            num = num2;
                            zzaitVar = new zzait(z4, strZzK, iZzs2, bArr2, i10, i6, bArr);
                        } else {
                            i14 += iZzB4;
                        }
                    }
                    zzacy.zza(zzaitVar != null, "tenc atom is mandatory");
                    String str = zzeo.zza;
                    pairCreate = Pair.create(num, zzaitVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzg += iZzB;
        }
        return null;
    }

    private static int zzs(zzef zzefVar) {
        int iZzs = zzefVar.zzs();
        int i = iZzs & 127;
        while ((iZzs & 128) == 128) {
            iZzs = zzefVar.zzs();
            i = (i << 7) | (iZzs & 127);
        }
        return i;
    }
}
