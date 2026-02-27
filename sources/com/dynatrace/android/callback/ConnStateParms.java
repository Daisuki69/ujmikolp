package com.dynatrace.android.callback;

import We.s;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.WebRequestUtils;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.callback.CbConstants;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class ConnStateParms extends WebReqStateParms {
    private static final Map<String, Integer> additionalHeader;
    private static final Map<String, List<String>> additionalOneAgentHeaders;
    HttpURLConnection conn;
    private final boolean useRequestHeaders;
    private final boolean useResponseHeaders;
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "ConnStateParms");
    private static final int BYTES_CONTENT_TYPE_HEADER = 49;

    static {
        HashMap map = new HashMap();
        additionalHeader = map;
        map.put(RtspHeaders.USER_AGENT, Integer.valueOf(CallbackCore.defaultUserAgent().length() + 12));
        map.put(RtspHeaders.CONNECTION, 22);
        map.put("Accept-Encoding", 21);
        HashMap map2 = new HashMap();
        additionalOneAgentHeaders = map2;
        map2.put(RtspHeaders.USER_AGENT, Collections.singletonList(CallbackCore.defaultUserAgent()));
        map2.put(RtspHeaders.CONNECTION, Collections.singletonList("keep-alive"));
        map2.put("Accept-Encoding", Collections.singletonList("gzip"));
    }

    public ConnStateParms(HttpURLConnection httpURLConnection, CbConstants.WrMethod wrMethod, CbConstants.WrStates wrStates, int i, boolean z4, boolean z5) {
        super(wrMethod, wrStates, i);
        this.conn = httpURLConnection;
        this.useResponseHeaders = z4;
        this.useRequestHeaders = z5;
    }

    private long calcHeader(Map<String, List<String>> map) {
        long length;
        long length2 = 0;
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                if (entry.getValue().size() > 0) {
                    length = entry.getValue().get(0).length() + 2;
                    length2 += length;
                }
            } else if (!entry.getKey().startsWith("X-Android")) {
                long length3 = entry.getKey().length() + 4;
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    length2 += ((long) it.next().length()) + length3;
                }
                if (RtspHeaders.CONTENT_LENGTH.equalsIgnoreCase(entry.getKey()) && entry.getValue().size() > 0) {
                    try {
                        length = Long.parseLong(entry.getValue().get(0));
                        length2 += length;
                    } catch (NumberFormatException e) {
                        if (Global.DEBUG) {
                            Utility.zlogD(LOGTAG, "invalid content length", e);
                        }
                    }
                }
            }
        }
        return length2;
    }

    private int calcRequestFirstLineLength(String str, String str2) {
        int length = str.length();
        return (str2 == null || str2.length() < 1) ? length + 13 : str2.length() + length + 12;
    }

    public void calcRequestBytes(boolean z4) {
        if (this.requestLength >= 0) {
            return;
        }
        try {
            this.requestLength = calcRequestFirstLineLength(this.conn.getRequestMethod(), this.conn.getURL().getFile());
            Map<String, List<String>> requestProperties = this.conn.getRequestProperties();
            this.requestLength = calcHeader(requestProperties) + 2 + this.requestLength;
            for (Map.Entry<String, Integer> entry : additionalHeader.entrySet()) {
                if (!requestProperties.containsKey(entry.getKey())) {
                    this.requestLength += (long) (entry.getValue().intValue() + 2);
                }
            }
            if (!requestProperties.containsKey("Host")) {
                this.requestLength += (long) (this.conn.getURL().toURI().getAuthority().length() + 8);
            }
            if (!z4 || requestProperties.containsKey(RtspHeaders.CONTENT_TYPE)) {
                return;
            }
            this.requestLength += (long) BYTES_CONTENT_TYPE_HEADER;
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "can't calculate request size", e);
            }
            this.requestLength = -1L;
        }
    }

    public void calcResponseBytes() {
        if (this.responseLength >= 0) {
            return;
        }
        try {
            this.responseLength = calcHeader(this.conn.getHeaderFields()) + 2;
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "can't calculate request size", e);
            }
            this.responseLength = -1L;
        }
    }

    public void evaluateServerTiming() {
        evaluateServerTiming(this.conn.getHeaderFields().get("Server-Timing"));
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public String getRequestClassName() {
        return getRequestClassName(this.conn);
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public String getRequestDesc() {
        String str = this.desc;
        if (str != null) {
            return str;
        }
        this.desc = "NA";
        HttpURLConnection httpURLConnection = this.conn;
        if (httpURLConnection != null) {
            this.desc = Utility.truncateWebRequest(WebRequestUtils.removeUrlCredentials(httpURLConnection.getURL().toString()).legacyAgentUrl);
        }
        return this.desc;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public Map<String, List<String>> getRequestHeaders() {
        return this.requestHeaders;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public String getRequestHost() {
        HttpURLConnection httpURLConnection = this.conn;
        return httpURLConnection != null ? httpURLConnection.getURL().getHost() : "NA";
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public String getRequestMethod() {
        HttpURLConnection httpURLConnection = this.conn;
        return httpURLConnection != null ? httpURLConnection.getRequestMethod() : "NA";
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public Map<String, List<String>> getResponseHeaders() {
        return this.responseHeaders;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public URL getUrl() {
        HttpURLConnection httpURLConnection = this.conn;
        if (httpURLConnection != null) {
            return httpURLConnection.getURL();
        }
        return null;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public Object[] getWebContext() {
        return null;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public boolean isSupportedByGrail() {
        return true;
    }

    public void parseRequestHeaders(boolean z4) {
        try {
            if (this.useRequestHeaders) {
                this.requestHeaders = new HashMap(this.conn.getRequestProperties());
                for (Map.Entry<String, List<String>> entry : additionalOneAgentHeaders.entrySet()) {
                    if (!this.requestHeaders.containsKey(entry.getKey())) {
                        this.requestHeaders.put(entry.getKey(), entry.getValue());
                    }
                }
                if (!this.requestHeaders.containsKey("Host")) {
                    this.requestHeaders.put("Host", Collections.singletonList(this.conn.getURL().toURI().getAuthority()));
                }
                if (z4 && !this.requestHeaders.containsKey(RtspHeaders.CONTENT_TYPE)) {
                    this.requestHeaders.put(RtspHeaders.CONTENT_TYPE, Collections.singletonList(ShareTarget.ENCODING_TYPE_URL_ENCODED));
                }
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "request headers tracked");
            }
        } catch (Exception e) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "not possible to parse headers as connection is already established", e);
        }
    }

    public void parseResponseHeaders() {
        try {
            if (this.useResponseHeaders) {
                HashMap map = new HashMap(this.conn.getHeaderFields());
                this.responseHeaders = map;
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str != null && str.contains("X-Android")) {
                        it.remove();
                    }
                }
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "response headers tracked");
            }
        } catch (Exception e) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "response headers can not be received", e);
        }
    }
}
