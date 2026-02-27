package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f7945b;
    public final /* synthetic */ String c;

    public /* synthetic */ f(AnalyticsListener.EventTime eventTime, String str, int i) {
        this.f7944a = i;
        this.f7945b = eventTime;
        this.c = str;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f7944a) {
            case 0:
                analyticsListener.onAudioDecoderReleased(this.f7945b, this.c);
                break;
            default:
                analyticsListener.onVideoDecoderReleased(this.f7945b, this.c);
                break;
        }
    }
}
