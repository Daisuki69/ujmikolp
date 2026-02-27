package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzesm implements zzeun {
    public final zzfci zza;

    public zzesm(zzfci zzfciVar) {
        this.zza = zzfciVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzcuu zzcuuVar = (zzcuu) obj;
        zzfci zzfciVar = this.zza;
        if (zzfciVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmK)).booleanValue()) {
                return;
            }
            Bundle bundle = zzcuuVar.zza;
            bundle.putBoolean("render_in_browser", zzfciVar.zzb());
            bundle.putBoolean("disable_ml", zzfciVar.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* synthetic */ void zzb(Object obj) {
        q.a(this, obj);
    }
}
