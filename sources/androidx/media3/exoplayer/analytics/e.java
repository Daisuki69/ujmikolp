package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f7943b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ e(AnalyticsListener.EventTime eventTime, int i, boolean z4) {
        this.f7942a = i;
        this.f7943b = eventTime;
        this.c = z4;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f7942a) {
            case 0:
                DefaultAnalyticsCollector.lambda$onIsLoadingChanged$34(this.f7943b, this.c, analyticsListener);
                break;
            case 1:
                analyticsListener.onSkipSilenceEnabledChanged(this.f7943b, this.c);
                break;
            case 2:
                analyticsListener.onIsPlayingChanged(this.f7943b, this.c);
                break;
            default:
                analyticsListener.onShuffleModeChanged(this.f7943b, this.c);
                break;
        }
    }
}
