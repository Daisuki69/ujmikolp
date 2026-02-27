package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.source.MediaLoadData;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaSourceList.ForwardingEventListener f7921b;
    public final /* synthetic */ Pair c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MediaLoadData f7922d;

    public /* synthetic */ E(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, MediaLoadData mediaLoadData, int i) {
        this.f7920a = i;
        this.f7921b = forwardingEventListener;
        this.c = pair;
        this.f7922d = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7920a) {
            case 0:
                this.f7921b.lambda$onUpstreamDiscarded$4(this.c, this.f7922d);
                break;
            default:
                this.f7921b.lambda$onDownstreamFormatChanged$5(this.c, this.f7922d);
                break;
        }
    }
}
