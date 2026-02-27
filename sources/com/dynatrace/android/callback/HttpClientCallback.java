package com.dynatrace.android.callback;

import We.s;
import android.util.Log;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.callback.CbConstants;
import com.google.firebase.perf.network.FirebasePerfHttpClient;
import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.URI;
import java.util.ArrayList;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpClientCallback {
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "HttpClientCallback");

    private HttpClientCallback() {
    }

    public static HttpHost determineTarget(HttpUriRequest httpUriRequest) {
        URI uri;
        if (httpUriRequest == null || (uri = httpUriRequest.getURI()) == null || !uri.isAbsolute()) {
            return null;
        }
        return new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws Exception {
        return execute(httpClient, httpUriRequest, new BasicHttpContext());
    }

    private static void getRespCodeFromResp(HttpResponse httpResponse, UriReqStateParms uriReqStateParms) {
        int statusCode;
        if (httpResponse == null || uriReqStateParms == null) {
            return;
        }
        int i = 0;
        try {
            StatusLine statusLine = httpResponse.getStatusLine();
            if (statusLine != null) {
                statusCode = statusLine.getStatusCode();
                try {
                    uriReqStateParms.reason = statusLine.getReasonPhrase();
                } catch (Exception e) {
                    e = e;
                    i = statusCode;
                    if (uriReqStateParms.reason == null) {
                        uriReqStateParms.reason = e.getMessage();
                    }
                    statusCode = i;
                }
            } else {
                statusCode = 0;
            }
            uriReqStateParms.calcHttpMessageBytes(httpResponse);
            Header[] headers = httpResponse.getHeaders("Server-Timing");
            ArrayList arrayList = new ArrayList();
            int length = headers.length;
            while (i < length) {
                arrayList.add(headers[i].getValue());
                i++;
            }
            uriReqStateParms.evaluateServerTiming(arrayList);
        } catch (Exception e7) {
            e = e7;
        }
        uriReqStateParms.respCode = statusCode;
    }

    public static void newInstance(HttpRequestBase httpRequestBase) {
        if (Global.isAlive.get()) {
            HttpClientCallbackCore.addHttpReq(httpRequestBase);
        }
    }

    private static void updateRequest(UriReqStateParms uriReqStateParms) {
        try {
            HttpClientCallbackCore.updateRequest(uriReqStateParms);
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, uriReqStateParms.toString(), e);
            }
        }
    }

    private static Object wrapHandleResponse(ResponseHandler<?> responseHandler, HttpResponse httpResponse) throws IOException {
        try {
            Object objHandleResponse = responseHandler.handleResponse(httpResponse);
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null) {
                entity.consumeContent();
            }
            return objHandleResponse;
        } catch (Throwable th2) {
            HttpEntity entity2 = httpResponse.getEntity();
            if (entity2 != null) {
                try {
                    entity2.consumeContent();
                } catch (Throwable th3) {
                    Log.w("HttpClient", "Error consuming content after an exception.", th3);
                }
            }
            if (th2 instanceof Error) {
                throw ((Error) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            throw new UndeclaredThrowableException(th2);
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws Exception {
        return execute(httpClient, httpHost, httpRequest, new BasicHttpContext());
    }

    public static Object execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<?> responseHandler) throws Exception {
        return execute(httpClient, httpUriRequest, responseHandler, new BasicHttpContext());
    }

    public static Object execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<?> responseHandler) throws Exception {
        return execute(httpClient, httpHost, httpRequest, responseHandler, new BasicHttpContext());
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws Exception {
        if (!Global.isAlive.get()) {
            return FirebasePerfHttpClient.execute(httpClient, httpUriRequest, httpContext);
        }
        if (httpContext == null) {
            httpContext = new BasicHttpContext();
        }
        UriReqStateParms uriReqStateParms = new UriReqStateParms(determineTarget(httpUriRequest), httpUriRequest, httpContext);
        try {
            updateRequest(uriReqStateParms);
            HttpResponse httpResponseExecute = FirebasePerfHttpClient.execute(httpClient, httpUriRequest, httpContext);
            getRespCodeFromResp(httpResponseExecute, uriReqStateParms);
            uriReqStateParms.state = CbConstants.WrStates.POST_EXEC_OK;
            updateRequest(uriReqStateParms);
            return httpResponseExecute;
        } catch (Exception e) {
            uriReqStateParms.respCode = 0;
            uriReqStateParms.reason = e.toString();
            uriReqStateParms.state = CbConstants.WrStates.POST_EXEC_ERR;
            updateRequest(uriReqStateParms);
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws Exception {
        if (!Global.isAlive.get()) {
            return FirebasePerfHttpClient.execute(httpClient, httpHost, httpRequest, httpContext);
        }
        if (httpContext == null) {
            httpContext = new BasicHttpContext();
        }
        UriReqStateParms uriReqStateParms = new UriReqStateParms(httpHost, httpRequest, httpContext);
        try {
            updateRequest(uriReqStateParms);
            HttpResponse httpResponseExecute = FirebasePerfHttpClient.execute(httpClient, httpHost, httpRequest, httpContext);
            getRespCodeFromResp(httpResponseExecute, uriReqStateParms);
            uriReqStateParms.state = CbConstants.WrStates.POST_EXEC_OK;
            updateRequest(uriReqStateParms);
            return httpResponseExecute;
        } catch (Exception e) {
            uriReqStateParms.respCode = 0;
            uriReqStateParms.reason = e.toString();
            uriReqStateParms.state = CbConstants.WrStates.POST_EXEC_ERR;
            updateRequest(uriReqStateParms);
            throw e;
        }
    }

    public static Object execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<?> responseHandler, HttpContext httpContext) throws Exception {
        return wrapHandleResponse(responseHandler, execute(httpClient, httpUriRequest, httpContext));
    }

    public static Object execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<?> responseHandler, HttpContext httpContext) throws Exception {
        return wrapHandleResponse(responseHandler, execute(httpClient, httpHost, httpRequest, httpContext));
    }
}
