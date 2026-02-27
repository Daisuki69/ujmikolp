package io.split.android.client.service.sseclient.notifications;

/* JADX INFO: loaded from: classes4.dex */
public class StreamingError {
    private final int code;
    private final String message;
    private final int statusCode;

    public StreamingError(String str, int i, int i4) {
        this.message = str;
        this.code = i;
        this.statusCode = i4;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public boolean isRetryable() {
        int i = this.code;
        return i >= 40140 && i <= 40149;
    }

    public boolean shouldBeIgnored() {
        int i = this.code;
        return i < 40000 || i > 49999;
    }
}
