package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbwk implements RewardItem {
    private final zzbvx zza;

    public zzbwk(zzbvx zzbvxVar) {
        this.zza = zzbvxVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzbvx zzbvxVar = this.zza;
        if (zzbvxVar != null) {
            try {
                return zzbvxVar.zzf();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    @Nullable
    public final String getType() {
        zzbvx zzbvxVar = this.zza;
        if (zzbvxVar != null) {
            try {
                return zzbvxVar.zze();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
