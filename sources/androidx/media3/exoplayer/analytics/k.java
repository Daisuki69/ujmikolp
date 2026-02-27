package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f7957b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ k(AnalyticsListener.EventTime eventTime, Exception exc, int i) {
        this.f7956a = i;
        this.f7957b = eventTime;
        this.c = exc;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f7956a) {
            case 0:
                analyticsListener.onVideoCodecError(this.f7957b, this.c);
                break;
            case 1:
                analyticsListener.onDrmSessionManagerError(this.f7957b, this.c);
                break;
            case 2:
                analyticsListener.onAudioCodecError(this.f7957b, this.c);
                break;
            default:
                analyticsListener.onAudioSinkError(this.f7957b, this.c);
                break;
        }
    }
}
