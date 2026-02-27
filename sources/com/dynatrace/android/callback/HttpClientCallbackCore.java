package com.dynatrace.android.callback;

import We.s;
import com.dynatrace.android.agent.ApacheUtil;
import com.dynatrace.android.agent.DTXAutoAction;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.WebReqTag;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.callback.CbConstants;
import java.util.WeakHashMap;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.methods.HttpRequestBase;

/* JADX INFO: loaded from: classes2.dex */
final class HttpClientCallbackCore {
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "HttpClientCallbackCore");
    private static final WeakHashMap<HttpRequest, CbWebReqTracker> httpReqs = new WeakHashMap<>();

    public static CbWebReqTracker addHttpReq(HttpRequestBase httpRequestBase) {
        return addHttpReq(httpRequestBase, HttpClientCallback.determineTarget(httpRequestBase));
    }

    private static WebReqTag generateWebReqTag(DTXAutoAction dTXAutoAction, HttpRequest httpRequest) {
        WebReqTag webReqTagTagRequest;
        return (dTXAutoAction == null || (webReqTagTagRequest = ApacheUtil.tagRequest(dTXAutoAction, httpRequest)) == null) ? ApacheUtil.tagRequest(httpRequest) : webReqTagTagRequest;
    }

    public static void updateRequest(UriReqStateParms uriReqStateParms) {
        if (uriReqStateParms.getRequest() == null || !CallbackCore.configuration.webRequestTiming) {
            return;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, uriReqStateParms.state + " of " + uriReqStateParms.trackingMethod + " of " + uriReqStateParms.getRequest().getClass().getSimpleName() + " to " + uriReqStateParms.getRequestDesc());
        }
        WeakHashMap<HttpRequest, CbWebReqTracker> weakHashMap = httpReqs;
        CbWebReqTracker cbWebReqTrackerAddHttpReq = weakHashMap.get(uriReqStateParms.getRequest());
        if (cbWebReqTrackerAddHttpReq == null) {
            if (CbConstants.WrStates.PRE_EXEC != uriReqStateParms.state) {
                return;
            } else {
                cbWebReqTrackerAddHttpReq = addHttpReq(uriReqStateParms.getRequest(), uriReqStateParms.getExecHost());
            }
        }
        if (cbWebReqTrackerAddHttpReq == null) {
            return;
        }
        HttpRequest request = uriReqStateParms.getRequest();
        if (cbWebReqTrackerAddHttpReq.checkForManualTag(ApacheUtil.fetchWebReqTag(request, Dynatrace.getRequestTagHeader()), ApacheUtil.fetchWebReqTag(request, "x-dtc"))) {
            ApacheUtil.removeHeaderFromRequest(request, Dynatrace.getRequestTagHeader());
        }
        cbWebReqTrackerAddHttpReq.procNewState(uriReqStateParms);
        if (cbWebReqTrackerAddHttpReq.canFinalize) {
            synchronized (weakHashMap) {
                weakHashMap.remove(uriReqStateParms.getRequest());
            }
            cbWebReqTrackerAddHttpReq.sendEvents(uriReqStateParms);
        }
    }

    public static CbWebReqTracker addHttpReq(HttpRequest httpRequest, HttpHost httpHost) {
        DTXAutoAction autoAction;
        WebReqTag webReqTagGenerateWebReqTag;
        if (httpRequest == null || !Dynatrace.getCaptureStatus() || !Session.currentSession().getPrivacyRules().shouldCollectEvent(EventType.WEB_REQUEST)) {
            return null;
        }
        CbURIDesc cbURIDescCreateURIDesc = CbURIDesc.createURIDesc(httpRequest, httpHost);
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "Add WR to " + cbURIDescCreateURIDesc.host);
        }
        if (!CallbackCore.isInitialized.get()) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "OneAgent not correctly initialized");
            }
            return null;
        }
        if (!CallbackCore.configuration.webRequestTiming || (webReqTagGenerateWebReqTag = generateWebReqTag((autoAction = DTXAutoAction.getAutoAction()), httpRequest)) == null) {
            return null;
        }
        CbWebReqTracker cbWebReqTracker = new CbWebReqTracker(autoAction, webReqTagGenerateWebReqTag.getSession());
        WeakHashMap<HttpRequest, CbWebReqTracker> weakHashMap = httpReqs;
        synchronized (weakHashMap) {
            weakHashMap.put(httpRequest, cbWebReqTracker);
        }
        cbWebReqTracker.setWebReqTag(webReqTagGenerateWebReqTag);
        return cbWebReqTracker;
    }
}
