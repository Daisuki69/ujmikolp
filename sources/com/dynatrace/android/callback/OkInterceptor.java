package com.dynatrace.android.callback;

import We.s;
import com.dynatrace.android.agent.AgentUtil;
import com.dynatrace.android.agent.DTXAutoAction;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.WebReqTag;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.mixed.WebRequestTraceContext;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.io.IOException;
import java.util.WeakHashMap;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
class OkInterceptor implements Interceptor {
    static final OkInterceptor theInterceptor = new OkInterceptor();
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "OkInterceptor");
    static WeakHashMap<Request, CbWebReqTracker> reqTracker = new WeakHashMap<>();

    private OkInterceptor() {
    }

    private WebReqTag generateWebReqTag(DTXAutoAction dTXAutoAction) {
        WebReqTag webReqTagInternalTagRequest;
        return (dTXAutoAction == null || (webReqTagInternalTagRequest = AgentUtil.internalTagRequest(dTXAutoAction)) == null) ? AgentUtil.getRequestTag() : webReqTagInternalTagRequest;
    }

    public CbWebReqTracker addRequest(Request request, OkRequestStateParms okRequestStateParms) {
        DTXAutoAction autoAction;
        WebReqTag webReqTagGenerateWebReqTag;
        if (request == null) {
            return null;
        }
        if (!CallbackCore.isInitialized.get()) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "OneAgent not correctly initialized");
            }
            return null;
        }
        if (!Dynatrace.getCaptureStatus() || !Session.currentSession().getPrivacyRules().shouldCollectEvent(EventType.WEB_REQUEST)) {
            return null;
        }
        if (request.header(Dynatrace.getRequestTagHeader()) != null) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, String.format("Ignore WR %s to %s (hc=%d)", Request.class.getName(), okRequestStateParms.getRequestDesc(), Integer.valueOf(okRequestStateParms.request.hashCode())));
            }
            return null;
        }
        String strHeader = request.header("x-dtc");
        if (strHeader != null) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "Ignore WR, request already tagged with x-dtc: ".concat(strHeader));
            }
            return null;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("Add WR %s to %s (hc=%d)", Request.class.getName(), okRequestStateParms.getRequestDesc(), Integer.valueOf(okRequestStateParms.request.hashCode())));
        }
        if (!CallbackCore.configuration.webRequestTiming || (webReqTagGenerateWebReqTag = generateWebReqTag((autoAction = DTXAutoAction.getAutoAction()))) == null) {
            return null;
        }
        CbWebReqTracker cbWebReqTracker = new CbWebReqTracker(autoAction, webReqTagGenerateWebReqTag.getSession());
        cbWebReqTracker.stateParm = okRequestStateParms;
        cbWebReqTracker.setWebReqTag(webReqTagGenerateWebReqTag);
        synchronized (reqTracker) {
            reqTracker.put(request, cbWebReqTracker);
        }
        return cbWebReqTracker;
    }

    public Request fetchOrigReq(Request request) {
        if (request == null) {
            return null;
        }
        if (reqTracker.containsKey(request)) {
            return request;
        }
        Object objTag = request.tag();
        while (!request.equals(objTag) && (objTag instanceof Request)) {
            request = (Request) objTag;
            if (reqTracker.containsKey(request)) {
                return request;
            }
            objTag = request.tag();
        }
        return null;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        WebReqTag webReqTag;
        if (!Global.isAlive.get()) {
            return chain.proceed(chain.request());
        }
        Request request = chain.request();
        Request requestFetchOrigReq = fetchOrigReq(request);
        CbWebReqTracker cbWebReqTracker = requestFetchOrigReq == null ? null : reqTracker.get(requestFetchOrigReq);
        if (cbWebReqTracker == null) {
            if (Global.DEBUG) {
                String str = LOGTAG;
                String string = request.url().toString();
                int iHashCode = requestFetchOrigReq != null ? requestFetchOrigReq.hashCode() : 0;
                int iHashCode2 = request.hashCode();
                StringBuilder sbR = androidx.camera.core.impl.a.r(iHashCode, "missed request ", string, " - orig hc=", ", cur hc=");
                sbR.append(iHashCode2);
                Utility.zlogD(str, sbR.toString());
            }
            return chain.proceed(request);
        }
        String strHeader = request.header(Dynatrace.getRequestTagHeader());
        if (strHeader == null) {
            return chain.proceed(tagRequest(request, cbWebReqTracker));
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "Existing " + strHeader + " - linked to hc=" + (requestFetchOrigReq != null ? requestFetchOrigReq.hashCode() : 0));
        }
        synchronized (reqTracker) {
            reqTracker.remove(requestFetchOrigReq);
        }
        DTXAutoAction dTXAutoAction = cbWebReqTracker.action;
        if (dTXAutoAction != null && (webReqTag = cbWebReqTracker.webReqTag) != null) {
            dTXAutoAction.onWrFinished(webReqTag.getParentTagId());
        }
        cbWebReqTracker.setWebReqTag(null);
        return chain.proceed(request);
    }

    public Request tagRequest(Request request, CbWebReqTracker cbWebReqTracker) {
        if (cbWebReqTracker == null) {
            return request;
        }
        Request.Builder builderNewBuilder = request.newBuilder();
        OkRequestStateParms okRequestStateParms = (OkRequestStateParms) cbWebReqTracker.stateParm;
        WebReqTag webReqTag = cbWebReqTracker.webReqTag;
        if (webReqTag == null) {
            cbWebReqTracker.setWebReqTag(null);
            return builderNewBuilder.build();
        }
        if (webReqTag.getSession().isGrailEventsShouldBeCaptured()) {
            WebRequestTraceContext webRequestTraceContext = new WebRequestTraceContext();
            cbWebReqTracker.setTraceContext(webRequestTraceContext);
            String traceparentId = webRequestTraceContext.getTraceparentId();
            builderNewBuilder.header("traceparent", traceparentId);
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "okhttp traceparent header is defined: " + traceparentId);
        }
        Request requestBuild = builderNewBuilder.header(Dynatrace.getRequestTagHeader(), webReqTag.toString()).build();
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("Tagged WR %s (hc=%d) with %s", okRequestStateParms.getRequestDesc(), Integer.valueOf(okRequestStateParms.request.hashCode()), webReqTag));
        }
        return requestBuild;
    }
}
