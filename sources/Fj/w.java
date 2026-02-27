package Fj;

import Bj.C0165x;
import Bj.H;
import Ej.InterfaceC0231i;
import bj.C1037h;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import ij.InterfaceC1610d;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends AbstractC1609c implements InterfaceC0231i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0231i f1678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f1679b;
    public final int c;
    public CoroutineContext e;
    public InterfaceC1526a f;

    public w(InterfaceC0231i interfaceC0231i, CoroutineContext coroutineContext) {
        super(u.f1675a, kotlin.coroutines.g.f18170a);
        this.f1678a = interfaceC0231i;
        this.f1679b = coroutineContext;
        this.c = ((Number) coroutineContext.fold(0, new C0165x(5))).intValue();
    }

    public final Object d(InterfaceC1526a interfaceC1526a, Object obj) {
        CoroutineContext context = interfaceC1526a.getContext();
        H.m(context);
        CoroutineContext coroutineContext = this.e;
        if (coroutineContext != context) {
            if (coroutineContext instanceof s) {
                throw new IllegalStateException(zj.s.b("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((s) coroutineContext).f1674b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new Ag.j(this, 1))).intValue() != this.c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f1679b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.e = context;
        }
        this.f = interfaceC1526a;
        x xVar = y.f1681a;
        InterfaceC0231i interfaceC0231i = this.f1678a;
        kotlin.jvm.internal.j.e(interfaceC0231i, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        xVar.getClass();
        Object objEmit = interfaceC0231i.emit(obj, this);
        if (!kotlin.jvm.internal.j.b(objEmit, EnumC1578a.f17050a)) {
            this.f = null;
        }
        return objEmit;
    }

    @Override // Ej.InterfaceC0231i
    public final Object emit(Object obj, InterfaceC1526a interfaceC1526a) {
        try {
            Object objD = d(interfaceC1526a, obj);
            return objD == EnumC1578a.f17050a ? objD : Unit.f18162a;
        } catch (Throwable th2) {
            this.e = new s(interfaceC1526a.getContext(), th2);
            throw th2;
        }
    }

    @Override // ij.AbstractC1607a, ij.InterfaceC1610d
    public final InterfaceC1610d getCallerFrame() {
        InterfaceC1526a interfaceC1526a = this.f;
        if (interfaceC1526a instanceof InterfaceC1610d) {
            return (InterfaceC1610d) interfaceC1526a;
        }
        return null;
    }

    @Override // ij.AbstractC1609c, gj.InterfaceC1526a
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.e;
        return coroutineContext == null ? kotlin.coroutines.g.f18170a : coroutineContext;
    }

    @Override // ij.AbstractC1607a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = C1037h.a(obj);
        if (thA != null) {
            this.e = new s(getContext(), thA);
        }
        InterfaceC1526a interfaceC1526a = this.f;
        if (interfaceC1526a != null) {
            interfaceC1526a.resumeWith(obj);
        }
        return EnumC1578a.f17050a;
    }
}
