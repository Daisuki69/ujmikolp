package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcrw {
    private final zzdyo zza;
    private final zzfdc zzb;
    private final zzfhh zzc;
    private final zzckw zzd;
    private final zzehr zze;
    private final zzdbh zzf;

    @Nullable
    private zzfcu zzg;
    private final zzdzw zzh;
    private final zzcuw zzi;
    private final Executor zzj;
    private final zzdzh zzk;
    private final zzeee zzl;

    public zzcrw(zzdyo zzdyoVar, zzfdc zzfdcVar, zzfhh zzfhhVar, zzckw zzckwVar, zzehr zzehrVar, zzdbh zzdbhVar, @Nullable zzfcu zzfcuVar, zzdzw zzdzwVar, zzcuw zzcuwVar, Executor executor, zzdzh zzdzhVar, zzeee zzeeeVar) {
        this.zza = zzdyoVar;
        this.zzb = zzfdcVar;
        this.zzc = zzfhhVar;
        this.zzd = zzckwVar;
        this.zze = zzehrVar;
        this.zzf = zzdbhVar;
        this.zzg = zzfcuVar;
        this.zzh = zzdzwVar;
        this.zzi = zzcuwVar;
        this.zzj = executor;
        this.zzk = zzdzhVar;
        this.zzl = zzeeeVar;
    }

    public final S1.y zza(S1.y yVar) {
        if (this.zzg != null) {
            zzfhh zzfhhVar = this.zzc;
            zzfhb zzfhbVar = zzfhb.SERVER_TRANSACTION;
            Objects.requireNonNull(zzfhhVar);
            return zzfgs.zza(zzgot.zza(this.zzg), zzfhbVar, zzfhhVar).zzi();
        }
        com.google.android.gms.ads.internal.zzt.zzj().zzb();
        zzfgy zzfgyVarZza = this.zzc.zza(zzfhb.SERVER_TRANSACTION, yVar);
        final zzdzh zzdzhVar = this.zzk;
        Objects.requireNonNull(zzdzhVar);
        return zzfgyVarZza.zzc(new zzgob() { // from class: com.google.android.gms.internal.ads.zzcrv
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return zzdzhVar.zza((zzbuv) obj);
            }
        }).zzi();
    }

    public final S1.y zzb() {
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.zzb.zzd;
        if (zzmVar.zzx == null && zzmVar.zzs == null) {
            return zza(this.zzi.zzb());
        }
        zzfhh zzfhhVar = this.zzc;
        zzfhb zzfhbVar = zzfhb.PRELOADED_LOADER;
        Objects.requireNonNull(zzfhhVar);
        return zzfgs.zza(this.zza.zza(), zzfhbVar, zzfhhVar).zzi();
    }

    public final S1.y zzc(S1.y yVar) {
        zzfgy zzfgyVarZzc = this.zzc.zza(zzfhb.RENDERER, yVar).zzb(new zzfgm() { // from class: com.google.android.gms.internal.ads.zzcru
            @Override // com.google.android.gms.internal.ads.zzfgm
            public final /* synthetic */ Object zza(Object obj) throws Exception {
                zzfcu zzfcuVar = (zzfcu) obj;
                this.zza.zzi(zzfcuVar);
                return zzfcuVar;
            }
        }).zzc(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgb)).booleanValue()) {
            zzfgyVarZzc = zzfgyVarZzc.zzh(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgc)).intValue(), TimeUnit.SECONDS);
        }
        return zzfgyVarZzc.zzi();
    }

    public final zzdbh zzd() {
        return this.zzf;
    }

    public final S1.y zze(final zzfey zzfeyVar) {
        zzfgo zzfgoVarZzi = this.zzc.zza(zzfhb.GET_CACHE_KEY, this.zzi.zzb()).zzc(new zzgob() { // from class: com.google.android.gms.internal.ads.zzcrt
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return this.zza.zzj(zzfeyVar, (zzbuv) obj);
            }
        }).zzi();
        zzgot.zzq(zzfgoVarZzi, new zzcrr(this), this.zzj);
        return zzfgoVarZzi;
    }

    public final S1.y zzf(zzbuv zzbuvVar) {
        zzfgo zzfgoVarZzi = this.zzc.zza(zzfhb.NOTIFY_CACHE_HIT, this.zzh.zzb(zzbuvVar)).zzi();
        zzgot.zzq(zzfgoVarZzi, new zzcrs(this), this.zzj);
        return zzfgoVarZzi;
    }

    public final com.google.android.gms.ads.internal.client.zze zzg(Throwable th2) {
        return zzfee.zzb(th2, this.zzl);
    }

    public final void zzh(zzfcu zzfcuVar) {
        this.zzg = zzfcuVar;
    }

    public final /* synthetic */ zzfcu zzi(zzfcu zzfcuVar) throws Exception {
        this.zzd.zza(zzfcuVar);
        return zzfcuVar;
    }

    public final /* synthetic */ S1.y zzj(zzfey zzfeyVar, zzbuv zzbuvVar) {
        zzbuvVar.zzi = zzfeyVar;
        return this.zzh.zza(zzbuvVar);
    }

    public final /* synthetic */ zzdbh zzk() {
        return this.zzf;
    }
}
