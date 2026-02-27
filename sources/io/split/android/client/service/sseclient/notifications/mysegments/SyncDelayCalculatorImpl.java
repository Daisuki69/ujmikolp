package io.split.android.client.service.sseclient.notifications.mysegments;

import a.AbstractC0617a;
import io.split.android.client.service.sseclient.notifications.HashingAlgorithm;
import io.split.android.client.service.sseclient.notifications.MySegmentUpdateStrategy;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class SyncDelayCalculatorImpl implements SyncDelayCalculator {
    public static final long DEFAULT_SYNC_INTERVAL_MS = TimeUnit.SECONDS.toMillis(60);

    @Override // io.split.android.client.service.sseclient.notifications.mysegments.SyncDelayCalculator
    public long calculateSyncDelay(String str, Long l6, Integer num, MySegmentUpdateStrategy mySegmentUpdateStrategy, HashingAlgorithm hashingAlgorithm) {
        if ((mySegmentUpdateStrategy != MySegmentUpdateStrategy.UNBOUNDED_FETCH_REQUEST && mySegmentUpdateStrategy != MySegmentUpdateStrategy.BOUNDED_FETCH_REQUEST) || hashingAlgorithm == HashingAlgorithm.NONE) {
            return 0L;
        }
        if (l6 == null || l6.longValue() <= 0) {
            l6 = Long.valueOf(DEFAULT_SYNC_INTERVAL_MS);
        }
        if (num == null) {
            num = 0;
        }
        return AbstractC0617a.G(str.length(), num.intValue(), str) % l6.longValue();
    }
}
