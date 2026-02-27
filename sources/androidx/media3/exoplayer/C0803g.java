package androidx.media3.exoplayer;

import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;

/* JADX INFO: renamed from: androidx.media3.exoplayer.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0803g implements N1.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsCollector f8020b;

    public /* synthetic */ C0803g(AnalyticsCollector analyticsCollector, int i) {
        this.f8019a = i;
        this.f8020b = analyticsCollector;
    }

    @Override // N1.g
    public final Object apply(Object obj) {
        switch (this.f8019a) {
            case 0:
                return ExoPlayer.Builder.lambda$setAnalyticsCollector$21(this.f8020b, (Clock) obj);
            default:
                return ExoPlayer.Builder.lambda$new$13(this.f8020b, (Clock) obj);
        }
    }
}
