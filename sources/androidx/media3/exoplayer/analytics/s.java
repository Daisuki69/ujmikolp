package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioSink;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f7978b;
    public final /* synthetic */ AudioSink.AudioTrackConfig c;

    public /* synthetic */ s(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig, int i) {
        this.f7977a = i;
        this.f7978b = eventTime;
        this.c = audioTrackConfig;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f7977a) {
            case 0:
                analyticsListener.onAudioTrackInitialized(this.f7978b, this.c);
                break;
            default:
                analyticsListener.onAudioTrackReleased(this.f7978b, this.c);
                break;
        }
    }
}
