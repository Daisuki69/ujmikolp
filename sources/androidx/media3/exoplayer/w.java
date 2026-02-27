package androidx.media3.exoplayer;

import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.ExoPlayerImplInternal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements ListenerSet.Event, ListenerSet.IterationFinishedEvent, ExoPlayerImplInternal.PlaybackInfoUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExoPlayerImpl f8142b;

    public /* synthetic */ w(ExoPlayerImpl exoPlayerImpl, int i) {
        this.f8141a = i;
        this.f8142b = exoPlayerImpl;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f8141a) {
            case 0:
                this.f8142b.lambda$setPlaylistMetadata$7((Player.Listener) obj);
                break;
            default:
                this.f8142b.lambda$updateAvailableCommands$26((Player.Listener) obj);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdateListener
    public void onPlaybackInfoUpdate(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        this.f8142b.lambda$new$2(playbackInfoUpdate);
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        this.f8142b.lambda$new$0((Player.Listener) obj, flagSet);
    }
}
