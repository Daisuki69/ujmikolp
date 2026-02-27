package com.dynatrace.android.agent;

import com.dynatrace.android.ragetap.detection.RageTapListener;
import com.dynatrace.android.window.WindowListenerFactory;

/* JADX INFO: loaded from: classes2.dex */
public interface SessionReplayComponentProvider {
    AgentStateListener generateAgentStateListener();

    RageTapListener generateRageTapListener();

    WindowListenerFactory generateWindowListenerFactory();
}
