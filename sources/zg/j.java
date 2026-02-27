package zg;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import p0.C2004c;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements CoroutineContext.Element {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2004c f21436b = new C2004c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f21437a;

    public j(CoroutineContext callContext) {
        kotlin.jvm.internal.j.g(callContext, "callContext");
        this.f21437a = callContext;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return f21436b;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.c(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.d(this, coroutineContext);
    }
}
