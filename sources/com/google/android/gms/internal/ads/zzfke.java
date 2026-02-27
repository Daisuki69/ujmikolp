package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfke extends zzflb {
    public zzfke(ClientApi clientApi, Context context, int i, zzfdy zzfdyVar, com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfkf zzfkfVar, Clock clock) {
        super(clientApi, context, i, zzfdyVar, zzftVar, zzceVar, scheduledExecutorService, zzfkfVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzflb
    public final S1.y zza(Context context) {
        zzbox zzboxVarZzd = this.zzd.zzd();
        if (zzboxVarZzd == null) {
            return zzgot.zzc(new zzfjx(1, "Failed to create an app open ad manager."));
        }
        com.google.android.gms.ads.internal.client.zzbx zzbxVarZzm = this.zza.zzm(ObjectWrapper.wrap(context), com.google.android.gms.ads.internal.client.zzr.zzd(), this.zze.zza, zzboxVarZzd, this.zzc);
        if (zzbxVarZzm == null) {
            return zzgot.zzc(new zzfjx(1, "Failed to create an app open ad manager."));
        }
        zzgpm zzgpmVarZze = zzgpm.zze();
        try {
            zzs(this.zze.zzc);
            zzbxVarZzm.zzJ(new zzfkd(this, zzgpmVarZze, this.zze));
            zzbxVarZzm.zze(this.zze.zzc);
            return zzgpmVarZze;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load app open ad.", e);
            return zzgot.zzc(new zzfjx(1, "remote exception"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflb
    @Nullable
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzb(Object obj) {
        try {
            return ((zzbab) obj).zzg();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for the app open ad.", e);
            return null;
        }
    }

    public zzfke(String str, ClientApi clientApi, Context context, int i, zzfdy zzfdyVar, com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzch zzchVar, ScheduledExecutorService scheduledExecutorService, zzfkf zzfkfVar, Clock clock) {
        super(str, clientApi, context, i, zzfdyVar, zzftVar, zzchVar, scheduledExecutorService, zzfkfVar, clock);
    }
}
