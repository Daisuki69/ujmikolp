package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.utils.futures.Futures;

/* JADX INFO: loaded from: classes.dex */
public final class SessionProcessorSurface extends DeferrableSurface {
    private final int mOutputConfigId;
    private final Surface mSurface;

    public SessionProcessorSurface(@NonNull Surface surface, int i) {
        this.mSurface = surface;
        this.mOutputConfigId = i;
    }

    public int getOutputConfigId() {
        return this.mOutputConfigId;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    @NonNull
    public S1.y provideSurface() {
        return Futures.immediateFuture(this.mSurface);
    }
}
