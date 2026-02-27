package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdnk implements zzbjl {

    @Nullable
    private final zzbha zza;
    private final zzdnx zzb;
    private final zzhpr zzc;

    public zzdnk(zzdje zzdjeVar, zzdiu zzdiuVar, zzdnx zzdnxVar, zzhpr zzhprVar) {
        this.zza = zzdjeVar.zzg(zzdiuVar.zzS());
        this.zzb = zzdnxVar;
        this.zzc = zzhprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbgq) this.zzc.zzb(), str);
        } catch (RemoteException e) {
            String strQ = We.s.q(new StringBuilder(String.valueOf(str).length() + 40), "Failed to call onCustomClick for asset ", str, ".");
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(strQ, e);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzd("/nativeAdCustomClick", this);
    }
}
