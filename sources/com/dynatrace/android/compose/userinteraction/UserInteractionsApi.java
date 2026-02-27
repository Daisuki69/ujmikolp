package com.dynatrace.android.compose.userinteraction;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutInfo;
import com.dynatrace.android.compose.userinteraction.handler.TouchUserInteractionHandler;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class UserInteractionsApi {
    public static final UserInteractionsApi INSTANCE = new UserInteractionsApi();
    private static final TouchUserInteractionHandler touchUserInteractionHandler = new TouchUserInteractionHandler();
    public static final int $stable = 8;

    private UserInteractionsApi() {
    }

    public static final void onAttach(LayoutInfo layoutInfo) {
        j.g(layoutInfo, "layoutInfo");
        touchUserInteractionHandler.onAttach$agent_instrumentorAPI_compose_release(layoutInfo);
    }

    public static final void onDetach(LayoutInfo layoutInfo) {
        j.g(layoutInfo, "layoutInfo");
        touchUserInteractionHandler.onDetach$agent_instrumentorAPI_compose_release(layoutInfo);
    }

    public static final void onNodeCoordinatorHit(LayoutInfo layoutInfo, boolean z4, List<? extends List<String>> sequentialPathList) {
        j.g(layoutInfo, "layoutInfo");
        j.g(sequentialPathList, "sequentialPathList");
        touchUserInteractionHandler.onNodeCoordinatorHit$agent_instrumentorAPI_compose_release(layoutInfo, z4, sequentialPathList);
    }
}
