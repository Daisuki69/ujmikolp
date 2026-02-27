package mx_android.support.v4.media.session;

import android.media.session.PlaybackState;

/* JADX INFO: loaded from: classes7.dex */
class PlaybackStateCompatApi21 {
    PlaybackStateCompatApi21() {
    }

    public static int getState(Object obj) {
        return ((PlaybackState) obj).getState();
    }

    public static long getPosition(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    public static long getBufferedPosition(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    public static float getPlaybackSpeed(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    public static long getActions(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    public static CharSequence getErrorMessage(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    public static long getLastPositionUpdateTime(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    public static Object newInstance(int i, long j, long j6, float f, long j7, CharSequence charSequence, long j9) {
        PlaybackState.Builder builder = new PlaybackState.Builder();
        builder.setState(i, j, f, j9);
        builder.setBufferedPosition(j6);
        builder.setActions(j7);
        builder.setErrorMessage(charSequence);
        return builder.build();
    }
}
