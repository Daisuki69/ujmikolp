package androidx.core.os;

import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 35)
public final class HeapProfileRequestBuilder extends ProfilingRequestBuilder<HeapProfileRequestBuilder> {
    private final Bundle mParams = new Bundle();

    @Override // androidx.core.os.ProfilingRequestBuilder
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public Bundle getParams() {
        return this.mParams;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public int getProfilingType() {
        return 2;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public HeapProfileRequestBuilder getThis() {
        return this;
    }

    public final HeapProfileRequestBuilder setBufferSizeKb(int i) {
        this.mParams.putInt("KEY_SIZE_KB", i);
        return this;
    }

    public final HeapProfileRequestBuilder setDurationMs(int i) {
        this.mParams.putInt("KEY_DURATION_MS", i);
        return this;
    }

    public final HeapProfileRequestBuilder setSamplingIntervalBytes(long j) {
        this.mParams.putLong("KEY_SAMPLING_INTERVAL_BYTES", j);
        return this;
    }

    public final HeapProfileRequestBuilder setTrackJavaAllocations(boolean z4) {
        this.mParams.putBoolean("KEY_TRACK_JAVA_ALLOCATIONS", z4);
        return this;
    }
}
