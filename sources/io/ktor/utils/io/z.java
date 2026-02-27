package io.ktor.utils.io;

import Bj.B0;
import Bj.E;
import Bj.H;
import bj.AbstractC1039j;
import bj.C1037h;
import e2.C1421c;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f17560a = new x();

    public static final void a(w wVar, Throwable th2) {
        kotlin.jvm.internal.j.g(wVar, "<this>");
        if (th2 != null) {
            wVar.a(th2);
            return;
        }
        eb.g gVar = new eb.g(1, wVar, w.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 12);
        x completion = f17560a;
        try {
            kotlin.jvm.internal.j.g(completion, "completion");
            kotlin.coroutines.g gVar2 = completion.f17557a;
            InterfaceC1526a interfaceC1526aB = hj.h.b(gVar2 == kotlin.coroutines.g.f18170a ? new hj.b(completion, gVar) : new hj.c(completion, gVar2, gVar));
            C1037h.a aVar = C1037h.f9166b;
            Gj.a.g(interfaceC1526aB, Unit.f18162a);
        } catch (Throwable th3) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1039j.a(th3);
            completion.getClass();
            throw th3;
        }
    }

    public static final Object b(w wVar, byte b8, AbstractC1609c abstractC1609c) throws Throwable {
        Mj.a aVarE = wVar.e();
        Mj.g gVarG = aVarE.g(1);
        int i = gVarG.c;
        gVarG.c = i + 1;
        gVarG.f3432a[i] = b8;
        aVarE.c++;
        Object objH = S1.r.h(wVar, abstractC1609c);
        return objH == EnumC1578a.f17050a ? objH : Unit.f18162a;
    }

    public static final Object c(w wVar, byte[] bArr, int i, int i4, AbstractC1609c abstractC1609c) {
        wVar.e().k(bArr, i, i4);
        Object objH = S1.r.h(wVar, abstractC1609c);
        return objH == EnumC1578a.f17050a ? objH : Unit.f18162a;
    }

    public static final Object d(w wVar, Mj.i iVar, AbstractC1609c abstractC1609c) throws Throwable {
        wVar.e().f(iVar);
        Object objH = S1.r.h(wVar, abstractC1609c);
        return objH == EnumC1578a.f17050a ? objH : Unit.f18162a;
    }

    public static C1421c e(E e, CoroutineContext coroutineContext, Function2 function2, int i) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f18170a;
        }
        kotlin.jvm.internal.j.g(e, "<this>");
        kotlin.jvm.internal.j.g(coroutineContext, "coroutineContext");
        k kVar = new k(false);
        kotlin.jvm.internal.j.g(e, "<this>");
        kotlin.jvm.internal.j.g(coroutineContext, "coroutineContext");
        B0 b0W = H.w(e, coroutineContext, null, new y(function2, kVar, null), 2);
        b0W.i(new com.squareup.wire.internal.a(kVar, 11));
        return new C1421c(12, kVar, b0W);
    }
}
