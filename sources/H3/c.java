package H3;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements MediaPlayer.OnCompletionListener {
    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        mediaPlayer.release();
    }
}
