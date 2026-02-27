package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes3.dex */
public final class zzq {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzq zza(int i) {
        zzghc.zzh(!this.zzb);
        this.zza.append(i, true);
        return this;
    }

    public final zzr zzb() {
        zzghc.zzh(!this.zzb);
        this.zzb = true;
        return new zzr(this.zza, null);
    }
}
