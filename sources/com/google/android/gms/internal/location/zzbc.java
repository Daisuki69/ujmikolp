package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes3.dex */
final class zzbc extends com.google.android.gms.location.zzbk {
    private final ListenerHolder zza;

    public zzbc(ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    public final synchronized void zzc() {
        this.zza.clear();
    }

    @Override // com.google.android.gms.location.zzbl
    public final synchronized void zzd(Location location) {
        this.zza.notifyListener(new zzbb(this, location));
    }
}
