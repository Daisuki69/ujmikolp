package mx_android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.os.SystemClock;
import mx_android.support.v4.media.session.MediaSessionCompatApi14;

/* JADX INFO: loaded from: classes7.dex */
public class MediaSessionCompatApi18 {
    public static Object createPlaybackPositionUpdateListener(MediaSessionCompatApi14.Callback callback) {
        return new OnPlaybackPositionUpdateListener(callback);
    }

    public static void registerMediaButtonEventReceiver(Context context, PendingIntent pendingIntent) {
        ((AudioManager) context.getSystemService("audio")).registerMediaButtonEventReceiver(pendingIntent);
    }

    public static void unregisterMediaButtonEventReceiver(Context context, PendingIntent pendingIntent) {
        ((AudioManager) context.getSystemService("audio")).unregisterMediaButtonEventReceiver(pendingIntent);
    }

    public static void setState(Object obj, int i, long j, float f, long j6) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (i == 3) {
            long j7 = 0;
            if (j > 0) {
                if (j6 > 0) {
                    j7 = jElapsedRealtime - j6;
                    if (f > 0.0f && f != 1.0f) {
                        j7 = (long) (j7 * f);
                    }
                }
                j += j7;
            }
        }
        ((RemoteControlClient) obj).setPlaybackState(MediaSessionCompatApi14.getRccStateFromState(i), j, f);
    }

    public static void setOnPlaybackPositionUpdateListener(Object obj, Object obj2) {
        ((RemoteControlClient) obj).setPlaybackPositionUpdateListener((RemoteControlClient.OnPlaybackPositionUpdateListener) obj2);
    }

    static class OnPlaybackPositionUpdateListener<T extends MediaSessionCompatApi14.Callback> implements RemoteControlClient.OnPlaybackPositionUpdateListener {
        protected final T mCallback;

        public OnPlaybackPositionUpdateListener(T t5) {
            this.mCallback = t5;
        }

        @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
        public void onPlaybackPositionUpdate(long j) {
            this.mCallback.onSeekTo(j);
        }
    }
}
