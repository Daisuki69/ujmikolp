package androidx.media3.exoplayer.rtsp;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8068b;

    public /* synthetic */ e(Object obj, int i) {
        this.f8067a = i;
        this.f8068b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8067a) {
            case 0:
                RtspMediaPeriod.access$500((RtspMediaPeriod) this.f8068b);
                break;
            case 1:
                RtspMediaPeriod.access$500((RtspMediaPeriod) this.f8068b);
                break;
            default:
                ((HandlerThread) this.f8068b).quit();
                break;
        }
    }
}
