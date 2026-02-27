package androidx.media3.common;

import androidx.media3.common.SimpleBasePlayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements N1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SimpleBasePlayer.State f7889b;

    public /* synthetic */ m(SimpleBasePlayer.State state, int i) {
        this.f7888a = i;
        this.f7889b = state;
    }

    @Override // N1.o
    public final Object get() {
        switch (this.f7888a) {
            case 0:
                return SimpleBasePlayer.lambda$setVideoSurface$17(this.f7889b);
            case 1:
                return SimpleBasePlayer.lambda$increaseDeviceVolume$25(this.f7889b);
            case 2:
                return SimpleBasePlayer.lambda$decreaseDeviceVolume$26(this.f7889b);
            case 3:
                return SimpleBasePlayer.lambda$release$13(this.f7889b);
            case 4:
                return SimpleBasePlayer.lambda$clearVideoOutput$21(this.f7889b);
            case 5:
                return SimpleBasePlayer.lambda$increaseDeviceVolume$24(this.f7889b);
            case 6:
                return SimpleBasePlayer.lambda$stop$12(this.f7889b);
            case 7:
                return SimpleBasePlayer.lambda$prepare$7(this.f7889b);
            default:
                return SimpleBasePlayer.lambda$decreaseDeviceVolume$27(this.f7889b);
        }
    }
}
