package io.split.android.client.service.sseclient.notifications.mysegments;

import io.split.android.client.service.sseclient.notifications.memberships.MembershipsNotificationProcessor;

/* JADX INFO: loaded from: classes4.dex */
public interface MySegmentsNotificationProcessorRegistry {
    void registerMembershipsNotificationProcessor(String str, MembershipsNotificationProcessor membershipsNotificationProcessor);

    void unregisterMembershipsProcessor(String str);
}
