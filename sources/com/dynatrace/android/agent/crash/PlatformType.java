package com.dynatrace.android.agent.crash;

import androidx.media3.exoplayer.upstream.CmcdData;

/* JADX INFO: loaded from: classes2.dex */
public enum PlatformType {
    JAVA(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY),
    JAVA_SCRIPT("j"),
    XAMARIN("x"),
    DART("d"),
    CUSTOM("c");

    private final String protocolValue;

    PlatformType(String str) {
        this.protocolValue = str;
    }

    public String getProtocolValue() {
        return this.protocolValue;
    }
}
