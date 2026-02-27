package androidx.work;

import Bj.A;
import Bj.E;
import Bj.H;
import Bj.U;
import S1.y;
import android.content.Context;
import androidx.work.ListenableWorker;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final A coroutineContext;
    private final WorkerParameters params;

    public static final class DeprecatedDispatcher extends A {
        public static final DeprecatedDispatcher INSTANCE = new DeprecatedDispatcher();
        private static final A dispatcher = U.f603a;

        private DeprecatedDispatcher() {
        }

        @Override // Bj.A
        public void dispatch(CoroutineContext context, Runnable block) {
            j.g(context, "context");
            j.g(block, "block");
            dispatcher.dispatch(context, block);
        }

        public final A getDispatcher() {
            return dispatcher;
        }

        @Override // Bj.A
        public boolean isDispatchNeeded(CoroutineContext context) {
            j.g(context, "context");
            return dispatcher.isDispatchNeeded(context);
        }
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$getForegroundInfoAsync$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {121}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super ForegroundInfo>, Object> {
        int label;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return CoroutineWorker.this.new AnonymousClass1(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super ForegroundInfo> interfaceC1526a) {
            return ((AnonymousClass1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
                return obj;
            }
            AbstractC1039j.b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.label = 1;
            Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
            return foregroundInfo == enumC1578a ? enumC1578a : foregroundInfo;
        }
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$startWork$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {67}, m = "invokeSuspend")
    public static final class C08281 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super ListenableWorker.Result>, Object> {
        int label;

        public C08281(InterfaceC1526a<? super C08281> interfaceC1526a) {
            super(2, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return CoroutineWorker.this.new C08281(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super ListenableWorker.Result> interfaceC1526a) {
            return ((C08281) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
                return obj;
            }
            AbstractC1039j.b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.label = 1;
            Object objDoWork = coroutineWorker.doWork(this);
            return objDoWork == enumC1578a ? enumC1578a : objDoWork;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        j.g(appContext, "appContext");
        j.g(params, "params");
        this.params = params;
        this.coroutineContext = DeprecatedDispatcher.INSTANCE;
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, InterfaceC1526a<? super ForegroundInfo> interfaceC1526a) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(InterfaceC1526a<? super ListenableWorker.Result> interfaceC1526a);

    public A getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(InterfaceC1526a<? super ForegroundInfo> interfaceC1526a) {
        return getForegroundInfo$suspendImpl(this, interfaceC1526a);
    }

    @Override // androidx.work.ListenableWorker
    public final y getForegroundInfoAsync() {
        return ListenableFutureKt.launchFuture$default(getCoroutineContext().plus(H.d(1)), null, new AnonymousClass1(null), 2, null);
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
    }

    public final Object setForeground(ForegroundInfo foregroundInfo, InterfaceC1526a<? super Unit> interfaceC1526a) {
        y foregroundAsync = setForegroundAsync(foregroundInfo);
        j.f(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        Object objAwait = androidx.concurrent.futures.ListenableFutureKt.await(foregroundAsync, interfaceC1526a);
        return objAwait == EnumC1578a.f17050a ? objAwait : Unit.f18162a;
    }

    public final Object setProgress(Data data, InterfaceC1526a<? super Unit> interfaceC1526a) {
        y progressAsync = setProgressAsync(data);
        j.f(progressAsync, "setProgressAsync(data)");
        Object objAwait = androidx.concurrent.futures.ListenableFutureKt.await(progressAsync, interfaceC1526a);
        return objAwait == EnumC1578a.f17050a ? objAwait : Unit.f18162a;
    }

    @Override // androidx.work.ListenableWorker
    public final y startWork() {
        CoroutineContext coroutineContext = !j.b(getCoroutineContext(), DeprecatedDispatcher.INSTANCE) ? getCoroutineContext() : this.params.getWorkerContext();
        j.f(coroutineContext, "if (coroutineContext != …rkerContext\n            }");
        return ListenableFutureKt.launchFuture$default(coroutineContext.plus(H.d(1)), null, new C08281(null), 2, null);
    }
}
