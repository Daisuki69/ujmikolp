package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcss implements com.google.android.gms.ads.internal.client.zza {
    private final zzcsw zza;
    private final zzfdc zzb;

    public zzcss(zzcsw zzcswVar, zzfdc zzfdcVar) {
        this.zza = zzcswVar;
        this.zzb = zzfdcVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zza(this.zzb.zzg);
    }
}
