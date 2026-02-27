package com.google.android.gms.ads.initialization;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface AdapterStatus {

    public enum State {
        NOT_READY,
        READY
    }

    @NonNull
    String getDescription();

    @NonNull
    State getInitializationState();

    int getLatency();
}
