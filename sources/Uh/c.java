package Uh;

import Ah.j;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends AtomicBoolean implements io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f5978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f5979b;

    public c(j jVar, d dVar) {
        this.f5978a = jVar;
        this.f5979b = dVar;
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.f5979b.j(this);
        }
    }
}
