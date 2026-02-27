package io.split.android.client.service.sseclient;

import g3.InterfaceC1498b;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;

/* JADX INFO: loaded from: classes4.dex */
public class SseAuthenticationResponse {
    private boolean isClientError;

    @InterfaceC1498b("pushEnabled")
    private boolean isStreamingEnabled;

    @InterfaceC1498b("connDelay")
    private Long sseConnectionDelay;

    @InterfaceC1498b(MPDbAdapter.KEY_TOKEN)
    private String token;

    public SseAuthenticationResponse() {
        this.isClientError = false;
    }

    public Long getSseConnectionDelay() {
        return this.sseConnectionDelay;
    }

    public String getToken() {
        return this.token;
    }

    public boolean isClientError() {
        return this.isClientError;
    }

    public boolean isStreamingEnabled() {
        return this.isStreamingEnabled;
    }

    public SseAuthenticationResponse(boolean z4) {
        this.isClientError = z4;
    }
}
