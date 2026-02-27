package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7967a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f7968b;
    public final /* synthetic */ long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7969d;

    public /* synthetic */ o(AnalyticsListener.EventTime eventTime, int i, long j) {
        this.f7968b = eventTime;
        this.f7969d = i;
        this.c = j;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f7967a) {
            case 0:
                analyticsListener.onDroppedVideoFrames(this.f7968b, this.f7969d, this.c);
                break;
            default:
                analyticsListener.onVideoFrameProcessingOffset(this.f7968b, this.c, this.f7969d);
                break;
        }
    }

    public /* synthetic */ o(AnalyticsListener.EventTime eventTime, long j, int i) {
        this.f7968b = eventTime;
        this.c = j;
        this.f7969d = i;
    }
}
