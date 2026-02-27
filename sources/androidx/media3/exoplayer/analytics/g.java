package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f7947b;
    public final /* synthetic */ LoadEventInfo c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MediaLoadData f7948d;

    public /* synthetic */ g(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.f7946a = i;
        this.f7947b = eventTime;
        this.c = loadEventInfo;
        this.f7948d = mediaLoadData;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f7946a) {
            case 0:
                analyticsListener.onLoadStarted(this.f7947b, this.c, this.f7948d);
                break;
            case 1:
                analyticsListener.onLoadCanceled(this.f7947b, this.c, this.f7948d);
                break;
            default:
                analyticsListener.onLoadCompleted(this.f7947b, this.c, this.f7948d);
                break;
        }
    }
}
