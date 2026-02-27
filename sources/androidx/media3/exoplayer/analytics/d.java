package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f7941b;
    public final /* synthetic */ long c;

    public /* synthetic */ d(AnalyticsListener.EventTime eventTime, long j, int i) {
        this.f7940a = i;
        this.f7941b = eventTime;
        this.c = j;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f7940a) {
            case 0:
                analyticsListener.onSeekForwardIncrementChanged(this.f7941b, this.c);
                break;
            case 1:
                analyticsListener.onAudioPositionAdvancing(this.f7941b, this.c);
                break;
            case 2:
                analyticsListener.onSeekBackIncrementChanged(this.f7941b, this.c);
                break;
            default:
                analyticsListener.onMaxSeekToPreviousPositionChanged(this.f7941b, this.c);
                break;
        }
    }
}
