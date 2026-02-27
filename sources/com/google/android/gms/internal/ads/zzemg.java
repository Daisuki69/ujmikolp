package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemg implements zzeup {
    private final Context zza;

    public zzemg(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        return zzgot.zza(new zzemh(ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 2;
    }
}
