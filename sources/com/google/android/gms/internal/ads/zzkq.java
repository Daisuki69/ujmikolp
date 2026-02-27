package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.MediaPeriodQueue;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzkq {
    private final zzmd zzc;
    private final zzdl zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzij zzh;

    @Nullable
    private zzkn zzi;

    @Nullable
    private zzkn zzj;

    @Nullable
    private zzkn zzk;

    @Nullable
    private zzkn zzl;

    @Nullable
    private zzkn zzm;
    private int zzn;

    @Nullable
    private Object zzo;
    private long zzp;
    private final zzjy zzr;
    private final zzbc zza = new zzbc();
    private final zzbd zzb = new zzbd();
    private List zzq = new ArrayList();

    public zzkq(zzmd zzmdVar, zzdl zzdlVar, zzjy zzjyVar, zzij zzijVar) {
        this.zzc = zzmdVar;
        this.zzd = zzdlVar;
        this.zzr = zzjyVar;
        this.zzh = zzijVar;
    }

    private static zzup zzA(zzbe zzbeVar, Object obj, long j, long j6, zzbd zzbdVar, zzbc zzbcVar) {
        zzbeVar.zzo(obj, zzbcVar);
        zzbeVar.zzb(zzbcVar.zzc, zzbdVar, 0L);
        zzbeVar.zze(obj);
        zzbcVar.zzb();
        zzbeVar.zzo(obj, zzbcVar);
        int iZze = zzbcVar.zze(j);
        return iZze == -1 ? new zzup(obj, j6, zzbcVar.zzf(j)) : new zzup(obj, iZze, zzbcVar.zzd(iZze), j6);
    }

    private final void zzB() {
        int i = zzgjz.zzd;
        final zzgjw zzgjwVar = new zzgjw();
        for (zzkn zzknVarZzp = this.zzi; zzknVarZzp != null; zzknVarZzp = zzknVarZzp.zzp()) {
            zzgjwVar.zzf(zzknVarZzp.zzg.zza);
        }
        zzkn zzknVar = this.zzj;
        final zzup zzupVar = zzknVar == null ? null : zzknVar.zzg.zza;
        this.zzd.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgjwVar, zzupVar);
            }
        });
    }

    private final long zzC(Object obj) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzkn zzknVar = (zzkn) this.zzq.get(i);
            if (zzknVar.zzb.equals(obj)) {
                return zzknVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final int zzD(zzbe zzbeVar) {
        zzbe zzbeVar2;
        zzkn zzknVarZzp = this.zzi;
        if (zzknVarZzp == null) {
            return 0;
        }
        int iZze = zzbeVar.zze(zzknVarZzp.zzb);
        while (true) {
            zzbeVar2 = zzbeVar;
            iZze = zzbeVar2.zzl(iZze, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzknVarZzp.getClass();
                if (zzknVarZzp.zzp() == null || zzknVarZzp.zzg.zzh) {
                    break;
                }
                zzknVarZzp = zzknVarZzp.zzp();
            }
            zzkn zzknVarZzp2 = zzknVarZzp.zzp();
            if (iZze == -1 || zzknVarZzp2 == null || zzbeVar2.zze(zzknVarZzp2.zzb) != iZze) {
                break;
            }
            zzknVarZzp = zzknVarZzp2;
            zzbeVar = zzbeVar2;
        }
        int iZzs = zzs(zzknVarZzp);
        zzknVarZzp.zzg = zzx(zzbeVar2, zzknVarZzp.zzg);
        return iZzs;
    }

    @Nullable
    private final zzko zzE(zzbe zzbeVar, zzkn zzknVar, long j) {
        zzbe zzbeVar2;
        long j6;
        zzbe zzbeVar3;
        zzbc zzbcVar;
        zzbd zzbdVar;
        Object obj;
        long j7;
        long j9;
        long j10;
        zzko zzkoVar = zzknVar.zzg;
        long jZza = zzknVar.zza();
        long j11 = zzkoVar.zze;
        long j12 = (jZza + j11) - j;
        if (!zzkoVar.zzh) {
            zzup zzupVar = zzkoVar.zza;
            Object obj2 = zzupVar.zza;
            zzbc zzbcVar2 = this.zza;
            zzbeVar.zzo(obj2, zzbcVar2);
            if (!zzupVar.zzb()) {
                int i = zzupVar.zze;
                if (i != -1) {
                    zzbcVar2.zzi(i);
                }
                int iZzd = zzbcVar2.zzd(i);
                zzbcVar2.zzk(i);
                if (iZzd != zzbcVar2.zzg(i)) {
                    return zzG(zzbeVar, obj2, i, iZzd, j11, zzupVar.zzd, false);
                }
                zzK(zzbeVar, obj2, i);
                return zzH(zzbeVar, obj2, 0L, j11, zzupVar.zzd, false);
            }
            int i4 = zzupVar.zzb;
            if (zzbcVar2.zzg(i4) == -1) {
                return null;
            }
            int iZza = zzbcVar2.zzg.zza(i4).zza(zzupVar.zzc);
            if (iZza < 0) {
                return zzG(zzbeVar, obj2, i4, iZza, zzkoVar.zzc, zzupVar.zzd, false);
            }
            long jLongValue = zzkoVar.zzc;
            if (jLongValue == androidx.media3.common.C.TIME_UNSET) {
                Pair pairZzn = zzbeVar.zzn(this.zzb, zzbcVar2, zzbcVar2.zzc, androidx.media3.common.C.TIME_UNSET, Math.max(0L, j12));
                zzbeVar2 = zzbeVar;
                if (pairZzn == null) {
                    return null;
                }
                jLongValue = ((Long) pairZzn.second).longValue();
                j6 = -9223372036854775807L;
            } else {
                zzbeVar2 = zzbeVar;
                j6 = jLongValue;
            }
            zzK(zzbeVar2, obj2, i4);
            return zzH(zzbeVar2, obj2, Math.max(0L, jLongValue), j6, zzupVar.zzd, false);
        }
        zzup zzupVar2 = zzkoVar.zza;
        Object obj3 = zzupVar2.zza;
        int iZze = zzbeVar.zze(obj3);
        int i6 = this.zzf;
        boolean z4 = this.zzg;
        zzbd zzbdVar2 = this.zzb;
        zzbc zzbcVar3 = this.zza;
        long j13 = 0;
        int iZzl = zzbeVar.zzl(iZze, zzbcVar3, zzbdVar2, i6, z4);
        if (iZzl == -1) {
            return null;
        }
        int i10 = zzbeVar.zzd(iZzl, zzbcVar3, true).zzc;
        Object obj4 = zzbcVar3.zzb;
        obj4.getClass();
        long j14 = zzupVar2.zzd;
        if (zzbeVar.zzb(i10, zzbdVar2, 0L).zzn == iZzl) {
            Pair pairZzn2 = zzbeVar.zzn(zzbdVar2, zzbcVar3, i10, androidx.media3.common.C.TIME_UNSET, Math.max(0L, j12));
            if (pairZzn2 == null) {
                return null;
            }
            Object obj5 = pairZzn2.first;
            long jLongValue2 = ((Long) pairZzn2.second).longValue();
            zzkn zzknVarZzp = zzknVar.zzp();
            if (zzknVarZzp == null || !zzknVarZzp.zzb.equals(obj5)) {
                long jZzC = zzC(obj5);
                if (jZzC == -1) {
                    jZzC = this.zze;
                    this.zze = 1 + jZzC;
                }
                j10 = jZzC;
            } else {
                j10 = zzknVarZzp.zzg.zza.zzd;
            }
            zzbeVar3 = zzbeVar;
            zzbdVar = zzbdVar2;
            zzbcVar = zzbcVar3;
            j7 = jLongValue2;
            obj = obj5;
            j9 = j10;
            j13 = -9223372036854775807L;
        } else {
            zzbeVar3 = zzbeVar;
            zzbcVar = zzbcVar3;
            zzbdVar = zzbdVar2;
            obj = obj4;
            j7 = 0;
            j9 = j14;
        }
        zzup zzupVarZzA = zzA(zzbeVar3, obj, j7, j9, zzbdVar, zzbcVar);
        long j15 = j7;
        zzbc zzbcVar4 = zzbcVar;
        if (j13 != androidx.media3.common.C.TIME_UNSET && zzkoVar.zzc != androidx.media3.common.C.TIME_UNSET) {
            zzbeVar3.zzo(obj3, zzbcVar4).zzb();
            int i11 = zzbcVar4.zzg.zzd;
        }
        return zzF(zzbeVar3, zzupVarZzA, j13, j15);
    }

    private final zzko zzF(zzbe zzbeVar, zzup zzupVar, long j, long j6) {
        Object obj = zzupVar.zza;
        zzbeVar.zzo(obj, this.zza);
        return zzupVar.zzb() ? zzG(zzbeVar, obj, zzupVar.zzb, zzupVar.zzc, j, zzupVar.zzd, false) : zzH(zzbeVar, obj, j6, j, zzupVar.zzd, false);
    }

    private final zzko zzG(zzbe zzbeVar, Object obj, int i, int i4, long j, long j6, boolean z4) {
        zzup zzupVar = new zzup(obj, i, i4, j6);
        Object obj2 = zzupVar.zza;
        int i6 = zzupVar.zzb;
        int i10 = zzupVar.zzc;
        zzbc zzbcVar = this.zza;
        long jZzh = zzbeVar.zzo(obj2, zzbcVar).zzh(i6, i10);
        if (i4 == zzbcVar.zzd(i)) {
            zzbcVar.zzj();
        }
        zzbcVar.zzk(i6);
        long jMax = 0;
        if (jZzh != androidx.media3.common.C.TIME_UNSET && jZzh <= 0) {
            jMax = Math.max(0L, (-1) + jZzh);
        }
        return new zzko(zzupVar, jMax, j, androidx.media3.common.C.TIME_UNSET, jZzh, false, false, false, false, false);
    }

    private final zzko zzH(zzbe zzbeVar, Object obj, long j, long j6, long j7, boolean z4) {
        long j9;
        long j10;
        long j11;
        long jMax = j;
        zzbc zzbcVar = this.zza;
        zzbeVar.zzo(obj, zzbcVar);
        int iZzf = zzbcVar.zzf(jMax);
        if (iZzf == -1) {
            zzbcVar.zzb();
        } else {
            zzbcVar.zzk(iZzf);
        }
        zzup zzupVar = new zzup(obj, j7, iZzf);
        boolean zZzL = zzL(zzupVar);
        boolean zZzI = zzI(zzbeVar, zzupVar);
        boolean zZzJ = zzJ(zzbeVar, zzupVar, zZzL);
        if (iZzf != -1) {
            zzbcVar.zzk(iZzf);
        }
        if (iZzf != -1) {
            zzbcVar.zzi(iZzf);
        }
        if (iZzf != -1) {
            zzbcVar.zzc(iZzf);
            j9 = 0;
        } else {
            j9 = -9223372036854775807L;
        }
        if (j9 != androidx.media3.common.C.TIME_UNSET) {
            j11 = j9;
            j10 = j11;
        } else {
            j10 = zzbcVar.zzd;
            j11 = -9223372036854775807L;
        }
        if (j10 != androidx.media3.common.C.TIME_UNSET && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        return new zzko(zzupVar, jMax, j6, j11, j10, false, false, zZzL, zZzI, zZzJ);
    }

    private final boolean zzI(zzbe zzbeVar, zzup zzupVar) {
        if (!zzL(zzupVar)) {
            return false;
        }
        Object obj = zzupVar.zza;
        return zzbeVar.zzb(zzbeVar.zzo(obj, this.zza).zzc, this.zzb, 0L).zzo == zzbeVar.zze(obj);
    }

    private final boolean zzJ(zzbe zzbeVar, zzup zzupVar, boolean z4) {
        int iZze = zzbeVar.zze(zzupVar.zza);
        zzbc zzbcVar = this.zza;
        int i = zzbeVar.zzd(iZze, zzbcVar, false).zzc;
        zzbd zzbdVar = this.zzb;
        return !zzbeVar.zzb(i, zzbdVar, 0L).zzi && zzbeVar.zzl(iZze, zzbcVar, zzbdVar, this.zzf, this.zzg) == -1 && z4;
    }

    private final long zzK(zzbe zzbeVar, Object obj, int i) {
        zzbc zzbcVar = this.zza;
        zzbeVar.zzo(obj, zzbcVar);
        zzbcVar.zzc(i);
        long j = zzbcVar.zzg.zza(i).zzh;
        return 0L;
    }

    private static final boolean zzL(zzup zzupVar) {
        return !zzupVar.zzb() && zzupVar.zze == -1;
    }

    public final int zza(zzbe zzbeVar, int i) {
        this.zzf = i;
        return zzD(zzbeVar);
    }

    public final int zzb(zzbe zzbeVar, boolean z4) {
        this.zzg = z4;
        return zzD(zzbeVar);
    }

    public final void zzc(zzbe zzbeVar, zzij zzijVar) {
        this.zzh = zzijVar;
        long j = zzijVar.zzb;
        zzj();
    }

    public final boolean zzd(zzun zzunVar) {
        zzkn zzknVar = this.zzl;
        return zzknVar != null && zzknVar.zza == zzunVar;
    }

    public final boolean zze(zzun zzunVar) {
        zzkn zzknVar = this.zzm;
        return zzknVar != null && zzknVar.zza == zzunVar;
    }

    public final void zzf(long j) {
        zzkn zzknVar = this.zzl;
        if (zzknVar != null) {
            zzknVar.zzi(j);
        }
    }

    public final boolean zzg() {
        zzkn zzknVar = this.zzl;
        if (zzknVar != null) {
            return !zzknVar.zzg.zzj && zzknVar.zzd() && this.zzl.zzg.zze != androidx.media3.common.C.TIME_UNSET && this.zzn < 100;
        }
        return true;
    }

    @Nullable
    public final zzko zzh(long j, zzld zzldVar) {
        zzkn zzknVar = this.zzl;
        return zzknVar == null ? zzF(zzldVar.zza, zzldVar.zzb, zzldVar.zzc, zzldVar.zzs) : zzE(zzldVar.zza, zzknVar, j);
    }

    public final zzkn zzi(zzko zzkoVar) {
        zzkn zzknVarZza;
        zzkn zzknVar = this.zzl;
        long jZza = zzknVar == null ? MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : (zzknVar.zza() + zzknVar.zzg.zze) - zzkoVar.zzb;
        int i = 0;
        while (true) {
            if (i >= this.zzq.size()) {
                zzknVarZza = null;
                break;
            }
            zzko zzkoVar2 = ((zzkn) this.zzq.get(i)).zzg;
            long j = zzkoVar2.zze;
            long j6 = zzkoVar.zze;
            if ((j == androidx.media3.common.C.TIME_UNSET || j == j6) && zzkoVar2.zzb == zzkoVar.zzb && zzkoVar2.zza.equals(zzkoVar.zza)) {
                zzknVarZza = (zzkn) this.zzq.remove(i);
                break;
            }
            i++;
        }
        if (zzknVarZza == null) {
            zzknVarZza = this.zzr.zza(zzkoVar, jZza);
        } else {
            zzknVarZza.zzg = zzkoVar;
            zzknVarZza.zzb(jZza);
        }
        zzkn zzknVar2 = this.zzl;
        if (zzknVar2 != null) {
            zzknVar2.zzo(zzknVarZza);
        } else {
            this.zzi = zzknVarZza;
            this.zzj = zzknVarZza;
            this.zzk = zzknVarZza;
        }
        this.zzo = null;
        this.zzl = zzknVarZza;
        this.zzn++;
        zzB();
        return zzknVarZza;
    }

    public final void zzj() {
        if (this.zzq.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.zzq.size(); i++) {
            ((zzkn) this.zzq.get(i)).zzn();
        }
        this.zzq = arrayList;
        this.zzm = null;
        zzt();
    }

    @Nullable
    public final zzkn zzk() {
        return this.zzl;
    }

    @Nullable
    public final zzkn zzl() {
        return this.zzm;
    }

    @Nullable
    public final zzkn zzm() {
        return this.zzi;
    }

    @Nullable
    public final zzkn zzn() {
        return this.zzj;
    }

    @Nullable
    public final zzkn zzo() {
        return this.zzk;
    }

    public final zzkn zzp() {
        zzkn zzknVar = this.zzk;
        zzkn zzknVar2 = this.zzj;
        if (zzknVar == zzknVar2) {
            zzknVar2.getClass();
            this.zzk = zzknVar2.zzp();
        }
        zzknVar2.getClass();
        this.zzj = zzknVar2.zzp();
        zzB();
        zzkn zzknVar3 = this.zzj;
        zzknVar3.getClass();
        return zzknVar3;
    }

    public final zzkn zzq() {
        zzkn zzknVar = this.zzk;
        zzknVar.getClass();
        this.zzk = zzknVar.zzp();
        zzB();
        zzkn zzknVar2 = this.zzk;
        zzknVar2.getClass();
        return zzknVar2;
    }

    @Nullable
    public final zzkn zzr() {
        zzkn zzknVar = this.zzi;
        if (zzknVar == null) {
            return null;
        }
        if (zzknVar == this.zzj) {
            this.zzj = zzknVar.zzp();
        }
        if (zzknVar == this.zzk) {
            this.zzk = zzknVar.zzp();
        }
        zzknVar.zzn();
        int i = this.zzn - 1;
        this.zzn = i;
        if (i == 0) {
            this.zzl = null;
            zzkn zzknVar2 = this.zzi;
            this.zzo = zzknVar2.zzb;
            this.zzp = zzknVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzp();
        zzB();
        return this.zzi;
    }

    public final int zzs(zzkn zzknVar) {
        zzknVar.getClass();
        int i = 0;
        if (zzknVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzknVar;
        while (zzknVar.zzp() != null) {
            zzknVar = zzknVar.zzp();
            zzknVar.getClass();
            if (zzknVar == this.zzj) {
                zzkn zzknVar2 = this.zzi;
                this.zzj = zzknVar2;
                this.zzk = zzknVar2;
                i = 3;
            }
            if (zzknVar == this.zzk) {
                this.zzk = this.zzj;
                i |= 2;
            }
            zzknVar.zzn();
            this.zzn--;
        }
        zzkn zzknVar3 = this.zzl;
        zzknVar3.getClass();
        zzknVar3.zzo(null);
        zzB();
        return i;
    }

    public final void zzt() {
        zzkn zzknVar = this.zzm;
        if (zzknVar == null || zzknVar.zze()) {
            this.zzm = null;
            for (int i = 0; i < this.zzq.size(); i++) {
                zzkn zzknVar2 = (zzkn) this.zzq.get(i);
                if (!zzknVar2.zze()) {
                    this.zzm = zzknVar2;
                    return;
                }
            }
        }
    }

    @Nullable
    public final zzkn zzu(zzun zzunVar) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzkn zzknVar = (zzkn) this.zzq.get(i);
            if (zzknVar.zza == zzunVar) {
                return zzknVar;
            }
        }
        return null;
    }

    public final void zzv() {
        if (this.zzn == 0) {
            return;
        }
        zzkn zzknVarZzp = this.zzi;
        zzknVarZzp.getClass();
        this.zzo = zzknVarZzp.zzb;
        this.zzp = zzknVarZzp.zzg.zza.zzd;
        while (zzknVarZzp != null) {
            zzknVarZzp.zzn();
            zzknVarZzp = zzknVarZzp.zzp();
        }
        this.zzi = null;
        this.zzl = null;
        this.zzj = null;
        this.zzk = null;
        this.zzn = 0;
        zzB();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x009d, code lost:
    
        return zzs(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzw(com.google.android.gms.internal.ads.zzbe r14, long r15, long r17, long r19) {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.zzkn r0 = r13.zzi
            r1 = 0
        L3:
            r2 = 0
            if (r0 == 0) goto L9e
            com.google.android.gms.internal.ads.zzko r3 = r0.zzg
            if (r1 != 0) goto L10
            com.google.android.gms.internal.ads.zzko r1 = r13.zzx(r14, r3)
            r4 = r15
            goto L2a
        L10:
            r4 = r15
            com.google.android.gms.internal.ads.zzko r6 = r13.zzE(r14, r1, r4)
            if (r6 == 0) goto L99
            long r7 = r3.zzb
            long r9 = r6.zzb
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L99
            com.google.android.gms.internal.ads.zzup r7 = r3.zza
            com.google.android.gms.internal.ads.zzup r8 = r6.zza
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L99
            r1 = r6
        L2a:
            long r6 = r3.zzc
            com.google.android.gms.internal.ads.zzko r6 = r1.zzb(r6)
            r0.zzg = r6
            long r6 = r3.zze
            long r8 = r1.zze
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L90
            r0.zzs()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r14 != 0) goto L4c
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L51
        L4c:
            long r10 = r0.zza()
            long r8 = r8 + r10
        L51:
            com.google.android.gms.internal.ads.zzkn r14 = r13.zzj
            r10 = -9223372036854775808
            r1 = 1
            if (r0 != r14) goto L66
            com.google.android.gms.internal.ads.zzko r14 = r0.zzg
            boolean r14 = r14.zzg
            int r14 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r14 == 0) goto L64
            int r14 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r14 < 0) goto L66
        L64:
            r14 = r1
            goto L67
        L66:
            r14 = r2
        L67:
            com.google.android.gms.internal.ads.zzkn r5 = r13.zzk
            if (r0 != r5) goto L75
            int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r5 == 0) goto L73
            int r5 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r5 < 0) goto L75
        L73:
            r5 = r1
            goto L76
        L75:
            r5 = r2
        L76:
            int r0 = r13.zzs(r0)
            if (r0 == 0) goto L7d
            return r0
        L7d:
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L82
            r6 = r3
        L82:
            if (r14 == 0) goto L8a
            int r14 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r14 != 0) goto L89
            goto L8a
        L89:
            r2 = r1
        L8a:
            if (r5 == 0) goto L8f
            r14 = r2 | 2
            return r14
        L8f:
            return r2
        L90:
            com.google.android.gms.internal.ads.zzkn r1 = r0.zzp()
            r12 = r1
            r1 = r0
            r0 = r12
            goto L3
        L99:
            int r14 = r13.zzs(r1)
            return r14
        L9e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkq.zzw(com.google.android.gms.internal.ads.zzbe, long, long, long):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzko zzx(com.google.android.gms.internal.ads.zzbe r19, com.google.android.gms.internal.ads.zzko r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzup r3 = r2.zza
            boolean r13 = zzL(r3)
            boolean r14 = r0.zzI(r1, r3)
            boolean r15 = r0.zzJ(r1, r3, r13)
            java.lang.Object r4 = r3.zza
            com.google.android.gms.internal.ads.zzbc r5 = r0.zza
            r1.zzo(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r6 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L2d
            int r1 = r3.zze
            if (r1 != r4) goto L2f
        L2d:
            r10 = r8
            goto L33
        L2f:
            r5.zzc(r1)
            r10 = r6
        L33:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L47
            int r1 = r3.zzb
            int r6 = r3.zzc
            long r6 = r5.zzh(r1, r6)
        L41:
            r16 = r10
            r9 = r6
            r7 = r16
            goto L51
        L47:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L4e
            r9 = r6
            r7 = r9
            goto L51
        L4e:
            long r6 = r5.zzd
            goto L41
        L51:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L5d
            int r1 = r3.zzb
            r5.zzk(r1)
            goto L64
        L5d:
            int r1 = r3.zze
            if (r1 == r4) goto L64
            r5.zzk(r1)
        L64:
            com.google.android.gms.internal.ads.zzko r1 = new com.google.android.gms.internal.ads.zzko
            r5 = r3
            long r3 = r2.zzb
            long r11 = r2.zzc
            r2 = r5
            r5 = r11
            r11 = 0
            r12 = 0
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkq.zzx(com.google.android.gms.internal.ads.zzbe, com.google.android.gms.internal.ads.zzko):com.google.android.gms.internal.ads.zzko");
    }

    public final zzup zzy(zzbe zzbeVar, Object obj, long j) {
        long jZzC;
        int iZze;
        zzbc zzbcVar = this.zza;
        int i = zzbeVar.zzo(obj, zzbcVar).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (iZze = zzbeVar.zze(obj2)) == -1 || zzbeVar.zzd(iZze, zzbcVar, false).zzc != i) {
            zzkn zzknVarZzp = this.zzi;
            while (true) {
                if (zzknVarZzp == null) {
                    zzkn zzknVarZzp2 = this.zzi;
                    while (true) {
                        if (zzknVarZzp2 != null) {
                            int iZze2 = zzbeVar.zze(zzknVarZzp2.zzb);
                            if (iZze2 != -1 && zzbeVar.zzd(iZze2, zzbcVar, false).zzc == i) {
                                jZzC = zzknVarZzp2.zzg.zza.zzd;
                                break;
                            }
                            zzknVarZzp2 = zzknVarZzp2.zzp();
                        } else {
                            jZzC = zzC(obj);
                            if (jZzC == -1) {
                                jZzC = this.zze;
                                this.zze = 1 + jZzC;
                                if (this.zzi == null) {
                                    this.zzo = obj;
                                    this.zzp = jZzC;
                                }
                            }
                        }
                    }
                } else {
                    if (zzknVarZzp.zzb.equals(obj)) {
                        jZzC = zzknVarZzp.zzg.zza.zzd;
                        break;
                    }
                    zzknVarZzp = zzknVarZzp.zzp();
                }
            }
        } else {
            jZzC = this.zzp;
        }
        long j6 = jZzC;
        zzbeVar.zzo(obj, zzbcVar);
        int i4 = zzbcVar.zzc;
        zzbd zzbdVar = this.zzb;
        zzbeVar.zzb(i4, zzbdVar, 0L);
        Object obj3 = obj;
        for (int iZze3 = zzbeVar.zze(obj); iZze3 >= zzbdVar.zzn; iZze3--) {
            zzbeVar.zzd(iZze3, zzbcVar, true);
            zzbcVar.zzb();
            if (zzbcVar.zze(zzbcVar.zzd) != -1) {
                Object obj4 = zzbcVar.zzb;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return zzA(zzbeVar, obj3, j, j6, zzbdVar, zzbcVar);
    }

    public final /* synthetic */ void zzz(zzgjw zzgjwVar, zzup zzupVar) {
        this.zzc.zzz(zzgjwVar.zzi(), zzupVar);
    }
}
