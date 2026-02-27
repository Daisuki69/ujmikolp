package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzekk extends com.google.android.gms.ads.internal.client.zzbs {

    @VisibleForTesting
    final zzfdb zza;

    @VisibleForTesting
    final zzdjd zzb;
    private final Context zzc;
    private final zzcgv zzd;
    private com.google.android.gms.ads.internal.client.zzbk zze;

    public zzekk(zzcgv zzcgvVar, Context context, String str) {
        zzfdb zzfdbVar = new zzfdb();
        this.zza = zzfdbVar;
        this.zzb = new zzdjd();
        this.zzd = zzcgvVar;
        zzfdbVar.zzg(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final com.google.android.gms.ads.internal.client.zzbq zze() {
        zzdje zzdjeVarZzg = this.zzb.zzg();
        ArrayList arrayListZzh = zzdjeVarZzg.zzh();
        zzfdb zzfdbVar = this.zza;
        zzfdbVar.zzm(arrayListZzh);
        zzfdbVar.zzn(zzdjeVarZzg.zzi());
        if (zzfdbVar.zzf() == null) {
            zzfdbVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzb());
        }
        return new zzekl(this.zzc, this.zzd, zzfdbVar, zzdjeVarZzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzf(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zze = zzbkVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzg(zzbgu zzbguVar) {
        this.zzb.zzb(zzbguVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzh(zzbgx zzbgxVar) {
        this.zzb.zza(zzbgxVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzi(String str, zzbhd zzbhdVar, @Nullable zzbha zzbhaVar) {
        this.zzb.zzf(str, zzbhdVar, zzbhaVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzj(zzbfl zzbflVar) {
        this.zza.zzo(zzbflVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzk(zzbhh zzbhhVar, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb.zzd(zzbhhVar);
        this.zza.zzc(zzrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzr(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzm(zzbhk zzbhkVar) {
        this.zzb.zzc(zzbhkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzn(zzblw zzblwVar) {
        this.zza.zzq(zzblwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzo(zzbmf zzbmfVar) {
        this.zzb.zze(zzbmfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzs(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzq(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zza.zzX(zzcsVar);
    }
}
