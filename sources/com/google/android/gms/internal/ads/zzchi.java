package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzchi implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzchi(zzcgx zzcgxVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzchi zza(zzcgx zzcgxVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzchi(zzcgxVar, zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdi)).booleanValue() ? new zzauu((zzaup) this.zzb.zzb()) : new zzauu((zzaup) this.zza.zzb());
    }
}
