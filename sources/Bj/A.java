package Bj;

import gj.InterfaceC1526a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public abstract class A extends kotlin.coroutines.a implements kotlin.coroutines.d {
    public static final C0167z Key = new C0167z(kotlin.coroutines.d.f18169N, new Ag.a(10));

    public A() {
        super(kotlin.coroutines.d.f18169N);
    }

    public static /* synthetic */ A limitedParallelism$default(A a8, int i, String str, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i4 & 2) != 0) {
            str = null;
        }
        return a8.limitedParallelism(i, str);
    }

    public abstract void dispatch(CoroutineContext coroutineContext, Runnable runnable);

    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        dispatch(coroutineContext, runnable);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(kotlin.coroutines.f key) {
        E e;
        kotlin.jvm.internal.j.g(key, "key");
        if (!(key instanceof kotlin.coroutines.b)) {
            if (kotlin.coroutines.d.f18169N == key) {
                return this;
            }
            return null;
        }
        kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
        kotlin.coroutines.f key2 = getKey();
        kotlin.jvm.internal.j.g(key2, "key");
        if ((key2 == bVar || bVar.f18166b == key2) && (e = (E) bVar.f18165a.invoke(this)) != null) {
            return e;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    public final <T> InterfaceC1526a<T> interceptContinuation(InterfaceC1526a<? super T> interfaceC1526a) {
        return new Gj.e(this, interfaceC1526a);
    }

    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return !(this instanceof J0);
    }

    public A limitedParallelism(int i, String str) {
        Gj.a.a(i);
        return new Gj.f(this, i, str);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(kotlin.coroutines.f key) {
        kotlin.jvm.internal.j.g(key, "key");
        if (key instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            kotlin.coroutines.f key2 = getKey();
            kotlin.jvm.internal.j.g(key2, "key");
            if ((key2 == bVar || bVar.f18166b == key2) && ((CoroutineContext.Element) bVar.f18165a.invoke(this)) != null) {
                return kotlin.coroutines.g.f18170a;
            }
        } else if (kotlin.coroutines.d.f18169N == key) {
            return kotlin.coroutines.g.f18170a;
        }
        return this;
    }

    public final A plus(A a8) {
        return a8;
    }

    @Override // kotlin.coroutines.d
    public final void releaseInterceptedContinuation(InterfaceC1526a<?> interfaceC1526a) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        kotlin.jvm.internal.j.e(interfaceC1526a, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        Gj.e eVar = (Gj.e) interfaceC1526a;
        do {
            atomicReferenceFieldUpdater = Gj.e.h;
        } while (atomicReferenceFieldUpdater.get(eVar) == Gj.a.c);
        Object obj = atomicReferenceFieldUpdater.get(eVar);
        C0151l c0151l = obj instanceof C0151l ? (C0151l) obj : null;
        if (c0151l != null) {
            c0151l.n();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + H.o(this);
    }

    public /* synthetic */ A limitedParallelism(int i) {
        return limitedParallelism(i, null);
    }
}
