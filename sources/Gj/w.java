package Gj;

import Bj.E0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f2037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal f2038b;
    public final x c;

    public w(Integer num, ThreadLocal threadLocal) {
        this.f2037a = num;
        this.f2038b = threadLocal;
        this.c = new x(threadLocal);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        if (this.c.equals(fVar)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return this.c;
    }

    @Override // Bj.E0
    public final void k(Object obj) {
        this.f2038b.set(obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return this.c.equals(fVar) ? kotlin.coroutines.g.f18170a : this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.d(this, coroutineContext);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f2037a + ", threadLocal = " + this.f2038b + ')';
    }

    @Override // Bj.E0
    public final Object y(CoroutineContext coroutineContext) {
        ThreadLocal threadLocal = this.f2038b;
        Object obj = threadLocal.get();
        threadLocal.set(this.f2037a);
        return obj;
    }
}
