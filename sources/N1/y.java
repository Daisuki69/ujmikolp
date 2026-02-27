package n1;

import android.os.Looper;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface y {
    void addListener(t tVar);

    Looper getApplicationLooper();

    long getContentBufferedPosition();

    long getContentPosition();

    long getCurrentPosition();

    List getCurrentStaticMetadata();

    AbstractC1894G getCurrentTimeline();

    TrackGroupArray getCurrentTrackGroups();

    v1.d getCurrentTrackSelections();

    int getCurrentWindowIndex();

    long getDuration();

    int getNextWindowIndex();

    boolean getPlayWhenReady();

    C1910p getPlaybackParameters();

    int getPlaybackState();

    ExoPlaybackException getPlayerError();

    int getPreviousWindowIndex();

    int getRendererType(int i);

    int getRepeatMode();

    boolean getShuffleModeEnabled();

    w getTextComponent();

    x getVideoComponent();

    boolean hasNext();

    boolean isCurrentWindowSeekable();

    boolean isPlaying();

    boolean isPlayingAd();

    void prepare();

    void removeListener(t tVar);

    void seekTo(int i, long j);

    void setPlayWhenReady(boolean z4);

    void setPlaybackParameters(C1910p c1910p);

    void setRepeatMode(int i);

    void setShuffleModeEnabled(boolean z4);
}
