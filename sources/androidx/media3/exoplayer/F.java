package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.MediaSourceList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaSourceList.ForwardingEventListener f7924b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ F(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, int i) {
        this.f7923a = i;
        this.f7924b = forwardingEventListener;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7923a) {
            case 0:
                this.f7924b.lambda$onDrmKeysLoaded$7(this.c);
                break;
            case 1:
                this.f7924b.lambda$onDrmKeysRemoved$10(this.c);
                break;
            case 2:
                this.f7924b.lambda$onDrmKeysRestored$9(this.c);
                break;
            default:
                this.f7924b.lambda$onDrmSessionReleased$11(this.c);
                break;
        }
    }
}
