package com.dynatrace.agent.userinteraction;

import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.layout.LayoutInfo;
import com.dynatrace.agent.userinteraction.handler.TouchUserInteractionHandler;
import com.dynatrace.agent.userinteraction.handler.UserInteractionHandler;
import com.dynatrace.agent.userinteraction.handler.UserInteractionHandlerFactory;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class OneAgentUserInteractionManagerImpl implements OneAgentUserInteractionManager {
    private final TouchUserInteractionHandler touchUserInteractionHandler;

    public OneAgentUserInteractionManagerImpl(UserInteractionHandlerFactory userInteractionHandlerFactory) {
        j.g(userInteractionHandlerFactory, "userInteractionHandlerFactory");
        UserInteractionHandler userInteractionHandlerCreate = userInteractionHandlerFactory.create(UserInteractionHandler.Type.TOUCH);
        j.e(userInteractionHandlerCreate, "null cannot be cast to non-null type com.dynatrace.agent.userinteraction.handler.TouchUserInteractionHandler");
        this.touchUserInteractionHandler = (TouchUserInteractionHandler) userInteractionHandlerCreate;
    }

    @Override // com.dynatrace.agent.userinteraction.OneAgentUserInteractionManager
    public void onComposeHit(LayoutInfo hitArea, List<? extends LayoutInfo> overlappedAreas, List<? extends List<String>> sequentialList) {
        j.g(hitArea, "hitArea");
        j.g(overlappedAreas, "overlappedAreas");
        j.g(sequentialList, "sequentialList");
        this.touchUserInteractionHandler.onComposeHit$com_dynatrace_agent_release(hitArea, overlappedAreas, sequentialList);
    }

    @Override // com.dynatrace.agent.userinteraction.OneAgentUserInteractionManager
    public void onMotionEvent(View rootView, MotionEvent event) {
        j.g(rootView, "rootView");
        j.g(event, "event");
        this.touchUserInteractionHandler.onMotionEvent$com_dynatrace_agent_release(rootView, event);
    }

    @Override // com.dynatrace.agent.userinteraction.OneAgentUserInteractionManager
    public void onViewClick(View view) {
        j.g(view, "view");
        this.touchUserInteractionHandler.onViewClick$com_dynatrace_agent_release(view);
    }
}
