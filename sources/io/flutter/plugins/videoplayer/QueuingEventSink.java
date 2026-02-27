package io.flutter.plugins.videoplayer;

import java.util.ArrayList;
import pg.k;

/* JADX INFO: loaded from: classes4.dex */
final class QueuingEventSink implements k {
    private k delegate;
    private final ArrayList<Object> eventQueue = new ArrayList<>();
    private boolean done = false;

    public static class EndOfStreamEvent {
    }

    public static class ErrorEvent {
        String code;
        Object details;
        String message;

        public ErrorEvent(String str, String str2, Object obj) {
            this.code = str;
            this.message = str2;
            this.details = obj;
        }
    }

    private void enqueue(Object obj) {
        if (this.done) {
            return;
        }
        this.eventQueue.add(obj);
    }

    private void maybeFlush() {
        if (this.delegate == null) {
            return;
        }
        for (Object obj : this.eventQueue) {
            if (obj instanceof EndOfStreamEvent) {
                this.delegate.endOfStream();
            } else if (obj instanceof ErrorEvent) {
                ErrorEvent errorEvent = (ErrorEvent) obj;
                this.delegate.error(errorEvent.code, errorEvent.message, errorEvent.details);
            } else {
                this.delegate.success(obj);
            }
        }
        this.eventQueue.clear();
    }

    @Override // pg.k
    public void endOfStream() {
        enqueue(new EndOfStreamEvent());
        maybeFlush();
        this.done = true;
    }

    @Override // pg.k
    public void error(String str, String str2, Object obj) {
        enqueue(new ErrorEvent(str, str2, obj));
        maybeFlush();
    }

    public void setDelegate(k kVar) {
        this.delegate = kVar;
        maybeFlush();
    }

    @Override // pg.k
    public void success(Object obj) {
        enqueue(obj);
        maybeFlush();
    }
}
