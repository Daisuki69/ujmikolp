package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzol {
    final /* synthetic */ zzom zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzup zze;
    private boolean zzf;
    private boolean zzg;

    public zzol(zzom zzomVar, String str, @Nullable int i, zzup zzupVar) {
        Objects.requireNonNull(zzomVar);
        this.zza = zzomVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzupVar == null ? -1L : zzupVar.zzd;
        if (zzupVar == null || !zzupVar.zzb()) {
            return;
        }
        this.zze = zzupVar;
    }

    public final boolean zza(zzbe zzbeVar, zzbe zzbeVar2) {
        int i = this.zzc;
        if (i < zzbeVar.zza()) {
            zzom zzomVar = this.zza;
            zzbeVar.zzb(i, zzomVar.zzj(), 0L);
            for (int i4 = zzomVar.zzj().zzn; i4 <= zzomVar.zzj().zzo; i4++) {
                int iZze = zzbeVar2.zze(zzbeVar.zzf(i4));
                if (iZze != -1) {
                    i = zzbeVar2.zzd(iZze, zzomVar.zzk(), false).zzc;
                    break;
                }
            }
            i = -1;
        } else if (i >= zzbeVar2.zza()) {
            i = -1;
        }
        this.zzc = i;
        if (i == -1) {
            return false;
        }
        zzup zzupVar = this.zze;
        return zzupVar == null || zzbeVar2.zze(zzupVar.zza) != -1;
    }

    public final boolean zzb(int i, @Nullable zzup zzupVar) {
        if (zzupVar == null) {
            return i == this.zzc;
        }
        zzup zzupVar2 = this.zze;
        return zzupVar2 == null ? !zzupVar.zzb() && zzupVar.zzd == this.zzd : zzupVar.zzd == zzupVar2.zzd && zzupVar.zzb == zzupVar2.zzb && zzupVar.zzc == zzupVar2.zzc;
    }

    public final void zzc(int i, @Nullable zzup zzupVar) {
        if (this.zzd == -1 && i == this.zzc && zzupVar != null) {
            zzom zzomVar = this.zza;
            long j = zzupVar.zzd;
            if (j >= zzomVar.zzi()) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzd(zzme zzmeVar) {
        zzup zzupVar = zzmeVar.zzd;
        if (zzupVar == null) {
            return this.zzc != zzmeVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        long j6 = zzupVar.zzd;
        if (j6 > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbe zzbeVar = zzmeVar.zzb;
        int iZze = zzbeVar.zze(zzupVar.zza);
        int iZze2 = zzbeVar.zze(this.zze.zza);
        zzup zzupVar2 = this.zze;
        if (j6 < zzupVar2.zzd || iZze < iZze2) {
            return false;
        }
        if (iZze > iZze2) {
            return true;
        }
        if (!zzupVar.zzb()) {
            int i = zzupVar.zze;
            return i == -1 || i > zzupVar2.zzb;
        }
        int i4 = zzupVar.zzb;
        int i6 = zzupVar.zzc;
        int i10 = zzupVar2.zzb;
        if (i4 <= i10) {
            return i4 == i10 && i6 > zzupVar2.zzc;
        }
        return true;
    }

    public final /* synthetic */ String zze() {
        return this.zzb;
    }

    public final /* synthetic */ int zzf() {
        return this.zzc;
    }

    public final /* synthetic */ long zzg() {
        return this.zzd;
    }

    public final /* synthetic */ zzup zzh() {
        return this.zze;
    }

    public final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    public final /* synthetic */ void zzj(boolean z4) {
        this.zzf = true;
    }

    public final /* synthetic */ boolean zzk() {
        return this.zzg;
    }

    public final /* synthetic */ void zzl(boolean z4) {
        this.zzg = true;
    }
}
