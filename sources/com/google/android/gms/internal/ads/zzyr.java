package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
final class zzyr {
    private final Handler zza;
    private final zzyt zzb;
    private boolean zzc;

    public zzyr(Handler handler, zzyt zzytVar) {
        this.zza = handler;
        this.zzb = zzytVar;
    }

    public final void zza() {
        this.zzc = true;
    }

    public final /* synthetic */ Handler zzb() {
        return this.zza;
    }

    public final /* synthetic */ zzyt zzc() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzd() {
        return this.zzc;
    }
}
