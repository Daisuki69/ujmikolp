package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzflf extends zzflb {
    public zzflf(ClientApi clientApi, Context context, int i, zzfdy zzfdyVar, com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfkf zzfkfVar, Clock clock) {
        super(clientApi, context, i, zzfdyVar, zzftVar, zzceVar, scheduledExecutorService, zzfkfVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzflb
    public final S1.y zza(Context context) {
        zzbox zzboxVarZzd = this.zzd.zzd();
        if (zzboxVarZzd == null) {
            return zzgot.zzc(new zzfjx(1, "Failed to create a rewarded ad."));
        }
        zzbwa zzbwaVarZzl = this.zza.zzl(ObjectWrapper.wrap(context), this.zze.zza, zzboxVarZzd, this.zzc);
        if (zzbwaVarZzl == null) {
            return zzgot.zzc(new zzfjx(1, "Failed to create a rewarded ad."));
        }
        zzgpm zzgpmVarZze = zzgpm.zze();
        try {
            zzs(this.zze.zzc);
            zzbwaVarZzl.zzc(this.zze.zzc, new zzfle(this, zzgpmVarZze, zzbwaVarZzl));
            return zzgpmVarZze;
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to load rewarded ad.");
            return zzgot.zzc(new zzfjx(1, "remote exception"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflb
    @Nullable
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzb(Object obj) {
        try {
            return ((zzbwa) obj).zzm();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for the rewarded ad.", e);
            return null;
        }
    }

    public zzflf(String str, ClientApi clientApi, Context context, int i, zzfdy zzfdyVar, com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzch zzchVar, ScheduledExecutorService scheduledExecutorService, zzfkf zzfkfVar, Clock clock) {
        super(str, clientApi, context, i, zzfdyVar, zzftVar, zzchVar, scheduledExecutorService, zzfkfVar, clock);
    }
}
