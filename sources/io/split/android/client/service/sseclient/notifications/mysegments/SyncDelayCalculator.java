package io.split.android.client.service.sseclient.notifications.mysegments;

import io.split.android.client.service.sseclient.notifications.HashingAlgorithm;
import io.split.android.client.service.sseclient.notifications.MySegmentUpdateStrategy;

/* JADX INFO: loaded from: classes4.dex */
public interface SyncDelayCalculator {
    long calculateSyncDelay(String str, Long l6, Integer num, MySegmentUpdateStrategy mySegmentUpdateStrategy, HashingAlgorithm hashingAlgorithm);
}
