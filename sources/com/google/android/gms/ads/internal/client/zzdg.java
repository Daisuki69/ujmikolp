package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdg extends zzde {
    private final MuteThisAdListener zza;

    public zzdg(MuteThisAdListener muteThisAdListener) {
        this.zza = muteThisAdListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdf
    public final void zze() {
        this.zza.onAdMuted();
    }
}
