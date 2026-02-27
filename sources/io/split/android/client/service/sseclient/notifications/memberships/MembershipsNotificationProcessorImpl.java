package io.split.android.client.service.sseclient.notifications.memberships;

import Li.b;
import P5.N;
import Qi.c;
import Ri.a;
import ai.C0715d;
import ai.EnumC0712a;
import androidx.annotation.Nullable;
import bi.h;
import io.split.android.client.service.sseclient.notifications.KeyList;
import io.split.android.client.service.sseclient.notifications.MembershipNotification;
import io.split.android.client.service.sseclient.notifications.MySegmentUpdateStrategy;
import io.split.android.client.service.sseclient.notifications.MySegmentsV2PayloadDecoder;
import io.split.android.client.service.sseclient.notifications.NotificationParser;
import io.split.android.client.service.sseclient.notifications.NotificationType;
import io.split.android.client.service.sseclient.notifications.mysegments.MySegmentsNotificationProcessorConfiguration;
import io.split.android.client.service.sseclient.notifications.mysegments.SyncDelayCalculator;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import ki.AbstractC1780a;
import ki.f;
import pg.C2038a;
import si.C2261c;
import si.g;

/* JADX INFO: loaded from: classes4.dex */
public class MembershipsNotificationProcessorImpl implements MembershipsNotificationProcessor {
    private final C0715d mCompressionProvider;
    private final MySegmentsNotificationProcessorConfiguration mConfiguration;
    private final MySegmentsV2PayloadDecoder mMySegmentsPayloadDecoder;
    private final NotificationParser mNotificationParser;
    private final f mSplitTaskExecutor;
    private final SyncDelayCalculator mSyncDelayCalculator;

