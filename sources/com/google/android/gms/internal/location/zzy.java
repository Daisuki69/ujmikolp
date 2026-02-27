package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* JADX INFO: loaded from: classes3.dex */
final class zzy extends IStatusCallback.Stub {
    private final BaseImplementation.ResultHolder zza;

    public zzy(BaseImplementation.ResultHolder resultHolder) {
        this.zza = resultHolder;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        this.zza.setResult(status);
    }
}
