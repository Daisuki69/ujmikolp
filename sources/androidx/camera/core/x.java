package androidx.camera.core;

import androidx.camera.core.RetryPolicy;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements RetryPolicy {
    @Override // androidx.camera.core.RetryPolicy
    public final /* synthetic */ long getTimeoutInMillis() {
        return y.a(this);
    }

    @Override // androidx.camera.core.RetryPolicy
    public final RetryPolicy.RetryConfig onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
        return RetryPolicy.RetryConfig.NOT_RETRY;
    }
}
