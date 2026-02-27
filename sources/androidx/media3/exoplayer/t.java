package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8111b;

    public /* synthetic */ t(int i, int i4) {
        this.f8110a = i4;
        this.f8111b = i;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f8110a) {
            case 0:
                ((Player.Listener) obj).onAudioSessionIdChanged(this.f8111b);
                break;
            default:
                ((Player.Listener) obj).onRepeatModeChanged(this.f8111b);
                break;
        }
    }
}
