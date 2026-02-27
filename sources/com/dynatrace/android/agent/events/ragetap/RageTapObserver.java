package com.dynatrace.android.agent.events.ragetap;

import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.metrics.AndroidMetrics;
import com.dynatrace.android.lifecycle.SimpleClassNameGenerator;
import com.dynatrace.android.ragetap.detection.RageTap;
import com.dynatrace.android.ragetap.detection.RageTapListener;
import com.dynatrace.android.useraction.ActionNameCustomizer;

/* JADX INFO: loaded from: classes2.dex */
public class RageTapObserver implements RageTapListener {
    private final RageTapSegmentFactory rageTapSegmentFactory = new RageTapSegmentFactory();
    private final ActionNameCustomizer activityNameCustomizer = new SimpleClassNameGenerator();

    @Override // com.dynatrace.android.ragetap.detection.RageTapListener
    public void onRageTap(Session session, RageTap rageTap, boolean z4) {
        if (Dynatrace.getCaptureStatus()) {
            String currentActivityName = AndroidMetrics.getInstance().getCurrentActivityName();
            RageTapSegment rageTapSegmentCreateSegment = this.rageTapSegmentFactory.createSegment(rageTap, currentActivityName == null ? null : this.activityNameCustomizer.customize(currentActivityName), Session.determineActiveSession(!z4, rageTap.getFirstTap().getTapDown().getTimestamp()), AdkSettings.getInstance().serverId);
            Core.getCalloutTable().addOtherEvent();
            Core.saveSegment(rageTapSegmentCreateSegment);
        }
    }
}
