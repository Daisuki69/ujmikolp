package com.dynatrace.agent.exitreason;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.media3.extractor.ts.TsExtractor;
import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.di.SessionInformationProvider;
import com.dynatrace.agent.exitreason.convertor.ExitReasonConverter;
import com.dynatrace.agent.metrics.MetricsRepository;
import com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource;
import com.dynatrace.agent.storage.preference.MetricsData;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import ij.InterfaceC1611e;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ExitReasonProcessor {
    private final Context context;
    private final ExitReasonConverter exitReasonEventConvertor;
    private final DataStoreExitReasonTimestampDataSource exitReasonTimestampDataSource;
    private final boolean isAnrReportingEnabled;
    private final boolean isNativeCrashReportingEnabled;
    private final MetricsRepository metricsRepository;
    private final long retentionTime;
    private final RumEventDispatcher rumEventDispatcher;
    private final SessionInformationProvider sessionInformationProvider;
    private final TimeProvider timeProvider;

    public static final class EventWithTimestamp {
        private final JSONObject event;
        private final long timestamp;

        public EventWithTimestamp(JSONObject event, long j) {
            j.g(event, "event");
            this.event = event;
            this.timestamp = j;
        }

        public static /* synthetic */ EventWithTimestamp copy$default(EventWithTimestamp eventWithTimestamp, JSONObject jSONObject, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                jSONObject = eventWithTimestamp.event;
            }
            if ((i & 2) != 0) {
                j = eventWithTimestamp.timestamp;
            }
            return eventWithTimestamp.copy(jSONObject, j);
        }

        public final JSONObject component1() {
            return this.event;
        }

        public final long component2() {
            return this.timestamp;
        }

        public final EventWithTimestamp copy(JSONObject event, long j) {
            j.g(event, "event");
            return new EventWithTimestamp(event, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EventWithTimestamp)) {
                return false;
            }
            EventWithTimestamp eventWithTimestamp = (EventWithTimestamp) obj;
            return j.b(this.event, eventWithTimestamp.event) && this.timestamp == eventWithTimestamp.timestamp;
        }

        public final JSONObject getEvent() {
            return this.event;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            int iHashCode = this.event.hashCode() * 31;
            long j = this.timestamp;
            return iHashCode + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "EventWithTimestamp(event=" + this.event + ", timestamp=" + this.timestamp + ')';
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.exitreason.ExitReasonProcessor$processExitReasons$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.exitreason.ExitReasonProcessor", f = "ExitReasonProcessor.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3, 163}, m = "processExitReasons")
    public static final class AnonymousClass1 extends AbstractC1609c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ExitReasonProcessor.this.processExitReasons(null, null, this);
        }
    }

    public ExitReasonProcessor(ExitReasonConverter exitReasonEventConvertor, DataStoreExitReasonTimestampDataSource exitReasonTimestampDataSource, TimeProvider timeProvider, long j, Context context, RumEventDispatcher rumEventDispatcher, SessionInformationProvider sessionInformationProvider, MetricsRepository metricsRepository, boolean z4, boolean z5) {
        j.g(exitReasonEventConvertor, "exitReasonEventConvertor");
        j.g(exitReasonTimestampDataSource, "exitReasonTimestampDataSource");
        j.g(timeProvider, "timeProvider");
        j.g(context, "context");
        j.g(rumEventDispatcher, "rumEventDispatcher");
        j.g(sessionInformationProvider, "sessionInformationProvider");
        j.g(metricsRepository, "metricsRepository");
        this.exitReasonEventConvertor = exitReasonEventConvertor;
        this.exitReasonTimestampDataSource = exitReasonTimestampDataSource;
        this.timeProvider = timeProvider;
        this.retentionTime = j;
        this.context = context;
        this.rumEventDispatcher = rumEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
        this.metricsRepository = metricsRepository;
        this.isNativeCrashReportingEnabled = z4;
        this.isAnrReportingEnabled = z5;
    }

    @RequiresApi(30)
    private final EventWithTimestamp buildEventOrNull(ApplicationExitInfo applicationExitInfo) {
        int reason = applicationExitInfo.getReason();
        JSONObject jSONObjectConvertAnr = reason != 5 ? reason != 6 ? null : this.exitReasonEventConvertor.convertAnr(applicationExitInfo) : this.exitReasonEventConvertor.convertNativeCrash(applicationExitInfo);
        if (jSONObjectConvertAnr != null) {
            return new EventWithTimestamp(jSONObjectConvertAnr, applicationExitInfo.getTimestamp());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @androidx.annotation.RequiresApi(30)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processExitReasons(java.util.List<android.app.ApplicationExitInfo> r23, com.dynatrace.agent.storage.preference.MetricsData r24, gj.InterfaceC1526a<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.exitreason.ExitReasonProcessor.processExitReasons(java.util.List, com.dynatrace.agent.storage.preference.MetricsData, gj.a):java.lang.Object");
    }

    @RequiresApi(30)
    private final boolean shouldBeProcessed(ApplicationExitInfo applicationExitInfo) {
        int reason = applicationExitInfo.getReason();
        if (reason == 5) {
            return this.isNativeCrashReportingEnabled;
        }
        if (reason != 6) {
            return false;
        }
        return this.isAnrReportingEnabled;
    }

    @RequiresApi(30)
    public final Object process(InterfaceC1526a<? super Unit> interfaceC1526a) {
        MetricsData metricsFromPreviousSession = this.metricsRepository.getMetricsFromPreviousSession();
        if (metricsFromPreviousSession == null) {
            Utility.devLog(OneAgentLoggingKt.TAG_START_STOP_AGENT, "ANR and native crash reporting disabled because we do not have metrics from previous session");
            return Unit.f18162a;
        }
        boolean zIsGrailEventsCanBeCaptured = this.sessionInformationProvider.collectSessionInfo().isGrailEventsCanBeCaptured();
        boolean z4 = (this.isNativeCrashReportingEnabled || this.isAnrReportingEnabled) && zIsGrailEventsCanBeCaptured;
        Object systemService = this.context.getSystemService("activity");
        j.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) systemService).getHistoricalProcessExitReasons(null, 0, 0);
        j.f(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
        if (historicalProcessExitReasons.isEmpty()) {
            Utility.devLog(OneAgentLoggingKt.TAG_CRASH_TRACKER, "there are no exit reasons");
            return Unit.f18162a;
        }
        if (!z4) {
            Utility.devLog(OneAgentLoggingKt.TAG_CRASH_TRACKER, "ANR and native crash reporting disabled because:isNativeCrashReportingEnabled=" + this.isNativeCrashReportingEnabled + ", isAnrReportingEnabled=" + this.isAnrReportingEnabled + ",isGrailEventsCanBeCaptured=" + zIsGrailEventsCanBeCaptured);
            Object objSaveCrashTimestamp = this.exitReasonTimestampDataSource.saveCrashTimestamp(this.timeProvider.millisSinceEpoch(), interfaceC1526a);
            return objSaveCrashTimestamp == EnumC1578a.f17050a ? objSaveCrashTimestamp : Unit.f18162a;
        }
        if (metricsFromPreviousSession.getSessionActive() && metricsFromPreviousSession.getCrashReportingOptIn()) {
            Utility.devLog(OneAgentLoggingKt.TAG_CRASH_TRACKER, "start processing exit reasons");
            Object objProcessExitReasons = processExitReasons(historicalProcessExitReasons, metricsFromPreviousSession, interfaceC1526a);
            return objProcessExitReasons == EnumC1578a.f17050a ? objProcessExitReasons : Unit.f18162a;
        }
        Utility.devLog(OneAgentLoggingKt.TAG_CRASH_TRACKER, "ANRs or native crashes are not reported because previous session should not capture it: sessionActive=" + metricsFromPreviousSession.getSessionActive() + ", crashReportingOptIn=" + metricsFromPreviousSession.getCrashReportingOptIn());
        Object objSaveCrashTimestamp2 = this.exitReasonTimestampDataSource.saveCrashTimestamp(this.timeProvider.millisSinceEpoch(), interfaceC1526a);
        return objSaveCrashTimestamp2 == EnumC1578a.f17050a ? objSaveCrashTimestamp2 : Unit.f18162a;
    }
}
