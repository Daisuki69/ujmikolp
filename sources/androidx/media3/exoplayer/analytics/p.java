package androidx.media3.exoplayer.analytics;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f7971b;
    public final /* synthetic */ PlaybackException c;

    public /* synthetic */ p(AnalyticsListener.EventTime eventTime, PlaybackException playbackException, int i) {
        this.f7970a = i;
        this.f7971b = eventTime;
        this.c = playbackException;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f7970a) {
            case 0:
                analyticsListener.onPlayerErrorChanged(this.f7971b, this.c);
                break;
            default:
                analyticsListener.onPlayerError(this.f7971b, this.c);
                break;
        }
    }
}
