package androidx.media3.exoplayer.dash.manifest;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ServiceDescriptionElement {
    public final long maxOffsetMs;
    public final float maxPlaybackSpeed;
    public final long minOffsetMs;
    public final float minPlaybackSpeed;
    public final long targetOffsetMs;

    public ServiceDescriptionElement(long j, long j6, long j7, float f, float f3) {
        this.targetOffsetMs = j;
        this.minOffsetMs = j6;
        this.maxOffsetMs = j7;
        this.minPlaybackSpeed = f;
        this.maxPlaybackSpeed = f3;
    }
}
