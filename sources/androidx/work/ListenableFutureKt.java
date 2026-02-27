package androidx.work;

import Bb.c;
import Bj.C0154m0;
import Bj.E;
import Bj.F;
import Bj.H;
import Bj.InterfaceC0156n0;
import S1.y;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import gj.InterfaceC1526a;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ListenableFutureKt {
    public static final <V> y executeAsync(Executor executor, String debugTag, Function0<? extends V> block) {
        j.g(executor, "<this>");
        j.g(debugTag, "debugTag");
        j.g(block, "block");
        y future = CallbackToFutureAdapter.getFuture(new c(17, executor, debugTag, block));
        j.f(future, "getFuture { completer ->… }\n        debugTag\n    }");
        return future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object executeAsync$lambda$4(Executor executor, String str, Function0 function0, CallbackToFutureAdapter.Completer completer) {
        j.g(completer, "completer");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        completer.addCancellationListener(new a(atomicBoolean, 0), DirectExecutor.INSTANCE);
        executor.execute(new b(atomicBoolean, completer, function0, 0));
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeAsync$lambda$4$lambda$3(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, Function0 function0) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            completer.set(function0.invoke());
        } catch (Throwable th2) {
            completer.setException(th2);
        }
    }

    public static final <T> y launchFuture(CoroutineContext context, F start, Function2<? super E, ? super InterfaceC1526a<? super T>, ? extends Object> block) {
        j.g(context, "context");
        j.g(start, "start");
        j.g(block, "block");
        y future = CallbackToFutureAdapter.getFuture(new c(18, context, start, block));
        j.f(future, "getFuture { completer ->…owable)\n        }\n    }\n}");
        return future;
    }

    public static /* synthetic */ y launchFuture$default(CoroutineContext coroutineContext, F f, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = g.f18170a;
        }
        if ((i & 2) != 0) {
            f = F.f585a;
        }
        return launchFuture(coroutineContext, f, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object launchFuture$lambda$1(CoroutineContext coroutineContext, F f, Function2 function2, CallbackToFutureAdapter.Completer completer) {
        j.g(completer, "completer");
        completer.addCancellationListener(new androidx.window.layout.adapter.extensions.a((InterfaceC0156n0) coroutineContext.get(C0154m0.f630a), 1), DirectExecutor.INSTANCE);
        return H.w(H.c(coroutineContext), null, f, new ListenableFutureKt$launchFuture$1$2(function2, completer, null), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchFuture$lambda$1$lambda$0(InterfaceC0156n0 interfaceC0156n0) {
        if (interfaceC0156n0 != null) {
            interfaceC0156n0.b(null);
        }
    }
}
