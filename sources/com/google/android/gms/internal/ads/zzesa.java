package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class zzesa implements zzeup {
    private final Context zza;
    private final Intent zzb;

    public zzesa(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        com.google.android.gms.ads.internal.util.zze.zza("HsdpMigrationSignal.produce");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznE)).booleanValue()) {
            return zzgot.zza(new zzesb(null));
        }
        boolean z4 = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                com.google.android.gms.ads.internal.util.zze.zza("HSDP intent is supported");
                z4 = true;
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return zzgot.zza(new zzesb(Boolean.valueOf(z4)));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 60;
    }
}
