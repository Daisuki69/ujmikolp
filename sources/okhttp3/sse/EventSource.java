package okhttp3.sse;

import okhttp3.Request;

/* JADX INFO: loaded from: classes5.dex */
public interface EventSource {

    public interface Factory {
        EventSource newEventSource(Request request, EventSourceListener eventSourceListener);
    }

    void cancel();

    Request request();
}
