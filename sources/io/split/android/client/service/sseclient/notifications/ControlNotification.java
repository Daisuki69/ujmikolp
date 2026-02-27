package io.split.android.client.service.sseclient.notifications;

import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public class ControlNotification extends IncomingNotification {

    @InterfaceC1498b("controlType")
    private ControlType controlType;

    public enum ControlType {
        STREAMING_RESUMED,
        STREAMING_DISABLED,
        STREAMING_PAUSED,
        STREAMING_RESET
    }

    public ControlType getControlType() {
        return this.controlType;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }
}
