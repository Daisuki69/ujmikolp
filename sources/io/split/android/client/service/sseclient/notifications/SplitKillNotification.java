package io.split.android.client.service.sseclient.notifications;

import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public class SplitKillNotification extends IncomingNotification {

    @InterfaceC1498b("changeNumber")
    private long changeNumber;

    @InterfaceC1498b("defaultTreatment")
    private String defaultTreatment;

    @InterfaceC1498b("splitName")
    private String splitName;

    public long getChangeNumber() {
        return this.changeNumber;
    }

    public String getDefaultTreatment() {
        return this.defaultTreatment;
    }

    public String getSplitName() {
        return this.splitName;
    }
}
