package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzlp {
    private final zzll zza;
    private final int zzb;

    @Nullable
    private final zzll zzc;
    private int zzd = 0;
    private boolean zze = false;
    private boolean zzf = false;

    public zzlp(zzll zzllVar, @Nullable zzll zzllVar2, int i) {
        this.zza = zzllVar;
        this.zzb = i;
        this.zzc = zzllVar2;
    }

    private final boolean zzM() {
        int i = this.zzd;
        return i == 2 || i == 4;
    }

    private final boolean zzN() {
        return this.zzd == 3;
    }

    private final boolean zzO(zzkn zzknVar, @Nullable zzll zzllVar) {
        if (zzllVar == null) {
            return true;
        }
        zzwf[] zzwfVarArr = zzknVar.zzc;
        int i = this.zzb;
        zzwf zzwfVar = zzwfVarArr[i];
        if (zzllVar.zzda() != null) {
            if (zzllVar.zzda() == zzwfVar) {
                if (zzwfVar != null && !zzllVar.zzdb()) {
                    zzknVar.zzp();
                    boolean z4 = zzknVar.zzg.zzg;
                }
            }
            zzkn zzknVarZzp = zzknVar.zzp();
            return zzknVarZzp != null && zzknVarZzp.zzc[i] == zzllVar.zzda();
        }
        return true;
    }

    private final void zzP(boolean z4) throws zzhz {
        if (z4) {
            zzll zzllVar = this.zzc;
            zzllVar.getClass();
            zzllVar.zzx(17, this.zza);
        } else {
            zzll zzllVar2 = this.zza;
            zzll zzllVar3 = this.zzc;
            zzllVar3.getClass();
            zzllVar2.zzx(17, zzllVar3);
        }
    }

    private final void zzQ(zzll zzllVar, zzwf zzwfVar, zzhx zzhxVar, long j, boolean z4) throws zzhz {
        if (zzV(zzllVar)) {
            if (zzwfVar != zzllVar.zzda()) {
                zzR(zzllVar, zzhxVar);
            } else if (z4) {
                zzllVar.zzp(j);
            }
        }
    }

    private final void zzR(zzll zzllVar, zzhx zzhxVar) {
        boolean z4 = true;
        if (this.zza != zzllVar && this.zzc != zzllVar) {
            z4 = false;
        }
        zzghc.zzh(z4);
        if (zzV(zzllVar)) {
            zzhxVar.zze(zzllVar);
            zzX(zzllVar);
            zzllVar.zzr();
        }
    }

    private final void zzS(boolean z4) {
        if (z4) {
            if (this.zze) {
                this.zza.zzs();
                this.zze = false;
                return;
            }
            return;
        }
        if (this.zzf) {
            zzll zzllVar = this.zzc;
            zzllVar.getClass();
            zzllVar.zzs();
            this.zzf = false;
        }
    }

    private final int zzT(@Nullable zzll zzllVar, zzkn zzknVar, zzyn zzynVar, zzhx zzhxVar) throws zzhz {
        if (zzllVar != null && zzV(zzllVar)) {
            zzll zzllVar2 = this.zza;
            boolean z4 = zzllVar != zzllVar2;
            if ((zzllVar != zzllVar2 || !zzM()) && (zzllVar != this.zzc || !zzN())) {
                zzwf zzwfVarZzda = zzllVar.zzda();
                zzwf[] zzwfVarArr = zzknVar.zzc;
                int i = this.zzb;
                zzwf zzwfVar = zzwfVarArr[i];
                boolean zZza = zzynVar.zza(i);
                if (zZza && zzwfVarZzda == zzwfVar) {
                    return 1;
                }
                if (!zzllVar.zzm()) {
                    zzu[] zzuVarArrZzU = zzU(zzynVar.zzc[i]);
                    zzwf zzwfVar2 = zzwfVarArr[i];
                    zzwfVar2.getClass();
                    zzllVar.zzcZ(zzuVarArrZzU, zzwfVar2, zzknVar.zzc(), zzknVar.zza(), zzknVar.zzg.zza);
                    return 3;
                }
                if (!zzllVar.zzY()) {
                    return 0;
                }
                zzR(zzllVar, zzhxVar);
                if (!zZza || zzc()) {
                    zzS(!z4);
                }
                return 1;
            }
        }
        return 1;
    }

    private static zzu[] zzU(@Nullable zzyf zzyfVar) {
        int iZze = zzyfVar != null ? zzyfVar.zze() : 0;
        zzu[] zzuVarArr = new zzu[iZze];
        for (int i = 0; i < iZze; i++) {
            zzyfVar.getClass();
            zzuVarArr[i] = zzyfVar.zzb(i);
        }
        return zzuVarArr;
    }

    private static boolean zzV(zzll zzllVar) {
        return zzllVar.zze() != 0;
    }

    @Nullable
    private final zzll zzW(@Nullable zzkn zzknVar) {
        if (zzknVar != null) {
            int i = this.zzb;
            zzwf[] zzwfVarArr = zzknVar.zzc;
            if (zzwfVarArr[i] != null) {
                zzll zzllVar = this.zza;
                zzwf zzwfVarZzda = zzllVar.zzda();
                zzwf zzwfVar = zzwfVarArr[i];
                if (zzwfVarZzda == zzwfVar) {
                    return zzllVar;
                }
                zzll zzllVar2 = this.zzc;
                if (zzllVar2 != null && zzllVar2.zzda() == zzwfVar) {
                    return zzllVar2;
                }
            }
        }
        return null;
    }

    private static final void zzX(zzll zzllVar) {
        if (zzllVar.zze() == 2) {
            zzllVar.zzq();
        }
    }

    private static final void zzY(zzll zzllVar, long j) {
        zzllVar.zzl();
        if (zzllVar instanceof zzwu) {
            throw null;
        }
    }

    public final void zzA(zzhx zzhxVar) throws zzhz {
        zzR(this.zza, zzhxVar);
        zzll zzllVar = this.zzc;
        if (zzllVar != null) {
            boolean z4 = zzV(zzllVar) && this.zzd != 3;
            zzR(zzllVar, zzhxVar);
            zzS(false);
            if (z4) {
                zzP(true);
            }
        }
        this.zzd = 0;
    }

    public final void zzB() throws zzhz {
        int i = this.zzd;
        if (i == 3 || i == 4) {
            zzP(i == 4);
            this.zzd = this.zzd != 4 ? 1 : 0;
        } else if (i == 2) {
            this.zzd = 0;
        }
    }

    public final void zzC(zzhx zzhxVar) {
        boolean z4;
        zzll zzllVar;
        if (zzc()) {
            int i = this.zzd;
            if (i == 4) {
                z4 = true;
            } else if (i == 2) {
                i = 2;
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                zzllVar = this.zza;
            } else {
                zzllVar = this.zzc;
                zzllVar.getClass();
            }
            zzR(zzllVar, zzhxVar);
            zzS(z4);
            this.zzd = i == 4 ? 1 : 0;
        }
    }

    public final void zzD(zzwf zzwfVar, zzhx zzhxVar, long j, boolean z4) throws zzhz {
        zzQ(this.zza, zzwfVar, zzhxVar, j, z4);
        zzll zzllVar = this.zzc;
        if (zzllVar != null) {
            zzQ(zzllVar, zzwfVar, zzhxVar, j, z4);
        }
    }

    public final void zzE(zzkn zzknVar, long j) throws zzhz {
        zzll zzllVarZzW = zzW(zzknVar);
        if (zzllVarZzW != null) {
            zzllVarZzW.zzp(j);
        }
    }

    public final void zzF() {
        if (!zzV(this.zza)) {
            zzS(true);
        }
        zzll zzllVar = this.zzc;
        if (zzllVar == null || zzV(zzllVar)) {
            return;
        }
        zzS(false);
    }

    public final int zzG(zzkn zzknVar, zzyn zzynVar, zzhx zzhxVar) throws zzhz {
        int iZzT = zzT(this.zza, zzknVar, zzynVar, zzhxVar);
        return iZzT == 1 ? zzT(this.zzc, zzknVar, zzynVar, zzhxVar) : iZzT;
    }

    public final void zzH() {
        this.zza.zzt();
        this.zze = false;
        zzll zzllVar = this.zzc;
        if (zzllVar != null) {
            zzllVar.zzt();
            this.zzf = false;
        }
    }

    public final void zzI(@Nullable Object obj) throws zzhz {
        if (zze() != 2) {
            return;
        }
        int i = this.zzd;
        if (i != 4 && i != 1) {
            this.zza.zzx(1, obj);
            return;
        }
        zzll zzllVar = this.zzc;
        zzllVar.getClass();
        zzllVar.zzx(1, obj);
    }

    public final void zzJ(zzaar zzaarVar) throws zzhz {
        if (zze() != 2) {
            zze();
            return;
        }
        this.zza.zzx(7, zzaarVar);
        zzll zzllVar = this.zzc;
        if (zzllVar != null) {
            zzllVar.zzx(7, zzaarVar);
        }
    }

    public final void zzK(float f) throws zzhz {
        if (zze() != 1) {
            return;
        }
        zzll zzllVar = this.zza;
        Float fValueOf = Float.valueOf(f);
        zzllVar.zzx(2, fValueOf);
        zzll zzllVar2 = this.zzc;
        if (zzllVar2 != null) {
            zzllVar2.zzx(2, fValueOf);
        }
    }

    public final boolean zzL() {
        int i = this.zzd;
        if (i == 0 || i == 2 || i == 4) {
            return zzV(this.zza);
        }
        zzll zzllVar = this.zzc;
        zzllVar.getClass();
        return zzV(zzllVar);
    }

    public final boolean zza() {
        return this.zzc != null;
    }

    public final void zzb() {
        int i;
        zzghc.zzh(!zzc());
        if (zzV(this.zza)) {
            i = 3;
        } else {
            zzll zzllVar = this.zzc;
            i = (zzllVar == null || !zzV(zzllVar)) ? 2 : 4;
        }
        this.zzd = i;
    }

    public final boolean zzc() {
        return zzM() || zzN();
    }

    public final int zzd() {
        zzll zzllVar = this.zzc;
        boolean zZzV = zzV(this.zza);
        int i = 0;
        if (zzllVar != null && zzV(zzllVar)) {
            i = 1;
        }
        return (zZzV ? 1 : 0) + i;
    }

    public final int zze() {
        return this.zza.zza();
    }

    public final long zzf(@Nullable zzkn zzknVar) {
        zzll zzllVarZzW = zzW(zzknVar);
        Objects.requireNonNull(zzllVarZzW);
        return zzllVarZzW.zzk();
    }

    public final boolean zzg(zzkn zzknVar) {
        zzll zzllVarZzW = zzW(zzknVar);
        zzllVarZzW.getClass();
        return zzllVarZzW.zzdb();
    }

    public final void zzh(zzkn zzknVar, long j) {
        zzll zzllVarZzW = zzW(zzknVar);
        zzllVarZzW.getClass();
        zzY(zzllVarZzW, j);
    }

    public final void zzi(zzyn zzynVar, zzyn zzynVar2, long j) {
        int i;
        int i4 = this.zzb;
        boolean zZza = zzynVar.zza(i4);
        boolean zZza2 = zzynVar2.zza(i4);
        zzll zzllVar = this.zzc;
        if (zzllVar == null || (i = this.zzd) == 3 || (i == 0 && zzV(this.zza))) {
            zzllVar = this.zza;
        }
        if (!zZza || zzllVar.zzm()) {
            return;
        }
        zze();
        zzlo zzloVar = zzynVar.zzb[i4];
        zzlo zzloVar2 = zzynVar2.zzb[i4];
        if (zZza2 && Objects.equals(zzloVar2, zzloVar) && !zzc()) {
            return;
        }
        zzY(zzllVar, j);
    }

    public final void zzj(long j) {
        int i;
        zzll zzllVar = this.zza;
        if (zzV(zzllVar) && (i = this.zzd) != 4 && i != 2) {
            zzY(zzllVar, j);
        }
        zzll zzllVar2 = this.zzc;
        if (zzllVar2 == null || !zzV(zzllVar2) || this.zzd == 3) {
            return;
        }
        zzY(zzllVar2, j);
    }

    public final long zzk(long j, long j6) {
        zzll zzllVar = this.zza;
        long jZzT = zzV(zzllVar) ? zzllVar.zzT(j, j6) : Long.MAX_VALUE;
        zzll zzllVar2 = this.zzc;
        return (zzllVar2 == null || !zzV(zzllVar2)) ? jZzT : Math.min(jZzT, zzllVar2.zzT(j, j6));
    }

    public final void zzl() {
        zzll zzllVar = this.zza;
        if (zzV(zzllVar)) {
            zzllVar.zzV();
            return;
        }
        zzll zzllVar2 = this.zzc;
        if (zzllVar2 == null || !zzV(zzllVar2)) {
            return;
        }
        zzllVar2.zzV();
    }

    public final void zzm(float f, float f3) throws zzhz {
        this.zza.zzU(f, f3);
        zzll zzllVar = this.zzc;
        if (zzllVar != null) {
            zzllVar.zzU(f, f3);
        }
    }

    public final void zzn(zzbe zzbeVar) {
        this.zza.zzo(zzbeVar);
        zzll zzllVar = this.zzc;
        if (zzllVar != null) {
            zzllVar.zzo(zzbeVar);
        }
    }

    public final boolean zzo() {
        zzll zzllVar = this.zza;
        boolean zZzY = zzV(zzllVar) ? zzllVar.zzY() : true;
        zzll zzllVar2 = this.zzc;
        return (zzllVar2 == null || !zzV(zzllVar2)) ? zZzY : zZzY & zzllVar2.zzY();
    }

    public final boolean zzp(@Nullable zzkn zzknVar) {
        return zzW(zzknVar) != null;
    }

    public final boolean zzq(zzkn zzknVar) {
        return (zzM() && zzW(zzknVar) == this.zza) || (zzN() && zzW(zzknVar) == this.zzc);
    }

    public final boolean zzr(zzkn zzknVar) {
        return zzO(zzknVar, this.zza) && zzO(zzknVar, this.zzc);
    }

    public final void zzs(long j, long j6) throws zzhz {
        zzll zzllVar = this.zza;
        if (zzV(zzllVar)) {
            zzllVar.zzW(j, j6);
        }
        zzll zzllVar2 = this.zzc;
        if (zzllVar2 == null || !zzV(zzllVar2)) {
            return;
        }
        zzllVar2.zzW(j, j6);
    }

    public final boolean zzt(zzkn zzknVar) {
        zzll zzllVarZzW = zzW(zzknVar);
        return zzllVarZzW == null || zzllVarZzW.zzdb() || zzllVarZzW.zzX() || zzllVarZzW.zzY();
    }

    public final void zzu(zzkn zzknVar) throws IOException {
        zzll zzllVarZzW = zzW(zzknVar);
        zzllVarZzW.getClass();
        zzllVarZzW.zzn();
    }

    public final void zzv() throws zzhz {
        zzll zzllVar = this.zza;
        if (zzllVar.zze() == 1 && this.zzd != 4) {
            zzllVar.zzcY();
            return;
        }
        zzll zzllVar2 = this.zzc;
        if (zzllVar2 == null || zzllVar2.zze() != 1 || this.zzd == 3) {
            return;
        }
        zzllVar2.zzcY();
    }

    public final void zzw() {
        zzll zzllVar = this.zza;
        if (zzV(zzllVar)) {
            zzX(zzllVar);
        }
        zzll zzllVar2 = this.zzc;
        if (zzllVar2 == null || !zzV(zzllVar2)) {
            return;
        }
        zzX(zzllVar2);
    }

    public final void zzx(zzlo zzloVar, zzyf zzyfVar, zzwf zzwfVar, long j, boolean z4, boolean z5, long j6, long j7, zzup zzupVar, zzhx zzhxVar) throws zzhz {
        zzu[] zzuVarArrZzU = zzU(zzyfVar);
        int i = this.zzd;
        if (i == 0 || i == 2 || i == 4) {
            this.zze = true;
            zzll zzllVar = this.zza;
            zzllVar.zzf(zzloVar, zzuVarArrZzU, zzwfVar, j, z4, z5, j6, j7, zzupVar);
            zzhxVar.zzd(zzllVar);
            return;
        }
        this.zzf = true;
        zzll zzllVar2 = this.zzc;
        zzllVar2.getClass();
        zzllVar2.zzf(zzloVar, zzuVarArrZzU, zzwfVar, j, z4, z5, j6, j7, zzupVar);
        zzhxVar.zzd(zzllVar2);
    }

    public final void zzy(int i, @Nullable Object obj, zzkn zzknVar) throws zzhz {
        zzll zzllVarZzW = zzW(zzknVar);
        zzllVarZzW.getClass();
        zzllVarZzW.zzx(11, obj);
    }

    public final void zzz(@Nullable zzls zzlsVar) throws zzhz {
        this.zza.zzx(18, zzlsVar);
        zzll zzllVar = this.zzc;
        if (zzllVar != null) {
            zzllVar.zzx(18, zzlsVar);
        }
    }
}
