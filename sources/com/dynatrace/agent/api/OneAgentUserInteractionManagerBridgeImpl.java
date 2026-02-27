package com.dynatrace.agent.api;

import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.layout.LayoutInfo;
import com.dynatrace.agent.userinteraction.OneAgentUserInteractionManager;
import com.dynatrace.android.agent.useraction.OneAgentUserInteractionManagerBridge;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class OneAgentUserInteractionManagerBridgeImpl implements OneAgentUserInteractionManagerBridge {
    private final OneAgentUserInteractionManager oneAgentUserInteractionManager;

    public OneAgentUserInteractionManagerBridgeImpl(OneAgentUserInteractionManager oneAgentUserInteractionManager) {
        j.g(oneAgentUserInteractionManager, "oneAgentUserInteractionManager");
        this.oneAgentUserInteractionManager = oneAgentUserInteractionManager;
    }

    @Override // com.dynatrace.android.agent.useraction.OneAgentUserInteractionManagerBridge
    public void onComposeHit(LayoutInfo hitArea, List<? extends LayoutInfo> overlappedAreas, List<? extends List<String>> sequentialList) {
        j.g(hitArea, "hitArea");
        j.g(overlappedAreas, "overlappedAreas");
        j.g(sequentialList, "sequentialList");
        this.oneAgentUserInteractionManager.onComposeHit(hitArea, overlappedAreas, sequentialList);
    }

    @Override // com.dynatrace.android.agent.useraction.OneAgentUserInteractionManagerBridge
    public void onMotionEvent(View rootView, MotionEvent event) {
        j.g(rootView, "rootView");
        j.g(event, "event");
        this.oneAgentUserInteractionManager.onMotionEvent(rootView, event);
    }

    @Override // com.dynatrace.android.agent.useraction.OneAgentUserInteractionManagerBridge
    public void onViewClick(View view) {
        j.g(view, "view");
        this.oneAgentUserInteractionManager.onViewClick(view);
    }
}
