package androidx.media3.exoplayer.upstream.experimental;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface BandwidthStatistic {
    void addSample(long j, long j6);

    long getBandwidthEstimate();

    void reset();
}
