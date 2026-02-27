package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f7962b;
    public final /* synthetic */ int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f7963d;

    public /* synthetic */ m(AnalyticsListener.EventTime eventTime, int i, boolean z4) {
        this.f7961a = 1;
        this.f7962b = eventTime;
        this.c = i;
        this.f7963d = z4;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f7961a) {
            case 0:
                analyticsListener.onPlayerStateChanged(this.f7962b, this.f7963d, this.c);
                break;
            case 1:
                analyticsListener.onDeviceVolumeChanged(this.f7962b, this.c, this.f7963d);
                break;
            default:
                analyticsListener.onPlayWhenReadyChanged(this.f7962b, this.f7963d, this.c);
                break;
        }
    }

    public /* synthetic */ m(AnalyticsListener.EventTime eventTime, boolean z4, int i, int i4) {
        this.f7961a = i4;
        this.f7962b = eventTime;
        this.f7963d = z4;
        this.c = i;
    }
}
