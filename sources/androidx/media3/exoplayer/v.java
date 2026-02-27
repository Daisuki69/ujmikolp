package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayerImplInternal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8126b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i, Object obj, Object obj2) {
        this.f8125a = i;
        this.f8126b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8125a) {
            case 0:
                ((ExoPlayerImpl) this.f8126b).lambda$new$1((ExoPlayerImplInternal.PlaybackInfoUpdate) this.c);
                break;
            default:
                ((ExoPlayerImplInternal) this.f8126b).lambda$sendMessageToTargetThread$1((PlayerMessage) this.c);
                break;
        }
    }
}
