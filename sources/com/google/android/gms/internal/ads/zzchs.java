package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzchs implements zzhpx {
    private final zzcgx zza;

    private zzchs(zzcgx zzcgxVar) {
        this.zza = zzcgxVar;
    }

    public static zzchs zzc(zzcgx zzcgxVar) {
        return new zzchs(zzcgxVar);
    }

    public static VersionInfoParcel zzd(zzcgx zzcgxVar) {
        VersionInfoParcel versionInfoParcelZzd = zzcgxVar.zzd();
        zzhqf.zzb(versionInfoParcelZzd);
        return versionInfoParcelZzd;
    }

    public final VersionInfoParcel zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
