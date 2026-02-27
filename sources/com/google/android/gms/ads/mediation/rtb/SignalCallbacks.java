package com.google.android.gms.ads.mediation.rtb;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

/* JADX INFO: loaded from: classes2.dex */
public interface SignalCallbacks {
    void onFailure(@NonNull AdError adError);

    @Deprecated
    void onFailure(@NonNull String str);

    void onSuccess(@NonNull String str);
}
