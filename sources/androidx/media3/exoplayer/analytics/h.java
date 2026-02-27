package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f7950b;
    public final /* synthetic */ int c;

    public /* synthetic */ h(AnalyticsListener.EventTime eventTime, int i, int i4) {
        this.f7949a = i4;
        this.f7950b = eventTime;
        this.c = i;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f7949a) {
            case 0:
                analyticsListener.onTimelineChanged(this.f7950b, this.c);
                break;
            case 1:
                analyticsListener.onPlaybackSuppressionReasonChanged(this.f7950b, this.c);
                break;
            case 2:
                analyticsListener.onPlaybackStateChanged(this.f7950b, this.c);
                break;
            case 3:
                DefaultAnalyticsCollector.lambda$onDrmSessionAcquired$63(this.f7950b, this.c, analyticsListener);
                break;
            case 4:
                analyticsListener.onAudioSessionIdChanged(this.f7950b, this.c);
                break;
            default:
                analyticsListener.onRepeatModeChanged(this.f7950b, this.c);
                break;
        }
    }
}
