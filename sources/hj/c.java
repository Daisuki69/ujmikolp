package hj;

import bj.AbstractC1039j;
import bj.InterfaceC1031b;
import ij.AbstractC1609c;
import io.ktor.utils.io.x;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f17055b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(x xVar, CoroutineContext coroutineContext, Function1 function1) {
        super(xVar, coroutineContext);
        this.f17055b = (i) function1;
        j.e(xVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        int i = this.f17054a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f17054a = 2;
            AbstractC1039j.b(obj);
            return obj;
        }
        this.f17054a = 1;
        AbstractC1039j.b(obj);
        InterfaceC1031b interfaceC1031b = this.f17055b;
        D.d(1, interfaceC1031b);
        return ((Function1) interfaceC1031b).invoke(this);
    }
}
