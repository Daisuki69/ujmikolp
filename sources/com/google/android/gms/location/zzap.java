package com.google.android.gms.location;

import android.location.Location;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class zzap extends com.google.android.gms.internal.location.zzan {
    final /* synthetic */ TaskCompletionSource zza;

    public zzap(FusedLocationProviderClient fusedLocationProviderClient, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(Status status, @Nullable Location location) {
        TaskUtil.trySetResultOrApiException(status, location, this.zza);
    }
}
