package com.google.android.gms.common.api;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    public abstract void onFailure(@NonNull Status status);

    @Override // com.google.android.gms.common.api.ResultCallback
    @KeepForSdk
    public final void onResult(@NonNull R r9) {
        Status status = r9.getStatus();
        if (status.isSuccess()) {
            onSuccess(r9);
            return;
        }
        onFailure(status);
        if (r9 instanceof Releasable) {
            try {
                ((Releasable) r9).release();
            } catch (RuntimeException e) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r9)), e);
            }
        }
    }

    public abstract void onSuccess(@NonNull R r9);
}
