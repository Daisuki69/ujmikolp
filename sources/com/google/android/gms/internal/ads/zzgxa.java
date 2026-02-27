package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
final class zzgxa implements zzgxc {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    public zzgxa(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzgxc
    public final boolean zza() {
        return this.zza.get();
    }
}
