package com.dynatrace.android.agent.useraction;

import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.layout.LayoutInfo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface OneAgentUserInteractionManagerBridge {
    void onComposeHit(LayoutInfo layoutInfo, List<LayoutInfo> list, List<List<String>> list2);

    void onMotionEvent(View view, MotionEvent motionEvent);

    void onViewClick(View view);
}
