package io.split.android.client.service.sseclient.notifications;

/* JADX INFO: loaded from: classes4.dex */
public class IncomingNotification extends IncomingNotificationType {
    protected String channel;
    private String jsonData;
    protected long timestamp;

    public IncomingNotification() {
    }

    public String getChannel() {
        return this.channel;
    }

    public String getJsonData() {
        return this.jsonData;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // io.split.android.client.service.sseclient.notifications.IncomingNotificationType
    public NotificationType getType() {
        return this.type;
    }

    public IncomingNotification(NotificationType notificationType, String str, String str2, long j) {
        this.type = notificationType;
        this.channel = str;
        this.jsonData = str2;
        this.timestamp = j;
    }
}
