package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzcio implements zzcpo {
    private final zzcih zza;
    private zzfaf zzb;
    private zzezj zzc;
    private zzdbs zzd;
    private zzcvb zze;
    private zzejp zzf;
    private zzcqk zzg;
    private zzeht zzh;
    private zzcoh zzi;
    private zzdgy zzj;

    public /* synthetic */ zzcio(zzcih zzcihVar, byte[] bArr) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcpo, com.google.android.gms.internal.ads.zzcuy
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcpp zzh() {
        zzhqf.zzc(this.zzd, zzdbs.class);
        zzhqf.zzc(this.zze, zzcvb.class);
        zzhqf.zzc(this.zzf, zzejp.class);
        zzhqf.zzc(this.zzg, zzcqk.class);
        if (this.zzh == null) {
            this.zzh = zzehv.zza();
        }
        zzhqf.zzc(this.zzi, zzcoh.class);
        zzhqf.zzc(this.zzj, zzdgy.class);
        return new zzcip(this.zza, this.zzi, this.zzj, new zzcry(), new zzfei(), new zzctz(), new zzdtb(), this.zzd, this.zze, this.zzh, this.zzf, this.zzg, null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzcpo
    public final /* synthetic */ zzcpo zzb(@Nullable zzezj zzezjVar) {
        this.zzc = zzezjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpo
    public final /* synthetic */ zzcpo zzc(@Nullable zzfaf zzfafVar) {
        this.zzb = zzfafVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpo
    public final /* bridge */ /* synthetic */ zzcpo zzd(zzdgy zzdgyVar) {
        this.zzj = zzdgyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpo
    public final /* bridge */ /* synthetic */ zzcpo zze(zzcoh zzcohVar) {
        this.zzi = zzcohVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpo
    public final /* bridge */ /* synthetic */ zzcpo zzf(zzeht zzehtVar) {
        this.zzh = zzehtVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpo
    public final /* bridge */ /* synthetic */ zzcpo zzg(zzcqk zzcqkVar) {
        this.zzg = zzcqkVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpo, com.google.android.gms.internal.ads.zzcuy
    public final /* synthetic */ zzcuy zzi(@Nullable zzezj zzezjVar) {
        this.zzc = zzezjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpo, com.google.android.gms.internal.ads.zzcuy
    public final /* synthetic */ zzcuy zzj(@Nullable zzfaf zzfafVar) {
        this.zzb = zzfafVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpo
    public final /* bridge */ /* synthetic */ zzcpo zzk(zzejp zzejpVar) {
        this.zzf = zzejpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpo
    public final /* bridge */ /* synthetic */ zzcpo zzl(zzcvb zzcvbVar) {
        this.zze = zzcvbVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpo
    public final /* bridge */ /* synthetic */ zzcpo zzm(zzdbs zzdbsVar) {
        this.zzd = zzdbsVar;
        return this;
    }
}
