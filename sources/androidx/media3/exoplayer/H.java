package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaSourceList.ForwardingEventListener f7929b;
    public final /* synthetic */ Pair c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LoadEventInfo f7930d;
    public final /* synthetic */ MediaLoadData e;

    public /* synthetic */ H(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.f7928a = i;
        this.f7929b = forwardingEventListener;
        this.c = pair;
        this.f7930d = loadEventInfo;
        this.e = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7928a) {
            case 0:
                this.f7929b.lambda$onLoadCanceled$2(this.c, this.f7930d, this.e);
                break;
            case 1:
                this.f7929b.lambda$onLoadStarted$0(this.c, this.f7930d, this.e);
                break;
            default:
                this.f7929b.lambda$onLoadCompleted$1(this.c, this.f7930d, this.e);
                break;
        }
    }
}
