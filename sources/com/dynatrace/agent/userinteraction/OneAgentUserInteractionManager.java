package com.dynatrace.agent.userinteraction;

import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.layout.LayoutInfo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface OneAgentUserInteractionManager {
    void onComposeHit(LayoutInfo layoutInfo, List<? extends LayoutInfo> list, List<? extends List<String>> list2);

    void onMotionEvent(View view, MotionEvent motionEvent);

    void onViewClick(View view);
}
