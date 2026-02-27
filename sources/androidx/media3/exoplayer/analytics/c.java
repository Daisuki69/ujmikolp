package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f7939b;
    public final /* synthetic */ DecoderCounters c;

    public /* synthetic */ c(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, int i) {
        this.f7938a = i;
        this.f7939b = eventTime;
        this.c = decoderCounters;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f7938a) {
            case 0:
                analyticsListener.onAudioEnabled(this.f7939b, this.c);
                break;
            case 1:
                analyticsListener.onAudioDisabled(this.f7939b, this.c);
                break;
            case 2:
                analyticsListener.onVideoDisabled(this.f7939b, this.c);
                break;
            default:
                analyticsListener.onVideoEnabled(this.f7939b, this.c);
                break;
        }
    }
}
