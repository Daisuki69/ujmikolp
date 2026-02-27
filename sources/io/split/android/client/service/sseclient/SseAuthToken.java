package io.split.android.client.service.sseclient;

import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
class SseAuthToken {

    @InterfaceC1498b("x-ably-capability")
    private final String channelList;

    @InterfaceC1498b("exp")
    private final long expirationAt;

    @InterfaceC1498b("iat")
    private final long issuedAt;

    public SseAuthToken(String str, long j, long j6) {
        this.channelList = str;
        this.issuedAt = j;
        this.expirationAt = j6;
    }

    public String getChannelList() {
        return this.channelList;
    }

    public long getExpirationAt() {
        return this.expirationAt;
    }

    public long getIssuedAt() {
        return this.issuedAt;
    }
}
