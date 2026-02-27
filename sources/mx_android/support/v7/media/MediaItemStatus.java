package mx_android.support.v7.media;

import android.os.Bundle;
import android.os.SystemClock;
import mx_android.support.v4.util.TimeUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class MediaItemStatus {
    public static final String EXTRA_HTTP_RESPONSE_HEADERS = "android.media.status.extra.HTTP_RESPONSE_HEADERS";
    public static final String EXTRA_HTTP_STATUS_CODE = "android.media.status.extra.HTTP_STATUS_CODE";
    private static final String KEY_CONTENT_DURATION = "contentDuration";
    private static final String KEY_CONTENT_POSITION = "contentPosition";
    private static final String KEY_EXTRAS = "extras";
    private static final String KEY_PLAYBACK_STATE = "playbackState";
    private static final String KEY_TIMESTAMP = "timestamp";
    public static final int PLAYBACK_STATE_BUFFERING = 3;
    public static final int PLAYBACK_STATE_CANCELED = 5;
    public static final int PLAYBACK_STATE_ERROR = 7;
    public static final int PLAYBACK_STATE_FINISHED = 4;
    public static final int PLAYBACK_STATE_INVALIDATED = 6;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PENDING = 0;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    private final Bundle mBundle;

    private MediaItemStatus(Bundle bundle) {
        this.mBundle = bundle;
    }

    public long getTimestamp() {
        return this.mBundle.getLong("timestamp");
    }

    public int getPlaybackState() {
        return this.mBundle.getInt(KEY_PLAYBACK_STATE, 7);
    }

    public long getContentPosition() {
        return this.mBundle.getLong(KEY_CONTENT_POSITION, -1L);
    }

    public long getContentDuration() {
        return this.mBundle.getLong(KEY_CONTENT_DURATION, -1L);
    }

    public Bundle getExtras() {
        return this.mBundle.getBundle(KEY_EXTRAS);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MediaItemStatus{ ");
        sb2.append("timestamp=");
        TimeUtils.formatDuration(SystemClock.elapsedRealtime() - getTimestamp(), sb2);
        sb2.append(" ms ago");
        sb2.append(", playbackState=");
        sb2.append(playbackStateToString(getPlaybackState()));
        sb2.append(", contentPosition=");
        sb2.append(getContentPosition());
        sb2.append(", contentDuration=");
        sb2.append(getContentDuration());
        sb2.append(", extras=");
        sb2.append(getExtras());
        sb2.append(" }");
        return sb2.toString();
    }

    private static String playbackStateToString(int i) {
        switch (i) {
            case 0:
                return "pending";
            case 1:
                return "playing";
            case 2:
                return "paused";
            case 3:
                return "buffering";
            case 4:
                return "finished";
            case 5:
                return "canceled";
            case 6:
                return "invalidated";
            case 7:
                return MediaRouteProviderProtocol.SERVICE_DATA_ERROR;
            default:
                return Integer.toString(i);
        }
    }

    public Bundle asBundle() {
        return this.mBundle;
    }

    public static MediaItemStatus fromBundle(Bundle bundle) {
        if (bundle != null) {
            return new MediaItemStatus(bundle);
        }
        return null;
    }

    public static final class Builder {
        private final Bundle mBundle;

        public Builder(int i) {
            this.mBundle = new Bundle();
            setTimestamp(SystemClock.elapsedRealtime());
            setPlaybackState(i);
        }

        public Builder(MediaItemStatus mediaItemStatus) {
            if (mediaItemStatus == null) {
                throw new IllegalArgumentException("status must not be null");
            }
            this.mBundle = new Bundle(mediaItemStatus.mBundle);
        }

        public Builder setTimestamp(long j) {
            this.mBundle.putLong("timestamp", j);
            return this;
        }

        public Builder setPlaybackState(int i) {
            this.mBundle.putInt(MediaItemStatus.KEY_PLAYBACK_STATE, i);
            return this;
        }

        public Builder setContentPosition(long j) {
            this.mBundle.putLong(MediaItemStatus.KEY_CONTENT_POSITION, j);
            return this;
        }

        public Builder setContentDuration(long j) {
            this.mBundle.putLong(MediaItemStatus.KEY_CONTENT_DURATION, j);
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.mBundle.putBundle(MediaItemStatus.KEY_EXTRAS, bundle);
            return this;
        }

        public MediaItemStatus build() {
            return new MediaItemStatus(this.mBundle);
        }
    }
}
