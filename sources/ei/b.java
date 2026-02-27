package Ei;

import Ff.f;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.e;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f1373b;

    public /* synthetic */ b(AtomicBoolean atomicBoolean, int i) {
        this.f1372a = i;
        this.f1373b = atomicBoolean;
    }

    @Override // ki.e
    public final void b(f fVar) {
        switch (this.f1372a) {
            case 0:
                this.f1373b.set(false);
                break;
            case 1:
                this.f1373b.set(false);
                break;
            default:
                if (Boolean.TRUE.equals(fVar.f())) {
                    this.f1373b.compareAndSet(true, false);
                }
                break;
        }
    }
}
