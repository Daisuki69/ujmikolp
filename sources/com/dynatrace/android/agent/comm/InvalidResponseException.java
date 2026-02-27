package com.dynatrace.android.agent.comm;

/* JADX INFO: loaded from: classes2.dex */
public class InvalidResponseException extends Exception {
    private HttpResponse response;

    public InvalidResponseException(String str, HttpResponse httpResponse) {
        super(str);
        this.response = httpResponse;
    }

    public HttpResponse getResponse() {
        return this.response;
    }

    public InvalidResponseException(String str, Throwable th2, HttpResponse httpResponse) {
        super(str, th2);
        this.response = httpResponse;
    }
}
