package androidx.work;

import S1.y;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> y future(Executor executor, Function0<? extends T> function0) {
        y future = CallbackToFutureAdapter.getFuture(new androidx.camera.lifecycle.a(17, executor, function0));
        j.f(future, "getFuture {\n        val …        }\n        }\n    }");
        return future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit future$lambda$2(Executor executor, Function0 function0, CallbackToFutureAdapter.Completer it) {
        j.g(it, "it");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        it.addCancellationListener(new a(atomicBoolean, 1), DirectExecutor.INSTANCE);
        executor.execute(new b(atomicBoolean, it, function0, 1));
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void future$lambda$2$lambda$1(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, Function0 function0) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            completer.set(function0.invoke());
        } catch (Throwable th2) {
            completer.setException(th2);
        }
    }
}
