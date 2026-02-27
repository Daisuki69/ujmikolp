package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.mp4.Atom;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaim implements zzacu, zzadv {
    public static final /* synthetic */ int zza = 0;
    private int zzA;
    private long zzB;
    private int zzC;

    @Nullable
    private zzago zzD;
    private final zzajt zzb;
    private final int zzc;
    private final zzef zzd;
    private final zzef zze;
    private final zzef zzf;
    private final zzef zzg;
    private final ArrayDeque zzh;
    private final zzaiq zzi;
    private final List zzj;
    private zzgjz zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;

    @Nullable
    private zzef zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private long zzw;
    private zzacx zzx;
    private zzail[] zzy;

    @Nullable
    private long[][] zzz;

    @Deprecated
    public zzaim() {
        this(zzajt.zza, 16);
    }

    private final void zzj() {
        this.zzl = 0;
        this.zzo = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    private final void zzk(long j) throws zzas {
        int i;
        boolean z4;
        zzao zzaoVar;
        int i4;
        int i6;
        int i10;
        ArrayDeque arrayDeque;
        List list;
        zzao zzaoVar2;
        ArrayList arrayList;
        int i11 = 0;
        int i12 = 1;
        while (true) {
            ArrayDeque arrayDeque2 = this.zzh;
            if (arrayDeque2.isEmpty() || ((zzet) arrayDeque2.peek()).zza != j) {
                break;
            }
            zzet zzetVar = (zzet) arrayDeque2.pop();
            if (zzetVar.zzd == 1836019574) {
                zzet zzetVarZzd = zzetVar.zzd(Atom.TYPE_meta);
                new ArrayList();
                zzao zzaoVarZze = zzetVarZzd != null ? zzahy.zze(zzetVarZzd) : null;
                ArrayList arrayList2 = new ArrayList();
                ?? r12 = this.zzC == i12 ? i12 : i11;
                zzadk zzadkVar = new zzadk();
                zzeu zzeuVarZzc = zzetVar.zzc(Atom.TYPE_udta);
                if (zzeuVarZzc != null) {
                    zzao zzaoVarZzc = zzahy.zzc(zzeuVarZzc);
                    zzadkVar.zza(zzaoVarZzc);
                    zzaoVar = zzaoVarZzc;
                } else {
                    zzaoVar = null;
                }
                zzeu zzeuVarZzc2 = zzetVar.zzc(Atom.TYPE_mvhd);
                zzeuVarZzc2.getClass();
                zzan[] zzanVarArr = new zzan[i12];
                zzanVarArr[i11] = zzahy.zzd(zzeuVarZzc2.zza);
                zzao zzaoVar3 = new zzao(androidx.media3.common.C.TIME_UNSET, zzanVarArr);
                int i13 = this.zzc;
                ArrayList arrayList3 = arrayList2;
                List listZzb = zzahy.zzb(zzetVar, zzadkVar, androidx.media3.common.C.TIME_UNSET, null, i12 != (i13 & 1) ? i11 : i12, r12, zzaik.zza, false);
                String strZza = zzaii.zza(listZzb);
                int i14 = i11;
                int i15 = i14;
                z4 = i12;
                long j6 = -9223372036854775807L;
                int size = -1;
                while (i14 < listZzb.size()) {
                    zzaiv zzaivVar = (zzaiv) listZzb.get(i14);
                    if (zzaivVar.zzb == 0) {
                        i4 = i11;
                        arrayDeque = arrayDeque2;
                        list = listZzb;
                        i6 = i15;
                        arrayList = arrayList3;
                        i10 = i14;
                    } else {
                        zzais zzaisVar = zzaivVar.zza;
                        i4 = i11;
                        zzacx zzacxVar = this.zzx;
                        i6 = i15 + 1;
                        int i16 = zzaisVar.zzb;
                        zzail zzailVar = new zzail(zzaisVar, zzaivVar, zzacxVar.zzu(i15, i16));
                        i10 = i14;
                        long j7 = zzaisVar.zze;
                        if (j7 == androidx.media3.common.C.TIME_UNSET) {
                            j7 = zzaivVar.zzh;
                        }
                        arrayDeque = arrayDeque2;
                        zzaeb zzaebVar = zzailVar.zzc;
                        long jMax = Math.max(j6, j7);
                        zzu zzuVar = zzaisVar.zzg;
                        String str = zzuVar.zzo;
                        int i17 = MimeTypes.AUDIO_TRUEHD.equals(str) ? zzaivVar.zze * 16 : zzaivVar.zze + 30;
                        zzs zzsVarZza = zzuVar.zza();
                        zzsVarZza.zzn(i17);
                        if (i16 == 2) {
                            int i18 = zzuVar.zzf;
                            if ((i13 & 8) != 0) {
                                i18 |= size == -1 ? z4 ? 1 : 0 : 2;
                            }
                            zzsVarZza.zzg(i18);
                            i16 = 2;
                        }
                        zzaih.zzb(i16, zzadkVar, zzsVarZza);
                        zzao zzaoVar4 = zzuVar.zzl;
                        List list2 = this.zzj;
                        if (list2.isEmpty()) {
                            list = listZzb;
                            zzaoVar2 = null;
                        } else {
                            list = listZzb;
                            zzaoVar2 = new zzao(list2);
                        }
                        zzao[] zzaoVarArr = new zzao[3];
                        zzaoVarArr[i4] = zzaoVar2;
                        zzaoVarArr[z4 ? 1 : 0] = zzaoVar;
                        zzaoVarArr[2] = zzaoVar3;
                        zzaih.zza(i16, zzaoVarZze, zzsVarZza, zzaoVar4, zzaoVarArr);
                        zzsVarZza.zzl(strZza);
                        if (Objects.equals(str, MimeTypes.AUDIO_MPEG)) {
                            zzailVar.zzf = zzsVarZza.zzM();
                        } else {
                            zzaebVar.zzu(zzsVarZza.zzM());
                        }
                        if (i16 == 2 && size == -1) {
                            size = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(zzailVar);
                        j6 = jMax;
                    }
                    i14 = i10 + 1;
                    arrayList3 = arrayList;
                    i11 = i4;
                    i15 = i6;
                    arrayDeque2 = arrayDeque;
                    listZzb = list;
                }
                ArrayDeque arrayDeque3 = arrayDeque2;
                this.zzA = size;
                this.zzB = j6;
                zzail[] zzailVarArr = (zzail[]) arrayList3.toArray(new zzail[i11]);
                this.zzy = zzailVarArr;
                int length = zzailVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i19 = 0; i19 < zzailVarArr.length; i19++) {
                    jArr[i19] = new long[zzailVarArr[i19].zzb.zzb];
                    jArr2[i19] = zzailVarArr[i19].zzb.zzf[0];
                }
                i = 0;
                long j9 = 0;
                int i20 = 0;
                while (i20 < zzailVarArr.length) {
                    long j10 = Long.MAX_VALUE;
                    int i21 = -1;
                    for (int i22 = 0; i22 < zzailVarArr.length; i22++) {
                        if (!zArr[i22]) {
                            long j11 = jArr2[i22];
                            if (j11 <= j10) {
                                i21 = i22;
                                j10 = j11;
                            }
                        }
                    }
                    int i23 = iArr[i21];
                    long[] jArr3 = jArr[i21];
                    jArr3[i23] = j9;
                    zzaiv zzaivVar2 = zzailVarArr[i21].zzb;
                    j9 += (long) zzaivVar2.zzd[i23];
                    int i24 = i23 + 1;
                    iArr[i21] = i24;
                    if (i24 < jArr3.length) {
                        jArr2[i21] = zzaivVar2.zzf[i24];
                    } else {
                        zArr[i21] = z4;
                        i20++;
                    }
                }
                this.zzz = jArr;
                this.zzx.zzv();
                this.zzx.zzw(this);
                arrayDeque3.clear();
                this.zzl = 2;
            } else {
                i = i11;
                z4 = i12;
                if (!arrayDeque2.isEmpty()) {
                    ((zzet) arrayDeque2.peek()).zzb(zzetVar);
                }
            }
            i12 = z4;
            i11 = i;
        }
        if (this.zzl != 2) {
            zzj();
        }
    }

    private static long zzl(zzaiv zzaivVar, long j, long j6) {
        int iZzm = zzm(zzaivVar, j);
        return iZzm == -1 ? j6 : Math.min(zzaivVar.zzc[iZzm], j6);
    }

    private static int zzm(zzaiv zzaivVar, long j) {
        int iZza = zzaivVar.zza(j);
        return iZza == -1 ? zzaivVar.zzb(j) : iZza;
    }

    private static int zzn(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        long j6;
        long j7;
        long jZzl;
        long j9;
        int iZzb;
        long j10 = j;
        zzail[] zzailVarArr = this.zzy;
        if (zzailVarArr.length == 0) {
            zzadw zzadwVar = zzadw.zza;
            return new zzadt(zzadwVar, zzadwVar);
        }
        int i = this.zzA;
        if (i != -1) {
            zzaiv zzaivVar = zzailVarArr[i].zzb;
            int iZzm = zzm(zzaivVar, j10);
            if (iZzm == -1) {
                zzadw zzadwVar2 = zzadw.zza;
                return new zzadt(zzadwVar2, zzadwVar2);
            }
            long[] jArr = zzaivVar.zzf;
            long j11 = jArr[iZzm];
            long[] jArr2 = zzaivVar.zzc;
            j6 = jArr2[iZzm];
            if (j11 >= j10 || iZzm >= zzaivVar.zzb - 1 || (iZzb = zzaivVar.zzb(j10)) == -1 || iZzb == iZzm) {
                j9 = -9223372036854775807L;
                jZzl = -1;
            } else {
                j9 = jArr[iZzb];
                jZzl = jArr2[iZzb];
            }
            j7 = j9;
            j10 = j11;
        } else {
            j6 = Long.MAX_VALUE;
            j7 = -9223372036854775807L;
            jZzl = -1;
        }
        int i4 = 0;
        while (true) {
            zzail[] zzailVarArr2 = this.zzy;
            if (i4 >= zzailVarArr2.length) {
                break;
            }
            if (i4 != this.zzA) {
                zzaiv zzaivVar2 = zzailVarArr2[i4].zzb;
                long jZzl2 = zzl(zzaivVar2, j10, j6);
                if (j7 != androidx.media3.common.C.TIME_UNSET) {
                    jZzl = zzl(zzaivVar2, j7, jZzl);
                }
                j6 = jZzl2;
            }
            i4++;
        }
        zzadw zzadwVar3 = new zzadw(j10, j6);
        return j7 == androidx.media3.common.C.TIME_UNSET ? new zzadt(zzadwVar3, zzadwVar3) : new zzadt(zzadwVar3, new zzadw(j7, jZzl));
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        zzadz zzadzVarZzb = zzair.zzb(zzacvVar, (this.zzc & 2) != 0);
        this.zzk = zzadzVarZzb != null ? zzgjz.zzj(zzadzVarZzb) : zzgjz.zzi();
        return zzadzVarZzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ List zze() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        if ((this.zzc & 16) == 0) {
            zzacxVar = new zzajw(zzacxVar, this.zzb);
        }
        this.zzx = zzacxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e4, code lost:
    
        if (java.util.Objects.equals(r5, androidx.media3.common.MimeTypes.AUDIO_MPEG) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e6, code lost:
    
        r2 = r10.zzf;
        r4 = r37.zzf;
        r4.zza(4);
        r38.zzi(r4.zzi(), 0, 4);
        r38.zzl();
        r5 = new com.google.android.gms.internal.ads.zzado();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0206, code lost:
    
        if (r5.zza(r4.zzB()) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0210, code lost:
    
        if (java.util.Objects.equals(r2.zzo, r5.zzb) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0212, code lost:
    
        r2 = r2.zza();
        r4 = r5.zzb;
        r4.getClass();
        r2.zzm(r4);
        r2 = r2.zzM();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0222, code lost:
    
        r9.zzu(r2);
        r10.zzf = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0229, code lost:
    
        if (r14 == null) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x022b, code lost:
    
        r14.zzb(r38);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x022e, code lost:
    
        r2 = r37.zzs;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0230, code lost:
    
        if (r2 >= r3) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0232, code lost:
    
        r2 = r9.zzy(r38, r3 - r2, false);
        r37.zzr += r2;
        r37.zzs += r2;
        r37.zzt -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0249, code lost:
    
        r16 = r15.zzf[r11];
        r1 = r15.zzg[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0253, code lost:
    
        if (r37.zzu != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0255, code lost:
    
        r1 = r1 | androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0258, code lost:
    
        if (r14 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x025a, code lost:
    
        r15 = r9;
        r14.zzc(r15, r16, r1, r18, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x026f, code lost:
    
        if ((r11 + 1) != r15.zzb) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0271, code lost:
    
        r14.zzd(r15, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0276, code lost:
    
        r9.zzx(r16, r1, r18, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0284, code lost:
    
        r10.zze++;
        r37.zzq = -1;
        r37.zzr = 0;
        r37.zzs = 0;
        r37.zzt = 0;
        r37.zzu = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0296, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0297, code lost:
    
        r39.zza = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0299, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x029a, code lost:
    
        r3 = r37.zzn - ((long) r37.zzo);
        r5 = r38.zzn() + r3;
        r7 = r37.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02ad, code lost:
    
        if (r7 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02af, code lost:
    
        r38.zzc(r7.zzi(), r37.zzo, (int) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02bb, code lost:
    
        if (r37.zzm != 1718909296) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02bd, code lost:
    
        r37.zzv = true;
        r7.zzh(8);
        r3 = zzn(r7.zzB());
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02cb, code lost:
    
        if (r3 == 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        r7 = r38.zzn();
        r14 = r37.zzq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ce, code lost:
    
        r7.zzk(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02d6, code lost:
    
        if (r7.zzd() <= 0) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02d8, code lost:
    
        r3 = zzn(r7.zzB());
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e0, code lost:
    
        if (r3 == 0) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02e3, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e4, code lost:
    
        r37.zzC = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e6, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r14 != (-1)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02e8, code lost:
    
        r3 = r37.zzh;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02ee, code lost:
    
        if (r3.isEmpty() != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02f0, code lost:
    
        ((com.google.android.gms.internal.ads.zzet) r3.peek()).zza(new com.google.android.gms.internal.ads.zzeu(r37.zzm, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0303, code lost:
    
        if (r37.zzv != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x030a, code lost:
    
        if (r37.zzm != 1835295092) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x030c, code lost:
    
        r37.zzC = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0311, code lost:
    
        if (r3 >= 262144) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        r21 = r6;
        r28 = r21 == true ? 1 : 0;
        r26 = -1;
        r27 = -1;
        r19 = Long.MAX_VALUE;
        r22 = Long.MAX_VALUE;
        r24 = Long.MAX_VALUE;
        r14 = 0;
        r29 = 262144;
        r21 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0313, code lost:
    
        r38.zzf((int) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0318, code lost:
    
        r39.zza = r38.zzn() + r3;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0320, code lost:
    
        zzk(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0323, code lost:
    
        if (r3 == false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0329, code lost:
    
        if (r37.zzl == 2) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x032b, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r15 = r37.zzy;
        r31 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r14 >= r15.length) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r10 = r15[r14];
        r11 = r10.zze;
        r10 = r10.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r11 != r10.zzb) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        r15 = r10.zzc[r11];
        r10 = r37.zzz;
        r10.getClass();
        r33 = r10[r14][r11];
        r15 = r15 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r15 < r31) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r15 < 262144) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        r10 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r10 != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r28 != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        r11 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r10 != r11) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        if (r15 >= r24) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        r28 = r10;
        r27 = r14;
        r24 = r15;
        r22 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        r28 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        if (r33 >= r19) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        r21 = r10;
        r26 = r14;
        r19 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        r14 = r14 + r6;
        r10 = r31;
        r21 = r21;
        r28 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:
    
        if (r19 == Long.MAX_VALUE) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        if (r21 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
    
        if (r22 < (r19 + 10485760)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        r14 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
    
        r14 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
    
        r37.zzq = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b0, code lost:
    
        if (r14 != (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b2, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        r31 = 0;
        r29 = 262144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b8, code lost:
    
        r10 = r37.zzy[r14];
        r14 = r10.zzc;
        r11 = r10.zze;
        r15 = r10.zzb;
        r19 = r14;
        r13 = r15.zzc[r11] + r37.zzw;
        r12 = r15.zzd;
        r17 = r12[r11];
        r23 = false;
        r14 = r10.zzd;
        r20 = 4;
        r7 = (r13 - r7) + ((long) r37.zzr);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e1, code lost:
    
        if (r7 < r31) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e5, code lost:
    
        if (r7 < r29) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00eb, code lost:
    
        r2 = r10.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f0, code lost:
    
        if (r2.zzh != 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f2, code lost:
    
        r7 = r7 + 8;
        r17 = r17 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f7, code lost:
    
        r3 = r17;
        r38.zzf((int) r7);
        r4 = r2.zzg;
        r5 = r4.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0107, code lost:
    
        if (java.util.Objects.equals(r5, "video/avc") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0109, code lost:
    
        java.util.Objects.equals(r5, androidx.media3.common.MimeTypes.VIDEO_H265);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010e, code lost:
    
        r37.zzu = true;
        r2 = r2.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0113, code lost:
    
        if (r2 == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0115, code lost:
    
        r5 = r37.zze;
        r7 = r5.zzi();
        r7[0] = 0;
        r7[1] = 0;
        r7[2] = 0;
        r6 = 4 - r2;
        r3 = r3 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0126, code lost:
    
        if (r37.zzs >= r3) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0128, code lost:
    
        r8 = r37.zzt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012a, code lost:
    
        if (r8 != 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012e, code lost:
    
        if (r37.zzu != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r7 == r6) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013a, code lost:
    
        if ((com.google.android.gms.internal.ads.zzfl.zzb(r4) + r2) > (r12[r11] - r37.zzr)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013c, code lost:
    
        r8 = com.google.android.gms.internal.ads.zzfl.zzb(r4);
        r9 = r2 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0143, code lost:
    
        r9 = r2;
        r8 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0146, code lost:
    
        r38.zzc(r7, r6, r9);
        r37.zzr += r9;
        r9 = r23;
        r5.zzh(r9);
        r13 = r5.zzB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0157, code lost:
    
        if (r13 < 0) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0159, code lost:
    
        r37.zzt = r13 - r8;
        r13 = r37.zzd;
        r13.zzh(r9);
        r17 = r2;
        r9 = r19;
        r2 = r20;
        r9.zzz(r13, r2);
        r37.zzs += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016f, code lost:
    
        if (r8 <= 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0171, code lost:
    
        r9.zzz(r5, r8);
        r37.zzs += r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017d, code lost:
    
        if (com.google.android.gms.internal.ads.zzfl.zzc(r7, r2, r8, r4) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r7 == 2) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017f, code lost:
    
        r37.zzu = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0182, code lost:
    
        r19 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0184, code lost:
    
        r2 = r17;
        r20 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0188, code lost:
    
        r23 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018b, code lost:
    
        r20 = r2;
        r19 = r9;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0199, code lost:
    
        throw com.google.android.gms.internal.ads.zzas.zzb("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019a, code lost:
    
        r17 = r2;
        r8 = r19.zzy(r38, r8, r23);
        r37.zzr += r8;
        r37.zzs += r8;
        r37.zzt -= r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b4, code lost:
    
        r9 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b6, code lost:
    
        r18 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r37.zzi.zzb(r38, r39, r37.zzj);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ba, code lost:
    
        r9 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c2, code lost:
    
        if (androidx.media3.common.MimeTypes.AUDIO_AC4.equals(r5) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c6, code lost:
    
        if (r37.zzs != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c8, code lost:
    
        r2 = r37.zzf;
        com.google.android.gms.internal.ads.zzaby.zzc(r3, r2);
        r13 = 7;
        r9.zzz(r2, 7);
        r37.zzs += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d7, code lost:
    
        r13 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d8, code lost:
    
        r3 = r3 + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01dc, code lost:
    
        if (r10.zzf == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r39.zza != 0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r38v0, types: [com.google.android.gms.internal.ads.zzacv, com.google.android.gms.internal.ads.zzi] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v29 */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzg(com.google.android.gms.internal.ads.zzacv r38, com.google.android.gms.internal.ads.zzads r39) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaim.zzg(com.google.android.gms.internal.ads.zzacv, com.google.android.gms.internal.ads.zzads):int");
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j6) {
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = false;
        if (j == 0) {
            if (this.zzl != 3) {
                zzj();
                return;
            } else {
                this.zzi.zza();
                this.zzj.clear();
                return;
            }
        }
        for (zzail zzailVar : this.zzy) {
            zzaiv zzaivVar = zzailVar.zzb;
            int iZza = zzaivVar.zza(j6);
            if (iZza == -1) {
                iZza = zzaivVar.zzb(j6);
            }
            zzailVar.zze = iZza;
            zzaec zzaecVar = zzailVar.zzd;
            if (zzaecVar != null) {
                zzaecVar.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ zzacu zzi() {
        return AbstractC1170d.b(this);
    }

    public zzaim(zzajt zzajtVar, int i) {
        this.zzb = zzajtVar;
        this.zzc = i;
        this.zzk = zzgjz.zzi();
        this.zzl = (i & 4) != 0 ? 3 : 0;
        this.zzi = new zzaiq();
        this.zzj = new ArrayList();
        this.zzg = new zzef(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzef(zzfl.zza);
        this.zze = new zzef(6);
        this.zzf = new zzef();
        this.zzq = -1;
        this.zzx = zzacx.zza;
        this.zzy = new zzail[0];
    }
}
