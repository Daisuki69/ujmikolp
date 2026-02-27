package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f7952b;
    public final /* synthetic */ int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f7953d;
    public final /* synthetic */ long e;

    public /* synthetic */ i(AnalyticsListener.EventTime eventTime, int i, long j, long j6, int i4) {
        this.f7951a = i4;
        this.f7952b = eventTime;
        this.c = i;
        this.f7953d = j;
        this.e = j6;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f7951a) {
            case 0:
                ((AnalyticsListener) obj).onBandwidthEstimate(this.f7952b, this.c, this.f7953d, this.e);
                break;
            default:
                ((AnalyticsListener) obj).onAudioUnderrun(this.f7952b, this.c, this.f7953d, this.e);
                break;
        }
    }
}
