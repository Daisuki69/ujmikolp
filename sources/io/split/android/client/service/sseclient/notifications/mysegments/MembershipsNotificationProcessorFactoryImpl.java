package io.split.android.client.service.sseclient.notifications.mysegments;

import ai.C0715d;
import androidx.annotation.NonNull;
import io.split.android.client.service.sseclient.notifications.MySegmentsV2PayloadDecoder;
import io.split.android.client.service.sseclient.notifications.NotificationParser;
import io.split.android.client.service.sseclient.notifications.memberships.MembershipsNotificationProcessor;
import io.split.android.client.service.sseclient.notifications.memberships.MembershipsNotificationProcessorImpl;
import java.util.Objects;
import ki.f;

/* JADX INFO: loaded from: classes4.dex */
public class MembershipsNotificationProcessorFactoryImpl implements MembershipsNotificationProcessorFactory {
    private final C0715d mCompressionProvider;
    private final MySegmentsV2PayloadDecoder mMySegmentsPayloadDecoder;
    private final NotificationParser mNotificationParser;
    private final f mSplitTaskExecutor;

    public MembershipsNotificationProcessorFactoryImpl(@NonNull NotificationParser notificationParser, @NonNull f fVar, @NonNull MySegmentsV2PayloadDecoder mySegmentsV2PayloadDecoder, @NonNull C0715d c0715d) {
        Objects.requireNonNull(notificationParser);
        this.mNotificationParser = notificationParser;
        Objects.requireNonNull(fVar);
        this.mSplitTaskExecutor = fVar;
        Objects.requireNonNull(mySegmentsV2PayloadDecoder);
        this.mMySegmentsPayloadDecoder = mySegmentsV2PayloadDecoder;
        Objects.requireNonNull(c0715d);
        this.mCompressionProvider = c0715d;
    }

    @Override // io.split.android.client.service.sseclient.notifications.mysegments.MembershipsNotificationProcessorFactory
    public MembershipsNotificationProcessor getProcessor(MySegmentsNotificationProcessorConfiguration mySegmentsNotificationProcessorConfiguration) {
        return new MembershipsNotificationProcessorImpl(this.mNotificationParser, this.mSplitTaskExecutor, this.mMySegmentsPayloadDecoder, this.mCompressionProvider, mySegmentsNotificationProcessorConfiguration, new SyncDelayCalculatorImpl());
    }
}
