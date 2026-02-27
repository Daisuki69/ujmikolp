package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdnv implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final Context zzb;
    private final zzdsm zzc;
    private final zzecn zzd;
    private final Executor zze;
    private final zzauu zzf;
    private final VersionInfoParcel zzg;
    private final zzfjv zzh;
    private final zzecy zzi;
    private final zzfdg zzj;

    public zzdnv(Context context, Executor executor, zzauu zzauuVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzcfa zzcfaVar, zzecn zzecnVar, zzfjv zzfjvVar, zzdsm zzdsmVar, zzecy zzecyVar, zzfdg zzfdgVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzauuVar;
        this.zzg = versionInfoParcel;
        this.zza = zzaVar;
        this.zzd = zzecnVar;
        this.zzh = zzfjvVar;
        this.zzc = zzdsmVar;
        this.zzi = zzecyVar;
        this.zzj = zzfdgVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdnx zzdnxVar = new zzdnx(this);
        zzdnxVar.zza();
        return zzdnxVar;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.zza zza() {
        return this.zza;
    }

    public final /* synthetic */ Context zzb() {
        return this.zzb;
    }

    public final /* synthetic */ zzdsm zzc() {
        return this.zzc;
    }

    public final /* synthetic */ zzecn zzd() {
        return this.zzd;
    }

    public final /* synthetic */ Executor zze() {
        return this.zze;
    }

    public final /* synthetic */ zzauu zzf() {
        return this.zzf;
    }

    public final /* synthetic */ VersionInfoParcel zzg() {
        return this.zzg;
    }

    public final /* synthetic */ zzfjv zzh() {
        return this.zzh;
    }

    public final /* synthetic */ zzecy zzi() {
        return this.zzi;
    }

    public final /* synthetic */ zzfdg zzj() {
        return this.zzj;
    }
}
