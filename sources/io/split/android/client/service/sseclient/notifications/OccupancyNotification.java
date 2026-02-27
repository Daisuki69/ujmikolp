package io.split.android.client.service.sseclient.notifications;

/* JADX INFO: loaded from: classes4.dex */
public class OccupancyNotification extends IncomingNotification {
    private static final String CONTROL_PRI_TOKEN = "control_pri";
    private static final String CONTROL_SEC_TOKEN = "control_sec";
    private Metrics metrics;

    public static class Metrics {
        private int publishers;

        public int getPublishers() {
            return this.publishers;
        }
    }

    public OccupancyNotification() {
        this.type = NotificationType.OCCUPANCY;
    }

    public Metrics getMetrics() {
        return this.metrics;
    }

    public boolean isControlPriChannel() {
        if (getChannel() == null) {
            return false;
        }
        return getChannel().contains(CONTROL_PRI_TOKEN);
    }

    public boolean isControlSecChannel() {
        if (getChannel() == null) {
            return false;
        }
        return getChannel().contains(CONTROL_SEC_TOKEN);
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }
}
