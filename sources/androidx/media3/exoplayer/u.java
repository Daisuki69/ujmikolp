package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.extractor.Extractor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements ListenerSet.Event, N1.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8116a;

    public /* synthetic */ u(int i) {
        this.f8116a = i;
    }

    @Override // N1.g
    public Object apply(Object obj) {
        switch (this.f8116a) {
            case 1:
                return new DefaultAnalyticsCollector((Clock) obj);
            default:
                return MediaExtractorCompat.lambda$selectExtractor$0((Extractor) obj);
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ExoPlayerImpl.lambda$release$5((Player.Listener) obj);
    }
}
