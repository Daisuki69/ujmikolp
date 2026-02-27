package io.split.android.client.service.sseclient.notifications;

import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public class RawNotification {

    @InterfaceC1498b(AppsFlyerProperties.CHANNEL)
    private String channel;

    @InterfaceC1498b("clientId")
    private String clientId;

    @InterfaceC1498b("data")
    private String data;

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private String name;

    @InterfaceC1498b("timestamp")
    private long timestamp;

    public String getChannel() {
        return this.channel;
    }

    public String getClientId() {
        return this.clientId;
    }

    public String getData() {
        return this.data;
    }

    public String getName() {
        return this.name;
    }

    public long getTimestamp() {
        return this.timestamp;
    }
}
