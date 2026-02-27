package com.google.android.gms.ads;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AdLoadCallback<AdT> {
    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
    }

    public void onAdLoaded(@NonNull AdT adt) {
    }
}
