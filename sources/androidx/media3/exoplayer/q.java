package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8060b;

    public /* synthetic */ q(boolean z4, int i) {
        this.f8059a = i;
        this.f8060b = z4;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f8059a) {
            case 0:
                ((Player.Listener) obj).onSkipSilenceEnabledChanged(this.f8060b);
                break;
            case 1:
                ((Player.Listener) obj).onShuffleModeEnabledChanged(this.f8060b);
                break;
            default:
                ((Player.Listener) obj).onSkipSilenceEnabledChanged(this.f8060b);
                break;
        }
    }
}
