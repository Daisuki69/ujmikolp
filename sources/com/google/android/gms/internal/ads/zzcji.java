package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzcji implements com.google.android.gms.ads.nonagon.signalgeneration.zzab {
    private final zzcih zza;
    private zzcvb zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzay zzc;

    public /* synthetic */ zzcji(zzcih zzcihVar, byte[] bArr) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzac zza() {
        zzhqf.zzc(this.zzb, zzcvb.class);
        zzhqf.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzay.class);
        return new zzcjj(this.zza, this.zzc, new zzcry(), new zzctz(), new zzdtb(), this.zzb, null, null);
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzab zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzay zzayVar) {
        this.zzc = zzayVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzab zzc(zzcvb zzcvbVar) {
        this.zzb = zzcvbVar;
        return this;
    }
}
