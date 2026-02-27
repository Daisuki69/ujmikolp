package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeyl extends zzext {
    public zzeyl(Context context, Executor executor, zzcgv zzcgvVar, zzfab zzfabVar, zzeyj zzeyjVar, zzfdb zzfdbVar, VersionInfoParcel versionInfoParcel) {
        super(context, executor, zzcgvVar, zzfabVar, zzeyjVar, zzfdbVar, versionInfoParcel);
    }

    @Override // com.google.android.gms.internal.ads.zzext
    public final /* bridge */ /* synthetic */ zzcuy zzc(zzcoh zzcohVar, zzcvb zzcvbVar, zzdbs zzdbsVar) {
        zzcnx zzcnxVarZzi = this.zza.zzi();
        zzcnxVarZzi.zzd(zzcvbVar);
        zzcnxVarZzi.zze(zzdbsVar);
        return zzcnxVarZzi;
    }
}
