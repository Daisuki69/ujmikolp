package okhttp3.sse;

import kotlin.jvm.internal.j;
import okhttp3.Response;

/* JADX INFO: loaded from: classes5.dex */
public abstract class EventSourceListener {
    public void onClosed(EventSource eventSource) {
        j.g(eventSource, "eventSource");
    }

    public void onEvent(EventSource eventSource, String str, String str2, String data) {
        j.g(eventSource, "eventSource");
        j.g(data, "data");
    }

    public void onFailure(EventSource eventSource, Throwable th2, Response response) {
        j.g(eventSource, "eventSource");
    }

    public void onOpen(EventSource eventSource, Response response) {
        j.g(eventSource, "eventSource");
        j.g(response, "response");
    }
}
