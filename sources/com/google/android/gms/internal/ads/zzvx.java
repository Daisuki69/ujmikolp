package com.google.android.gms.internal.ads;

import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzvx extends zzto implements zzvl {
    private final zzfz zza;
    private final zzvh zzb;
    private final zzru zzc;
    private final int zzd;
    private boolean zze = true;
    private long zzf = androidx.media3.common.C.TIME_UNSET;
    private boolean zzg;
    private boolean zzh;

    @Nullable
    private zzgy zzi;

    @GuardedBy("this")
    private zzaj zzj;
    private final zzyy zzk;

    public /* synthetic */ zzvx(zzaj zzajVar, zzfz zzfzVar, zzvh zzvhVar, zzru zzruVar, zzyy zzyyVar, int i, int i4, zzu zzuVar, zzght zzghtVar, byte[] bArr) {
        this.zzj = zzajVar;
        this.zza = zzfzVar;
        this.zzb = zzvhVar;
        this.zzc = zzruVar;
        this.zzk = zzyyVar;
        this.zzd = i;
    }

    private final void zzu() {
        long j = this.zzf;
        boolean z4 = this.zzg;
        boolean z5 = this.zzh;
        zzaj zzajVarZzJ = zzJ();
        zzbe zzwjVar = new zzwj(androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, j, j, 0L, 0L, z4, false, false, null, zzajVarZzJ, z5 ? zzajVarZzJ.zzc : null);
        if (this.zze) {
            zzwjVar = new zzvu(this, zzwjVar);
        }
        zze(zzwjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zzur
    public final synchronized void zzA(zzaj zzajVar) {
        this.zzj = zzajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzC(zzun zzunVar) {
        ((zzvt) zzunVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final zzun zzG(zzup zzupVar, zzyv zzyvVar, long j) {
        zzga zzgaVarZza = this.zza.zza();
        zzgy zzgyVar = this.zzi;
        if (zzgyVar != null) {
            zzgaVarZza.zze(zzgyVar);
        }
        zzaf zzafVar = zzJ().zzb;
        zzafVar.getClass();
        return new zzvt(zzafVar.zza, zzgaVarZza, this.zzb.zza(zzk()), this.zzc, zzh(zzupVar), this.zzk, zzf(zzupVar), this, zzyvVar, null, this.zzd, 0, null, zzeo.zzq(androidx.media3.common.C.TIME_UNSET), null);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final synchronized zzaj zzJ() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    public final void zza(@Nullable zzgy zzgyVar) {
        this.zzi = zzgyVar;
        Looper.myLooper().getClass();
        zzk();
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzb(long j, zzadv zzadvVar, boolean z4) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            j = this.zzf;
        }
        boolean zZzb = zzadvVar.zzb();
        if (!this.zze && this.zzf == j && this.zzg == zZzb && this.zzh == z4) {
            return;
        }
        this.zzf = j;
        this.zzg = zZzb;
        this.zzh = z4;
        this.zze = false;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzto
    public final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzt() {
    }
}
