package com.google.android.gms.internal.ads;

import androidx.media3.exoplayer.DefaultLoadControl;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaov {
    private int zza = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
    private int zzb;

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final void zzc(zzapq zzapqVar) throws zzapq {
        int i = this.zzb + 1;
        this.zzb = i;
        int i4 = this.zza;
        this.zza = i4 + i4;
        if (i > 1) {
            throw zzapqVar;
        }
    }
}
