package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface InitializationCompleteCallback {
    void onInitializationFailed(@NonNull String str);

    void onInitializationSucceeded();
}
