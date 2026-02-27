package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import androidx.core.view.accessibility.AccessibilityEventCompat;

/* JADX INFO: loaded from: classes3.dex */
public class zzhb {
    private int zza;

    @CallSuper
    public void zza() {
        this.zza = 0;
    }

    public final boolean zzb() {
        return zzi(4);
    }

    public final boolean zzc() {
        return zzi(1);
    }

    public final boolean zzd() {
        return zzi(androidx.media3.common.C.BUFFER_FLAG_LAST_SAMPLE);
    }

    public final boolean zze() {
        return zzi(268435456);
    }

    public final boolean zzf() {
        return zzi(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
    }

    public final void zzg(int i) {
        this.zza = i;
    }

    public final void zzh(int i) {
        this.zza |= androidx.media3.common.C.BUFFER_FLAG_LAST_SAMPLE;
    }

    public final boolean zzi(int i) {
        return (this.zza & i) == i;
    }
}
