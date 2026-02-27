package hj;

import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import ij.AbstractC1614h;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AbstractC1614h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f17057b;
    public final /* synthetic */ InterfaceC1526a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC1526a interfaceC1526a, InterfaceC1526a interfaceC1526a2, Function2 function2) {
        super(interfaceC1526a);
        this.f17057b = function2;
        this.c = interfaceC1526a2;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        int i = this.f17056a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f17056a = 2;
            AbstractC1039j.b(obj);
            return obj;
        }
        this.f17056a = 1;
        AbstractC1039j.b(obj);
        Function2 function2 = this.f17057b;
        j.e(function2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        D.d(2, function2);
        return function2.invoke(this.c, this);
    }
}
