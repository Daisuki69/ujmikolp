package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzhq implements zzll, zzln {
    private final int zzb;

    @Nullable
    private zzlo zzd;
    private int zze;
    private zzox zzf;
    private zzdb zzg;
    private int zzh;

    @Nullable
    private zzwf zzi;

    @Nullable
    private zzu[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;

    @Nullable
    private zzup zzq;

    @Nullable
    @GuardedBy("lock")
    private zzlm zzr;
    private final Object zza = new Object();
    private final zzkh zzc = new zzkh();
    private long zzm = Long.MIN_VALUE;
    private zzbe zzp = zzbe.zza;

    public zzhq(int i) {
        this.zzb = i;
    }

    private final void zzab(long j, boolean z4) throws zzhz {
        this.zzn = false;
        this.zzl = j;
        this.zzm = j;
        zzA(j, z4);
    }

    public void zzA(long j, boolean z4) throws zzhz {
        throw null;
    }

    public void zzB() throws zzhz {
    }

    public void zzC() {
    }

    public void zzD() {
        throw null;
    }

    public void zzE() {
    }

    public void zzF() {
    }

    public final long zzG() {
        return this.zzl;
    }

    public final zzkh zzH() {
        zzkh zzkhVar = this.zzc;
        zzkhVar.zza = null;
        zzkhVar.zzb = null;
        return zzkhVar;
    }

    public final zzu[] zzI() {
        zzu[] zzuVarArr = this.zzj;
        zzuVarArr.getClass();
        return zzuVarArr;
    }

    public final zzlo zzJ() {
        zzlo zzloVar = this.zzd;
        zzloVar.getClass();
        return zzloVar;
    }

    public final zzox zzK() {
        zzox zzoxVar = this.zzf;
        zzoxVar.getClass();
        return zzoxVar;
    }

    public final zzdb zzL() {
        zzdb zzdbVar = this.zzg;
        zzdbVar.getClass();
        return zzdbVar;
    }

    public final zzbe zzM() {
        return this.zzp;
    }

    public final zzhz zzN(Throwable th2, @Nullable zzu zzuVar, boolean z4, int i) {
        int iZzaa = 4;
        if (zzuVar != null && !this.zzo) {
            this.zzo = true;
            try {
                iZzaa = zzaa(zzuVar) & 7;
            } catch (zzhz unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zzhz.zzb(th2, zzS(), this.zze, zzuVar, iZzaa, this.zzq, z4, i);
    }

    public final int zzO(zzkh zzkhVar, zzhg zzhgVar, int i) {
        zzwf zzwfVar = this.zzi;
        zzwfVar.getClass();
        int iZzd = zzwfVar.zzd(zzkhVar, zzhgVar, i);
        if (iZzd == -4) {
            if (zzhgVar.zzb()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j = zzhgVar.zze + this.zzk;
            zzhgVar.zze = j;
            this.zzm = Math.max(this.zzm, j);
            return iZzd;
        }
        if (iZzd == -5) {
            zzu zzuVar = zzkhVar.zzb;
            zzuVar.getClass();
            long j6 = zzuVar.zzt;
            if (j6 != Long.MAX_VALUE) {
                zzs zzsVarZza = zzuVar.zza();
                zzsVarZza.zzr(j6 + this.zzk);
                zzkhVar.zzb = zzsVarZza.zzM();
                return -5;
            }
        }
        return iZzd;
    }

    public final int zzP(long j) {
        zzwf zzwfVar = this.zzi;
        zzwfVar.getClass();
        return zzwfVar.zze(j - this.zzk);
    }

    public final boolean zzQ() {
        if (zzdb()) {
            return this.zzn;
        }
        zzwf zzwfVar = this.zzi;
        zzwfVar.getClass();
        return zzwfVar.zzb();
    }

    public final void zzR() {
        zzlm zzlmVar;
        synchronized (this.zza) {
            zzlmVar = this.zzr;
        }
        if (zzlmVar != null) {
            zzlmVar.zza(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public /* synthetic */ long zzT(long j, long j6) {
        return F.a(this, j, j6);
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public /* synthetic */ void zzU(float f, float f3) {
        F.b(this, f, f3);
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public /* synthetic */ void zzV() {
        F.c(this);
    }

    @Override // com.google.android.gms.internal.ads.zzll, com.google.android.gms.internal.ads.zzln
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final zzln zzb() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzc(int i, zzox zzoxVar, zzdb zzdbVar) {
        this.zze = i;
        this.zzf = zzoxVar;
        this.zzg = zzdbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzcY() throws zzhz {
        zzghc.zzh(this.zzh == 1);
        this.zzh = 2;
        zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzcZ(zzu[] zzuVarArr, zzwf zzwfVar, long j, long j6, zzup zzupVar) throws zzhz {
        zzghc.zzh(!this.zzn);
        this.zzi = zzwfVar;
        this.zzq = zzupVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j;
        }
        this.zzj = zzuVarArr;
        this.zzk = j6;
        zzz(zzuVarArr, j, j6, zzupVar);
    }

    @Override // com.google.android.gms.internal.ads.zzll
    @Nullable
    public zzkm zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    @Nullable
    public final zzwf zzda() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final boolean zzdb() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final int zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzf(zzlo zzloVar, zzu[] zzuVarArr, zzwf zzwfVar, long j, boolean z4, boolean z5, long j6, long j7, zzup zzupVar) throws zzhz {
        zzghc.zzh(this.zzh == 0);
        this.zzd = zzloVar;
        this.zzq = zzupVar;
        this.zzh = 1;
        zzy(z4, z5);
        zzcZ(zzuVarArr, zzwfVar, j6, j7, zzupVar);
        zzab(j6, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final long zzk() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzl() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final boolean zzm() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzn() throws IOException {
        zzwf zzwfVar = this.zzi;
        zzwfVar.getClass();
        zzwfVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzo(zzbe zzbeVar) {
        if (Objects.equals(this.zzp, zzbeVar)) {
            return;
        }
        this.zzp = zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzp(long j) throws zzhz {
        zzab(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzq() {
        zzghc.zzh(this.zzh == 2);
        this.zzh = 1;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzr() {
        zzghc.zzh(this.zzh == 1);
        zzkh zzkhVar = this.zzc;
        zzkhVar.zza = null;
        zzkhVar.zzb = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzD();
        this.zzq = null;
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzs() {
        zzghc.zzh(this.zzh == 0);
        zzkh zzkhVar = this.zzc;
        zzkhVar.zza = null;
        zzkhVar.zzb = null;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zzt() {
        zzghc.zzh(this.zzh == 0);
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public int zzu() throws zzhz {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzv(zzlm zzlmVar) {
        synchronized (this.zza) {
            this.zzr = zzlmVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzw() {
        synchronized (this.zza) {
            this.zzr = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public void zzx(int i, @Nullable Object obj) throws zzhz {
    }

    public void zzy(boolean z4, boolean z5) throws zzhz {
    }

    public void zzz(zzu[] zzuVarArr, long j, long j6, zzup zzupVar) throws zzhz {
    }
}
