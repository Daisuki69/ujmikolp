package com.dynatrace.android.callback;

import We.s;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.callback.CbConstants;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes2.dex */
class UriReqStateParms extends WebReqStateParms {
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "UriReqStateParms");
    private HttpHost host;
    private HttpContext httpContext;
    private HttpRequest request;
    private CbURIDesc uriDesc;
    private HttpUriRequest uriRequest;

    public UriReqStateParms(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        super(CbConstants.WrMethod.execute, CbConstants.WrStates.PRE_EXEC, 0);
        this.host = httpHost;
        this.request = httpRequest;
        this.httpContext = httpContext;
        this.uriDesc = CbURIDesc.createURIDesc(httpRequest, httpHost);
        if (httpRequest == null || !(httpRequest instanceof HttpUriRequest)) {
            return;
        }
        this.uriRequest = (HttpUriRequest) httpRequest;
    }

    private static long calcHttpRequestLength(HttpContext httpContext) {
        RequestWrapper requestWrapper = (RequestWrapper) httpContext.getAttribute("http.request");
        long j = 0;
        int length = 2;
        for (Header header : requestWrapper.getAllHeaders()) {
            length += header.toString().length() + 2;
            if (RtspHeaders.CONTENT_LENGTH.equalsIgnoreCase(header.getName())) {
                j = Long.parseLong(header.getValue());
            }
        }
        return ((long) (requestWrapper.getRequestLine().toString().length() + 2 + length)) + j;
    }

    private static long calcHttpResponseLength(HttpResponse httpResponse) {
        int length = httpResponse.getStatusLine().toString().length() + 2;
        long j = 0;
        boolean z4 = true;
        int length2 = 2;
        for (Header header : httpResponse.getAllHeaders()) {
            length2 += header.toString().length() + 2;
            if (z4 && RtspHeaders.CONTENT_LENGTH.equals(header.getName())) {
                try {
                    j = Long.parseLong(header.getValue());
                } catch (NumberFormatException e) {
                    if (Global.DEBUG) {
                        Utility.zlogD(LOGTAG, e.getMessage());
                    }
                }
                z4 = false;
            }
        }
        return ((long) (length + length2)) + j;
    }

    public void calcHttpMessageBytes(HttpResponse httpResponse) {
        try {
            this.requestLength = calcHttpRequestLength(this.httpContext);
            this.responseLength = calcHttpResponseLength(httpResponse);
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, e.getMessage(), e);
            }
            this.requestLength = -1L;
            this.responseLength = -1L;
        }
    }

    public HttpHost getExecHost() {
        return this.host;
    }

    public HttpRequest getRequest() {
        return this.request;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public String getRequestClassName() {
        return getRequestClassName(this.request);
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public String getRequestDesc() {
        String str = this.desc;
        if (str != null) {
            return str;
        }
        String str2 = this.uriDesc.desc;
        this.desc = str2;
        return str2;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public Map<String, List<String>> getRequestHeaders() {
        return null;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public String getRequestHost() {
        return this.uriDesc.host;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public String getRequestMethod() {
        RequestLine requestLine;
        HttpUriRequest httpUriRequest = this.uriRequest;
        if (httpUriRequest != null) {
            return httpUriRequest.getMethod();
        }
        HttpRequest httpRequest = this.request;
        return (!(httpRequest instanceof HttpEntityEnclosingRequest) || (requestLine = httpRequest.getRequestLine()) == null) ? "NA" : requestLine.getMethod();
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public Map<String, List<String>> getResponseHeaders() {
        return null;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public URL getUrl() {
        URI uri = this.uriDesc.uri;
        if (uri != null) {
            try {
                return uri.toURL();
            } catch (MalformedURLException e) {
                if (Global.DEBUG) {
                    Utility.zlogD(LOGTAG, e.toString(), e);
                }
            } catch (Exception e7) {
                if (Global.DEBUG) {
                    Utility.zlogW(LOGTAG, e7.toString());
                }
                return null;
            }
        }
        return null;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public Object[] getWebContext() {
        return null;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public boolean isSupportedByGrail() {
        return false;
    }
}
