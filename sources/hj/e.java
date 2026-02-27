package hj;

import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import ij.AbstractC1609c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f17059b;
    public final /* synthetic */ InterfaceC1526a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC1526a interfaceC1526a, CoroutineContext coroutineContext, Function2 function2, InterfaceC1526a interfaceC1526a2) {
        super(interfaceC1526a, coroutineContext);
        this.f17059b = function2;
        this.c = interfaceC1526a2;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        int i = this.f17058a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f17058a = 2;
            AbstractC1039j.b(obj);
            return obj;
        }
        this.f17058a = 1;
        AbstractC1039j.b(obj);
        Function2 function2 = this.f17059b;
        j.e(function2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        D.d(2, function2);
        return function2.invoke(this.c, this);
    }
}
