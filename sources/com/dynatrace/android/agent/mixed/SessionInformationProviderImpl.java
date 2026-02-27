package com.dynatrace.android.agent.mixed;

import com.dynatrace.agent.di.SessionInformationProvider;
import com.dynatrace.agent.metrics.SessionInformationMetrics;
import com.dynatrace.android.agent.data.Session;

/* JADX INFO: loaded from: classes2.dex */
public class SessionInformationProviderImpl implements SessionInformationProvider {
    @Override // com.dynatrace.agent.di.SessionInformationProvider
    public SessionInformationMetrics collectSessionInfo() {
        return SessionInformationGenerator.generate(Session.determineActiveSessionForInternalEvent());
    }
}
