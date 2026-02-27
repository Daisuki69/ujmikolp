package com.dynatrace.android.compose.userinteraction.handler;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.unit.IntSizeKt;
import cj.C1110A;
import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.useraction.OneAgentUserInteractionManagerBridge;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.compose.userinteraction.handler.TouchUserInteractionHandler;
import com.dynatrace.android.compose.userinteraction.uitl.UserInteractionsUtilKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import yj.q;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class TouchUserInteractionHandler {
    public static final int $stable = 8;
    private final List<LayoutInfo> layoutList = new ArrayList();

    private final List<LayoutInfo> getOverlappedLayouts(final Rect rect) {
        return q.q(q.h(C1110A.u(this.layoutList), new Function1() { // from class: A0.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TouchUserInteractionHandler.getOverlappedLayouts$lambda$0(rect, (LayoutInfo) obj));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOverlappedLayouts$lambda$0(Rect rect, LayoutInfo layoutInfo) {
        j.g(layoutInfo, "layoutInfo");
        return UserInteractionsUtilKt.isValid(layoutInfo) && LayoutCoordinatesKt.boundsInWindow(layoutInfo.getCoordinates()).overlaps(rect);
    }

    public final void onAttach$agent_instrumentorAPI_compose_release(LayoutInfo layoutInfo) {
        j.g(layoutInfo, "layoutInfo");
        this.layoutList.add(layoutInfo);
    }

    public final void onDetach$agent_instrumentorAPI_compose_release(LayoutInfo layoutInfo) {
        j.g(layoutInfo, "layoutInfo");
        this.layoutList.remove(layoutInfo);
    }

    public final void onNodeCoordinatorHit$agent_instrumentorAPI_compose_release(LayoutInfo layoutInfo, boolean z4, List<? extends List<String>> sequentialPathList) {
        j.g(layoutInfo, "layoutInfo");
        j.g(sequentialPathList, "sequentialPathList");
        if (UserInteractionsUtilKt.isValid(layoutInfo) && !z4) {
            Rect rect = RectKt.Rect-tz77jQw(LayoutCoordinatesKt.positionInWindow(layoutInfo.getCoordinates()), IntSizeKt.toSize-ozmzZPI(layoutInfo.getCoordinates().getSize-YbymL2g()));
            List<LayoutInfo> overlappedLayouts = getOverlappedLayouts(rect);
            Utility.devLog(OneAgentLoggingKt.TAG_USER_INTERACTION, "NodeCoordinator hit in area " + rect + " for " + layoutInfo.getSemanticsId());
            OneAgentUserInteractionManagerBridge oneAgentUserInteractionManagerBridge = Core.getOneAgentUserInteractionManagerBridge();
            if (oneAgentUserInteractionManagerBridge != null) {
                oneAgentUserInteractionManagerBridge.onComposeHit(layoutInfo, overlappedLayouts, sequentialPathList);
            }
        }
    }
}
