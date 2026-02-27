package androidx.media3.exoplayer;

import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.Player;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.MediaPeriodHolder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements ListenerSet.Event, MediaPeriodHolder.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8048b;

    public /* synthetic */ o(Object obj, int i) {
        this.f8047a = i;
        this.f8048b = obj;
    }

    @Override // androidx.media3.exoplayer.MediaPeriodHolder.Factory
    public MediaPeriodHolder create(MediaPeriodInfo mediaPeriodInfo, long j) {
        return ((ExoPlayerImplInternal) this.f8048b).createMediaPeriodHolder(mediaPeriodInfo, j);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f8047a) {
            case 0:
                ((Player.Listener) obj).onMediaMetadataChanged((MediaMetadata) this.f8048b);
                break;
            case 1:
                ((Player.Listener) obj).onAudioAttributesChanged((AudioAttributes) this.f8048b);
                break;
            case 2:
                ((Player.Listener) obj).onTrackSelectionParametersChanged((TrackSelectionParameters) this.f8048b);
                break;
            case 3:
                ((Player.Listener) obj).onCues((CueGroup) this.f8048b);
                break;
            case 4:
                ((ExoPlayerImpl.ComponentListener) this.f8048b).lambda$onMetadata$4((Player.Listener) obj);
                break;
            case 5:
                ((Player.Listener) obj).onMetadata((Metadata) this.f8048b);
                break;
            case 6:
                ((Player.Listener) obj).onCues((List<Cue>) this.f8048b);
                break;
            case 7:
                ((Player.Listener) obj).onVideoSizeChanged((VideoSize) this.f8048b);
                break;
            default:
                ((Player.Listener) obj).onDeviceInfoChanged((DeviceInfo) this.f8048b);
                break;
        }
    }
}
