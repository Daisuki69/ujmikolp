package okhttp3.internal.http;

import androidx.browser.trusted.sharing.ShareTarget;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes5.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String method) {
        j.g(method, "method");
        return (method.equals(ShareTarget.METHOD_GET) || method.equals("HEAD")) ? false : true;
    }

    public static final boolean requiresRequestBody(String method) {
        j.g(method, "method");
        return method.equals(ShareTarget.METHOD_POST) || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT");
    }

    public final boolean invalidatesCache(String method) {
        j.g(method, "method");
        return method.equals(ShareTarget.METHOD_POST) || method.equals("PATCH") || method.equals("PUT") || method.equals("DELETE") || method.equals("MOVE");
    }

    public final boolean redirectsToGet(String method) {
        j.g(method, "method");
        return !method.equals("PROPFIND");
    }

    public final boolean redirectsWithBody(String method) {
        j.g(method, "method");
        return method.equals("PROPFIND");
    }
}
