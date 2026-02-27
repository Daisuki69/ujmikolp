package androidx.media3.exoplayer.analytics;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f7980b;
    public final /* synthetic */ MediaMetadata c;

    public /* synthetic */ t(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata, int i) {
        this.f7979a = i;
        this.f7980b = eventTime;
        this.c = mediaMetadata;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f7979a) {
            case 0:
                analyticsListener.onPlaylistMetadataChanged(this.f7980b, this.c);
                break;
            default:
                analyticsListener.onMediaMetadataChanged(this.f7980b, this.c);
                break;
        }
    }
}
