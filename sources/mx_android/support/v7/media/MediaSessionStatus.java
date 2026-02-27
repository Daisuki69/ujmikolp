package mx_android.support.v7.media;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import mx_android.support.v4.util.TimeUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class MediaSessionStatus {
    private static final String KEY_EXTRAS = "extras";
    private static final String KEY_QUEUE_PAUSED = "queuePaused";
    private static final String KEY_SESSION_STATE = "sessionState";
    private static final String KEY_TIMESTAMP = "timestamp";
    public static final int SESSION_STATE_ACTIVE = 0;
    public static final int SESSION_STATE_ENDED = 1;
    public static final int SESSION_STATE_INVALIDATED = 2;
    private final Bundle mBundle;

    private MediaSessionStatus(Bundle bundle) {
        this.mBundle = bundle;
    }

    public long getTimestamp() {
        return this.mBundle.getLong("timestamp");
    }

    public int getSessionState() {
        return this.mBundle.getInt(KEY_SESSION_STATE, 2);
    }

    public boolean isQueuePaused() {
        return this.mBundle.getBoolean(KEY_QUEUE_PAUSED);
    }

    public Bundle getExtras() {
        return this.mBundle.getBundle(KEY_EXTRAS);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MediaSessionStatus{ ");
        sb2.append("timestamp=");
        TimeUtils.formatDuration(SystemClock.elapsedRealtime() - getTimestamp(), sb2);
        sb2.append(" ms ago");
        sb2.append(", sessionState=");
        sb2.append(sessionStateToString(getSessionState()));
        sb2.append(", queuePaused=");
        sb2.append(isQueuePaused());
        sb2.append(", extras=");
        sb2.append(getExtras());
        sb2.append(" }");
        return sb2.toString();
    }

    private static String sessionStateToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? Integer.toString(i) : "invalidated" : "ended" : AppMeasurementSdk.ConditionalUserProperty.ACTIVE;
    }

    public Bundle asBundle() {
        return this.mBundle;
    }

    public static MediaSessionStatus fromBundle(Bundle bundle) {
        if (bundle != null) {
            return new MediaSessionStatus(bundle);
        }
        return null;
    }

    public static final class Builder {
        private final Bundle mBundle;

        public Builder(int i) {
            this.mBundle = new Bundle();
            setTimestamp(SystemClock.elapsedRealtime());
            setSessionState(i);
        }

        public Builder(MediaSessionStatus mediaSessionStatus) {
            if (mediaSessionStatus == null) {
                throw new IllegalArgumentException("status must not be null");
            }
            this.mBundle = new Bundle(mediaSessionStatus.mBundle);
        }

        public Builder setTimestamp(long j) {
            this.mBundle.putLong("timestamp", j);
            return this;
        }

        public Builder setSessionState(int i) {
            this.mBundle.putInt(MediaSessionStatus.KEY_SESSION_STATE, i);
            return this;
        }

        public Builder setQueuePaused(boolean z4) {
            this.mBundle.putBoolean(MediaSessionStatus.KEY_QUEUE_PAUSED, z4);
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.mBundle.putBundle(MediaSessionStatus.KEY_EXTRAS, bundle);
            return this;
        }

        public MediaSessionStatus build() {
            return new MediaSessionStatus(this.mBundle);
        }
    }
}
