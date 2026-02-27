package androidx.media3.common;

import androidx.media3.common.SimpleBasePlayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements N1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SimpleBasePlayer.State f7877b;
    public final /* synthetic */ int c;

    public /* synthetic */ h(SimpleBasePlayer.State state, int i, int i4) {
        this.f7876a = i4;
        this.f7877b = state;
        this.c = i;
    }

    @Override // N1.o
    public final Object get() {
        switch (this.f7876a) {
            case 0:
                return SimpleBasePlayer.lambda$setDeviceVolume$22(this.f7877b, this.c);
            case 1:
                return SimpleBasePlayer.lambda$setDeviceVolume$23(this.f7877b, this.c);
            default:
                return SimpleBasePlayer.lambda$setRepeatMode$8(this.f7877b, this.c);
        }
    }
}
