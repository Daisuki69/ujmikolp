package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdpq implements zzcwn {

    @Nullable
    private final zzcek zza;

    public zzdpq(@Nullable zzcek zzcekVar) {
        this.zza = zzcekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zza(@Nullable Context context) {
        zzcek zzcekVar = this.zza;
        if (zzcekVar != null) {
            zzcekVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzb(@Nullable Context context) {
        zzcek zzcekVar = this.zza;
        if (zzcekVar != null) {
            zzcekVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzc(@Nullable Context context) {
        zzcek zzcekVar = this.zza;
        if (zzcekVar != null) {
            zzcekVar.destroy();
        }
    }
}
