package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzdun implements zzgoq {
    final /* synthetic */ zzdux zza;

    public zzdun(zzdux zzduxVar) {
        Objects.requireNonNull(zzduxVar);
        this.zza = zzduxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th2) {
        synchronized (this) {
            zzdux zzduxVar = this.zza;
            zzduxVar.zzn(true);
            zzduxVar.zzm("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzduxVar.zzo()));
            zzduxVar.zzp().zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            zzdux zzduxVar = this.zza;
            zzduxVar.zzn(true);
            zzduxVar.zzm("com.google.android.gms.ads.MobileAds", true, "", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzduxVar.zzo()));
            zzduxVar.zzq().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdum
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza.zzl(str);
                }
            });
        }
    }
}
