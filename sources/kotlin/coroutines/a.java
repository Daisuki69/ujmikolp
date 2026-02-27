package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements CoroutineContext.Element {
    private final f key;

    public a(f key) {
        j.g(key, "key");
        this.key = key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r9, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) e.a(this, r9, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(f fVar) {
        return (E) e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public f getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(f fVar) {
        return e.c(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.d(this, coroutineContext);
    }
}
