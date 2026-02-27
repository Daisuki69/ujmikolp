package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f7965b;
    public final /* synthetic */ String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f7966d;
    public final /* synthetic */ long e;

    public /* synthetic */ n(AnalyticsListener.EventTime eventTime, String str, long j, long j6, int i) {
        this.f7964a = i;
        this.f7965b = eventTime;
        this.c = str;
        this.f7966d = j;
        this.e = j6;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f7964a) {
            case 0:
                String str = this.c;
                long j = this.f7966d;
                DefaultAnalyticsCollector.lambda$onAudioDecoderInitialized$4(this.f7965b, str, j, this.e, (AnalyticsListener) obj);
                break;
            default:
                String str2 = this.c;
                long j6 = this.f7966d;
                DefaultAnalyticsCollector.lambda$onVideoDecoderInitialized$16(this.f7965b, str2, j6, this.e, (AnalyticsListener) obj);
                break;
        }
    }
}
