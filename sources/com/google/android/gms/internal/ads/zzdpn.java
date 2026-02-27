package com.google.android.gms.internal.ads;

import android.view.InputEvent;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdpn {
    private volatile InputEvent zza;

    @VisibleForTesting(otherwise = 3)
    public zzdpn() {
    }

    public final void zza(InputEvent inputEvent) {
        this.zza = inputEvent;
    }

    public final InputEvent zzb() {
        return this.zza;
    }
}
