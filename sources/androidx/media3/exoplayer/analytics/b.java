package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f7937b;

    public /* synthetic */ b(AnalyticsListener.EventTime eventTime, int i) {
        this.f7936a = i;
        this.f7937b = eventTime;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f7936a) {
            case 0:
                ((AnalyticsListener) obj).onPlayerReleased(this.f7937b);
                break;
            case 1:
                ((AnalyticsListener) obj).onDrmKeysRemoved(this.f7937b);
                break;
            case 2:
                ((AnalyticsListener) obj).onDrmKeysRestored(this.f7937b);
                break;
            case 3:
                ((AnalyticsListener) obj).onSeekStarted(this.f7937b);
                break;
            case 4:
                ((AnalyticsListener) obj).onDrmKeysLoaded(this.f7937b);
                break;
            default:
                ((AnalyticsListener) obj).onDrmSessionReleased(this.f7937b);
                break;
        }
    }
}
