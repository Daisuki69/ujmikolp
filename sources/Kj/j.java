package Kj;

import Gj.r;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends r {
    public final /* synthetic */ AtomicReferenceArray e;

    public j(long j, j jVar, int i) {
        super(j, jVar, i);
        this.e = new AtomicReferenceArray(i.f);
    }

    @Override // Gj.r
    public final int g() {
        return i.f;
    }

    @Override // Gj.r
    public final void h(int i, CoroutineContext coroutineContext) {
        this.e.set(i, i.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
