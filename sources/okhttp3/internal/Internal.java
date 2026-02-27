package okhttp3.internal;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.j;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes5.dex */
public final class Internal {
    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String line) {
        j.g(builder, "builder");
        j.g(line, "line");
        return builder.addLenient$okhttp(line);
    }

    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sslSocket, boolean z4) {
        j.g(connectionSpec, "connectionSpec");
        j.g(sslSocket, "sslSocket");
        connectionSpec.apply$okhttp(sslSocket, z4);
    }

    public static final Response cacheGet(Cache cache, Request request) {
        j.g(cache, "cache");
        j.g(request, "request");
        return cache.get$okhttp(request);
    }

    public static final String cookieToString(Cookie cookie, boolean z4) {
        j.g(cookie, "cookie");
        return cookie.toString$okhttp(z4);
    }

    public static final Cookie parseCookie(long j, HttpUrl url, String setCookie) {
        j.g(url, "url");
        j.g(setCookie, "setCookie");
        return Cookie.Companion.parse$okhttp(j, url, setCookie);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String name, String value) {
        j.g(builder, "builder");
        j.g(name, "name");
        j.g(value, "value");
        return builder.addLenient$okhttp(name, value);
    }
}
