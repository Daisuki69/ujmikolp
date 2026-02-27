package androidx.concurrent.futures;

import Bj.C0151l;
import S1.y;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import hj.h;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class ListenableFutureKt {
    public static final <T> Object await(y yVar, InterfaceC1526a<? super T> interfaceC1526a) {
        try {
            if (yVar.isDone()) {
                return AbstractResolvableFuture.getUninterruptibly(yVar);
            }
            C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
            yVar.addListener(new ToContinuation(yVar, c0151l), DirectExecutor.INSTANCE);
            c0151l.t(new ListenableFutureKt$await$$inlined$suspendCancellableCoroutine$lambda$1(yVar));
            Object objQ = c0151l.q();
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            return objQ;
        } catch (ExecutionException e) {
            throw nonNullCause(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable nonNullCause(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        if (cause == null) {
            j.l();
        }
        return cause;
    }
}
