package com.google.android.gms.ads.rewarded;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface RewardItem {

    @NonNull
    public static final RewardItem DEFAULT_REWARD = new zza();

    int getAmount();

    @NonNull
    String getType();
}
