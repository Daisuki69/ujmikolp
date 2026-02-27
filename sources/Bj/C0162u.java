package Bj;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: Bj.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C0162u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f641b = AtomicIntegerFieldUpdater.newUpdater(C0162u.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f642a;

    public C0162u(Throwable th2, boolean z4) {
        this.f642a = th2;
        this._handled$volatile = z4 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f642a + ']';
    }
}
