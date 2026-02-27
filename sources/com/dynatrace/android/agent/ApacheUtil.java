package com.dynatrace.android.agent;

import We.s;
import com.dynatrace.android.agent.util.Utility;
import org.apache.http.Header;
import org.apache.http.HttpRequest;

/* JADX INFO: loaded from: classes2.dex */
public class ApacheUtil {
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "ApacheUtil");

    public static String fetchWebReqTag(HttpRequest httpRequest, String str) {
        if (httpRequest == null) {
            return null;
        }
        try {
            Header lastHeader = httpRequest.getLastHeader(str);
            if (lastHeader != null) {
                return lastHeader.getValue();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static void removeHeaderFromRequest(HttpRequest httpRequest, String str) {
        if (httpRequest != null) {
            try {
                httpRequest.removeHeaders(str);
            } catch (Exception e) {
                Utility.zlogE(LOGTAG, "can't remove header", e);
            }
        }
    }

    public static WebReqTag tagRequest(HttpRequest httpRequest) {
        WebReqTag requestTag;
        if (!Dynatrace.getCaptureStatus() || httpRequest == null || (requestTag = AgentUtil.getRequestTag()) == null) {
            return null;
        }
        httpRequest.setHeader(Dynatrace.getRequestTagHeader(), requestTag.toString());
        return requestTag;
    }

    public static WebReqTag tagRequest(DTXActionImpl dTXActionImpl, HttpRequest httpRequest) {
        WebReqTag internalRequestTag;
        if (!dTXActionImpl.getPreconditions() || httpRequest == null || !dTXActionImpl.session.getPrivacyRules().shouldCollectEvent(EventType.WEB_REQUEST) || (internalRequestTag = dTXActionImpl.getInternalRequestTag()) == null) {
            return null;
        }
        httpRequest.setHeader(Dynatrace.getRequestTagHeader(), internalRequestTag.toString());
        dTXActionImpl.addChildEvent(new CustomSegment(internalRequestTag.toString(), 110, EventType.PLACEHOLDER, dTXActionImpl.getTagId(), dTXActionImpl.session, dTXActionImpl.serverId, true));
        return internalRequestTag;
    }
}
