package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes5.dex */
public abstract class EventListener {
    public static final Companion Companion = new Companion(null);
    public static final EventListener NONE = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public interface Factory {
        EventListener create(Call call);
    }

    public void cacheConditionalHit(Call call, Response cachedResponse) {
        j.g(call, "call");
        j.g(cachedResponse, "cachedResponse");
    }

    public void cacheHit(Call call, Response response) {
        j.g(call, "call");
        j.g(response, "response");
    }

    public void cacheMiss(Call call) {
        j.g(call, "call");
    }

    public void callEnd(Call call) {
        j.g(call, "call");
    }

    public void callFailed(Call call, IOException ioe) {
        j.g(call, "call");
        j.g(ioe, "ioe");
    }

    public void callStart(Call call) {
        j.g(call, "call");
    }

    public void canceled(Call call) {
        j.g(call, "call");
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        j.g(call, "call");
        j.g(inetSocketAddress, "inetSocketAddress");
        j.g(proxy, "proxy");
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        j.g(call, "call");
        j.g(inetSocketAddress, "inetSocketAddress");
        j.g(proxy, "proxy");
        j.g(ioe, "ioe");
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        j.g(call, "call");
        j.g(inetSocketAddress, "inetSocketAddress");
        j.g(proxy, "proxy");
    }

    public void connectionAcquired(Call call, Connection connection) {
        j.g(call, "call");
        j.g(connection, "connection");
    }

    public void connectionReleased(Call call, Connection connection) {
        j.g(call, "call");
        j.g(connection, "connection");
    }

    public void dnsEnd(Call call, String domainName, List<InetAddress> inetAddressList) {
        j.g(call, "call");
        j.g(domainName, "domainName");
        j.g(inetAddressList, "inetAddressList");
    }

    public void dnsStart(Call call, String domainName) {
        j.g(call, "call");
        j.g(domainName, "domainName");
    }

    public void proxySelectEnd(Call call, HttpUrl url, List<Proxy> proxies) {
        j.g(call, "call");
        j.g(url, "url");
        j.g(proxies, "proxies");
    }

    public void proxySelectStart(Call call, HttpUrl url) {
        j.g(call, "call");
        j.g(url, "url");
    }

    public void requestBodyEnd(Call call, long j) {
        j.g(call, "call");
    }

    public void requestBodyStart(Call call) {
        j.g(call, "call");
    }

    public void requestFailed(Call call, IOException ioe) {
        j.g(call, "call");
        j.g(ioe, "ioe");
    }

    public void requestHeadersEnd(Call call, Request request) {
        j.g(call, "call");
        j.g(request, "request");
    }

    public void requestHeadersStart(Call call) {
        j.g(call, "call");
    }

    public void responseBodyEnd(Call call, long j) {
        j.g(call, "call");
    }

    public void responseBodyStart(Call call) {
        j.g(call, "call");
    }

    public void responseFailed(Call call, IOException ioe) {
        j.g(call, "call");
        j.g(ioe, "ioe");
    }

    public void responseHeadersEnd(Call call, Response response) {
        j.g(call, "call");
        j.g(response, "response");
    }

    public void responseHeadersStart(Call call) {
        j.g(call, "call");
    }

    public void satisfactionFailure(Call call, Response response) {
        j.g(call, "call");
        j.g(response, "response");
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        j.g(call, "call");
    }

    public void secureConnectStart(Call call) {
        j.g(call, "call");
    }
}
