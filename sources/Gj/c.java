package Gj;

import Bj.E;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f2007a;

    public c(CoroutineContext coroutineContext) {
        this.f2007a = coroutineContext;
    }

    @Override // Bj.E
    public final CoroutineContext getCoroutineContext() {
        return this.f2007a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f2007a + ')';
    }
}
