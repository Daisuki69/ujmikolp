package androidx.camera.core.impl;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.ExperimentalRetryPolicy;
import androidx.camera.core.InitializationException;
import androidx.camera.core.RetryPolicy;
import androidx.camera.core.impl.CameraValidator;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalRetryPolicy
public final class CameraProviderExecutionState implements RetryPolicy.ExecutionState {
    private final int mAttemptCount;

    @Nullable
    private final Throwable mCause;
    private final int mStatus;
    private final long mTaskExecutedTimeInMillis;

    public CameraProviderExecutionState(long j, int i, @Nullable Throwable th2) {
        this.mTaskExecutedTimeInMillis = SystemClock.elapsedRealtime() - j;
        this.mAttemptCount = i;
        if (th2 instanceof CameraValidator.CameraIdListIncorrectException) {
            this.mStatus = 2;
            this.mCause = th2;
            return;
        }
        if (!(th2 instanceof InitializationException)) {
            this.mStatus = 0;
            this.mCause = th2;
            return;
        }
        Throwable cause = th2.getCause();
        th2 = cause != null ? cause : th2;
        this.mCause = th2;
        if (th2 instanceof CameraUnavailableException) {
            this.mStatus = 2;
        } else if (th2 instanceof IllegalArgumentException) {
            this.mStatus = 1;
        } else {
            this.mStatus = 0;
        }
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    @Nullable
    public Throwable getCause() {
        return this.mCause;
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public long getExecutedTimeInMillis() {
        return this.mTaskExecutedTimeInMillis;
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public int getNumOfAttempts() {
        return this.mAttemptCount;
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public int getStatus() {
        return this.mStatus;
    }
}
