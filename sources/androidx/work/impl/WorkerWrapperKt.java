package androidx.work.impl;

import Bj.C0151l;
import S1.y;
import androidx.annotation.RestrictTo;
import androidx.work.DirectExecutor;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkerWrapperKt {
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WorkerWrapper");
        j.f(strTagWithPrefix, "tagWithPrefix(\"WorkerWrapper\")");
        TAG = strTagWithPrefix;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> Object awaitWithin(y yVar, ListenableWorker listenableWorker, InterfaceC1526a<? super T> interfaceC1526a) throws Throwable {
        try {
            if (yVar.isDone()) {
                return getUninterruptibly(yVar);
            }
            C0151l c0151l = new C0151l(1, hj.h.b(interfaceC1526a));
            c0151l.r();
            yVar.addListener(new ToContinuation(yVar, c0151l), DirectExecutor.INSTANCE);
            c0151l.t(new WorkerWrapperKt$awaitWithin$2$1(listenableWorker, yVar));
            Object objQ = c0151l.q();
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            return objQ;
        } catch (ExecutionException e) {
            throw nonNullCause(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V> V getUninterruptibly(Future<V> future) {
        V v7;
        boolean z4 = false;
        while (true) {
            try {
                v7 = future.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th2) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return v7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable nonNullCause(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        j.d(cause);
        return cause;
    }
}
