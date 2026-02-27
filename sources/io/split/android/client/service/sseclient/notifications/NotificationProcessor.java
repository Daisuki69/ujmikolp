package io.split.android.client.service.sseclient.notifications;

import Ri.a;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.JsonSyntaxException;
import defpackage.AbstractC1414e;
import io.split.android.client.dtos.Split;
import io.split.android.client.service.sseclient.notifications.memberships.MembershipsNotificationProcessor;
import io.split.android.client.service.sseclient.notifications.mysegments.MySegmentsNotificationProcessorRegistry;
import io.split.android.client.storage.splits.c;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import ki.AbstractC1780a;
import ki.f;
import ki.g;
import ki.h;

/* JADX INFO: loaded from: classes4.dex */
public class NotificationProcessor implements MySegmentsNotificationProcessorRegistry {
    private final ConcurrentMap<String, MembershipsNotificationProcessor> mMembershipsNotificationProcessors;
    private final NotificationParser mNotificationParser;
    private final f mSplitTaskExecutor;
    private final g mSplitTaskFactory;
    private final BlockingQueue<InstantUpdateChangeNotification> mSplitsUpdateNotificationsQueue;

    /* JADX INFO: renamed from: io.split.android.client.service.sseclient.notifications.NotificationProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$split$android$client$service$sseclient$notifications$NotificationType;

        static {
            int[] iArr = new int[NotificationType.values().length];
            $SwitchMap$io$split$android$client$service$sseclient$notifications$NotificationType = iArr;
            try {
                iArr[NotificationType.SPLIT_UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$split$android$client$service$sseclient$notifications$NotificationType[NotificationType.RULE_BASED_SEGMENT_UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$split$android$client$service$sseclient$notifications$NotificationType[NotificationType.SPLIT_KILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$split$android$client$service$sseclient$notifications$NotificationType[NotificationType.MEMBERSHIPS_MS_UPDATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$split$android$client$service$sseclient$notifications$NotificationType[NotificationType.MEMBERSHIPS_LS_UPDATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public NotificationProcessor(@NonNull f fVar, @NonNull g gVar, @NonNull NotificationParser notificationParser, @NonNull BlockingQueue<InstantUpdateChangeNotification> blockingQueue) {
        Objects.requireNonNull(fVar);
        this.mSplitTaskExecutor = fVar;
        Objects.requireNonNull(gVar);
        this.mSplitTaskFactory = gVar;
        Objects.requireNonNull(notificationParser);
        this.mNotificationParser = notificationParser;
        Objects.requireNonNull(blockingQueue);
        this.mSplitsUpdateNotificationsQueue = blockingQueue;
        this.mMembershipsNotificationProcessors = new ConcurrentHashMap();
    }

    private void processMembershipsUpdate(@Nullable MembershipNotification membershipNotification) {
        Iterator<MembershipsNotificationProcessor> it = this.mMembershipsNotificationProcessors.values().iterator();
        while (it.hasNext()) {
            it.next().process(membershipNotification);
        }
    }

    private void processRuleBasedSegmentUpdate(RuleBasedSegmentChangeNotification ruleBasedSegmentChangeNotification) {
        a.d("Received rule based segment change notification");
        this.mSplitsUpdateNotificationsQueue.offer(ruleBasedSegmentChangeNotification);
    }

    private void processSplitKill(SplitKillNotification splitKillNotification) {
        Split split = new Split();
        split.name = splitKillNotification.getSplitName();
        split.defaultTreatment = splitKillNotification.getDefaultTreatment();
        split.changeNumber = splitKillNotification.getChangeNumber();
        f fVar = this.mSplitTaskExecutor;
        h hVar = (h) this.mSplitTaskFactory;
        ((AbstractC1780a) fVar).l(new Ci.a((c) hVar.f18141b.f914a, split, hVar.f18143g), null);
        this.mSplitsUpdateNotificationsQueue.offer(new SplitsChangeNotification(split.changeNumber));
    }

    private void processSplitUpdate(SplitsChangeNotification splitsChangeNotification) {
        a.d("Received feature flag change notification");
        this.mSplitsUpdateNotificationsQueue.offer(splitsChangeNotification);
    }

    public void process(IncomingNotification incomingNotification) {
        try {
            String jsonData = incomingNotification.getJsonData();
            int i = AnonymousClass1.$SwitchMap$io$split$android$client$service$sseclient$notifications$NotificationType[incomingNotification.getType().ordinal()];
            if (i == 1) {
                processSplitUpdate(this.mNotificationParser.parseSplitUpdate(jsonData));
                return;
            }
            if (i == 2) {
                processRuleBasedSegmentUpdate(this.mNotificationParser.parseRuleBasedSegmentUpdate(jsonData));
                return;
            }
            if (i == 3) {
                processSplitKill(this.mNotificationParser.parseSplitKill(jsonData));
                return;
            }
            if (i == 4 || i == 5) {
                processMembershipsUpdate(this.mNotificationParser.parseMembershipNotification(jsonData));
                return;
            }
            a.g("Unknown notification arrived: " + jsonData);
        } catch (JsonSyntaxException e) {
            a.g("Error processing incoming push notification: " + e.getLocalizedMessage());
        } catch (Exception e7) {
            AbstractC1414e.o(e7, new StringBuilder("Unknown error while processing incoming push notification: "));
        }
    }

    @Override // io.split.android.client.service.sseclient.notifications.mysegments.MySegmentsNotificationProcessorRegistry
    public void registerMembershipsNotificationProcessor(String str, MembershipsNotificationProcessor membershipsNotificationProcessor) {
        this.mMembershipsNotificationProcessors.put(str, membershipsNotificationProcessor);
    }

    @Override // io.split.android.client.service.sseclient.notifications.mysegments.MySegmentsNotificationProcessorRegistry
    public void unregisterMembershipsProcessor(String str) {
        this.mMembershipsNotificationProcessors.remove(str);
    }
}
