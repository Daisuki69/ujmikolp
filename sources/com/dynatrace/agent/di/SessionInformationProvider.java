package com.dynatrace.agent.di;

import com.dynatrace.agent.metrics.SessionInformationMetrics;

/* JADX INFO: loaded from: classes2.dex */
public interface SessionInformationProvider {
    SessionInformationMetrics collectSessionInfo();
}
