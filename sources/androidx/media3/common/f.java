package androidx.media3.common;

import androidx.media3.common.SimpleBasePlayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements N1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SimpleBasePlayer.State f7873b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ f(SimpleBasePlayer.State state, boolean z4, int i) {
        this.f7872a = i;
        this.f7873b = state;
        this.c = z4;
    }

    @Override // N1.o
    public final Object get() {
        switch (this.f7872a) {
            case 0:
                return SimpleBasePlayer.lambda$setPlayWhenReady$1(this.f7873b, this.c);
            case 1:
                return SimpleBasePlayer.lambda$setShuffleModeEnabled$9(this.f7873b, this.c);
            case 2:
                return SimpleBasePlayer.lambda$setDeviceMuted$28(this.f7873b, this.c);
            default:
                return SimpleBasePlayer.lambda$setDeviceMuted$29(this.f7873b, this.c);
        }
    }
}
