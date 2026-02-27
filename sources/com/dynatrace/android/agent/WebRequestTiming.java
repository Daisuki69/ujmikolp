package com.dynatrace.android.agent;

import We.s;
import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.android.agent.GuardedEventDispatcher;
import com.dynatrace.android.agent.WebRequestUtils;
import com.dynatrace.android.agent.conf.PrivacyRules;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.mixed.ManualWebRequestEventGenerator;
import com.dynatrace.android.agent.mixed.SessionInformationGenerator;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class WebRequestTiming {
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "WebRequestTiming");
    private final boolean forwardToGrail;
    private long mEventEndTime;
    private long mEventStartTime;
    private boolean mFinalized;
    private HttpURLConnection userConnection;
    private final WebReqTag webReqTag;

    public WebRequestTiming(String str) {
        this(str, true);
    }

    private static String getTag(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return null;
        }
        if (httpURLConnection.getRequestProperty(Dynatrace.getRequestTagHeader()) == null) {
            Dynatrace.tagRequest(httpURLConnection);
        }
        return httpURLConnection.getRequestProperty(Dynatrace.getRequestTagHeader());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopWebRequest$0(Session session, WebRequestUtils.FormattedUrl formattedUrl, URI uri, int i, String str, RumEventDispatcher rumEventDispatcher) {
        PrivacyRules privacyRules = session.getPrivacyRules();
        EventType eventType = EventType.EVENT_API;
        if (!privacyRules.shouldCollectEvent(eventType)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "stopWebRequest eventType shouldn't be collected, because of data collection level: " + eventType);
            return;
        }
        ManualWebRequestEventGenerator manualWebRequestEventGenerator = new ManualWebRequestEventGenerator();
        manualWebRequestEventGenerator.setUrl(formattedUrl.oneAgentUrl);
        manualWebRequestEventGenerator.setNetworkProtocolName(uri.getScheme());
        manualWebRequestEventGenerator.setStatusCode(i);
        manualWebRequestEventGenerator.setReasonPhrase(str);
        JSONObject jSONObjectGenerateRumRequestEvent = manualWebRequestEventGenerator.generateRumRequestEvent();
        if (jSONObjectGenerateRumRequestEvent == null) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "manual web request event is invalid " + uri);
            return;
        }
        try {
            jSONObjectGenerateRumRequestEvent.put(EventKeys.DT.SUPPORT.LEGACY_API_REPORTED, true);
        } catch (JSONException unused) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "manual web request event is invalid " + uri);
        }
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "manual web request event is generated: " + jSONObjectGenerateRumRequestEvent);
        long sessionStartTime = session.getSessionStartTime();
        long j = this.mEventStartTime;
        rumEventDispatcher.dispatchEvent(jSONObjectGenerateRumRequestEvent, sessionStartTime + j, this.mEventEndTime - j, SessionInformationGenerator.generate(session), true, null);
    }

    private void stopWebRequest(final URI uri, final int i, final String str, long j, long j6) {
        WebReqTag webReqTag;
        if (uri == null) {
            if (Global.DEBUG) {
                Utility.zlogE(LOGTAG, "Invalid usage of stopWebRequestTiming(). The argument \"requestUri\" must not be null");
                return;
            }
            return;
        }
        if (!isSchemeExists(uri)) {
            if (Global.DEBUG) {
                Utility.zlogE(LOGTAG, "Invalid usage of stopWebRequestTiming(). The URI scheme is empty");
                return;
            }
            return;
        }
        if (this.mEventStartTime == -1 || (webReqTag = this.webReqTag) == null) {
            return;
        }
        final Session session = webReqTag.getSession();
        if (isFinalized()) {
            return;
        }
        if (!Dynatrace.getCaptureStatus()) {
            this.mFinalized = true;
            return;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "Creating web timing event for " + this.webReqTag);
        }
        updateEndTime(session.getRunningTime());
        final WebRequestUtils.FormattedUrl formattedUrlRemoveUrlCredentials = WebRequestUtils.removeUrlCredentials(uri.toString());
        Core.saveSegment(new WebReqSegment(this.webReqTag.getParentTagId(), this.webReqTag.getSeqNumber(), this.mEventStartTime, this.mEventEndTime, i, str, Utility.truncateWebRequest(formattedUrlRemoveUrlCredentials.legacyAgentUrl), j, j6, session, this.webReqTag.getServerId(), null, !session.isGrailEventsShouldBeCaptured()));
        if (this.forwardToGrail) {
            Core.GUARDED_EVENT_DISPATCHER.executeWithVerification(session, new GuardedEventDispatcher.GuardedOperation() { // from class: com.dynatrace.android.agent.c
                @Override // com.dynatrace.android.agent.GuardedEventDispatcher.GuardedOperation
                public final void execute(RumEventDispatcher rumEventDispatcher) {
                    this.f9589a.lambda$stopWebRequest$0(session, formattedUrlRemoveUrlCredentials, uri, i, str, rumEventDispatcher);
                }
            });
        }
    }

    private void updateEndTime(long j) {
        if (this.mFinalized) {
            return;
        }
        this.mEventEndTime = j;
        this.mFinalized = true;
    }

    public boolean isFinalized() {
        return this.mFinalized;
    }

    public boolean isSchemeExists(URI uri) {
        return uri.getScheme() != null;
    }

    public void startWebRequestTiming() {
        if (this.webReqTag == null || isFinalized()) {
            return;
        }
        this.mEventStartTime = this.webReqTag.getSession().getRunningTime();
    }

    public void stopWebRequestTiming(String str, int i, String str2) throws MalformedURLException {
        if (str != null) {
            stopWebRequestTiming(URI.create(str), i, str2);
        } else if (Global.DEBUG) {
            Utility.zlogE(LOGTAG, "Invalid usage of stopWebRequestTiming(). The argument \"requestUrl\" must not be null");
        }
    }

    public WebRequestTiming(String str, boolean z4) {
        this.mFinalized = false;
        this.mEventStartTime = -1L;
        this.mEventEndTime = -1L;
        this.userConnection = null;
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, "Creating new web request timing for tag " + str);
        }
        this.webReqTag = WebReqTag.parseTag(str, Session.currentSession());
        this.forwardToGrail = z4;
    }

    public void stopWebRequestTiming(URL url, int i, String str) {
        if (url == null) {
            if (Global.DEBUG) {
                Utility.zlogE(LOGTAG, "Invalid usage of stopWebRequestTiming(). The argument \"requestUrl\" must not be null");
            }
        } else {
            try {
                stopWebRequestTiming(url.toURI(), i, str);
            } catch (URISyntaxException e) {
                if (Global.DEBUG) {
                    Utility.zlogE(LOGTAG, "Invalid usage of stopWebRequestTiming(). The argument \"requestUrl\" is not formatted strictly according to to RFC2396", e);
                }
            }
        }
    }

    public void stopWebRequestTiming(URI uri, int i, String str) {
        stopWebRequest(uri, i, str, -1L, -1L);
    }

    public void stopWebRequestTiming(URI uri, int i, String str, long j, long j6) {
        stopWebRequest(uri, i, str, j, j6);
    }

    @Deprecated
    public WebRequestTiming(HttpURLConnection httpURLConnection) {
        this(getTag(httpURLConnection));
        this.userConnection = httpURLConnection;
    }

    @Deprecated
    public void stopWebRequestTiming() {
        HttpURLConnection httpURLConnection = this.userConnection;
        if (httpURLConnection == null) {
            if (Global.DEBUG) {
                Utility.zlogE(LOGTAG, "Invalid usage of stopWebRequestTiming().");
            }
        } else {
            try {
                stopWebRequestTiming(httpURLConnection.getURL(), this.userConnection.getResponseCode(), this.userConnection.getResponseMessage());
            } catch (IOException e) {
                if (Global.DEBUG) {
                    Utility.zlogE(LOGTAG, "Unable to retrieve status information for web timing request.", e);
                }
                stopWebRequestTiming(this.userConnection.getURL(), 0, e.getMessage());
            }
        }
    }
}
