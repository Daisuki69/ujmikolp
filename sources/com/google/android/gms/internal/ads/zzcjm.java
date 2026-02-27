package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcjm implements zzhpx {
    private final zzcjl zza;

    private zzcjm(zzcjl zzcjlVar) {
        this.zza = zzcjlVar;
    }

    public static zzcjm zzc(zzcjl zzcjlVar) {
        return new zzcjm(zzcjlVar);
    }

    public static com.google.android.gms.ads.internal.zza zzd(zzcjl zzcjlVar) {
        return new com.google.android.gms.ads.internal.zza(new zzcca(), new zzcav());
    }

    public final com.google.android.gms.ads.internal.zza zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
