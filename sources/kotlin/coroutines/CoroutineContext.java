package kotlin.coroutines;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public interface CoroutineContext {

    public interface Element extends CoroutineContext {
        f getKey();
    }

    Object fold(Object obj, Function2 function2);

    Element get(f fVar);

    CoroutineContext minusKey(f fVar);

    CoroutineContext plus(CoroutineContext coroutineContext);
}
