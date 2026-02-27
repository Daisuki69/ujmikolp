package androidx.camera.core.processing;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements CallbackToFutureAdapter.Resolver, ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7580b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(Object obj, int i, int i4) {
        this.c = obj;
        this.f7579a = i;
        this.f7580b = i4;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((DefaultSurfaceProcessor) this.c).lambda$snapshot$8(this.f7579a, this.f7580b, completer);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onSurfaceSizeChanged((AnalyticsListener.EventTime) this.c, this.f7579a, this.f7580b);
    }
}
