package okhttp3;

import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i, String reason) {
        j.g(webSocket, "webSocket");
        j.g(reason, "reason");
    }

    public void onClosing(WebSocket webSocket, int i, String reason) {
        j.g(webSocket, "webSocket");
        j.g(reason, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable t5, Response response) {
        j.g(webSocket, "webSocket");
        j.g(t5, "t");
    }

    public void onMessage(WebSocket webSocket, String text) {
        j.g(webSocket, "webSocket");
        j.g(text, "text");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        j.g(webSocket, "webSocket");
        j.g(response, "response");
    }

    public void onMessage(WebSocket webSocket, ByteString bytes) {
        j.g(webSocket, "webSocket");
        j.g(bytes, "bytes");
    }
}
