package H3;

import android.media.MediaPlayer;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements MediaPlayer.OnErrorListener {
    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i4) {
        Log.w(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Failed to beep " + i + ", " + i4);
        mediaPlayer.stop();
        mediaPlayer.release();
        return true;
    }
}
