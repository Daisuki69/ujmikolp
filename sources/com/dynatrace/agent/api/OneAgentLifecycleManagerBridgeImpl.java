package com.dynatrace.agent.api;

import com.dynatrace.agent.lifecycle.OneAgentLifecycleManager;
import com.dynatrace.android.agent.lifecycle.OneAgentLifecycleManagerBridge;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class OneAgentLifecycleManagerBridgeImpl implements OneAgentLifecycleManagerBridge {
    private final OneAgentLifecycleManager oneAgentLifecycleManager;

    public OneAgentLifecycleManagerBridgeImpl(OneAgentLifecycleManager oneAgentLifecycleManager) {
        j.g(oneAgentLifecycleManager, "oneAgentLifecycleManager");
        this.oneAgentLifecycleManager = oneAgentLifecycleManager;
    }

    @Override // com.dynatrace.android.agent.lifecycle.OneAgentLifecycleManagerBridge
    public void onAgentShutdown() {
        Utility.devLog(OneAgentLoggingKt.TAG_START_STOP_AGENT, "stop OneAgent, unregister lifecycle callbacks");
        this.oneAgentLifecycleManager.onAgentShutdown();
    }

    @Override // com.dynatrace.android.agent.lifecycle.OneAgentLifecycleManagerBridge
    public void onAppStart() {
        Utility.devLog(OneAgentLoggingKt.TAG_LIFECYCLE, "onAppStart");
        this.oneAgentLifecycleManager.onAppStart();
    }
}
