package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzetf implements zzeup {

    @Nullable
    private final Bundle zza;

    public zzetf(@Nullable Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        return zzgot.zza(new zzetg(this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 30;
    }
}
