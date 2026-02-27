package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdku implements zzcwm {
    private final zzdiu zza;
    private final zzdiz zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdku(zzdiu zzdiuVar, zzdiz zzdizVar, Executor executor, Executor executor2) {
        this.zza = zzdiuVar;
        this.zzb = zzdizVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zza(final zzcek zzcekVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcekVar.zze("onSdkImpression", new ArrayMap());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        if (this.zzb.zzd()) {
            zzdiu zzdiuVar = this.zza;
            zzedu zzeduVarZzZ = zzdiuVar.zzZ();
            if (zzeduVarZzZ == null && zzdiuVar.zzX() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfQ)).booleanValue()) {
                S1.y yVarZzX = zzdiuVar.zzX();
                zzbzm zzbzmVarZzY = zzdiuVar.zzY();
                if (yVarZzX == null || zzbzmVarZzY == null) {
                    return;
                }
                zzgot.zzq(zzgot.zzp(yVarZzX, zzbzmVarZzY), new zzdks(this), this.zzd);
                return;
            }
            if (zzeduVarZzZ != null) {
                zzcek zzcekVarZzW = zzdiuVar.zzW();
                zzcek zzcekVarZzT = zzdiuVar.zzT();
                if (zzcekVarZzW == null) {
                    zzcekVarZzW = zzcekVarZzT == null ? null : zzcekVarZzT;
                }
                if (zzcekVarZzW != null) {
                    zza(zzcekVarZzW);
                }
            }
        }
    }
}
