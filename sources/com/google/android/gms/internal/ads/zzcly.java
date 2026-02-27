package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcly implements zzcwn {
    private final zzfea zza;

    public zzcly(zzfea zzfeaVar) {
        this.zza = zzfeaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zza(@Nullable Context context) {
        try {
            this.zza.zzi();
        } catch (zzfdj e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzb(@Nullable Context context) {
        try {
            zzfea zzfeaVar = this.zza;
            zzfeaVar.zzj();
            if (context != null) {
                zzfeaVar.zzp(context);
            }
        } catch (zzfdj e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzc(@Nullable Context context) {
        try {
            this.zza.zzf();
        } catch (zzfdj e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }
}
