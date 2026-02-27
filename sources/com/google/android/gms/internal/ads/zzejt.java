package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzejt implements zzdgp {
    final /* synthetic */ zzfcj zza;

    public zzejt(zzejw zzejwVar, zzfcj zzfcjVar) {
        this.zza = zzfcjVar;
        Objects.requireNonNull(zzejwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final void zza(boolean z4, Context context, @Nullable zzcwf zzcwfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    @Nullable
    public final zzfcj zzb() {
        return this.zza;
    }
}
