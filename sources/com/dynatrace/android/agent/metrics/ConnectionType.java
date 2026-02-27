package com.dynatrace.android.agent.metrics;

import androidx.media3.exoplayer.upstream.CmcdData;

/* JADX INFO: loaded from: classes2.dex */
public enum ConnectionType {
    OFFLINE("o"),
    MOBILE("m"),
    WIFI("w"),
    LAN(CmcdData.Factory.STREAM_TYPE_LIVE),
    OTHER("");

    private String protocolValue;

    ConnectionType(String str) {
        this.protocolValue = str;
    }

    public String getProtocolValue() {
        return this.protocolValue;
    }
}
