package okhttp3.internal.sse;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.sse.ServerSentEventReader;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;

/* JADX INFO: loaded from: classes5.dex */
public final class RealEventSource implements EventSource, ServerSentEventReader.Callback, Callback {
    private RealCall call;
    private final EventSourceListener listener;
    private final Request request;

    public RealEventSource(Request request, EventSourceListener listener) {
        j.g(request, "request");
        j.g(listener, "listener");
        this.request = request;
        this.listener = listener;
    }

    private final boolean isEventStream(ResponseBody responseBody) {
        MediaType mediaTypeContentType = responseBody.contentType();
        return mediaTypeContentType != null && j.b(mediaTypeContentType.type(), "text") && j.b(mediaTypeContentType.subtype(), "event-stream");
    }

    @Override // okhttp3.sse.EventSource
    public void cancel() {
        RealCall realCall = this.call;
        if (realCall != null) {
            realCall.cancel();
        } else {
            j.n("call");
            throw null;
        }
    }

    public final void connect(OkHttpClient client) {
        j.g(client, "client");
        Call callNewCall = client.newBuilder().eventListener(EventListener.NONE).build().newCall(this.request);
        j.e(callNewCall, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall");
        RealCall realCall = (RealCall) callNewCall;
        this.call = realCall;
        realCall.enqueue(this);
    }

    @Override // okhttp3.internal.sse.ServerSentEventReader.Callback
    public void onEvent(String str, String str2, String data) {
        j.g(data, "data");
        this.listener.onEvent(this, str, str2, data);
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException e) {
        j.g(call, "call");
        j.g(e, "e");
        this.listener.onFailure(this, e, null);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        j.g(call, "call");
        j.g(response, "response");
        processResponse(response);
    }

    @Override // okhttp3.internal.sse.ServerSentEventReader.Callback
    public void onRetryChange(long j) {
    }

    public final void processResponse(Response response) {
        j.g(response, "response");
        try {
            if (!response.isSuccessful()) {
                this.listener.onFailure(this, null, response);
                response.close();
                return;
            }
            ResponseBody responseBodyBody = response.body();
            j.d(responseBodyBody);
            if (!isEventStream(responseBodyBody)) {
                this.listener.onFailure(this, new IllegalStateException("Invalid content-type: " + responseBodyBody.contentType()), response);
                response.close();
                return;
            }
            RealCall realCall = this.call;
            if (realCall == null) {
                j.n("call");
                throw null;
            }
            realCall.timeoutEarlyExit();
            Response responseBuild = response.newBuilder().body(Util.EMPTY_RESPONSE).build();
            ServerSentEventReader serverSentEventReader = new ServerSentEventReader(responseBodyBody.source(), this);
            try {
                this.listener.onOpen(this, responseBuild);
                do {
                } while (serverSentEventReader.processNextEvent());
                this.listener.onClosed(this);
                Unit unit = Unit.f18162a;
                response.close();
            } catch (Exception e) {
                this.listener.onFailure(this, e, responseBuild);
                response.close();
            }
        } finally {
        }
    }

    @Override // okhttp3.sse.EventSource
    public Request request() {
        return this.request;
    }
}
