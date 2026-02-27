package androidx.work;

import E8.RunnableC0218a;
import S1.y;
import X2.h;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.work.Operation;
import gj.InterfaceC1526a;
import ij.AbstractC1609c;
import ij.InterfaceC1611e;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class OperationKt {

    /* JADX INFO: renamed from: androidx.work.OperationKt$await$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.work.OperationKt", f = "Operation.kt", l = {36}, m = "await")
    public static final class AnonymousClass1 extends AbstractC1609c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OperationKt.await(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object await(androidx.work.Operation r4, gj.InterfaceC1526a<? super androidx.work.Operation.State.SUCCESS> r5) {
        /*
            boolean r0 = r5 instanceof androidx.work.OperationKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.work.OperationKt$await$1 r0 = (androidx.work.OperationKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.work.OperationKt$await$1 r0 = new androidx.work.OperationKt$await$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            bj.AbstractC1039j.b(r5)
            goto L44
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            bj.AbstractC1039j.b(r5)
            S1.y r4 = r4.getResult()
            java.lang.String r5 = "result"
            kotlin.jvm.internal.j.f(r4, r5)
            r0.label = r3
            java.lang.Object r5 = androidx.concurrent.futures.ListenableFutureKt.await(r4, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            java.lang.String r4 = "result.await()"
            kotlin.jvm.internal.j.f(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.OperationKt.await(androidx.work.Operation, gj.a):java.lang.Object");
    }

    private static final Object await$$forInline(Operation operation, InterfaceC1526a<? super Operation.State.SUCCESS> interfaceC1526a) {
        y result = operation.getResult();
        j.f(result, "result");
        Object objAwait = androidx.concurrent.futures.ListenableFutureKt.await(result, interfaceC1526a);
        j.f(objAwait, "result.await()");
        return objAwait;
    }

    public static final Operation launchOperation(Tracer tracer, String label, Executor executor, Function0<Unit> block) {
        j.g(tracer, "tracer");
        j.g(label, "label");
        j.g(executor, "executor");
        j.g(block, "block");
        MutableLiveData mutableLiveData = new MutableLiveData(Operation.IN_PROGRESS);
        y future = CallbackToFutureAdapter.getFuture(new h(executor, tracer, label, block, mutableLiveData));
        j.f(future, "getFuture { completer ->…}\n            }\n        }");
        return new OperationImpl(mutableLiveData, future);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchOperation$lambda$2(Executor executor, Tracer tracer, String str, Function0 function0, MutableLiveData mutableLiveData, CallbackToFutureAdapter.Completer completer) {
        j.g(completer, "completer");
        executor.execute(new RunnableC0218a(tracer, str, function0, mutableLiveData, completer, 3));
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchOperation$lambda$2$lambda$1(Tracer tracer, String str, Function0 function0, MutableLiveData mutableLiveData, CallbackToFutureAdapter.Completer completer) {
        boolean zIsEnabled = tracer.isEnabled();
        if (zIsEnabled) {
            try {
                tracer.beginSection(str);
            } finally {
                if (zIsEnabled) {
                    tracer.endSection();
                }
            }
        }
        try {
            function0.invoke();
            Operation.State.SUCCESS success = Operation.SUCCESS;
            mutableLiveData.postValue(success);
            completer.set(success);
        } catch (Throwable th2) {
            mutableLiveData.postValue(new Operation.State.FAILURE(th2));
            completer.setException(th2);
        }
        Unit unit = Unit.f18162a;
    }
}
