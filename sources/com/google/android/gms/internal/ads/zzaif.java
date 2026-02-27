package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaif implements zzacu {
    private static final byte[] zza = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzu zzb;
    private long zzA;
    private long zzB;

    @Nullable
    private zzaie zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzacx zzI;
    private zzaeb[] zzJ;
    private zzaeb[] zzK;
    private boolean zzL;
    private long zzM;
    private final zzajt zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzef zzg;
    private final zzef zzh;
    private final zzef zzi;
    private final byte[] zzj;
    private final zzef zzk;
    private final zzaft zzl;
    private final zzef zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzfp zzp;
    private final zzacj zzq;
    private zzgjz zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;

    @Nullable
    private zzef zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    static {
        zzs zzsVar = new zzs();
        zzsVar.zzm(MimeTypes.APPLICATION_EMSG);
        zzb = zzsVar.zzM();
    }

    @Deprecated
    public zzaif() {
        this(zzajt.zza, 32, null, null, zzgjz.zzi(), null);
    }

    private final void zzb() {
        this.zzs = 0;
        this.zzv = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:309:0x07a7, code lost:
    
        zzb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x07aa, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzc(long r59) throws com.google.android.gms.internal.ads.zzas {
        /*
            Method dump skipped, instruction units count: 1963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaif.zzc(long):void");
    }

    private static int zzj(int i) throws zzas {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 27);
        sb2.append("Unexpected negative value: ");
        sb2.append(i);
        throw zzas.zzb(sb2.toString(), null);
    }

    private static void zzk(zzef zzefVar, int i, zzaiu zzaiuVar) throws zzas {
        zzefVar.zzh(i + 8);
        int iZzB = zzefVar.zzB();
        int i4 = zzahy.zza;
        if ((iZzB & 1) != 0) {
            throw zzas.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z4 = (iZzB & 2) != 0;
        int iZzH = zzefVar.zzH();
        if (iZzH == 0) {
            Arrays.fill(zzaiuVar.zzl, 0, zzaiuVar.zze, false);
            return;
        }
        int i6 = zzaiuVar.zze;
        if (iZzH != i6) {
            throw zzas.zzb(androidx.media3.datasource.cache.c.n(new StringBuilder(String.valueOf(iZzH).length() + 58 + String.valueOf(i6).length()), "Senc sample count ", iZzH, " is different from fragment sample count", i6), null);
        }
        Arrays.fill(zzaiuVar.zzl, 0, iZzH, z4);
        zzaiuVar.zza(zzefVar.zzd());
        zzef zzefVar2 = zzaiuVar.zzn;
        zzefVar.zzm(zzefVar2.zzi(), 0, zzefVar2.zze());
        zzefVar2.zzh(0);
        zzaiuVar.zzo = false;
    }

    private static Pair zzl(zzef zzefVar, long j) throws zzas {
        long jZzJ;
        long jZzJ2;
        zzef zzefVar2 = zzefVar;
        zzefVar2.zzh(8);
        int iZza = zzahy.zza(zzefVar2.zzB());
        zzefVar2.zzk(4);
        long jZzz = zzefVar2.zzz();
        if (iZza == 0) {
            jZzJ = zzefVar2.zzz();
            jZzJ2 = zzefVar2.zzz();
        } else {
            jZzJ = zzefVar2.zzJ();
            jZzJ2 = zzefVar2.zzJ();
        }
        long j6 = jZzJ2 + j;
        long jZzt = zzeo.zzt(jZzJ, 1000000L, jZzz, RoundingMode.DOWN);
        zzefVar2.zzk(2);
        int iZzt = zzefVar2.zzt();
        int[] iArr = new int[iZzt];
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        long[] jArr3 = new long[iZzt];
        long j7 = j6;
        long j9 = jZzt;
        int i = 0;
        while (i < iZzt) {
            int iZzB = zzefVar2.zzB();
            if ((Integer.MIN_VALUE & iZzB) != 0) {
                throw zzas.zzb("Unhandled indirect reference", null);
            }
            long jZzz2 = zzefVar2.zzz();
            iArr[i] = iZzB & Integer.MAX_VALUE;
            jArr[i] = j7;
            jArr3[i] = j9;
            jZzJ += jZzz2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jZzt2 = zzeo.zzt(jZzJ, 1000000L, jZzz, RoundingMode.DOWN);
            jArr4[i] = jZzt2 - jArr5[i];
            zzefVar2.zzk(4);
            j7 += (long) iArr[i];
            i++;
            zzefVar2 = zzefVar;
            iZzt = iZzt;
            j9 = jZzt2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jZzt), new zzaci(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0129  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzp zzm(java.util.List r19) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaif.zzm(java.util.List):com.google.android.gms.internal.ads.zzp");
    }

    private static final zzahz zzn(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzahz) sparseArray.valueAt(0);
        }
        zzahz zzahzVar = (zzahz) sparseArray.get(i);
        zzahzVar.getClass();
        return zzahzVar;
    }

    public final /* synthetic */ void zza(long j, zzef zzefVar) {
        zzach.zza(j, zzefVar, this.zzK);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        zzadz zzadzVarZza = zzair.zza(zzacvVar);
        this.zzr = zzadzVarZza != null ? zzgjz.zzj(zzadzVarZza) : zzgjz.zzi();
        return zzadzVarZza == null;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ List zze() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        int i;
        int i4 = this.zzd;
        if ((i4 & 32) == 0) {
            zzacxVar = new zzajw(zzacxVar, this.zzc);
        }
        this.zzI = zzacxVar;
        zzb();
        zzaeb[] zzaebVarArr = new zzaeb[2];
        this.zzJ = zzaebVarArr;
        int i6 = 100;
        int i10 = 0;
        if ((i4 & 4) != 0) {
            zzaebVarArr[0] = this.zzI.zzu(100, 5);
            i = 1;
            i6 = 101;
        } else {
            i = 0;
        }
        zzaeb[] zzaebVarArr2 = (zzaeb[]) zzeo.zzb(this.zzJ, i);
        this.zzJ = zzaebVarArr2;
        for (zzaeb zzaebVar : zzaebVarArr2) {
            zzaebVar.zzu(zzb);
        }
        List list = this.zze;
        this.zzK = new zzaeb[list.size()];
        while (i10 < this.zzK.length) {
            zzaeb zzaebVarZzu = this.zzI.zzu(i6, 3);
            zzaebVarZzu.zzu((zzu) list.get(i10));
            this.zzK[i10] = zzaebVarZzu;
            i10++;
            i6++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f4, code lost:
    
        if ((r17 & 31) == 6) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fa, code lost:
    
        if (java.util.Objects.equals(r2, androidx.media3.common.MimeTypes.VIDEO_H265) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0202, code lost:
    
        if (com.google.android.gms.internal.ads.zzar.zze(r6.zzk, androidx.media3.common.MimeTypes.VIDEO_H265) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0205, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x020d, code lost:
    
        if (((r17 & 126) >> 1) != 39) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020f, code lost:
    
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0212, code lost:
    
        r21 = r8;
        r8 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0216, code lost:
    
        r31.zzH = r2;
        r9.zzz(r15, r3);
        r31.zzE += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0220, code lost:
    
        if (r3 <= 0) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0224, code lost:
    
        if (r31.zzG != false) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x022d, code lost:
    
        if (com.google.android.gms.internal.ads.zzfl.zzc(r5, 4, r3, r4.zzg) == false) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x022f, code lost:
    
        r31.zzG = r19;
        r8 = r21;
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x023b, code lost:
    
        r8 = r21;
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0241, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024c, code lost:
    
        throw com.google.android.gms.internal.ads.zzas.zzb("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x024d, code lost:
    
        r28 = r2;
        r21 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0254, code lost:
    
        if (r31.zzH == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0256, code lost:
    
        r2 = r31.zzi;
        r2.zza(r3);
        r32.zzc(r2.zzi(), 0, r31.zzF);
        r9.zzz(r2, r31.zzF);
        r3 = r31.zzF;
        r6 = com.google.android.gms.internal.ads.zzfl.zza(r2.zzi(), r2.zze());
        r2.zzh(0);
        r2.zzf(r6);
        r6 = r4.zzg.zzq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0283, code lost:
    
        if (r6 != (-1)) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0285, code lost:
    
        r6 = r31.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x028b, code lost:
    
        if (r6.zzb() == 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x028d, code lost:
    
        r6.zza(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0291, code lost:
    
        r7 = r31.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0297, code lost:
    
        if (r7.zzb() == r6) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0299, code lost:
    
        r7.zza(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x029c, code lost:
    
        r6 = r31.zzp;
        r6.zzc(r12, r2);
        r20 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02a9, code lost:
    
        if ((r28.zzg() & 4) == 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02ab, code lost:
    
        r6.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02af, code lost:
    
        r20 = 4;
        r3 = r9.zzy(r32, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02b6, code lost:
    
        r31.zzE += r3;
        r31.zzF -= r3;
        r8 = r21;
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02c9, code lost:
    
        r1 = r28.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02cf, code lost:
    
        if (r31.zzG != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02d1, code lost:
    
        r1 = r1 | androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02d4, code lost:
    
        r22 = r1;
        r1 = r28.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02da, code lost:
    
        if (r1 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02dc, code lost:
    
        r25 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e1, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02e3, code lost:
    
        r9.zzx(r12, r22, r31.zzD, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02f0, code lost:
    
        r1 = r31.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02f6, code lost:
    
        if (r1.isEmpty() != false) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02f8, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzaid) r1.removeFirst();
        r2 = r31.zzy;
        r7 = r1.zzc;
        r31.zzy = r2 - r7;
        r2 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0309, code lost:
    
        if (r1.zzb == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x030b, code lost:
    
        r2 = r2 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x030d, code lost:
    
        r4 = r2;
        r1 = r31.zzJ;
        r2 = r1.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0312, code lost:
    
        if (r10 >= r2) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0314, code lost:
    
        r1[r10].zzx(r4, 1, r7, r31.zzy, null);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0324, code lost:
    
        if (r28.zzh() != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0326, code lost:
    
        r31.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0329, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x032a, code lost:
    
        r31.zzs = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x032e, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        if (r31.zzs != 3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
    
        r31.zzD = r2.zzf();
        r4 = r2.zzd.zza.zzg.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
    
        if (java.util.Objects.equals(r4, "video/avc") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        java.util.Objects.equals(r4, androidx.media3.common.MimeTypes.VIDEO_H265);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bd, code lost:
    
        r31.zzG = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
    
        if (r2.zzf >= r2.zzi) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
    
        r32.zzf(r31.zzD);
        r1 = r2.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
    
        r3 = r2.zzb;
        r4 = r3.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d7, code lost:
    
        if (r1 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
    
        r4.zzk(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e2, code lost:
    
        if (r3.zzb(r2.zzf) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e4, code lost:
    
        r4.zzk(r4.zzt() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
    
        if (r2.zzh() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f2, code lost:
    
        r31.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f4, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fd, code lost:
    
        if (r2.zzd.zza.zzh != 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ff, code lost:
    
        r31.zzD -= 8;
        r32.zzf(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0116, code lost:
    
        if (androidx.media3.common.MimeTypes.AUDIO_AC4.equals(r2.zzd.zza.zzg.zzo) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0118, code lost:
    
        r31.zzE = r2.zzi(r31.zzD, 7);
        r4 = r31.zzD;
        r12 = r31.zzk;
        com.google.android.gms.internal.ads.zzaby.zzc(r4, r12);
        r2.zza.zzz(r12, 7);
        r4 = r31.zzE + 7;
        r31.zzE = r4;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0134, code lost:
    
        r9 = 0;
        r4 = r2.zzi(r31.zzD, 0);
        r31.zzE = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013d, code lost:
    
        r31.zzD += r4;
        r31.zzs = 4;
        r31.zzF = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0146, code lost:
    
        r4 = r2.zzd.zza;
        r9 = r2.zza;
        r12 = r2.zzd();
        r14 = r4.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0152, code lost:
    
        if (r14 != 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0154, code lost:
    
        r3 = r31.zzE;
        r4 = r31.zzD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0158, code lost:
    
        if (r3 >= r4) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015a, code lost:
    
        r31.zzE += r9.zzy(r32, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0166, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016a, code lost:
    
        r15 = r31.zzh;
        r5 = r15.zzi();
        r5[0] = 0;
        r5[1] = 0;
        r5[r17] = 0;
        r8 = 4 - r14;
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0180, code lost:
    
        if (r31.zzE >= r31.zzD) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0182, code lost:
    
        r3 = r31.zzF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0184, code lost:
    
        if (r3 != 0) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0189, code lost:
    
        if (r31.zzK.length > 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018d, code lost:
    
        if (r31.zzG != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0190, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0192, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0194, code lost:
    
        r3 = com.google.android.gms.internal.ads.zzfl.zzb(r4.zzg);
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a3, code lost:
    
        if ((r14 + r3) <= (r31.zzD - r31.zzE)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a6, code lost:
    
        r32.zzc(r5, r8, r14 + r3);
        r15.zzh(0);
        r6 = r15.zzB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b3, code lost:
    
        if (r6 < 0) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b5, code lost:
    
        r31.zzF = r6 - r3;
        r6 = r31.zzg;
        r6.zzh(0);
        r9.zzz(r6, 4);
        r31.zzE += 4;
        r31.zzD += r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ce, code lost:
    
        if (r31.zzK.length <= 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d0, code lost:
    
        if (r3 <= 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d2, code lost:
    
        r6 = r4.zzg;
        r7 = r5[4];
        r2 = r6.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        if (java.util.Objects.equals(r2, "video/avc") != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01de, code lost:
    
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e6, code lost:
    
        if (com.google.android.gms.internal.ads.zzar.zze(r6.zzk, "video/avc") == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e9, code lost:
    
        r21 = r8;
        r8 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ed, code lost:
    
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r21 = r8;
        r8 = 6;
     */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzg(com.google.android.gms.internal.ads.zzacv r32, com.google.android.gms.internal.ads.zzads r33) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaif.zzg(com.google.android.gms.internal.ads.zzacv, com.google.android.gms.internal.ads.zzads):int");
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j6) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((zzaie) sparseArray.valueAt(i)).zzc();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzd();
        this.zzz = j6;
        this.zzn.clear();
        zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ zzacu zzi() {
        return AbstractC1170d.b(this);
    }

    public zzaif(zzajt zzajtVar, int i, @Nullable zzel zzelVar, @Nullable zzais zzaisVar, List list, @Nullable zzaeb zzaebVar) {
        this.zzc = zzajtVar;
        this.zzd = i;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzaft();
        this.zzm = new zzef(16);
        this.zzg = new zzef(zzfl.zza);
        this.zzh = new zzef(6);
        this.zzi = new zzef();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzef(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzgjz.zzi();
        this.zzA = androidx.media3.common.C.TIME_UNSET;
        this.zzz = androidx.media3.common.C.TIME_UNSET;
        this.zzB = androidx.media3.common.C.TIME_UNSET;
        this.zzI = zzacx.zza;
        this.zzJ = new zzaeb[0];
        this.zzK = new zzaeb[0];
        this.zzp = new zzfp(new zzfo() { // from class: com.google.android.gms.internal.ads.zzaic
            @Override // com.google.android.gms.internal.ads.zzfo
            public final /* synthetic */ void zza(long j, zzef zzefVar) {
                this.zza.zza(j, zzefVar);
            }
        });
        this.zzq = new zzacj();
        this.zzM = -1L;
    }
}
