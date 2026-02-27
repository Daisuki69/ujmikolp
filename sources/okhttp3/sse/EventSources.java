package okhttp3.sse;

import androidx.media3.exoplayer.rtsp.RtspHeaders;
import de.m;
import kotlin.jvm.internal.j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.sse.RealEventSource;
import okhttp3.sse.EventSource;

/* JADX INFO: loaded from: classes5.dex */
public final class EventSources {
    public static final EventSources INSTANCE = new EventSources();

    private EventSources() {
    }

    public static final EventSource.Factory createFactory(OkHttpClient client) {
        j.g(client, "client");
        return new m(client, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventSource createFactory$lambda$1(OkHttpClient client, Request request, EventSourceListener listener) {
        j.g(client, "$client");
        j.g(request, "request");
        j.g(listener, "listener");
        if (request.header(RtspHeaders.ACCEPT) == null) {
            request = request.newBuilder().addHeader(RtspHeaders.ACCEPT, "text/event-stream").build();
        }
        RealEventSource realEventSource = new RealEventSource(request, listener);
        realEventSource.connect(client);
        return realEventSource;
    }

    public static final void processResponse(Response response, EventSourceListener listener) {
        j.g(response, "response");
        j.g(listener, "listener");
        new RealEventSource(response.request(), listener).processResponse(response);
    }
}
