package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbwr extends zzbvw {
    private final String zza;
    private final int zzb;

    public zzbwr(@Nullable RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final String zze() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final int zzf() throws RemoteException {
        return this.zzb;
    }

    public zzbwr(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }
}
