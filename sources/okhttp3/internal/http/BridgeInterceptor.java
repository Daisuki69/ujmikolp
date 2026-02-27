package okhttp3.internal.http;

import androidx.media3.exoplayer.rtsp.RtspHeaders;
import cj.C1132s;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.j;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okio.GzipSource;
import okio.Okio;

/* JADX INFO: loaded from: classes5.dex */
public final class BridgeInterceptor implements Interceptor {
    private final CookieJar cookieJar;

    public BridgeInterceptor(CookieJar cookieJar) {
        j.g(cookieJar, "cookieJar");
        this.cookieJar = cookieJar;
    }

    private final String cookieHeader(List<Cookie> list) {
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i4 = i + 1;
            if (i < 0) {
                C1132s.k();
                throw null;
            }
            Cookie cookie = (Cookie) obj;
            if (i > 0) {
                sb2.append("; ");
            }
            sb2.append(cookie.name());
            sb2.append('=');
            sb2.append(cookie.value());
            i = i4;
        }
        String string = sb2.toString();
        j.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        ResponseBody responseBodyBody;
        j.g(chain, "chain");
        Request request = chain.request();
        Request.Builder builderNewBuilder = request.newBuilder();
        RequestBody requestBodyBody = request.body();
        if (requestBodyBody != null) {
            MediaType mediaTypeContentType = requestBodyBody.contentType();
            if (mediaTypeContentType != null) {
                builderNewBuilder.header(RtspHeaders.CONTENT_TYPE, mediaTypeContentType.toString());
            }
            long jContentLength = requestBodyBody.contentLength();
            if (jContentLength != -1) {
                builderNewBuilder.header(RtspHeaders.CONTENT_LENGTH, String.valueOf(jContentLength));
                builderNewBuilder.removeHeader("Transfer-Encoding");
            } else {
                builderNewBuilder.header("Transfer-Encoding", "chunked");
                builderNewBuilder.removeHeader(RtspHeaders.CONTENT_LENGTH);
            }
        }
        boolean z4 = true;
        if (request.header("Host") == null) {
            builderNewBuilder.header("Host", Util.toHostHeader$default(request.url(), false, 1, null));
        }
        if (request.header(RtspHeaders.CONNECTION) == null) {
            builderNewBuilder.header(RtspHeaders.CONNECTION, "Keep-Alive");
        }
        if (request.header("Accept-Encoding") == null && request.header(RtspHeaders.RANGE) == null) {
            builderNewBuilder.header("Accept-Encoding", "gzip");
        } else {
            z4 = false;
        }
        List<Cookie> listLoadForRequest = this.cookieJar.loadForRequest(request.url());
        if (!listLoadForRequest.isEmpty()) {
            builderNewBuilder.header("Cookie", cookieHeader(listLoadForRequest));
        }
        if (request.header(RtspHeaders.USER_AGENT) == null) {
            builderNewBuilder.header(RtspHeaders.USER_AGENT, Util.userAgent);
        }
        Response responseProceed = chain.proceed(builderNewBuilder.build());
        HttpHeaders.receiveHeaders(this.cookieJar, request.url(), responseProceed.headers());
        Response.Builder builderRequest = responseProceed.newBuilder().request(request);
        if (z4 && "gzip".equalsIgnoreCase(Response.header$default(responseProceed, RtspHeaders.CONTENT_ENCODING, null, 2, null)) && HttpHeaders.promisesBody(responseProceed) && (responseBodyBody = responseProceed.body()) != null) {
            GzipSource gzipSource = new GzipSource(responseBodyBody.source());
            builderRequest.headers(responseProceed.headers().newBuilder().removeAll(RtspHeaders.CONTENT_ENCODING).removeAll(RtspHeaders.CONTENT_LENGTH).build());
            builderRequest.body(new RealResponseBody(Response.header$default(responseProceed, RtspHeaders.CONTENT_TYPE, null, 2, null), -1L, Okio.buffer(gzipSource)));
        }
        return builderRequest.build();
    }
}
