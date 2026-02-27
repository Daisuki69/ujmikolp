package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.MediaPeriodQueue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzkf implements Handler.Callback, zzum, zzyl, zzlb, zzhw, zzlf, zzho, zzaar {
    private static final long zza = zzeo.zzp(10000);
    private zzlt zzA;
    private boolean zzC;
    private boolean zzD;

    @Nullable
    private zzke zzE;
    private int zzF;
    private zzld zzG;
    private zzkc zzH;
    private boolean zzI;
    private boolean zzK;
    private boolean zzL;
    private boolean zzN;
    private boolean zzQ;
    private int zzR;

    @Nullable
    private zzke zzS;
    private long zzT;
    private long zzU;
    private int zzV;
    private boolean zzW;

    @Nullable
    private zzhz zzX;
    private zzij zzZ;
    private boolean zzab;
    private final zzht zzad;
    private final zzlp[] zzb;
    private final zzln[] zzc;
    private final boolean[] zzd;
    private final zzym zze;
    private final zzyn zzf;
    private final zzkj zzg;
    private final zzyu zzh;
    private final zzdl zzi;
    private final zzle zzj;
    private final Looper zzk;
    private final zzbd zzl;
    private final zzbc zzm;
    private final long zzn;
    private final zzhx zzo;
    private final ArrayList zzp;
    private final zzdb zzq;
    private final zzkd zzr;
    private final zzkq zzs;
    private final zzlc zzt;
    private final long zzu;
    private final zzox zzv;
    private final zzmd zzw;
    private final zzdl zzx;
    private final boolean zzy;
    private final zzhp zzz;
    private long zzaa = androidx.media3.common.C.TIME_UNSET;
    private int zzO = 0;
    private boolean zzP = false;
    private boolean zzJ = false;
    private float zzac = 1.0f;
    private zzls zzB = zzls.zza;
    private long zzY = androidx.media3.common.C.TIME_UNSET;
    private long zzM = androidx.media3.common.C.TIME_UNSET;

    public zzkf(Context context, zzll[] zzllVarArr, zzll[] zzllVarArr2, zzym zzymVar, zzyn zzynVar, zzkj zzkjVar, zzyu zzyuVar, int i, boolean z4, zzmd zzmdVar, zzlt zzltVar, zzht zzhtVar, long j, boolean z5, boolean z8, Looper looper, zzdb zzdbVar, zzkd zzkdVar, zzox zzoxVar, @Nullable zzle zzleVar, zzij zzijVar, final zzaar zzaarVar) {
        this.zzr = zzkdVar;
        this.zze = zzymVar;
        this.zzf = zzynVar;
        this.zzg = zzkjVar;
        this.zzh = zzyuVar;
        int i4 = 0;
        this.zzA = zzltVar;
        this.zzad = zzhtVar;
        this.zzu = j;
        this.zzq = zzdbVar;
        this.zzv = zzoxVar;
        this.zzZ = zzijVar;
        this.zzw = zzmdVar;
        this.zzn = zzkjVar.zze(zzoxVar);
        zzkjVar.zzf(zzoxVar);
        zzbe zzbeVar = zzbe.zza;
        zzld zzldVarZza = zzld.zza(zzynVar);
        this.zzG = zzldVarZza;
        this.zzH = new zzkc(zzldVarZza);
        int length = zzllVarArr.length;
        this.zzc = new zzln[2];
        this.zzd = new boolean[2];
        zzlm zzlmVarZzg = zzymVar.zzg();
        this.zzb = new zzlp[2];
        boolean z9 = false;
        for (int i6 = 2; i4 < i6; i6 = 2) {
            zzllVarArr[i4].zzc(i4, zzoxVar, zzdbVar);
            this.zzc[i4] = zzllVarArr[i4].zzb();
            this.zzc[i4].zzv(zzlmVarZzg);
            zzll zzllVar = zzllVarArr2[i4];
            if (zzllVar != null) {
                zzllVar.zzc(i4, zzoxVar, zzdbVar);
                z9 = true;
            }
            this.zzb[i4] = new zzlp(zzllVarArr[i4], zzllVarArr2[i4], i4);
            i4++;
        }
        this.zzy = z9;
        this.zzo = new zzhx(this, zzdbVar);
        this.zzp = new ArrayList();
        this.zzl = new zzbd();
        this.zzm = new zzbc();
        zzymVar.zzr(this, zzyuVar);
        this.zzW = true;
        zzdl zzdlVarZzd = zzdbVar.zzd(looper, null);
        this.zzx = zzdlVarZzd;
        this.zzs = new zzkq(zzmdVar, zzdlVarZzd, new zzjy(this), zzijVar);
        this.zzt = new zzlc(this, zzmdVar, zzdlVarZzd, zzoxVar);
        zzle zzleVar2 = new zzle(null);
        this.zzj = zzleVar2;
        Looper looperZza = zzleVar2.zza();
        this.zzk = looperZza;
        zzdl zzdlVarZzd2 = zzdbVar.zzd(looperZza, this);
        this.zzi = zzdlVarZzd2;
        this.zzz = new zzhp(context, looperZza, this);
        zzdlVarZzd2.zzd(35, new zzaar() { // from class: com.google.android.gms.internal.ads.zzju
            @Override // com.google.android.gms.internal.ads.zzaar
            public final /* synthetic */ void zzcS(long j6, long j7, zzu zzuVar, MediaFormat mediaFormat) {
                this.zza.zzcS(j6, j7, zzuVar, mediaFormat);
            }
        }).zza();
    }

    private final void zzA(IOException iOException, int i) {
        zzkq zzkqVar = this.zzs;
        zzhz zzhzVarZza = zzhz.zza(iOException, i);
        zzkn zzknVarZzm = zzkqVar.zzm();
        if (zzknVarZzm != null) {
            zzhzVarZza = zzhzVarZza.zzd(zzknVarZzm.zzg.zza);
        }
        zzds.zzf("ExoPlayerImplInternal", "Playback error", zzhzVarZza);
        zzW(false, false);
        this.zzG = this.zzG.zzf(zzhzVarZza);
    }

    private final void zzB(int i) {
        zzld zzldVar = this.zzG;
        if (zzldVar.zze != i) {
            if (i != 2) {
                this.zzY = androidx.media3.common.C.TIME_UNSET;
            }
            this.zzG = zzldVar.zze(i);
        }
    }

    private final void zzC() {
        this.zzH.zzb(this.zzG);
        if (this.zzH.zzd()) {
            this.zzr.zza(this.zzH);
            this.zzH = new zzkc(this.zzG);
        }
    }

    private final void zzD(float f) throws zzhz {
        this.zzac = f;
        float fZza = f * this.zzz.zza();
        int i = 0;
        while (true) {
            zzlp[] zzlpVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzlpVarArr[i].zzK(fZza);
            i++;
        }
    }

    private final void zzE(boolean z4, int i, boolean z5, int i4) throws zzhz {
        this.zzH.zza(z5 ? 1 : 0);
        zzG(z4, i, i4);
    }

    private final void zzF() throws zzhz {
        zzld zzldVar = this.zzG;
        zzG(zzldVar.zzl, zzldVar.zzn, zzldVar.zzm);
    }

    private final void zzG(boolean z4, int i, int i4) throws zzhz {
        zzH(z4, this.zzz.zzc(z4, this.zzG.zze), i, i4);
    }

    private final void zzH(boolean z4, int i, int i4, int i6) throws zzhz {
        boolean z5;
        if (!z4) {
            z5 = false;
        } else if (i != -1) {
            z5 = true;
        } else {
            i = -1;
            z5 = false;
        }
        if (i == -1) {
            i6 = 2;
        } else if (i6 == 2) {
            i6 = 1;
        }
        if (i == 0) {
            i4 = 1;
        } else if (i4 == 1) {
            i4 = 0;
        }
        zzld zzldVar = this.zzG;
        if (zzldVar.zzl == z5 && zzldVar.zzn == i4 && zzldVar.zzm == i6) {
            return;
        }
        this.zzG = zzldVar.zzi(z5, i6, i4);
        zzaC(false, false);
        zzkq zzkqVar = this.zzs;
        for (zzkn zzknVarZzm = zzkqVar.zzm(); zzknVarZzm != null; zzknVarZzm = zzknVarZzm.zzp()) {
            for (zzyf zzyfVar : zzknVarZzm.zzr().zzc) {
            }
        }
        if (!zzax()) {
            zzK();
            zzL();
            boolean z8 = this.zzG.zzp;
            zzkqVar.zzf(this.zzT);
            return;
        }
        int i10 = this.zzG.zze;
        if (i10 == 3) {
            this.zzo.zza();
            zzJ();
            this.zzi.zzh(2);
        } else if (i10 == 2) {
            this.zzi.zzh(2);
        }
    }

    private final void zzI(boolean z4) throws zzhz {
        zzup zzupVar = this.zzs.zzm().zzg.zza;
        long jZzT = zzT(zzupVar, this.zzG.zzs, true, false);
        if (jZzT != this.zzG.zzs) {
            zzld zzldVar = this.zzG;
            this.zzG = zzao(zzupVar, jZzT, zzldVar.zzc, zzldVar.zzd, z4, 5);
        }
    }

    private final void zzJ() throws zzhz {
        zzkn zzknVarZzm = this.zzs.zzm();
        if (zzknVarZzm == null) {
            return;
        }
        zzyn zzynVarZzr = zzknVarZzm.zzr();
        int i = 0;
        while (true) {
            zzlp[] zzlpVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            if (zzynVarZzr.zza(i)) {
                zzlpVarArr[i].zzv();
            }
            i++;
        }
    }

    private final void zzK() throws zzhz {
        this.zzo.zzb();
        int i = 0;
        while (true) {
            zzlp[] zzlpVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzlpVarArr[i].zzw();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzL() throws com.google.android.gms.internal.ads.zzhz {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkf.zzL():void");
    }

    private final void zzM(zzau zzauVar) {
        this.zzi.zzk(16);
        this.zzo.zzi(zzauVar);
    }

    private final void zzN(final int i, final boolean z4) {
        boolean[] zArr = this.zzd;
        if (zArr[i] != z4) {
            zArr[i] = z4;
            this.zzx.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(i, z4);
                }
            });
        }
    }

    private final long zzO(zzbe zzbeVar, Object obj, long j) {
        int i = zzbeVar.zzo(obj, this.zzm).zzc;
        zzbd zzbdVar = this.zzl;
        zzbeVar.zzb(i, zzbdVar, 0L);
        if (zzbdVar.zzf == androidx.media3.common.C.TIME_UNSET || !zzbdVar.zzb() || !zzbdVar.zzi) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        long j6 = zzbdVar.zzg;
        String str = zzeo.zza;
        return zzeo.zzq((j6 == androidx.media3.common.C.TIME_UNSET ? System.currentTimeMillis() : j6 + SystemClock.elapsedRealtime()) - zzbdVar.zzf) - j;
    }

    private final boolean zzP(zzbe zzbeVar, zzup zzupVar) {
        if (!zzupVar.zzb() && !zzbeVar.zzg()) {
            int i = zzbeVar.zzo(zzupVar.zza, this.zzm).zzc;
            zzbd zzbdVar = this.zzl;
            zzbeVar.zzb(i, zzbdVar, 0L);
            if (zzbdVar.zzb() && zzbdVar.zzi && zzbdVar.zzf != androidx.media3.common.C.TIME_UNSET) {
                return true;
            }
        }
        return false;
    }

    private final void zzQ(long j) {
        if (zzw()) {
            jMin = this.zzG.zze != 3 ? zza : 1000L;
            zzlp[] zzlpVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                jMin = Math.min(jMin, zzeo.zzp(zzlpVarArr[i].zzk(this.zzT, this.zzU)));
            }
            if (this.zzG.zzj()) {
                zzkq zzkqVar = this.zzs;
                if ((zzkqVar.zzm() != null ? zzkqVar.zzm().zzp() : null) != null) {
                    if (this.zzT + (zzeo.zzq(jMin) * this.zzG.zzo.zzb) >= r0.zzc()) {
                        jMin = Math.min(jMin, zza);
                    }
                }
            }
        } else if (this.zzG.zze != 3 || zzax()) {
            jMin = zza;
        }
        this.zzi.zzj(2, j + jMin);
    }

    private final void zzR(zzke zzkeVar, boolean z4) throws Throwable {
        long jLongValue;
        long j;
        long j6;
        boolean z5;
        zzup zzupVar;
        zzup zzupVar2;
        boolean z8;
        long j7;
        long jZzk;
        zzup zzupVar3;
        long j9;
        long j10;
        boolean z9;
        zzld zzldVar;
        int i;
        this.zzH.zza(z4 ? 1 : 0);
        if (this.zzD) {
            if (this.zzE != null) {
                this.zzF++;
            }
            this.zzE = zzkeVar;
            return;
        }
        zzbe zzbeVar = this.zzG.zza;
        int i4 = this.zzO;
        boolean z10 = this.zzP;
        zzbd zzbdVar = this.zzl;
        zzbc zzbcVar = this.zzm;
        Pair pairZzaD = zzaD(zzbeVar, zzkeVar, true, i4, z10, zzbdVar, zzbcVar);
        if (pairZzaD == null) {
            Pair pairZzY = zzY(this.zzG.zza);
            zzupVar = (zzup) pairZzY.first;
            jLongValue = ((Long) pairZzY.second).longValue();
            z5 = !this.zzG.zza.zzg();
            j = -9223372036854775807L;
            j6 = 0;
        } else {
            Object obj = pairZzaD.first;
            jLongValue = ((Long) pairZzaD.second).longValue();
            long j11 = zzkeVar.zzc;
            j = j11 == androidx.media3.common.C.TIME_UNSET ? -9223372036854775807L : jLongValue;
            j6 = 0;
            zzup zzupVarZzy = this.zzs.zzy(this.zzG.zza, obj, jLongValue);
            if (zzupVarZzy.zzb()) {
                this.zzG.zza.zzo(zzupVarZzy.zza, zzbcVar);
                if (zzbcVar.zzd(zzupVarZzy.zzb) == zzupVarZzy.zzc) {
                    zzbcVar.zzj();
                }
                zzupVar = zzupVarZzy;
                z5 = true;
                jLongValue = 0;
            } else {
                z5 = j11 == androidx.media3.common.C.TIME_UNSET;
                zzupVar = zzupVarZzy;
            }
        }
        try {
            if (this.zzG.zza.zzg()) {
                this.zzS = zzkeVar;
            } else if (pairZzaD == null) {
                if (this.zzG.zze != 1) {
                    zzB(4);
                }
                zzX(false, true, false, true);
            } else {
                if (zzupVar.equals(this.zzG.zzb)) {
                    zzkn zzknVarZzm = this.zzs.zzm();
                    if (zzknVarZzm == null || !zzknVarZzm.zze || jLongValue == j6) {
                        jZzk = jLongValue;
                    } else {
                        zzun zzunVar = zzknVarZzm.zza;
                        long j12 = zzbdVar.zzm;
                        if (this.zzC && j12 != androidx.media3.common.C.TIME_UNSET) {
                            Double d10 = this.zzB.zzc;
                        }
                        jZzk = zzunVar.zzk(jLongValue, this.zzA);
                    }
                    if (zzeo.zzp(jZzk) == zzeo.zzp(this.zzG.zzs) && ((i = (zzldVar = this.zzG).zze) == 2 || i == 3)) {
                        jLongValue = zzldVar.zzs;
                    }
                } else {
                    jZzk = jLongValue;
                }
                this.zzD = this.zzC;
                long jZzS = zzS(zzupVar, jZzk, this.zzG.zze == 4);
                boolean z11 = z5 | (jLongValue != jZzS);
                try {
                    zzld zzldVar2 = this.zzG;
                    zzbe zzbeVar2 = zzldVar2.zza;
                    zzup zzupVar4 = zzupVar;
                    long j13 = j;
                    try {
                        zzag(zzbeVar2, zzupVar4, zzbeVar2, zzldVar2.zzb, j13, true);
                        zzupVar3 = zzupVar4;
                        j9 = j13;
                        j10 = jZzS;
                        z9 = z11;
                        this.zzG = zzao(zzupVar3, j10, j9, j10, z9, 2);
                    } catch (Throwable th2) {
                        th = th2;
                        zzupVar2 = zzupVar4;
                        j = j13;
                        j7 = jZzS;
                        z8 = z11;
                        this.zzG = zzao(zzupVar2, j7, j, j7, z8, 2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    zzupVar2 = zzupVar;
                }
            }
            z9 = z5;
            zzupVar3 = zzupVar;
            j10 = jLongValue;
            j9 = j;
            this.zzG = zzao(zzupVar3, j10, j9, j10, z9, 2);
        } catch (Throwable th4) {
            th = th4;
            zzupVar2 = zzupVar;
            z8 = z5;
            j7 = jLongValue;
        }
    }

    private final long zzS(zzup zzupVar, long j, boolean z4) throws zzhz {
        zzkq zzkqVar = this.zzs;
        return zzT(zzupVar, j, zzkqVar.zzm() != zzkqVar.zzn(), z4);
    }

    private final long zzT(zzup zzupVar, long j, boolean z4, boolean z5) throws zzhz {
        zzK();
        zzaC(false, true);
        if (z5 || this.zzG.zze == 3) {
            zzB(2);
        }
        zzkq zzkqVar = this.zzs;
        zzkn zzknVarZzm = zzkqVar.zzm();
        zzkn zzknVarZzp = zzknVarZzm;
        while (zzknVarZzp != null && !zzupVar.equals(zzknVarZzp.zzg.zza)) {
            zzknVarZzp = zzknVarZzp.zzp();
        }
        if (z4 || zzknVarZzm != zzknVarZzp || (zzknVarZzp != null && zzknVarZzp.zza() + j < 0)) {
            zzaa();
            if (zzknVarZzp != null) {
                while (zzkqVar.zzm() != zzknVarZzp) {
                    zzkqVar.zzr();
                }
                zzkqVar.zzs(zzknVarZzp);
                zzknVarZzp.zzb(MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US);
                zzap();
                zzknVarZzp.zzh = true;
            }
        }
        zzab();
        if (zzknVarZzp != null) {
            zzkqVar.zzs(zzknVarZzp);
            if (!zzknVarZzp.zze) {
                zzknVarZzp.zzg = zzknVarZzp.zzg.zza(j);
            } else if (zzknVarZzp.zzf) {
                zzun zzunVar = zzknVarZzp.zza;
                j = zzunVar.zzj(j);
                zzunVar.zzf(j - this.zzn, false);
            }
            zzU(j);
            zzam();
        } else {
            zzkqVar.zzv();
            zzU(j);
        }
        zzas(false);
        this.zzi.zzh(2);
        return j;
    }

    private final void zzU(long j) throws zzhz {
        zzkn zzknVarZzm = this.zzs.zzm();
        long jZza = j + (zzknVarZzm == null ? MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : zzknVarZzm.zza());
        this.zzT = jZza;
        this.zzo.zzc(jZza);
        zzlp[] zzlpVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            zzlpVarArr[i].zzE(zzknVarZzm, this.zzT);
        }
        for (zzkn zzknVarZzm2 = r0.zzm(); zzknVarZzm2 != null; zzknVarZzm2 = zzknVarZzm2.zzp()) {
            for (zzyf zzyfVar : zzknVarZzm2.zzr().zzc) {
            }
        }
    }

    private final void zzV() throws zzhz {
        int i = 0;
        while (true) {
            zzlp[] zzlpVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzlpVarArr[i].zzz(this.zzC ? this.zzB : null);
            i++;
        }
    }

    private final void zzW(boolean z4, boolean z5) {
        zzX(z4 || !this.zzQ, false, true, false);
        this.zzH.zza(z5 ? 1 : 0);
        this.zzg.zzc(this.zzv);
        this.zzz.zzc(this.zzG.zzl, 1);
        zzB(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[PHI: r2 r7 r9
  0x0094: PHI (r2v2 com.google.android.gms.internal.ads.zzup) = (r2v1 com.google.android.gms.internal.ads.zzup), (r2v11 com.google.android.gms.internal.ads.zzup) binds: [B:25:0x006a, B:27:0x008f] A[DONT_GENERATE, DONT_INLINE]
  0x0094: PHI (r7v3 long) = (r7v2 long), (r7v11 long) binds: [B:25:0x006a, B:27:0x008f] A[DONT_GENERATE, DONT_INLINE]
  0x0094: PHI (r9v2 long) = (r9v1 long), (r9v7 long) binds: [B:25:0x006a, B:27:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8 A[PHI: r3
  0x00d8: PHI (r3v3 com.google.android.gms.internal.ads.zzbe) = 
  (r3v2 com.google.android.gms.internal.ads.zzbe)
  (r3v2 com.google.android.gms.internal.ads.zzbe)
  (r3v12 com.google.android.gms.internal.ads.zzbe)
  (r3v12 com.google.android.gms.internal.ads.zzbe)
 binds: [B:31:0x00a1, B:33:0x00a5, B:35:0x00b6, B:37:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzX(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkf.zzX(boolean, boolean, boolean, boolean):void");
    }

    private final Pair zzY(zzbe zzbeVar) {
        long j = 0;
        if (zzbeVar.zzg()) {
            return Pair.create(zzld.zzb(), 0L);
        }
        int iZzk = zzbeVar.zzk(this.zzP);
        zzbd zzbdVar = this.zzl;
        zzbc zzbcVar = this.zzm;
        Pair pairZzm = zzbeVar.zzm(zzbdVar, zzbcVar, iZzk, androidx.media3.common.C.TIME_UNSET);
        zzup zzupVarZzy = this.zzs.zzy(zzbeVar, pairZzm.first, 0L);
        long jLongValue = ((Long) pairZzm.second).longValue();
        if (zzupVarZzy.zzb()) {
            zzbeVar.zzo(zzupVarZzy.zza, zzbcVar);
            if (zzupVarZzy.zzc == zzbcVar.zzd(zzupVarZzy.zzb)) {
                zzbcVar.zzj();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(zzupVarZzy, Long.valueOf(j));
    }

    private final void zzZ(zzbe zzbeVar, zzbe zzbeVar2) {
        if (zzbeVar.zzg() && zzbeVar2.zzg()) {
            return;
        }
        ArrayList arrayList = this.zzp;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            Object obj = ((zzkb) arrayList.get(size)).zzb;
            String str = zzeo.zza;
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaA, reason: merged with bridge method [inline-methods] */
    public final boolean zzw() {
        if (!this.zzC) {
            return false;
        }
        boolean z4 = this.zzB.zzg;
        return true;
    }

    private static boolean zzaB(zzld zzldVar, zzbc zzbcVar) {
        zzup zzupVar = zzldVar.zzb;
        zzbe zzbeVar = zzldVar.zza;
        return zzbeVar.zzg() || zzbeVar.zzo(zzupVar.zza, zzbcVar).zzf;
    }

    private final void zzaC(boolean z4, boolean z5) {
        this.zzL = z4;
        long jElapsedRealtime = androidx.media3.common.C.TIME_UNSET;
        if (z4 && !z5) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.zzM = jElapsedRealtime;
    }

    @Nullable
    private static Pair zzaD(zzbe zzbeVar, zzke zzkeVar, boolean z4, int i, boolean z5, zzbd zzbdVar, zzbc zzbcVar) {
        Pair pairZzm;
        zzbe zzbeVar2;
        zzbe zzbeVar3 = zzkeVar.zza;
        if (zzbeVar.zzg()) {
            return null;
        }
        boolean zZzg = zzbeVar3.zzg();
        zzbe zzbeVar4 = zzbeVar3;
        if (true == zZzg) {
            zzbeVar4 = zzbeVar;
        }
        try {
            pairZzm = zzbeVar4.zzm(zzbdVar, zzbcVar, zzkeVar.zzb, zzkeVar.zzc);
            zzbeVar2 = zzbeVar4;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzbeVar.equals(zzbeVar2)) {
            return pairZzm;
        }
        if (zzbeVar.zze(pairZzm.first) != -1) {
            return (zzbeVar2.zzo(pairZzm.first, zzbcVar).zzf && zzbeVar2.zzb(zzbcVar.zzc, zzbdVar, 0L).zzn == zzbeVar2.zze(pairZzm.first)) ? zzbeVar.zzm(zzbdVar, zzbcVar, zzbeVar.zzo(pairZzm.first, zzbcVar).zzc, zzkeVar.zzc) : pairZzm;
        }
        int iZzr = zzr(zzbdVar, zzbcVar, i, z5, pairZzm.first, zzbeVar2, zzbeVar);
        if (iZzr != -1) {
            return zzbeVar.zzm(zzbdVar, zzbcVar, iZzr, androidx.media3.common.C.TIME_UNSET);
        }
        return null;
    }

    private static final void zzaE(zzlh zzlhVar) throws zzhz {
        zzlhVar.zzh();
        try {
            zzlhVar.zza().zzx(zzlhVar.zzc(), zzlhVar.zze());
        } finally {
            zzlhVar.zzi(true);
        }
    }

    private static final boolean zzaF(@Nullable zzkn zzknVar) {
        if (zzknVar != null) {
            try {
                if (zzknVar.zze) {
                    zzwf[] zzwfVarArr = zzknVar.zzc;
                    for (int i = 0; i < 2; i++) {
                        zzwf zzwfVar = zzwfVarArr[i];
                        if (zzwfVar != null) {
                            zzwfVar.zzc();
                        }
                    }
                } else {
                    zzknVar.zza.zzc();
                }
                if (zzknVar.zzg() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void zzaa() throws zzhz {
        int i = 0;
        while (true) {
            zzlp[] zzlpVarArr = this.zzb;
            if (i >= 2) {
                this.zzaa = androidx.media3.common.C.TIME_UNSET;
                return;
            }
            int iZzd = zzlpVarArr[i].zzd();
            zzlpVarArr[i].zzA(this.zzo);
            zzN(i, false);
            this.zzR -= iZzd;
            i++;
        }
    }

    private final void zzab() {
        if (this.zzy && zzaz()) {
            zzlp[] zzlpVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                zzlp zzlpVar = zzlpVarArr[i];
                int iZzd = zzlpVar.zzd();
                zzlpVar.zzC(this.zzo);
                this.zzR -= iZzd - zzlpVar.zzd();
            }
            this.zzaa = androidx.media3.common.C.TIME_UNSET;
        }
    }

    private final void zzac() throws zzhz {
        zzad();
        zzI(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.google.android.gms.internal.ads.zzkf] */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.google.android.gms.internal.ads.zzkf] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    private final void zzad() throws zzhz {
        int i;
        int i4;
        ?? r62;
        boolean z4;
        zzhx zzhxVar = this.zzo;
        float f = zzhxVar.zzj().zzb;
        zzkq zzkqVar = this.zzs;
        zzkn zzknVarZzm = zzkqVar.zzm();
        zzkn zzknVarZzn = zzkqVar.zzn();
        zzyn zzynVar = null;
        boolean z5 = true;
        while (zzknVarZzm != null && zzknVarZzm.zze) {
            zzld zzldVar = this.zzG;
            zzyn zzynVarZzk = zzknVarZzm.zzk(f, zzldVar.zza, zzldVar.zzl);
            zzyn zzynVar2 = zzknVarZzm == zzkqVar.zzm() ? zzynVarZzk : zzynVar;
            zzyn zzynVarZzr = zzknVarZzm.zzr();
            boolean z8 = false;
            if (zzynVarZzr != null) {
                zzyf[] zzyfVarArr = zzynVarZzk.zzc;
                if (zzynVarZzr.zzc.length == zzyfVarArr.length) {
                    for (int i6 = 0; i6 < zzyfVarArr.length; i6++) {
                        if (zzynVarZzk.zzb(zzynVarZzr, i6)) {
                        }
                    }
                    if (zzknVarZzm != zzknVarZzn) {
                        z8 = true;
                    }
                    z5 &= z8;
                    zzknVarZzm = zzknVarZzm.zzp();
                    zzynVar = zzynVar2;
                }
            }
            if (z5) {
                zzkn zzknVarZzm2 = zzkqVar.zzm();
                int iZzs = zzkqVar.zzs(zzknVarZzm2) & 1;
                zzlp[] zzlpVarArr = this.zzb;
                boolean[] zArr = new boolean[2];
                zzynVar2.getClass();
                long jZzm = zzknVarZzm2.zzm(zzynVar2, this.zzG.zzs, 1 == iZzs, zArr);
                zzld zzldVar2 = this.zzG;
                if (zzldVar2.zze == 4 || jZzm == zzldVar2.zzs) {
                    z4 = false;
                } else {
                    z4 = false;
                    z8 = true;
                }
                zzld zzldVar3 = this.zzG;
                boolean z9 = z4;
                i = 4;
                i4 = 2;
                ?? r63 = this;
                r63.zzG = zzao(zzldVar3.zzb, jZzm, zzldVar3.zzc, zzldVar3.zzd, z8, 5);
                if (z8) {
                    r63.zzU(jZzm);
                }
                r63.zzab();
                boolean[] zArr2 = new boolean[2];
                for (?? r82 = z9; r82 < 2; r82++) {
                    int iZzd = zzlpVarArr[r82].zzd();
                    zArr2[r82] = zzlpVarArr[r82].zzL();
                    zzhx zzhxVar2 = zzhxVar;
                    zzlpVarArr[r82].zzD(zzknVarZzm2.zzc[r82], zzhxVar2, r63.zzT, zArr[r82]);
                    if (iZzd - zzlpVarArr[r82].zzd() > 0) {
                        r63.zzN(r82, z9);
                    }
                    r63.zzR -= iZzd - zzlpVarArr[r82].zzd();
                    zzhxVar = zzhxVar2;
                }
                r63.zzaq(zArr2, r63.zzT);
                zzknVarZzm2.zzh = true;
                r62 = r63;
            } else {
                zzkf zzkfVar = this;
                i = 4;
                i4 = 2;
                zzkqVar.zzs(zzknVarZzm);
                r62 = zzkfVar;
                if (zzknVarZzm.zze) {
                    long jMax = Math.max(zzknVarZzm.zzg.zzb, zzkfVar.zzT - zzknVarZzm.zza());
                    if (zzkfVar.zzy && zzkfVar.zzaz() && zzkqVar.zzo() == zzknVarZzm) {
                        zzkfVar.zzab();
                    }
                    zzknVarZzm.zzl(zzynVarZzk, jMax, false);
                    r62 = zzkfVar;
                }
            }
            r62.zzas(true);
            if (r62.zzG.zze != i) {
                r62.zzam();
                r62.zzL();
                r62.zzi.zzh(i4);
                return;
            }
            return;
        }
    }

    private final boolean zzae() {
        zzkn zzknVarZzm = this.zzs.zzm();
        long j = zzknVarZzm.zzg.zze;
        if (zzknVarZzm.zze) {
            return j == androidx.media3.common.C.TIME_UNSET || this.zzG.zzs < j || !zzax();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e1 A[Catch: all -> 0x02c3, TryCatch #1 {all -> 0x02c3, blocks: (B:144:0x02bf, B:147:0x02ca, B:149:0x02cd, B:157:0x02e1, B:159:0x02ea, B:161:0x02f2, B:163:0x02fc, B:164:0x0307, B:165:0x030c), top: B:226:0x0271 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0259 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0273 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzaf(com.google.android.gms.internal.ads.zzbe r31, boolean r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkf.zzaf(com.google.android.gms.internal.ads.zzbe, boolean):void");
    }

    private final void zzag(zzbe zzbeVar, zzup zzupVar, zzbe zzbeVar2, zzup zzupVar2, long j, boolean z4) throws zzhz {
        if (!zzP(zzbeVar, zzupVar)) {
            zzau zzauVar = zzupVar.zzb() ? zzau.zza : this.zzG.zzo;
            if (this.zzo.zzj().equals(zzauVar)) {
                return;
            }
            zzM(zzauVar);
            zzal(this.zzG.zzo, zzauVar.zzb, false, false);
            return;
        }
        Object obj = zzupVar.zza;
        zzbc zzbcVar = this.zzm;
        int i = zzbeVar.zzo(obj, zzbcVar).zzc;
        zzbd zzbdVar = this.zzl;
        zzbeVar.zzb(i, zzbdVar, 0L);
        zzht zzhtVar = this.zzad;
        zzae zzaeVar = zzbdVar.zzj;
        String str = zzeo.zza;
        zzhtVar.zza(zzaeVar);
        if (j != androidx.media3.common.C.TIME_UNSET) {
            zzhtVar.zzb(zzO(zzbeVar, obj, j));
            return;
        }
        if (!Objects.equals(!zzbeVar2.zzg() ? zzbeVar2.zzb(zzbeVar2.zzo(zzupVar2.zza, zzbcVar).zzc, zzbdVar, 0L).zzb : null, zzbdVar.zzb) || z4) {
            zzhtVar.zzb(androidx.media3.common.C.TIME_UNSET);
        }
    }

    private final long zzah(zzkn zzknVar) {
        if (zzknVar == null) {
            return 0L;
        }
        long jZza = zzknVar.zza();
        if (zzknVar.zze) {
            int i = 0;
            while (true) {
                zzlp[] zzlpVarArr = this.zzb;
                if (i >= 2) {
                    break;
                }
                if (zzlpVarArr[i].zzp(zzknVar)) {
                    long jZzf = zzlpVarArr[i].zzf(zzknVar);
                    if (jZzf == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jZza = Math.max(jZzf, jZza);
                }
                i++;
            }
        }
        return jZza;
    }

    private final void zzai() {
        zzkq zzkqVar = this.zzs;
        zzkqVar.zzt();
        zzkn zzknVarZzl = zzkqVar.zzl();
        if (zzknVarZzl != null) {
            if (!zzknVarZzl.zzd || zzknVarZzl.zze) {
                zzun zzunVar = zzknVarZzl.zza;
                if (zzunVar.zzn()) {
                    return;
                }
                if (this.zzg.zzi(this.zzG.zza, zzknVarZzl.zzg.zza, zzknVarZzl.zze ? zzunVar.zzi() : 0L)) {
                    if (!zzknVarZzl.zzd) {
                        zzknVarZzl.zzt(this, zzknVarZzl.zzg.zzb);
                        return;
                    }
                    zzkk zzkkVar = new zzkk();
                    zzkkVar.zza(this.zzT - zzknVarZzl.zza());
                    zzkkVar.zzb(this.zzo.zzj().zzb);
                    zzkkVar.zzc(this.zzM);
                    zzknVarZzl.zzj(new zzkl(zzkkVar, null));
                }
            }
        }
    }

    private final void zzaj() {
        zzkn zzknVarZzm = this.zzs.zzm();
        boolean z4 = false;
        if (zzknVarZzm != null && zzknVarZzm.zzg.zzi && this.zzJ) {
            z4 = true;
        }
        this.zzK = z4;
    }

    private final void zzak(zzau zzauVar, boolean z4) throws zzhz {
        zzal(zzauVar, zzauVar.zzb, true, z4);
    }

    private final void zzal(zzau zzauVar, float f, boolean z4, boolean z5) throws zzhz {
        int i;
        if (z4) {
            if (z5) {
                this.zzH.zza(1);
            }
            zzld zzldVar = this.zzG;
            this.zzG = new zzld(zzldVar.zza, zzldVar.zzb, zzldVar.zzc, zzldVar.zzd, zzldVar.zze, zzldVar.zzf, zzldVar.zzg, zzldVar.zzh, zzldVar.zzi, zzldVar.zzj, zzldVar.zzk, zzldVar.zzl, zzldVar.zzm, zzldVar.zzn, zzauVar, zzldVar.zzq, zzldVar.zzr, zzldVar.zzs, zzldVar.zzt, false);
        }
        float f3 = zzauVar.zzb;
        zzkn zzknVarZzm = this.zzs.zzm();
        while (true) {
            i = 0;
            if (zzknVarZzm == null) {
                break;
            }
            zzyf[] zzyfVarArr = zzknVarZzm.zzr().zzc;
            int length = zzyfVarArr.length;
            while (i < length) {
                zzyf zzyfVar = zzyfVarArr[i];
                i++;
            }
            zzknVarZzm = zzknVarZzm.zzp();
        }
        zzlp[] zzlpVarArr = this.zzb;
        while (i < 2) {
            zzlpVarArr[i].zzm(f, f3);
            i++;
        }
    }

    private final void zzam() {
        long jZza;
        long jZza2;
        zzkq zzkqVar = this.zzs;
        boolean zZzg = false;
        if (zzaF(zzkqVar.zzk())) {
            zzkn zzknVarZzk = zzkqVar.zzk();
            long jZzau = zzau(zzknVarZzk.zzg());
            if (zzknVarZzk == zzkqVar.zzm()) {
                jZza = this.zzT;
                jZza2 = zzknVarZzk.zza();
            } else {
                jZza = this.zzT - zzknVarZzk.zza();
                jZza2 = zzknVarZzk.zzg.zzb;
            }
            zzki zzkiVar = new zzki(this.zzv, this.zzG.zza, zzknVarZzk.zzg.zza, jZza - jZza2, jZzau, this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzknVarZzk.zzg.zza) ? this.zzad.zze() : androidx.media3.common.C.TIME_UNSET, this.zzM);
            zzkj zzkjVar = this.zzg;
            boolean zZzg2 = zzkjVar.zzg(zzkiVar);
            zzkn zzknVarZzm = zzkqVar.zzm();
            if (zZzg2 || !zzknVarZzm.zze || jZzau >= 500000 || this.zzn <= 0) {
                zZzg = zZzg2;
            } else {
                zzknVarZzm.zza.zzf(this.zzG.zzs, false);
                zZzg = zzkjVar.zzg(zzkiVar);
            }
        }
        this.zzN = zZzg;
        if (zZzg) {
            zzkn zzknVarZzk2 = zzkqVar.zzk();
            zzknVarZzk2.getClass();
            zzkk zzkkVar = new zzkk();
            zzkkVar.zza(this.zzT - zzknVarZzk2.zza());
            zzkkVar.zzb(this.zzo.zzj().zzb);
            zzkkVar.zzc(this.zzM);
            zzknVarZzk2.zzj(new zzkl(zzkkVar, null));
        }
        zzan();
    }

    private final void zzan() {
        zzkn zzknVarZzk = this.zzs.zzk();
        boolean z4 = true;
        if (!this.zzN && (zzknVarZzk == null || !zzknVarZzk.zza.zzn())) {
            z4 = false;
        }
        zzld zzldVar = this.zzG;
        if (z4 != zzldVar.zzg) {
            this.zzG = zzldVar.zzg(z4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    @androidx.annotation.CheckResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.zzld zzao(com.google.android.gms.internal.ads.zzup r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkf.zzao(com.google.android.gms.internal.ads.zzup, long, long, long, boolean, int):com.google.android.gms.internal.ads.zzld");
    }

    private final void zzap() throws zzhz {
        zzaq(new boolean[2], this.zzs.zzn().zzc());
    }

    private final void zzaq(boolean[] zArr, long j) throws zzhz {
        zzlp[] zzlpVarArr;
        long j6;
        zzkn zzknVarZzn = this.zzs.zzn();
        zzyn zzynVarZzr = zzknVarZzn.zzr();
        int i = 0;
        while (true) {
            zzlpVarArr = this.zzb;
            if (i >= 2) {
                break;
            }
            if (!zzynVarZzr.zza(i)) {
                zzlpVarArr[i].zzF();
            }
            i++;
        }
        int i4 = 0;
        while (i4 < 2) {
            if (!zzynVarZzr.zza(i4) || zzlpVarArr[i4].zzp(zzknVarZzn)) {
                j6 = j;
            } else {
                j6 = j;
                zzar(zzknVarZzn, i4, zArr[i4], j6);
            }
            i4++;
            j = j6;
        }
    }

    private final void zzar(zzkn zzknVar, int i, boolean z4, long j) throws zzhz {
        zzlp zzlpVar = this.zzb[i];
        if (zzlpVar.zzL()) {
            return;
        }
        boolean z5 = zzknVar == this.zzs.zzm();
        zzyn zzynVarZzr = zzknVar.zzr();
        zzlo zzloVar = zzynVarZzr.zzb[i];
        zzyf zzyfVar = zzynVarZzr.zzc[i];
        boolean z8 = zzax() && this.zzG.zze == 3;
        boolean z9 = !z4 && z8;
        this.zzR++;
        zzlpVar.zzx(zzloVar, zzyfVar, zzknVar.zzc[i], this.zzT, z9, z5, j, zzknVar.zza(), zzknVar.zzg.zza, this.zzo);
        zzlpVar.zzy(11, new zzjt(this), zzknVar);
        if (z8 && z5) {
            zzlpVar.zzv();
        }
    }

    private final void zzas(boolean z4) {
        zzkn zzknVarZzk = this.zzs.zzk();
        zzup zzupVar = zzknVarZzk == null ? this.zzG.zzb : zzknVarZzk.zzg.zza;
        boolean zEquals = this.zzG.zzk.equals(zzupVar);
        if (!zEquals) {
            this.zzG = this.zzG.zzh(zzupVar);
        }
        zzld zzldVar = this.zzG;
        zzldVar.zzq = zzknVarZzk == null ? zzldVar.zzs : zzknVarZzk.zzf();
        this.zzG.zzr = zzat();
        if ((!zEquals || z4) && zzknVarZzk != null && zzknVarZzk.zze) {
            zzaw(zzknVarZzk.zzg.zza, zzknVarZzk.zzq(), zzknVarZzk.zzr());
        }
    }

    private final long zzat() {
        return zzau(this.zzG.zzq);
    }

    private final long zzau(long j) {
        zzkn zzknVarZzk = this.zzs.zzk();
        if (zzknVarZzk == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzT - zzknVarZzk.zza()));
    }

    private final long zzav(zzkn zzknVar) {
        zzghc.zzh(zzknVar.zze);
        return (long) ((zzknVar.zzc() - this.zzT) / this.zzo.zzj().zzb);
    }

    private final void zzaw(zzup zzupVar, zzwq zzwqVar, zzyn zzynVar) {
        long jZza;
        long jZza2;
        zzkq zzkqVar = this.zzs;
        zzkn zzknVarZzk = zzkqVar.zzk();
        zzknVarZzk.getClass();
        if (zzknVarZzk == zzkqVar.zzm()) {
            jZza = this.zzT;
            jZza2 = zzknVarZzk.zza();
        } else {
            jZza = this.zzT - zzknVarZzk.zza();
            jZza2 = zzknVarZzk.zzg.zzb;
        }
        this.zzg.zzb(new zzki(this.zzv, this.zzG.zza, zzupVar, jZza - jZza2, zzau(zzknVarZzk.zzf()), this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzknVarZzk.zzg.zza) ? this.zzad.zze() : androidx.media3.common.C.TIME_UNSET, this.zzM), zzwqVar, zzynVar.zzc);
    }

    private final boolean zzax() {
        zzld zzldVar = this.zzG;
        return zzldVar.zzl && zzldVar.zzn == 0;
    }

    private final void zzay(int i) throws Throwable {
        zzlp zzlpVar = this.zzb[i];
        try {
            zzkn zzknVarZzm = this.zzs.zzm();
            if (zzknVarZzm == null) {
                throw null;
            }
            zzlpVar.zzu(zzknVarZzm);
        } catch (IOException e) {
            e = e;
            zzlpVar.zze();
            throw e;
        } catch (RuntimeException e7) {
            e = e7;
            zzlpVar.zze();
            throw e;
        }
    }

    private final boolean zzaz() {
        if (!this.zzy) {
            return false;
        }
        zzlp[] zzlpVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            if (zzlpVarArr[i].zzc()) {
                return true;
            }
        }
        return false;
    }

    public static int zzr(zzbd zzbdVar, zzbc zzbcVar, int i, boolean z4, Object obj, zzbe zzbeVar, zzbe zzbeVar2) {
        zzbd zzbdVar2 = zzbdVar;
        zzbe zzbeVar3 = zzbeVar;
        Object obj2 = zzbeVar3.zzb(zzbeVar3.zzo(obj, zzbcVar).zzc, zzbdVar, 0L).zzb;
        for (int i4 = 0; i4 < zzbeVar2.zza(); i4++) {
            if (zzbeVar2.zzb(i4, zzbdVar, 0L).zzb.equals(obj2)) {
                return i4;
            }
        }
        int iZze = zzbeVar3.zze(obj);
        int iZzc = zzbeVar3.zzc();
        int iZze2 = -1;
        int i6 = 0;
        while (true) {
            if (i6 >= iZzc || iZze2 != -1) {
                break;
            }
            zzbe zzbeVar4 = zzbeVar3;
            int iZzl = zzbeVar4.zzl(iZze, zzbcVar, zzbdVar2, i, z4);
            if (iZzl == -1) {
                iZze2 = -1;
                break;
            }
            iZze2 = zzbeVar2.zze(zzbeVar4.zzf(iZzl));
            i6++;
            zzbeVar3 = zzbeVar4;
            iZze = iZzl;
            zzbdVar2 = zzbdVar;
        }
        if (iZze2 == -1) {
            return -1;
        }
        return zzbeVar2.zzd(iZze2, zzbcVar, false).zzc;
    }

    public static final /* synthetic */ void zzz(zzlh zzlhVar) {
        try {
            zzaE(zzlhVar);
        } catch (zzhz e) {
            zzds.zzf("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05f5 A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, TRY_LEAVE, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0705 A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, LOOP:18: B:349:0x0703->B:350:0x0705, LOOP_END, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x086e A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, LOOP:8: B:439:0x086c->B:440:0x086e, LOOP_END, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x087c A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x088c A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:503:0x096f A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0a20 A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0a2d A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0a34 A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0a51 A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0acf A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0b1d  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0b21  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0b59  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0b63  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0b76  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0b8f  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0bf1  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0bf5  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x0bff  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkf.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzho
    public final void zza(float f) {
        this.zzi.zzh(34);
    }

    @Override // com.google.android.gms.internal.ads.zzho
    public final void zzb(int i) {
        this.zzi.zze(33, i, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzc(zzau zzauVar) {
        this.zzi.zzd(16, zzauVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void zzcS(long j, long j6, zzu zzuVar, @Nullable MediaFormat mediaFormat) {
        if (this.zzD) {
            this.zzi.zzc(37).zza();
        }
    }

    public final void zzd() {
        this.zzi.zzc(29).zza();
    }

    public final void zze(boolean z4, int i, int i4) {
        this.zzi.zze(1, z4 ? 1 : 0, (i4 << 4) | 1).zza();
    }

    public final void zzf(zzbe zzbeVar, int i, long j) {
        this.zzi.zzd(3, new zzke(zzbeVar, i, j)).zza();
    }

    public final void zzg(zzls zzlsVar) {
        this.zzi.zzd(38, zzlsVar).zza();
    }

    public final void zzh() {
        this.zzi.zzc(6).zza();
    }

    public final void zzi(zzc zzcVar, boolean z4) {
        this.zzi.zzf(31, 0, 0, zzcVar).zza();
    }

    public final void zzj(float f) {
        this.zzi.zzd(32, Float.valueOf(f)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlf
    public final void zzk(zzlh zzlhVar) {
        if (!this.zzI && this.zzk.getThread().isAlive()) {
            this.zzi.zzd(14, zzlhVar).zza();
        } else {
            zzds.zzc("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzlhVar.zzi(false);
        }
    }

    public final boolean zzl(@Nullable Object obj, long j) {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        zzde zzdeVar = new zzde(this.zzq);
        this.zzi.zzd(30, new Pair(obj, zzdeVar)).zza();
        if (j != androidx.media3.common.C.TIME_UNSET) {
            return zzdeVar.zze(j);
        }
        return true;
    }

    public final boolean zzm() {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        this.zzI = true;
        zzde zzdeVar = new zzde(this.zzq);
        this.zzi.zzd(7, zzdeVar).zza();
        return zzdeVar.zze(this.zzu);
    }

    public final Looper zzn() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzo() {
        zzdl zzdlVar = this.zzi;
        zzdlVar.zzk(2);
        zzdlVar.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public final void zzp(zzun zzunVar) {
        this.zzi.zzd(8, zzunVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyl
    public final void zzq() {
        this.zzi.zzh(10);
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final /* bridge */ /* synthetic */ void zzs(zzwh zzwhVar) {
        this.zzi.zzd(9, (zzun) zzwhVar).zza();
    }

    public final /* synthetic */ zzkn zzt(zzko zzkoVar, long j) {
        zzyv zzyvVarZzk = this.zzg.zzk();
        long j6 = this.zzZ.zzb;
        zzyn zzynVar = this.zzf;
        zzlc zzlcVar = this.zzt;
        return new zzkn(this.zzc, j, this.zze, zzyvVarZzk, zzlcVar, zzkoVar, zzynVar, androidx.media3.common.C.TIME_UNSET);
    }

    public final /* synthetic */ void zzu(int i, boolean z4) {
        this.zzw.zzB(i, this.zzb[i].zze(), z4);
    }

    public final /* synthetic */ void zzv(int i) {
        this.zzw.zzW(i);
    }

    public final /* synthetic */ zzdl zzx() {
        return this.zzi;
    }

    public final void zzy(List list, int i, long j, zzwi zzwiVar) {
        this.zzi.zzd(17, new zzjz(list, zzwiVar, i, j, null)).zza();
    }
}
