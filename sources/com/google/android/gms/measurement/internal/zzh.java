package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzh {

    @Nullable
    private Long zzA;
    private long zzB;

    @Nullable
    private String zzC;
    private int zzD;
    private int zzE;
    private long zzF;
    private String zzG;

    @Nullable
    private byte[] zzH;
    private int zzI;
    private long zzJ;
    private long zzK;
    private long zzL;
    private long zzM;
    private long zzN;
    private long zzO;

    @Nullable
    private String zzP;
    private boolean zzQ;
    private long zzR;
    private long zzS;
    private final zzic zza;
    private final String zzb;

    @Nullable
    private String zzc;

    @Nullable
    private String zzd;

    @Nullable
    private String zze;

    @Nullable
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    @Nullable
    private String zzj;
    private long zzk;

    @Nullable
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;

    @Nullable
    private Boolean zzq;
    private long zzr;

    @Nullable
    private List zzs;

    @Nullable
    private String zzt;
    private boolean zzu;
    private long zzv;
    private long zzw;
    private int zzx;
    private boolean zzy;

    @Nullable
    private Long zzz;

    @WorkerThread
    public zzh(zzic zzicVar, String str) {
        Preconditions.checkNotNull(zzicVar);
        Preconditions.checkNotEmpty(str);
        this.zza = zzicVar;
        this.zzb = str;
        zzicVar.zzaW().zzg();
    }

    @WorkerThread
    public final void zzA(long j) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzn != j;
        this.zzn = j;
    }

    @WorkerThread
    public final long zzB() {
        this.zza.zzaW().zzg();
        return this.zzr;
    }

    @WorkerThread
    public final void zzC(long j) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzr != j;
        this.zzr = j;
    }

    @WorkerThread
    public final boolean zzD() {
        this.zza.zzaW().zzg();
        return this.zzo;
    }

    @WorkerThread
    public final void zzE(boolean z4) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzo != z4;
        this.zzo = z4;
    }

    @WorkerThread
    public final void zzF(long j) {
        Preconditions.checkArgument(j >= 0);
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzg != j;
        this.zzg = j;
    }

    @WorkerThread
    public final long zzG() {
        this.zza.zzaW().zzg();
        return this.zzg;
    }

    @WorkerThread
    public final long zzH() {
        this.zza.zzaW().zzg();
        return this.zzR;
    }

    @WorkerThread
    public final void zzI(long j) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzR != j;
        this.zzR = j;
    }

    @WorkerThread
    public final long zzJ() {
        this.zza.zzaW().zzg();
        return this.zzS;
    }

    @WorkerThread
    public final void zzK(long j) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzS != j;
        this.zzS = j;
    }

    @WorkerThread
    public final void zzL() {
        zzic zzicVar = this.zza;
        zzicVar.zzaW().zzg();
        long j = this.zzg + 1;
        if (j > 2147483647L) {
            zzicVar.zzaV().zze().zzb("Bundle index overflow. appId", zzgu.zzl(this.zzb));
            j = 0;
        }
        this.zzQ = true;
        this.zzg = j;
    }

    @WorkerThread
    public final void zzM(long j) {
        zzic zzicVar = this.zza;
        zzicVar.zzaW().zzg();
        long j6 = this.zzg + j;
        if (j6 > 2147483647L) {
            zzicVar.zzaV().zze().zzb("Bundle index overflow. appId", zzgu.zzl(this.zzb));
            j6 = (-1) + j;
        }
        long j7 = this.zzF + 1;
        if (j7 > 2147483647L) {
            zzicVar.zzaV().zze().zzb("Delivery index overflow. appId", zzgu.zzl(this.zzb));
            j7 = 0;
        }
        this.zzQ = true;
        this.zzg = j6;
        this.zzF = j7;
    }

    @WorkerThread
    public final long zzN() {
        this.zza.zzaW().zzg();
        return this.zzJ;
    }

    @WorkerThread
    public final void zzO(long j) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzJ != j;
        this.zzJ = j;
    }

    @WorkerThread
    public final long zzP() {
        this.zza.zzaW().zzg();
        return this.zzK;
    }

    @WorkerThread
    public final void zzQ(long j) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzK != j;
        this.zzK = j;
    }

    @WorkerThread
    public final long zzR() {
        this.zza.zzaW().zzg();
        return this.zzL;
    }

    @WorkerThread
    public final void zzS(long j) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzL != j;
        this.zzL = j;
    }

    @WorkerThread
    public final long zzT() {
        this.zza.zzaW().zzg();
        return this.zzM;
    }

    @WorkerThread
    public final void zzU(long j) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzM != j;
        this.zzM = j;
    }

    @WorkerThread
    public final long zzV() {
        this.zza.zzaW().zzg();
        return this.zzO;
    }

    @WorkerThread
    public final void zzW(long j) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzO != j;
        this.zzO = j;
    }

    @WorkerThread
    public final long zzX() {
        this.zza.zzaW().zzg();
        return this.zzN;
    }

    @WorkerThread
    public final void zzY(long j) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzN != j;
        this.zzN = j;
    }

    @Nullable
    @WorkerThread
    public final String zzZ() {
        this.zza.zzaW().zzg();
        return this.zzP;
    }

    @WorkerThread
    public final boolean zza() {
        this.zza.zzaW().zzg();
        return this.zzQ;
    }

    @WorkerThread
    public final int zzaA() {
        this.zza.zzaW().zzg();
        return this.zzD;
    }

    @WorkerThread
    public final void zzaB(int i) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzD != i;
        this.zzD = i;
    }

    @WorkerThread
    public final int zzaC() {
        this.zza.zzaW().zzg();
        return this.zzE;
    }

    @WorkerThread
    public final void zzaD(int i) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzE != i;
        this.zzE = i;
    }

    @WorkerThread
    public final void zzaE(long j) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzF != j;
        this.zzF = j;
    }

    @WorkerThread
    public final long zzaF() {
        this.zza.zzaW().zzg();
        return this.zzF;
    }

    @WorkerThread
    public final void zzaG(String str) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzG != str;
        this.zzG = str;
    }

    @WorkerThread
    public final String zzaH() {
        this.zza.zzaW().zzg();
        return this.zzG;
    }

    @WorkerThread
    public final void zzaI(@Nullable byte[] bArr) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzH != bArr;
        this.zzH = bArr;
    }

    @Nullable
    @WorkerThread
    public final byte[] zzaJ() {
        this.zza.zzaW().zzg();
        return this.zzH;
    }

    @WorkerThread
    public final void zzaK(int i) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzI != i;
        this.zzI = i;
    }

    @WorkerThread
    public final int zzaL() {
        this.zza.zzaW().zzg();
        return this.zzI;
    }

    @Nullable
    @WorkerThread
    public final String zzaa() {
        this.zza.zzaW().zzg();
        String str = this.zzP;
        zzab(null);
        return str;
    }

    @WorkerThread
    public final void zzab(@Nullable String str) {
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzP, str);
        this.zzP = str;
    }

    @WorkerThread
    public final boolean zzac() {
        this.zza.zzaW().zzg();
        return this.zzp;
    }

    @WorkerThread
    public final void zzad(boolean z4) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzp != z4;
        this.zzp = z4;
    }

    @Nullable
    @WorkerThread
    public final Boolean zzae() {
        this.zza.zzaW().zzg();
        return this.zzq;
    }

    @WorkerThread
    public final void zzaf(@Nullable Boolean bool) {
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzq, bool);
        this.zzq = bool;
    }

    @Nullable
    @WorkerThread
    public final List zzag() {
        this.zza.zzaW().zzg();
        return this.zzs;
    }

    @WorkerThread
    public final void zzah(@Nullable List list) {
        this.zza.zzaW().zzg();
        if (Objects.equals(this.zzs, list)) {
            return;
        }
        this.zzQ = true;
        this.zzs = list != null ? new ArrayList(list) : null;
    }

    @WorkerThread
    public final boolean zzai() {
        this.zza.zzaW().zzg();
        return this.zzu;
    }

    @WorkerThread
    public final void zzaj(boolean z4) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzu != z4;
        this.zzu = z4;
    }

    @WorkerThread
    public final long zzak() {
        this.zza.zzaW().zzg();
        return this.zzv;
    }

    @WorkerThread
    public final void zzal(long j) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzv != j;
        this.zzv = j;
    }

    @WorkerThread
    public final long zzam() {
        this.zza.zzaW().zzg();
        return this.zzw;
    }

    @WorkerThread
    public final void zzan(long j) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzw != j;
        this.zzw = j;
    }

    @WorkerThread
    public final int zzao() {
        this.zza.zzaW().zzg();
        return this.zzx;
    }

    @WorkerThread
    public final void zzap(int i) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzx != i;
        this.zzx = i;
    }

    @WorkerThread
    public final boolean zzaq() {
        this.zza.zzaW().zzg();
        return this.zzy;
    }

    @WorkerThread
    public final void zzar(boolean z4) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzy != z4;
        this.zzy = z4;
    }

    @Nullable
    @WorkerThread
    public final Long zzas() {
        this.zza.zzaW().zzg();
        return this.zzz;
    }

    @WorkerThread
    public final void zzat(@Nullable Long l6) {
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzz, l6);
        this.zzz = l6;
    }

    @Nullable
    @WorkerThread
    public final Long zzau() {
        this.zza.zzaW().zzg();
        return this.zzA;
    }

    @WorkerThread
    public final void zzav(@Nullable Long l6) {
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzA, l6);
        this.zzA = l6;
    }

    @WorkerThread
    public final long zzaw() {
        this.zza.zzaW().zzg();
        return this.zzB;
    }

    @WorkerThread
    public final void zzax(long j) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzB != j;
        this.zzB = j;
    }

    @Nullable
    @WorkerThread
    public final String zzay() {
        this.zza.zzaW().zzg();
        return this.zzC;
    }

    @WorkerThread
    public final void zzaz(@Nullable String str) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzC != str;
        this.zzC = str;
    }

    @WorkerThread
    public final void zzb() {
        this.zza.zzaW().zzg();
        this.zzQ = false;
    }

    @WorkerThread
    public final String zzc() {
        this.zza.zzaW().zzg();
        return this.zzb;
    }

    @Nullable
    @WorkerThread
    public final String zzd() {
        this.zza.zzaW().zzg();
        return this.zzc;
    }

    @WorkerThread
    public final void zze(@Nullable String str) {
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzc, str);
        this.zzc = str;
    }

    @Nullable
    @WorkerThread
    public final String zzf() {
        this.zza.zzaW().zzg();
        return this.zzd;
    }

    @WorkerThread
    public final void zzg(@Nullable String str) {
        this.zza.zzaW().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzQ |= true ^ Objects.equals(this.zzd, str);
        this.zzd = str;
    }

    @Nullable
    @WorkerThread
    public final String zzh() {
        this.zza.zzaW().zzg();
        return this.zzt;
    }

    @WorkerThread
    public final void zzi(@Nullable String str) {
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzt, str);
        this.zzt = str;
    }

    @Nullable
    @WorkerThread
    public final String zzj() {
        this.zza.zzaW().zzg();
        return this.zze;
    }

    @WorkerThread
    public final void zzk(@Nullable String str) {
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zze, str);
        this.zze = str;
    }

    @Nullable
    @WorkerThread
    public final String zzl() {
        this.zza.zzaW().zzg();
        return this.zzf;
    }

    @WorkerThread
    public final void zzm(@Nullable String str) {
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzf, str);
        this.zzf = str;
    }

    @WorkerThread
    public final long zzn() {
        this.zza.zzaW().zzg();
        return this.zzh;
    }

    @WorkerThread
    public final void zzo(long j) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzh != j;
        this.zzh = j;
    }

    @WorkerThread
    public final long zzp() {
        this.zza.zzaW().zzg();
        return this.zzi;
    }

    @WorkerThread
    public final void zzq(long j) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzi != j;
        this.zzi = j;
    }

    @Nullable
    @WorkerThread
    public final String zzr() {
        this.zza.zzaW().zzg();
        return this.zzj;
    }

    @WorkerThread
    public final void zzs(@Nullable String str) {
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzj, str);
        this.zzj = str;
    }

    @WorkerThread
    public final long zzt() {
        this.zza.zzaW().zzg();
        return this.zzk;
    }

    @WorkerThread
    public final void zzu(long j) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzk != j;
        this.zzk = j;
    }

    @Nullable
    @WorkerThread
    public final String zzv() {
        this.zza.zzaW().zzg();
        return this.zzl;
    }

    @WorkerThread
    public final void zzw(@Nullable String str) {
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzl, str);
        this.zzl = str;
    }

    @WorkerThread
    public final long zzx() {
        this.zza.zzaW().zzg();
        return this.zzm;
    }

    @WorkerThread
    public final void zzy(long j) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzm != j;
        this.zzm = j;
    }

    @WorkerThread
    public final long zzz() {
        this.zza.zzaW().zzg();
        return this.zzn;
    }
}
