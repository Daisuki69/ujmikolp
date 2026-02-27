package com.dynatrace.agent.lifecycle;

import We.s;
import cj.C1110A;
import cj.C1132s;
import com.dynatrace.agent.OneAgentStartupEventDispatcher;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.di.SessionInformationProvider;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.lifecycle.model.AppStartupPhase;
import com.dynatrace.agent.lifecycle.model.AppStartupPhaseWithTiming;
import com.dynatrace.agent.lifecycle.model.AppStartupType;
import com.dynatrace.agent.lifecycle.model.VisibilityStatus;
import com.dynatrace.agent.lifecycle.util.AppStartupLogger;
import com.dynatrace.agent.metrics.SessionInformationMetrics;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AppStartupManagerImpl implements AppStartupManager {
    private final AppStartupLogger appStartupLogger;
    private boolean isProcessingStartup;
    private final List<AppStartupPhaseWithTiming> phases;
    private final List<AppStartupPhase> phasesOrder;
    private final OneAgentStartupEventDispatcher rumEventDispatcher;
    private final SessionInformationProvider sessionInformationProvider;
    private final TimeProvider timeProvider;
    private final Function0<VisibilityStatus> visibilityStatusProvider;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppStartupPhase.values().length];
            try {
                iArr[AppStartupPhase.APPLICATION_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppStartupPhase.ACTIVITY_CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppStartupPhase.ACTIVITY_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AppStartupPhase.ACTIVITY_RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppStartupManagerImpl(TimeProvider timeProvider, AppStartupLogger appStartupLogger, OneAgentStartupEventDispatcher rumEventDispatcher, SessionInformationProvider sessionInformationProvider, Function0<? extends VisibilityStatus> visibilityStatusProvider) {
        j.g(timeProvider, "timeProvider");
        j.g(appStartupLogger, "appStartupLogger");
        j.g(rumEventDispatcher, "rumEventDispatcher");
        j.g(sessionInformationProvider, "sessionInformationProvider");
        j.g(visibilityStatusProvider, "visibilityStatusProvider");
        this.timeProvider = timeProvider;
        this.appStartupLogger = appStartupLogger;
        this.rumEventDispatcher = rumEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
        this.visibilityStatusProvider = visibilityStatusProvider;
        this.phases = new ArrayList();
        this.phasesOrder = C1132s.g(AppStartupPhase.APPLICATION_CREATE, AppStartupPhase.ACTIVITY_CREATE, AppStartupPhase.ACTIVITY_START, AppStartupPhase.ACTIVITY_RESUMED);
    }

    private final boolean canProcessPhase() {
        if (this.visibilityStatusProvider.invoke() == VisibilityStatus.BACKGROUND) {
            this.isProcessingStartup = true;
        }
        return this.isProcessingStartup;
    }

    private final AppStartupType getStartupType() {
        int i = WhenMappings.$EnumSwitchMapping$0[((AppStartupPhaseWithTiming) C1110A.A(this.phases)).getPhase().ordinal()];
        if (i == 1) {
            return AppStartupType.COLD;
        }
        if (i == 2) {
            return AppStartupType.WARM;
        }
        if (i == 3) {
            return AppStartupType.HOT;
        }
        if (i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void onStartupEnd(AppStartupType appStartupType) throws JSONException {
        SessionInformationMetrics sessionInformationMetricsCollectSessionInfo = this.sessionInformationProvider.collectSessionInfo();
        if (!sessionInformationMetricsCollectSessionInfo.isGrailEventsCanBeCaptured()) {
            Utility.devLog(OneAgentLoggingKt.TAG_LIFECYCLE, "startup event cannot be tracked, isGrailEventsCanBeCaptured == false");
            this.phases.clear();
            return;
        }
        if (!sessionInformationMetricsCollectSessionInfo.getSessionActive()) {
            Utility.devLog(OneAgentLoggingKt.TAG_LIFECYCLE, "startup event cannot be tracked, session is disabled");
            this.phases.clear();
            return;
        }
        long start = ((AppStartupPhaseWithTiming) C1110A.A(this.phases)).getStart();
        long start2 = ((AppStartupPhaseWithTiming) C1110A.G(this.phases)).getStart();
        this.appStartupLogger.logApplicationStartup(appStartupType, start, start2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(EventKeys.Characteristics.HAS_APP_START, true);
        jSONObject.put(EventKeys.APPSTART.TYPE, appStartupType.getValue());
        int i = 0;
        for (Object obj : this.phases) {
            int i4 = i + 1;
            if (i < 0) {
                C1132s.k();
                throw null;
            }
            AppStartupPhaseWithTiming appStartupPhaseWithTiming = (AppStartupPhaseWithTiming) obj;
            AppStartupPhaseWithTiming appStartupPhaseWithTiming2 = (AppStartupPhaseWithTiming) C1110A.C(i4, this.phases);
            if (appStartupPhaseWithTiming2 != null) {
                long start3 = appStartupPhaseWithTiming2.getStart();
                if (appStartupPhaseWithTiming.getPhase() != AppStartupPhase.ACTIVITY_RESUMED) {
                    jSONObject.put(EventKeys.APPSTART.NAMESPACE + appStartupPhaseWithTiming.getPhase().getValue() + ".start_time", appStartupPhaseWithTiming.getStart() - start);
                    jSONObject.put(EventKeys.APPSTART.NAMESPACE + appStartupPhaseWithTiming.getPhase().getValue() + ".end_time", start3 - start);
                }
            }
            i = i4;
        }
        this.rumEventDispatcher.dispatchNativeEvent(jSONObject, start, start2 - start, sessionInformationMetricsCollectSessionInfo);
        this.phases.clear();
    }

    private final void processStartupPhases() throws JSONException {
        AppStartupType startupType = getStartupType();
        if (startupType == null) {
            return;
        }
        if (this.phases.size() == 1) {
            this.appStartupLogger.logApplicationStartupBegin(startupType, ((AppStartupPhaseWithTiming) C1110A.A(this.phases)).getStart());
        } else if (this.phases.size() > 1) {
            this.appStartupLogger.logPhase(startupType, ((AppStartupPhaseWithTiming) s.e(2, this.phases)).getPhase(), ((AppStartupPhaseWithTiming) s.e(2, this.phases)).getStart(), ((AppStartupPhaseWithTiming) C1110A.G(this.phases)).getStart());
            if (((AppStartupPhaseWithTiming) C1110A.G(this.phases)).getPhase() == AppStartupPhase.ACTIVITY_RESUMED) {
                this.isProcessingStartup = false;
                onStartupEnd(startupType);
            }
        }
    }

    @Override // com.dynatrace.agent.lifecycle.AppStartupManager
    public void onStartupPhase(AppStartupPhase startupPhase) throws JSONException {
        int iIndexOf;
        j.g(startupPhase, "startupPhase");
        if (canProcessPhase()) {
            if (!this.phases.isEmpty() && (iIndexOf = this.phasesOrder.indexOf(((AppStartupPhaseWithTiming) C1110A.G(this.phases)).getPhase())) != C1132s.f(this.phasesOrder) && this.phasesOrder.get(iIndexOf + 1) != startupPhase) {
                AppStartupType startupType = getStartupType();
                if (startupType != null) {
                    this.appStartupLogger.logApplicationStartupCancel(startupType);
                }
                this.phases.clear();
            }
            this.phases.add(new AppStartupPhaseWithTiming(startupPhase, this.timeProvider.millisSinceEpoch()));
            processStartupPhases();
        }
    }
}
