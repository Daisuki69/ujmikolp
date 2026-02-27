package g4;

import ch.l;
import ch.r;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: g4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1500b extends l {
    public abstract Object d();

    public abstract void e(r rVar);

    @Override // ch.l
    public final void subscribeActual(r observer) {
        j.h(observer, "observer");
        e(observer);
        observer.onNext(d());
    }
}
