package androidx.lifecycle;

import Bj.D0;
import Bj.H;
import Bj.U;
import Ej.C0225c;
import Ej.InterfaceC0230h;
import Ej.W;
import Gj.m;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleKt {
    public static final LifecycleCoroutineScope getCoroutineScope(Lifecycle lifecycle) {
        j.g(lifecycle, "<this>");
        while (true) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl != null) {
                return lifecycleCoroutineScopeImpl;
            }
            D0 d0E = H.e(1);
            Ij.e eVar = U.f603a;
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = new LifecycleCoroutineScopeImpl(lifecycle, kotlin.coroutines.e.d(d0E, m.f2024a.c));
            AtomicReference<Object> internalScopeRef = lifecycle.getInternalScopeRef();
            while (!internalScopeRef.compareAndSet(null, lifecycleCoroutineScopeImpl2)) {
                if (internalScopeRef.get() != null) {
                    break;
                }
            }
            lifecycleCoroutineScopeImpl2.register();
            return lifecycleCoroutineScopeImpl2;
        }
    }

    public static final InterfaceC0230h getEventFlow(Lifecycle lifecycle) {
        j.g(lifecycle, "<this>");
        C0225c c0225cF = W.f(new LifecycleKt$eventFlow$1(lifecycle, null));
        Ij.e eVar = U.f603a;
        return W.n(c0225cF, m.f2024a.c);
    }
}
