package androidx.media3.exoplayer;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements N1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8148b;

    public /* synthetic */ z(Object obj, int i) {
        this.f8147a = i;
        this.f8148b = obj;
    }

    @Override // N1.o
    public final Object get() {
        switch (this.f8147a) {
            case 0:
                return ((ExoPlayerImplInternal) this.f8148b).lambda$release$0();
            default:
                return Boolean.valueOf(((AtomicBoolean) this.f8148b).get());
        }
    }
}
