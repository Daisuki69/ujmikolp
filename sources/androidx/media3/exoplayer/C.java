package androidx.media3.exoplayer;

import O1.O;
import android.util.Pair;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.source.MediaSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7917b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7918d;

    public /* synthetic */ C(int i, Object obj, Object obj2, Object obj3) {
        this.f7916a = i;
        this.f7917b = obj;
        this.c = obj2;
        this.f7918d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7916a) {
            case 0:
                ((MediaPeriodQueue) this.f7917b).lambda$notifyQueueUpdate$0((O) this.c, (MediaSource.MediaPeriodId) this.f7918d);
                break;
            default:
                ((MediaSourceList.ForwardingEventListener) this.f7917b).lambda$onDrmSessionManagerError$8((Pair) this.c, (Exception) this.f7918d);
                break;
        }
    }
}
