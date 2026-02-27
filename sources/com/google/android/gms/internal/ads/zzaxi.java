package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaxi extends zzaxl {
    private final View zzh;

    public zzaxi(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i4, View view) {
        super(zzavxVar, "UGogIgDf9q+IGA3QKHqW/91b9ZzRTVJqtfmUoLBkD310fwrDg1hJZvDQk8/WK1MH", "sEqRe1gPhw/PwjhUj/qVAEUjKSVJDrXHsmrE44pcjTE=", zzarwVar, i, 57);
        this.zzh = view;
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        View view = this.zzh;
        if (view != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdP);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlM);
            zzawb zzawbVar = new zzawb((String) this.zze.invoke(null, view, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzasr zzasrVarZza = zzass.zza();
            zzasrVarZza.zzb(zzawbVar.zza.longValue());
            zzasrVarZza.zzc(zzawbVar.zzb.longValue());
            zzasrVarZza.zzd(zzawbVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zzasrVarZza.zza(zzawbVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zzasrVarZza.zze(zzawbVar.zzd.longValue());
            }
            this.zzd.zzM((zzass) zzasrVarZza.zzbu());
        }
    }
}
