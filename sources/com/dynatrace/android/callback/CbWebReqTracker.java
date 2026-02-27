package com.dynatrace.android.callback;

import We.s;
import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.CustomSegment;
import com.dynatrace.android.agent.DTXAutoAction;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.GuardedEventDispatcher;
import com.dynatrace.android.agent.WebReqSegment;
import com.dynatrace.android.agent.WebReqTag;
import com.dynatrace.android.agent.WebRequestUtils;
import com.dynatrace.android.agent.conf.PrivacyRules;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.mixed.AutoWebRequestEventGenerator;
import com.dynatrace.android.agent.mixed.SessionInformationGenerator;
import com.dynatrace.android.agent.mixed.WebRequestTraceContext;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.callback.CbConstants;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class CbWebReqTracker {
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "CbWebReqTracker");
    DTXAutoAction action;
    boolean canFinalize;
    private long endTime;
    private String eventData;
    private String server;
    final Session session;
    long startTime;
    WebReqStateParms stateParm;
    WebReqTag webReqTag;
    private CustomSegment wrtEvent;
    private long requestLength = -1;
    private long responseLength = -1;
    private Map<String, List<String>> requestHeaders = null;
    private Map<String, List<String>> responseHeaders = null;
    private WebRequestTraceContext traceContext = null;

    /* JADX INFO: renamed from: com.dynatrace.android.callback.CbWebReqTracker$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$dynatrace$android$callback$CbConstants$WrStates;

        static {
            int[] iArr = new int[CbConstants.WrStates.values().length];
            $SwitchMap$com$dynatrace$android$callback$CbConstants$WrStates = iArr;
            try {
                iArr[CbConstants.WrStates.PRE_EXEC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$dynatrace$android$callback$CbConstants$WrStates[CbConstants.WrStates.POST_EXEC_ERR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$dynatrace$android$callback$CbConstants$WrStates[CbConstants.WrStates.POST_EXEC_OK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$dynatrace$android$callback$CbConstants$WrStates[CbConstants.WrStates.POST_EXEC_FINALIZE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public CbWebReqTracker(DTXAutoAction dTXAutoAction, Session session) {
        this.action = dTXAutoAction;
        this.session = session;
    }

    private void abandonTagAndUserAction() {
        DTXAutoAction dTXAutoAction = this.action;
        if (dTXAutoAction != null) {
            dTXAutoAction.removeChildEvent(this.webReqTag.toString());
        }
        this.webReqTag = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendEvents$0(WebReqStateParms webReqStateParms, RumEventDispatcher rumEventDispatcher) {
        PrivacyRules privacyRules = this.session.getPrivacyRules();
        EventType eventType = EventType.EVENT_API;
        if (!privacyRules.shouldCollectEvent(eventType)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "auto web request event shouldn't be collected, because of data collection level: " + eventType);
            return;
        }
        if (!webReqStateParms.isSupportedByGrail()) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "auto web request event not supported by: ".concat(webReqStateParms.getClass().getName()));
            return;
        }
        JSONObject jSONObjectGenerateRumRequestEvent = setUpEventGenerator(webReqStateParms, WebRequestUtils.removeUrlCredentials(webReqStateParms.getUrl().toString())).generateRumRequestEvent();
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "auto web request event is generated: " + jSONObjectGenerateRumRequestEvent);
        if (jSONObjectGenerateRumRequestEvent == null) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "invalid RUM Request event for url " + webReqStateParms.getUrl().toString());
        } else {
            long sessionStartTime = this.session.getSessionStartTime();
            long j = this.startTime;
            rumEventDispatcher.dispatchEvent(jSONObjectGenerateRumRequestEvent, sessionStartTime + j, this.endTime - j, SessionInformationGenerator.generate(this.session), false, webReqStateParms.getWebContext());
        }
    }

    private AutoWebRequestEventGenerator setUpEventGenerator(WebReqStateParms webReqStateParms, WebRequestUtils.FormattedUrl formattedUrl) {
        AutoWebRequestEventGenerator autoWebRequestEventGenerator = new AutoWebRequestEventGenerator();
        autoWebRequestEventGenerator.setUrl(formattedUrl.oneAgentUrl);
        autoWebRequestEventGenerator.setException(webReqStateParms.exception);
        autoWebRequestEventGenerator.setNetworkProtocolName(webReqStateParms.getUrl().getProtocol());
        autoWebRequestEventGenerator.setHttpRequestMethod(webReqStateParms.getRequestMethod());
        autoWebRequestEventGenerator.setStatusCode(webReqStateParms.respCode);
        autoWebRequestEventGenerator.setReasonPhrase(webReqStateParms.reasonPhrase);
        autoWebRequestEventGenerator.setHttpRequestHeaders(this.requestHeaders);
        autoWebRequestEventGenerator.setHttpResponseHeaders(this.responseHeaders);
        autoWebRequestEventGenerator.setWebRequestTraceContext(this.traceContext);
        return autoWebRequestEventGenerator;
    }

    public boolean checkForManualTag(String str, String str2) {
        WebReqTag webReqTag = this.webReqTag;
        if (webReqTag == null) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "ManualTag '" + str + "' is used");
            }
            return false;
        }
        if (!webReqTag.sameAs(str)) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, s.l("AutoTag ", this.webReqTag.toString(), " != ManualTag '", str, "'"));
            }
            abandonTagAndUserAction();
            return false;
        }
        if (str2 == null) {
            return false;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "ManualTag x-dtc exists: '" + str2 + "'");
        }
        abandonTagAndUserAction();
        return true;
    }

    public WebRequestTraceContext getTraceContext() {
        return this.traceContext;
    }

    public void procNewState(WebReqStateParms webReqStateParms) {
        if (this.server == null) {
            this.server = webReqStateParms.getRequestHost();
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, webReqStateParms.getRequestMethod() + "/" + webReqStateParms.trackingMethod + "/" + webReqStateParms.state);
        }
        int i = AnonymousClass1.$SwitchMap$com$dynatrace$android$callback$CbConstants$WrStates[webReqStateParms.state.ordinal()];
        if (i == 1) {
            if (this.startTime <= 0) {
                this.startTime = this.session.getRunningTime();
            }
            long j = this.requestLength;
            if (j >= 0) {
                webReqStateParms.requestLength = j;
            } else if (webReqStateParms instanceof ConnStateParms) {
                ((ConnStateParms) webReqStateParms).calcRequestBytes(webReqStateParms.trackingMethod == CbConstants.WrMethod.getOutputStream);
            }
            long j6 = this.responseLength;
            if (j6 >= 0) {
                webReqStateParms.responseLength = j6;
            }
            Map<String, List<String>> map = this.requestHeaders;
            if (map != null) {
                webReqStateParms.requestHeaders = map;
            } else if (webReqStateParms instanceof ConnStateParms) {
                ((ConnStateParms) webReqStateParms).parseRequestHeaders(webReqStateParms.trackingMethod == CbConstants.WrMethod.getOutputStream);
            }
            Map<String, List<String>> map2 = this.responseHeaders;
            if (map2 != null) {
                webReqStateParms.responseHeaders = map2;
                return;
            }
            return;
        }
        if (i == 2) {
            long j7 = webReqStateParms.requestLength;
            if (j7 >= 0) {
                this.requestLength = j7;
            }
            long j9 = webReqStateParms.responseLength;
            if (j9 >= 0) {
                this.responseLength = j9;
            }
            Map<String, List<String>> map3 = webReqStateParms.responseHeaders;
            if (map3 != null) {
                this.responseHeaders = map3;
            }
            Map<String, List<String>> map4 = webReqStateParms.requestHeaders;
            if (map4 != null) {
                this.requestHeaders = map4;
            }
            if (webReqStateParms.trackingMethod == CbConstants.WrMethod.getOutputStream && this.endTime > 0) {
                this.endTime = 0L;
                return;
            } else {
                this.canFinalize = true;
                this.endTime = this.session.getRunningTime();
                return;
            }
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            webReqStateParms.canFinalize = true;
            this.canFinalize = true;
            if (this.endTime <= 0) {
                this.endTime = this.session.getRunningTime();
                return;
            }
            return;
        }
        if ((webReqStateParms instanceof ConnStateParms) && webReqStateParms.trackingMethod != CbConstants.WrMethod.getOutputStream) {
            ConnStateParms connStateParms = (ConnStateParms) webReqStateParms;
            connStateParms.calcResponseBytes();
            connStateParms.evaluateServerTiming();
            connStateParms.parseResponseHeaders();
        }
        long j10 = webReqStateParms.requestLength;
        if (j10 >= 0) {
            this.requestLength = j10;
        }
        long j11 = webReqStateParms.responseLength;
        if (j11 >= 0) {
            this.responseLength = j11;
        }
        Map<String, List<String>> map5 = webReqStateParms.responseHeaders;
        if (map5 != null) {
            this.responseHeaders = map5;
        }
        Map<String, List<String>> map6 = webReqStateParms.requestHeaders;
        if (map6 != null) {
            this.requestHeaders = map6;
        }
        if (webReqStateParms.trackingMethod == CbConstants.WrMethod.getOutputStream) {
            this.endTime = this.session.getRunningTime();
            return;
        }
        this.canFinalize = webReqStateParms.canFinalize;
        if (this.endTime <= 0) {
            this.endTime = this.session.getRunningTime();
        }
    }

    public void sendEvents(final WebReqStateParms webReqStateParms) {
        WebReqTag webReqTag;
        if (Global.DEBUG) {
            WebReqTag webReqTag2 = this.webReqTag;
            String string = webReqTag2 != null ? webReqTag2.toString() : "none!";
            String str = LOGTAG;
            Utility.zlogD(str, String.format("WRE: sT=%d eT=%d server=%s tag=%s", Long.valueOf(this.startTime), Long.valueOf(this.endTime), this.server, string));
            Utility.zlogD(str, String.format("WRE: desc=%s rc=%d msg=%s", webReqStateParms.getRequestDesc(), Integer.valueOf(webReqStateParms.respCode), webReqStateParms.reason));
        }
        if (Dynatrace.getCaptureStatus() && this.webReqTag != null) {
            WebReqSegment webReqSegment = new WebReqSegment(this.webReqTag.getParentTagId(), this.webReqTag.getSeqNumber(), this.startTime, this.endTime, webReqStateParms.respCode, webReqStateParms.reason, webReqStateParms.getRequestDesc(), webReqStateParms.requestLength, webReqStateParms.responseLength, this.session, this.webReqTag.getServerId(), webReqStateParms.serverTimingValue, !this.session.isGrailEventsShouldBeCaptured());
            Core.GUARDED_EVENT_DISPATCHER.executeWithVerification(this.session, new GuardedEventDispatcher.GuardedOperation() { // from class: com.dynatrace.android.callback.a
                @Override // com.dynatrace.android.agent.GuardedEventDispatcher.GuardedOperation
                public final void execute(RumEventDispatcher rumEventDispatcher) {
                    this.f9592a.lambda$sendEvents$0(webReqStateParms, rumEventDispatcher);
                }
            });
            if (CallbackCore.captureTestData) {
                this.wrtEvent = webReqSegment;
                this.eventData = webReqSegment.createEventData().toString();
            }
            Core.saveSegment(webReqSegment);
        }
        DTXAutoAction dTXAutoAction = this.action;
        if (dTXAutoAction == null || (webReqTag = this.webReqTag) == null) {
            return;
        }
        dTXAutoAction.onWrFinished(webReqTag.getParentTagId());
    }

    public void setTraceContext(WebRequestTraceContext webRequestTraceContext) {
        this.traceContext = webRequestTraceContext;
    }

    public void setWebReqTag(WebReqTag webReqTag) {
        this.webReqTag = webReqTag;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.canFinalize));
        sb2.append("&&");
        sb2.append(String.valueOf(this.startTime));
        sb2.append("&&");
        sb2.append(String.valueOf(this.endTime));
        sb2.append("&&");
        sb2.append(String.valueOf(this.server));
        sb2.append("&&");
        WebReqTag webReqTag = this.webReqTag;
        if (webReqTag != null) {
            sb2.append(webReqTag.toString());
            sb2.append("&&");
        } else {
            sb2.append("NA&&");
        }
        DTXAutoAction dTXAutoAction = this.action;
        if (dTXAutoAction != null) {
            sb2.append(dTXAutoAction.createEventData().toString());
            sb2.append("&&");
        } else {
            sb2.append("NA&&");
        }
        if (this.wrtEvent != null) {
            sb2.append(this.eventData);
        } else {
            sb2.append("NA");
        }
        return sb2.toString();
    }
}