    /* JADX INFO: renamed from: io.split.android.client.service.sseclient.notifications.memberships.MembershipsNotificationProcessorImpl$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$split$android$client$service$sseclient$notifications$MySegmentUpdateStrategy;

        static {
            int[] iArr = new int[MySegmentUpdateStrategy.values().length];
            $SwitchMap$io$split$android$client$service$sseclient$notifications$MySegmentUpdateStrategy = iArr;
            try {
                iArr[MySegmentUpdateStrategy.UNBOUNDED_FETCH_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$split$android$client$service$sseclient$notifications$MySegmentUpdateStrategy[MySegmentUpdateStrategy.BOUNDED_FETCH_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$split$android$client$service$sseclient$notifications$MySegmentUpdateStrategy[MySegmentUpdateStrategy.KEY_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$split$android$client$service$sseclient$notifications$MySegmentUpdateStrategy[MySegmentUpdateStrategy.SEGMENT_REMOVAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public MembershipsNotificationProcessorImpl(NotificationParser notificationParser, f fVar, MySegmentsV2PayloadDecoder mySegmentsV2PayloadDecoder, C0715d c0715d, MySegmentsNotificationProcessorConfiguration mySegmentsNotificationProcessorConfiguration, SyncDelayCalculator syncDelayCalculator) {
        this.mNotificationParser = notificationParser;
        this.mSplitTaskExecutor = fVar;
        this.mMySegmentsPayloadDecoder = mySegmentsV2PayloadDecoder;
        this.mCompressionProvider = c0715d;
        this.mConfiguration = mySegmentsNotificationProcessorConfiguration;
        this.mSyncDelayCalculator = syncDelayCalculator;
    }

    private void executeBoundedFetch(byte[] bArr, long j, NotificationType notificationType, Long l6) {
        if (this.mMySegmentsPayloadDecoder.isKeyInBitmap(bArr, this.mMySegmentsPayloadDecoder.computeKeyIndex(this.mConfiguration.getHashedUserKey(), bArr.length))) {
            a.d("Executing Bounded membership fetch request");
            notifyMySegmentRefreshNeeded(this.mConfiguration.getNotificationsQueue(), j, notificationType, l6);
        }
    }

    private void notifyMySegmentRefreshNeeded(BlockingQueue<C2261c> blockingQueue, long j, NotificationType notificationType, Long l6) {
        Long l8 = notificationType == NotificationType.MEMBERSHIPS_MS_UPDATE ? l6 : null;
        if (notificationType != NotificationType.MEMBERSHIPS_LS_UPDATE) {
            l6 = null;
        }
        blockingQueue.offer(new C2261c(Long.valueOf(j), l8, l6));
    }

    private void processUpdate(NotificationType notificationType, MySegmentUpdateStrategy mySegmentUpdateStrategy, String str, EnumC0712a enumC0712a, Set<String> set, Long l6, BlockingQueue<C2261c> blockingQueue, long j) {
        try {
            int i = AnonymousClass1.$SwitchMap$io$split$android$client$service$sseclient$notifications$MySegmentUpdateStrategy[mySegmentUpdateStrategy.ordinal()];
            if (i == 1) {
                a.d("Received Unbounded membership fetch request");
                notifyMySegmentRefreshNeeded(blockingQueue, j, notificationType, l6);
                return;
            }
            if (i == 2) {
                a.d("Received Bounded membership fetch request");
                executeBoundedFetch(this.mMySegmentsPayloadDecoder.decodeAsBytes(str, this.mCompressionProvider.a(enumC0712a)), j, notificationType, l6);
                return;
            }
            if (i == 3) {
                a.d("Received KeyList membership fetch request");
                updateSegments(notificationType, this.mMySegmentsPayloadDecoder.decodeAsString(str, this.mCompressionProvider.a(enumC0712a)), set, l6);
            } else if (i == 4) {
                a.d("Received membership removal request");
                removeSegment(notificationType, set, l6);
            } else {
                notifyMySegmentRefreshNeeded(blockingQueue, j, notificationType, l6);
                a.q("Unknown membership change notification type: " + mySegmentUpdateStrategy);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("Executing unbounded fetch because an error has occurred processing my ");
            sb2.append(notificationType == NotificationType.MEMBERSHIPS_LS_UPDATE ? "large" : "");
            sb2.append(" segment notification: ");
            sb2.append(e.getLocalizedMessage());
            a.g(sb2.toString());
            notifyMySegmentRefreshNeeded(blockingQueue, j, notificationType, l6);
        }
    }

    private void removeSegment(NotificationType notificationType, Set<String> set, Long l6) {
        si.f fVar;
        if (set == null) {
            return;
        }
        if (notificationType == NotificationType.MEMBERSHIPS_LS_UPDATE) {
            C2038a c2038a = (C2038a) this.mConfiguration.getMySegmentsTaskFactory();
            N n7 = (N) c2038a.f19100b;
            fVar = new si.f((b) n7.h, false, set, l6, (h) n7.c, (c) c2038a.c, (g) n7.f);
        } else {
            C2038a c2038a2 = (C2038a) this.mConfiguration.getMySegmentsTaskFactory();
            N n10 = (N) c2038a2.f19100b;
            fVar = new si.f((b) n10.f5026b, false, set, l6, (h) n10.c, (c) c2038a2.c, (g) n10.e);
        }
        ((AbstractC1780a) this.mSplitTaskExecutor).l(fVar, null);
    }

    private void updateSegments(NotificationType notificationType, String str, Set<String> set, Long l6) {
        si.f fVar;
        if (set == null) {
            return;
        }
        KeyList.Action keyListAction = this.mMySegmentsPayloadDecoder.getKeyListAction(this.mNotificationParser.parseKeyList(str), this.mConfiguration.getHashedUserKey());
        boolean z4 = keyListAction != KeyList.Action.REMOVE;
        if (keyListAction == KeyList.Action.NONE) {
            return;
        }
        boolean z5 = notificationType == NotificationType.MEMBERSHIPS_LS_UPDATE;
        StringBuilder sb2 = new StringBuilder("Executing KeyList my ");
        sb2.append(z5 ? "large " : "");
        sb2.append("segment fetch request: Adding = ");
        sb2.append(z4);
        a.d(sb2.toString());
        if (z5) {
            C2038a c2038a = (C2038a) this.mConfiguration.getMySegmentsTaskFactory();
            N n7 = (N) c2038a.f19100b;
            fVar = new si.f((b) n7.h, z4, set, l6, (h) n7.c, (c) c2038a.c, (g) n7.f);
        } else {
            C2038a c2038a2 = (C2038a) this.mConfiguration.getMySegmentsTaskFactory();
            N n10 = (N) c2038a2.f19100b;
            fVar = new si.f((b) n10.f5026b, z4, set, l6, (h) n10.c, (c) c2038a2.c, (g) n10.e);
        }
        ((AbstractC1780a) this.mSplitTaskExecutor).l(fVar, null);
    }

    @Override // io.split.android.client.service.sseclient.notifications.memberships.MembershipsNotificationProcessor
    public void process(@Nullable MembershipNotification membershipNotification) {
        if (membershipNotification == null) {
            notifyMySegmentRefreshNeeded(this.mConfiguration.getNotificationsQueue(), 0L, null, null);
        } else {
            processUpdate(membershipNotification.getType(), membershipNotification.getUpdateStrategy(), membershipNotification.getData(), membershipNotification.getCompression(), membershipNotification.getNames(), membershipNotification.getChangeNumber(), this.mConfiguration.getNotificationsQueue(), this.mSyncDelayCalculator.calculateSyncDelay(this.mConfiguration.getUserKey(), membershipNotification.getUpdateIntervalMs(), membershipNotification.getAlgorithmSeed(), membershipNotification.getUpdateStrategy(), membershipNotification.getHashingAlgorithm()));
        }
    }
}
