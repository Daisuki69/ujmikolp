package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcyl extends zzdbq {
    private boolean zzb;

    @VisibleForTesting
    public zzcyl(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzs(zzcyk.zza);
        this.zzb = true;
    }
}
