package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzwe implements zzaeb {
    private boolean zzB;
    private final zzvz zza;

    @Nullable
    private final zzru zzd;

    @Nullable
    private final zzrp zze;

    @Nullable
    private zzwd zzf;

    @Nullable
    private zzu zzg;

    @Nullable
    private zzrn zzh;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzw;

    @Nullable
    private zzu zzz;
    private final zzwa zzb = new zzwa();
    private int zzi = 1000;
    private long[] zzj = new long[1000];
    private long[] zzk = new long[1000];
    private long[] zzn = new long[1000];
    private int[] zzm = new int[1000];
    private int[] zzl = new int[1000];
    private zzaea[] zzo = new zzaea[1000];
    private final zzwl zzc = new zzwl(zzwb.zza);
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private long zzv = Long.MIN_VALUE;
    private boolean zzy = true;
    private boolean zzx = true;
    private boolean zzA = true;

    public zzwe(zzyv zzyvVar, @Nullable zzru zzruVar, @Nullable zzrp zzrpVar) {
        this.zzd = zzruVar;
        this.zze = zzrpVar;
        this.zza = new zzvz(zzyvVar);
    }

    private final synchronized void zzA() {
        this.zzs = 0;
        this.zza.zzb();
    }

    private final synchronized int zzB(zzkh zzkhVar, zzhg zzhgVar, boolean z4, boolean z5, zzwa zzwaVar) {
        try {
            zzhgVar.zzd = false;
            if (!zzH()) {
                if (!z5 && !this.zzw) {
                    zzu zzuVar = this.zzz;
                    if (zzuVar == null || (!z4 && zzuVar == this.zzg)) {
                        return -3;
                    }
                    zzI(zzuVar, zzkhVar);
                    return -5;
                }
                zzhgVar.zzg(4);
                zzhgVar.zze = Long.MIN_VALUE;
                return -4;
            }
            zzu zzuVar2 = ((zzwc) this.zzc.zza(this.zzq + this.zzs)).zza;
            if (!z4 && zzuVar2 == this.zzg) {
                int iZzM = zzM(this.zzs);
                if (!zzJ(iZzM)) {
                    zzhgVar.zzd = true;
                    return -3;
                }
                zzhgVar.zzg(this.zzm[iZzM]);
                if (this.zzs == this.zzp - 1 && (z5 || this.zzw)) {
                    zzhgVar.zzh(androidx.media3.common.C.BUFFER_FLAG_LAST_SAMPLE);
                }
                zzhgVar.zze = this.zzn[iZzM];
                zzwaVar.zza = this.zzl[iZzM];
                zzwaVar.zzb = this.zzk[iZzM];
                zzwaVar.zzc = this.zzo[iZzM];
                return -4;
            }
            zzI(zzuVar2, zzkhVar);
            return -5;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized boolean zzC(zzu zzuVar) {
        try {
            this.zzy = false;
            if (Objects.equals(zzuVar, this.zzz)) {
                return false;
            }
            zzwl zzwlVar = this.zzc;
            if (zzwlVar.zzf() || !((zzwc) zzwlVar.zzc()).zza.equals(zzuVar)) {
                this.zzz = zzuVar;
            } else {
                this.zzz = ((zzwc) zzwlVar.zzc()).zza;
            }
            boolean z4 = this.zzA;
            zzu zzuVar2 = this.zzz;
            this.zzA = z4 & zzar.zzd(zzuVar2.zzo, zzuVar2.zzk);
            this.zzB = false;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized long zzD(long r8, boolean r10, boolean r11) throws java.lang.Throwable {
        /*
            r7 = this;
            monitor-enter(r7)
            int r10 = r7.zzp     // Catch: java.lang.Throwable -> L32
            if (r10 == 0) goto Lf
            long[] r0 = r7.zzn     // Catch: java.lang.Throwable -> L32
            int r2 = r7.zzr     // Catch: java.lang.Throwable -> L32
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L32
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L11
        Lf:
            r1 = r7
            goto L35
        L11:
            if (r11 == 0) goto L19
            int r11 = r7.zzs     // Catch: java.lang.Throwable -> L1b
            if (r11 == r10) goto L19
            int r10 = r11 + 1
        L19:
            r3 = r10
            goto L1f
        L1b:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L39
        L1f:
            r6 = 0
            r1 = r7
            r4 = r8
            int r8 = r1.zzK(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L2f
            r9 = -1
            if (r8 == r9) goto L35
            long r8 = r7.zzL(r8)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r7)
            return r8
        L2f:
            r0 = move-exception
        L30:
            r8 = r0
            goto L39
        L32:
            r0 = move-exception
            r1 = r7
            goto L30
        L35:
            monitor-exit(r7)
            r8 = -1
            return r8
        L39:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwe.zzD(long, boolean, boolean):long");
    }

    private final synchronized long zzE() {
        int i = this.zzp;
        if (i == 0) {
            return -1L;
        }
        return zzL(i);
    }

    private final void zzF() {
        if (this.zzh != null) {
            this.zzh = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzG(long j, int i, long j6, int i4, @Nullable zzaea zzaeaVar) {
        try {
            int i6 = this.zzp;
            if (i6 > 0) {
                int iZzM = zzM(i6 - 1);
                zzghc.zza(this.zzk[iZzM] + ((long) this.zzl[iZzM]) <= j6);
            }
            this.zzw = (536870912 & i) != 0;
            this.zzv = Math.max(this.zzv, j);
            int iZzM2 = zzM(this.zzp);
            this.zzn[iZzM2] = j;
            this.zzk[iZzM2] = j6;
            this.zzl[iZzM2] = i4;
            this.zzm[iZzM2] = i;
            this.zzo[iZzM2] = zzaeaVar;
            this.zzj[iZzM2] = 0;
            zzwl zzwlVar = this.zzc;
            if (zzwlVar.zzf() || !((zzwc) zzwlVar.zzc()).zza.equals(this.zzz)) {
                zzu zzuVar = this.zzz;
                if (zzuVar == null) {
                    throw null;
                }
                zzwlVar.zzb(this.zzq + this.zzp, new zzwc(zzuVar, zzrt.zzb, null));
            }
            int i10 = this.zzp + 1;
            this.zzp = i10;
            int i11 = this.zzi;
            if (i10 == i11) {
                int i12 = i11 + 1000;
                long[] jArr = new long[i12];
                long[] jArr2 = new long[i12];
                long[] jArr3 = new long[i12];
                int[] iArr = new int[i12];
                int[] iArr2 = new int[i12];
                zzaea[] zzaeaVarArr = new zzaea[i12];
                int i13 = this.zzr;
                int i14 = i11 - i13;
                System.arraycopy(this.zzk, i13, jArr2, 0, i14);
                System.arraycopy(this.zzn, this.zzr, jArr3, 0, i14);
                System.arraycopy(this.zzm, this.zzr, iArr, 0, i14);
                System.arraycopy(this.zzl, this.zzr, iArr2, 0, i14);
                System.arraycopy(this.zzo, this.zzr, zzaeaVarArr, 0, i14);
                System.arraycopy(this.zzj, this.zzr, jArr, 0, i14);
                int i15 = this.zzr;
                System.arraycopy(this.zzk, 0, jArr2, i14, i15);
                System.arraycopy(this.zzn, 0, jArr3, i14, i15);
                System.arraycopy(this.zzm, 0, iArr, i14, i15);
                System.arraycopy(this.zzl, 0, iArr2, i14, i15);
                System.arraycopy(this.zzo, 0, zzaeaVarArr, i14, i15);
                System.arraycopy(this.zzj, 0, jArr, i14, i15);
                this.zzk = jArr2;
                this.zzn = jArr3;
                this.zzm = iArr;
                this.zzl = iArr2;
                this.zzo = zzaeaVarArr;
                this.zzj = jArr;
                this.zzr = 0;
                this.zzi = i12;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final boolean zzH() {
        return this.zzs != this.zzp;
    }

    private final void zzI(zzu zzuVar, zzkh zzkhVar) {
        zzu zzuVar2 = this.zzg;
        zzp zzpVar = zzuVar2 == null ? null : zzuVar2.zzs;
        this.zzg = zzuVar;
        zzp zzpVar2 = zzuVar.zzs;
        zzru zzruVar = this.zzd;
        zzkhVar.zzb = zzuVar.zzb(zzruVar.zzb(zzuVar));
        zzkhVar.zza = this.zzh;
        if (zzuVar2 == null || !Objects.equals(zzpVar, zzpVar2)) {
            zzrn zzrnVarZza = zzruVar.zza(this.zze, zzuVar);
            this.zzh = zzrnVarZza;
            zzkhVar.zza = zzrnVarZza;
        }
    }

    private final boolean zzJ(int i) {
        if (this.zzh == null) {
            return true;
        }
        int i4 = this.zzm[i];
        return false;
    }

    private final int zzK(int i, int i4, long j, boolean z4) {
        int i6 = -1;
        for (int i10 = 0; i10 < i4; i10++) {
            long j6 = this.zzn[i];
            if (j6 > j) {
                break;
            }
            if (!z4 || (this.zzm[i] & 1) != 0) {
                if (j6 == j) {
                    return i10;
                }
                i6 = i10;
            }
            i++;
            if (i == this.zzi) {
                i = 0;
            }
        }
        return i6;
    }

    @GuardedBy("this")
    private final long zzL(int i) {
        long j = this.zzu;
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int iZzM = zzM(i - 1);
            for (int i4 = 0; i4 < i; i4++) {
                jMax = Math.max(jMax, this.zzn[iZzM]);
                if ((this.zzm[iZzM] & 1) != 0) {
                    break;
                }
                iZzM--;
                if (iZzM == -1) {
                    iZzM = this.zzi - 1;
                }
            }
        }
        this.zzu = Math.max(j, jMax);
        this.zzp -= i;
        int i6 = this.zzq + i;
        this.zzq = i6;
        int i10 = this.zzr + i;
        this.zzr = i10;
        int i11 = this.zzi;
        if (i10 >= i11) {
            this.zzr = i10 - i11;
        }
        int i12 = this.zzs - i;
        this.zzs = i12;
        if (i12 < 0) {
            this.zzs = 0;
        }
        this.zzc.zzd(i6);
        if (this.zzp != 0) {
            return this.zzk[this.zzr];
        }
        int i13 = this.zzr;
        if (i13 == 0) {
            i13 = this.zzi;
        }
        int i14 = i13 - 1;
        return this.zzk[i14] + ((long) this.zzl[i14]);
    }

    private final int zzM(int i) {
        int i4 = this.zzr + i;
        int i6 = this.zzi;
        return i4 < i6 ? i4 : i4 - i6;
    }

    @CallSuper
    public final void zza() {
        zzb(true);
        zzF();
    }

    @CallSuper
    public final void zzb(boolean z4) {
        this.zza.zza();
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzx = true;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = Long.MIN_VALUE;
        this.zzw = false;
        this.zzc.zze();
        if (z4) {
            this.zzz = null;
            this.zzy = true;
            this.zzA = true;
        }
    }

    public final void zzc(long j) {
        this.zzt = j;
    }

    public final int zzd() {
        return this.zzq + this.zzp;
    }

    @CallSuper
    public final void zze() {
        zzs();
        zzF();
    }

    @CallSuper
    public final void zzf() throws IOException {
        zzrn zzrnVar = this.zzh;
        if (zzrnVar != null) {
            throw zzrnVar.zza();
        }
    }

    public final int zzg() {
        return this.zzq;
    }

    public final int zzh() {
        return this.zzq + this.zzs;
    }

    @Nullable
    public final synchronized zzu zzi() {
        if (this.zzy) {
            return null;
        }
        return this.zzz;
    }

    public final synchronized long zzj() {
        return this.zzv;
    }

    public final synchronized boolean zzk() {
        return this.zzw;
    }

    @CallSuper
    public final synchronized boolean zzl(boolean z4) {
        boolean z5 = true;
        if (zzH()) {
            if (((zzwc) this.zzc.zza(this.zzq + this.zzs)).zza != this.zzg) {
                return true;
            }
            return zzJ(zzM(this.zzs));
        }
        if (!z4 && !this.zzw) {
            zzu zzuVar = this.zzz;
            if (zzuVar == null) {
                z5 = false;
            } else if (zzuVar == this.zzg) {
                return false;
            }
        }
        return z5;
    }

    @CallSuper
    public final int zzm(zzkh zzkhVar, zzhg zzhgVar, int i, boolean z4) {
        boolean z5 = (i & 2) != 0;
        zzwa zzwaVar = this.zzb;
        int iZzB = zzB(zzkhVar, zzhgVar, z5, z4, zzwaVar);
        if (iZzB != -4) {
            return iZzB;
        }
        if (!zzhgVar.zzb()) {
            int i4 = i & 1;
            if ((i & 4) == 0) {
                if (i4 != 0) {
                    this.zza.zzd(zzhgVar, zzwaVar);
                    return -4;
                }
                this.zza.zzc(zzhgVar, zzwaVar);
            } else if (i4 != 0) {
                return -4;
            }
            this.zzs++;
        }
        return -4;
    }

    public final synchronized boolean zzn(int i) {
        zzA();
        int i4 = this.zzq;
        if (i >= i4 && i <= this.zzp + i4) {
            this.zzt = Long.MIN_VALUE;
            this.zzs = i - i4;
            return true;
        }
        return false;
    }

    public final synchronized boolean zzo(long j, boolean z4) throws Throwable {
        Throwable th2;
        zzwe zzweVar;
        long j6;
        int iZzK;
        try {
            try {
                zzA();
                int i = this.zzs;
                int iZzM = zzM(i);
                if (zzH() && j >= this.zzn[iZzM]) {
                    if (j > this.zzv) {
                        if (z4) {
                            z4 = true;
                        }
                    }
                    if (this.zzA) {
                        try {
                            int i4 = this.zzp - i;
                            int i6 = 0;
                            while (true) {
                                if (i6 < i4) {
                                    if (this.zzn[iZzM] >= j) {
                                        zzweVar = this;
                                        j6 = j;
                                        iZzK = i6;
                                        break;
                                    }
                                    iZzM++;
                                    if (iZzM == this.zzi) {
                                        iZzM = 0;
                                    }
                                    i6++;
                                } else if (z4) {
                                    j6 = j;
                                    iZzK = i4;
                                    zzweVar = this;
                                } else {
                                    zzweVar = this;
                                    j6 = j;
                                    iZzK = -1;
                                }
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    } else {
                        zzweVar = this;
                        j6 = j;
                        iZzK = zzweVar.zzK(iZzM, this.zzp - i, j6, true);
                    }
                    if (iZzK != -1) {
                        zzweVar.zzt = j6;
                        zzweVar.zzs += iZzK;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final synchronized int zzp(long j, boolean z4) {
        Throwable th2;
        try {
            try {
                int i = this.zzs;
                int iZzM = zzM(i);
                if (!zzH() || j < this.zzn[iZzM]) {
                    return 0;
                }
                if (j <= this.zzv || !z4) {
                    int iZzK = zzK(iZzM, this.zzp - i, j, true);
                    if (iZzK == -1) {
                        return 0;
                    }
                    return iZzK;
                }
                try {
                    return this.zzp - i;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th2 = th;
        throw th2;
    }

    public final synchronized void zzq(int i) {
        boolean z4 = false;
        if (i >= 0) {
            try {
                if (this.zzs + i <= this.zzp) {
                    z4 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzghc.zza(z4);
        this.zzs += i;
    }

    public final void zzr(long j, boolean z4, boolean z5) {
        this.zza.zze(zzD(j, false, z5));
    }

    public final void zzs() {
        this.zza.zze(zzE());
    }

    public final void zzt(@Nullable zzwd zzwdVar) {
        this.zzf = zzwdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzu(zzu zzuVar) {
        boolean zZzC = zzC(zzuVar);
        zzwd zzwdVar = this.zzf;
        if (zzwdVar == null || !zZzC) {
            return;
        }
        zzwdVar.zzy(zzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final int zzv(zzi zziVar, int i, boolean z4, int i4) throws IOException {
        return this.zza.zzg(zziVar, i, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzw(zzef zzefVar, int i, int i4) {
        this.zza.zzh(zzefVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzx(long j, int i, int i4, int i6, @Nullable zzaea zzaeaVar) {
        if (this.zzx) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.zzx = false;
            }
        }
        if (this.zzA) {
            if (j < this.zzt) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.zzB) {
                    zzds.zzc("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzz)));
                    this.zzB = true;
                }
                i |= 1;
            }
        }
        int i10 = i;
        zzG(j, i10, (this.zza.zzf() - ((long) i4)) - ((long) i6), i4, zzaeaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final /* synthetic */ int zzy(zzi zziVar, int i, boolean z4) {
        return AbstractC1172f.a(this, zziVar, i, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final /* synthetic */ void zzz(zzef zzefVar, int i) {
        AbstractC1172f.b(this, zzefVar, i);
    }
}
