package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.MediaSourceEventListener;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f8091b;
    public final /* synthetic */ MediaSourceEventListener c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LoadEventInfo f8092d;
    public final /* synthetic */ MediaLoadData e;

    public /* synthetic */ j(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.f8090a = i;
        this.f8091b = eventDispatcher;
        this.c = mediaSourceEventListener;
        this.f8092d = loadEventInfo;
        this.e = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8090a) {
            case 0:
                this.f8091b.lambda$loadStarted$0(this.c, this.f8092d, this.e);
                break;
            case 1:
                this.f8091b.lambda$loadCompleted$1(this.c, this.f8092d, this.e);
                break;
            default:
                this.f8091b.lambda$loadCanceled$2(this.c, this.f8092d, this.e);
                break;
        }
    }
}
