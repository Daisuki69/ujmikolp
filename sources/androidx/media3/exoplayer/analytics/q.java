package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.MediaLoadData;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f7973b;
    public final /* synthetic */ MediaLoadData c;

    public /* synthetic */ q(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, int i) {
        this.f7972a = i;
        this.f7973b = eventTime;
        this.c = mediaLoadData;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f7972a) {
            case 0:
                analyticsListener.onDownstreamFormatChanged(this.f7973b, this.c);
                break;
            default:
                analyticsListener.onUpstreamDiscarded(this.f7973b, this.c);
                break;
        }
    }
}
