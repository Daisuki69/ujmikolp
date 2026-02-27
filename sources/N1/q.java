package N1;

import androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3507a;

    public /* synthetic */ q(int i) {
        this.f3507a = i;
    }

    @Override // N1.o
    public final Object get() {
        switch (this.f3507a) {
            case 0:
                throw new IllegalStateException();
            default:
                return DefaultPlaybackSessionManager.generateDefaultSessionId();
        }
    }
}
