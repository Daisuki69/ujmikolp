package Bg;

import Bj.C0154m0;
import Bj.C0162u;
import Bj.D0;
import Bj.InterfaceC0156n0;
import Bj.InterfaceC0160s;
import Bj.o0;
import Ej.InterfaceC0231i;
import android.util.Log;
import b3.C0868H;
import b3.C0872L;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Bg.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0104a extends AbstractC1616j implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f510b;
    public /* synthetic */ Object c;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0104a(Object obj, InterfaceC1526a interfaceC1526a, int i) {
        super(3, interfaceC1526a);
        this.f509a = i;
        this.f = obj;
    }

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f509a) {
            case 0:
                C0104a c0104a = new C0104a((Function2) this.f, (InterfaceC1526a) obj3, 0);
                c0104a.c = (Vg.e) obj;
                c0104a.e = (Kg.c) obj2;
                return c0104a.invokeSuspend(Unit.f18162a);
            case 1:
                C0104a c0104a2 = new C0104a((List) this.f, (InterfaceC1526a) obj3, 1);
                c0104a2.c = (Cg.h) obj;
                c0104a2.e = (Jg.c) obj2;
                return c0104a2.invokeSuspend(Unit.f18162a);
            case 2:
                C0104a c0104a3 = new C0104a((Cg.b) this.f, (InterfaceC1526a) obj3, 2);
                c0104a3.c = (Cg.h) obj;
                c0104a3.e = (Jg.c) obj2;
                return c0104a3.invokeSuspend(Unit.f18162a);
            case 3:
                C0104a c0104a4 = new C0104a((Cg.b) this.f, (InterfaceC1526a) obj3, 3);
                c0104a4.c = (Jg.c) obj;
                c0104a4.e = (Function1) obj2;
                return c0104a4.invokeSuspend(Unit.f18162a);
            case 4:
                C0104a c0104a5 = new C0104a((qj.p) this.f, (InterfaceC1526a) obj3, 4);
                c0104a5.c = (Vg.e) obj;
                return c0104a5.invokeSuspend(Unit.f18162a);
            case 5:
                C0104a c0104a6 = new C0104a((Ej.K) this.f, (InterfaceC1526a) obj3, 5);
                c0104a6.c = (InterfaceC0231i) obj;
                c0104a6.e = obj2;
                return c0104a6.invokeSuspend(Unit.f18162a);
            case 6:
                C0104a c0104a7 = new C0104a((Fg.e) this.f, (InterfaceC1526a) obj3, 6);
                c0104a7.c = (Fg.s) obj;
                c0104a7.e = (xg.b) obj2;
                return c0104a7.invokeSuspend(Unit.f18162a);
            case 7:
                C0104a c0104a8 = new C0104a((b3.e0) this.f, (InterfaceC1526a) obj3, 7);
                c0104a8.c = (InterfaceC0231i) obj;
                c0104a8.e = (Throwable) obj2;
                return c0104a8.invokeSuspend(Unit.f18162a);
            default:
                C0104a c0104a9 = new C0104a((wg.c) this.f, (InterfaceC1526a) obj3, 8);
                c0104a9.c = (Vg.e) obj;
                c0104a9.e = obj2;
                return c0104a9.invokeSuspend(Unit.f18162a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v18, types: [xg.b] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Vg.e eVar;
        Jg.c cVar;
        Cg.h hVar;
        Throwable th2;
        InterfaceC0160s interfaceC0160s;
        Vg.e eVar2;
        C0104a c0104a;
        Wg.a aVar;
        InterfaceC0231i interfaceC0231i;
        Throwable th3;
        Fg.d dVar;
        Vg.e eVar3;
        Object obj2;
        int i = 3;
        int i4 = 2;
        Object obj3 = this.f;
        ?? r42 = "call to 'resume' before 'invoke' with coroutine";
        switch (this.f509a) {
            case 0:
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                int i6 = this.f510b;
                if (i6 == 0) {
                    AbstractC1039j.b(obj);
                    Vg.e eVar4 = (Vg.e) this.c;
                    Kg.c cVar2 = (Kg.c) this.e;
                    this.c = eVar4;
                    this.f510b = 1;
                    Object objInvoke = ((Function2) obj3).invoke(cVar2, this);
                    if (objInvoke == enumC1578a) {
                        return enumC1578a;
                    }
                    eVar = eVar4;
                    obj = objInvoke;
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1039j.b(obj);
                        return Unit.f18162a;
                    }
                    eVar = (Vg.e) this.c;
                    AbstractC1039j.b(obj);
                }
                Kg.c cVar3 = (Kg.c) obj;
                if (cVar3 != null) {
                    this.c = null;
                    this.f510b = 2;
                    if (eVar.d(this, cVar3) == enumC1578a) {
                        return enumC1578a;
                    }
                }
                return Unit.f18162a;
            case 1:
                EnumC1578a enumC1578a2 = EnumC1578a.f17050a;
                int i10 = this.f510b;
                if (i10 == 0) {
                    AbstractC1039j.b(obj);
                    Cg.h hVar2 = (Cg.h) ((Bj.E) this.c);
                    Jg.c cVar4 = (Jg.c) this.e;
                    this.c = null;
                    this.f510b = 1;
                    obj = hVar2.f778a.a(cVar4, this);
                    if (obj == enumC1578a2) {
                        return enumC1578a2;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        xg.b bVar = (xg.b) ((Bj.E) this.c);
                        AbstractC1039j.b(obj);
                        return bVar;
                    }
                    AbstractC1039j.b(obj);
                }
                xg.b bVar2 = (xg.b) obj;
                Kg.c cVarD = bVar2.d();
                this.c = bVar2;
                this.f510b = 2;
                return D.b((List) obj3, cVarD, this) == enumC1578a2 ? enumC1578a2 : bVar2;
            case 2:
                EnumC1578a enumC1578a3 = EnumC1578a.f17050a;
                int i11 = this.f510b;
                if (i11 == 0) {
                    AbstractC1039j.b(obj);
                    Cg.h hVar3 = (Cg.h) this.c;
                    cVar = (Jg.c) this.e;
                    this.c = hVar3;
                    this.e = cVar;
                    this.f510b = 1;
                    Object objA = hVar3.f778a.a(cVar, this);
                    if (objA != enumC1578a3) {
                        hVar = hVar3;
                        obj = objA;
                    }
                    return enumC1578a3;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1039j.b(obj);
                    return obj;
                }
                cVar = (Jg.c) this.e;
                hVar = (Cg.h) this.c;
                AbstractC1039j.b(obj);
                xg.b bVar3 = (xg.b) obj;
                if (!P.f490a.contains(bVar3.c().r())) {
                    return bVar3;
                }
                wg.c cVar5 = ((Cg.b) obj3).f764a;
                this.c = null;
                this.e = null;
                this.f510b = 2;
                Object objA2 = P.a(hVar, cVar, bVar3, cVar5, this);
                if (objA2 != enumC1578a3) {
                    return objA2;
                }
                return enumC1578a3;
            case 3:
                EnumC1578a enumC1578a4 = EnumC1578a.f17050a;
                int i12 = this.f510b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC0160s = (InterfaceC0160s) this.c;
                    try {
                        AbstractC1039j.b(obj);
                        ((o0) interfaceC0160s).h0();
                        return Unit.f18162a;
                    } catch (Throwable th4) {
                        th2 = th4;
                        try {
                            o0 o0Var = (o0) interfaceC0160s;
                            o0Var.getClass();
                            o0Var.T(new C0162u(th2, false));
                            throw th2;
                        } catch (Throwable th5) {
                            ((o0) interfaceC0160s).h0();
                            throw th5;
                        }
                    }
                }
                AbstractC1039j.b(obj);
                Jg.c cVar6 = (Jg.c) this.c;
                Function1 function1 = (Function1) this.e;
                D0 d02 = new D0(cVar6.e);
                CoroutineContext.Element element = ((Cg.b) obj3).f764a.f20789d.get(C0154m0.f630a);
                kotlin.jvm.internal.j.d(element);
                ok.b bVar4 = Q.f493a;
                d02.i(new Ag.d(((InterfaceC0156n0) element).i(new Ag.d(d02, i4)), i));
                try {
                    cVar6.e = d02;
                    this.c = d02;
                    this.f510b = 1;
                    if (function1.invoke(this) == enumC1578a4) {
                        return enumC1578a4;
                    }
                    interfaceC0160s = d02;
                    ((o0) interfaceC0160s).h0();
                    return Unit.f18162a;
                } catch (Throwable th6) {
                    th2 = th6;
                    interfaceC0160s = d02;
                    o0 o0Var2 = (o0) interfaceC0160s;
                    o0Var2.getClass();
                    o0Var2.T(new C0162u(th2, false));
                    throw th2;
                }
            case 4:
                EnumC1578a enumC1578a5 = EnumC1578a.f17050a;
                int i13 = this.f510b;
                if (i13 == 0) {
                    AbstractC1039j.b(obj);
                    eVar2 = (Vg.e) this.c;
                    Kg.d dVar2 = (Kg.d) eVar2.b();
                    Wg.a aVar2 = dVar2.f2663a;
                    Object obj4 = dVar2.f2664b;
                    if (!(obj4 instanceof io.ktor.utils.io.n)) {
                        return Unit.f18162a;
                    }
                    Cg.j jVar = new Cg.j();
                    Kg.c cVarD2 = ((xg.b) eVar2.f6113a).d();
                    this.c = eVar2;
                    this.e = aVar2;
                    this.f510b = 1;
                    c0104a = this;
                    obj = ((qj.p) obj3).c(jVar, cVarD2, obj4, aVar2, c0104a);
                    if (obj == enumC1578a5) {
                        return enumC1578a5;
                    }
                    aVar = aVar2;
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1039j.b(obj);
                        return Unit.f18162a;
                    }
                    aVar = (Wg.a) this.e;
                    eVar2 = (Vg.e) this.c;
                    AbstractC1039j.b(obj);
                    c0104a = this;
                }
                if (obj == null) {
                    return Unit.f18162a;
                }
                if (!(obj instanceof Og.c) && !aVar.f6433a.d(obj)) {
                    throw new IllegalStateException("transformResponseBody returned " + obj + " but expected value of type " + aVar);
                }
                Kg.d dVar3 = new Kg.d(aVar, obj);
                c0104a.c = null;
                c0104a.e = null;
                c0104a.f510b = 2;
                if (eVar2.d(this, dVar3) == enumC1578a5) {
                    return enumC1578a5;
                }
                return Unit.f18162a;
            case 5:
                EnumC1578a enumC1578a6 = EnumC1578a.f17050a;
                int i14 = this.f510b;
                if (i14 == 0) {
                    AbstractC1039j.b(obj);
                    InterfaceC0231i interfaceC0231i2 = (InterfaceC0231i) this.c;
                    Object obj5 = this.e;
                    this.c = interfaceC0231i2;
                    this.f510b = 1;
                    Object objInvoke2 = ((Ej.K) obj3).invoke(obj5, this);
                    if (objInvoke2 == enumC1578a6) {
                        return enumC1578a6;
                    }
                    interfaceC0231i = interfaceC0231i2;
                    obj = objInvoke2;
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1039j.b(obj);
                        return Unit.f18162a;
                    }
                    interfaceC0231i = (InterfaceC0231i) this.c;
                    AbstractC1039j.b(obj);
                }
                this.c = null;
                this.f510b = 2;
                if (interfaceC0231i.emit(obj, this) == enumC1578a6) {
                    return enumC1578a6;
                }
                return Unit.f18162a;
            case 6:
                EnumC1578a enumC1578a7 = EnumC1578a.f17050a;
                int i15 = this.f510b;
                Fg.e eVar5 = (Fg.e) obj3;
                try {
                } catch (Throwable th7) {
                    th3 = th7;
                    StringBuilder sb2 = new StringBuilder();
                    Fg.d dVar4 = (Fg.d) r42.t().c(Fg.n.f1622a);
                    Fg.n.b(eVar5, sb2, r42.c(), th3);
                    String string = sb2.toString();
                    kotlin.jvm.internal.j.f(string, "toString(...)");
                    this.c = th3;
                    this.e = dVar4;
                    this.f510b = 2;
                    if (dVar4.e(string, this) == enumC1578a7) {
                        return enumC1578a7;
                    }
                    dVar = dVar4;
                }
                if (i15 == 0) {
                    AbstractC1039j.b(obj);
                    Fg.s sVar = (Fg.s) this.c;
                    xg.b bVar5 = (xg.b) this.e;
                    if (eVar5 == Fg.e.f || bVar5.t().b(Fg.n.f1623b)) {
                        return Unit.f18162a;
                    }
                    this.c = bVar5;
                    this.f510b = 1;
                    obj = sVar.f1630a.c(this);
                    r42 = bVar5;
                    if (obj == enumC1578a7) {
                        return enumC1578a7;
                    }
                } else {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th8 = (Throwable) this.c;
                            AbstractC1039j.b(obj);
                            throw th8;
                        }
                        dVar = (Fg.d) this.e;
                        Throwable th9 = (Throwable) this.c;
                        AbstractC1039j.b(obj);
                        th3 = th9;
                        this.c = th3;
                        this.e = null;
                        this.f510b = 3;
                        if (dVar.b(this) == enumC1578a7) {
                            return enumC1578a7;
                        }
                        throw th3;
                    }
                    xg.b bVar6 = (xg.b) this.c;
                    AbstractC1039j.b(obj);
                    r42 = bVar6;
                }
                return Unit.f18162a;
            case 7:
                EnumC1578a enumC1578a8 = EnumC1578a.f17050a;
                int i16 = this.f510b;
                if (i16 == 0) {
                    AbstractC1039j.b(obj);
                    InterfaceC0231i interfaceC0231i3 = (InterfaceC0231i) this.c;
                    Throwable th10 = (Throwable) this.e;
                    C0872L c0872lA = ((b3.e0) obj3).f8451b.a(null);
                    C0868H c0868h = new C0868H(c0872lA, null, null);
                    Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th10.getMessage() + ". Emit fallback session " + c0872lA.f8393a);
                    this.c = null;
                    this.f510b = 1;
                    if (interfaceC0231i3.emit(c0868h, this) == enumC1578a8) {
                        return enumC1578a8;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1039j.b(obj);
                }
                return Unit.f18162a;
            default:
                EnumC1578a enumC1578a9 = EnumC1578a.f17050a;
                int i17 = this.f510b;
                if (i17 == 0) {
                    AbstractC1039j.b(obj);
                    eVar3 = (Vg.e) this.c;
                    Object obj6 = this.e;
                    if (!(obj6 instanceof xg.b)) {
                        throw new IllegalStateException(("Error: HttpClientCall expected, but found " + obj6 + '(' + kotlin.jvm.internal.z.a(obj6.getClass()) + ").").toString());
                    }
                    Kg.b bVar7 = ((wg.c) obj3).h;
                    Unit unit = Unit.f18162a;
                    Kg.c cVarD3 = ((xg.b) obj6).d();
                    this.c = eVar3;
                    this.e = obj6;
                    this.f510b = 1;
                    Object objA3 = bVar7.a(unit, cVarD3, this);
                    if (objA3 == enumC1578a9) {
                        return enumC1578a9;
                    }
                    obj2 = obj6;
                    obj = objA3;
                } else {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1039j.b(obj);
                        return Unit.f18162a;
                    }
                    obj2 = this.e;
                    eVar3 = (Vg.e) this.c;
                    AbstractC1039j.b(obj);
                }
                Kg.c response = (Kg.c) obj;
                xg.b bVar8 = (xg.b) obj2;
                bVar8.getClass();
                kotlin.jvm.internal.j.g(response, "response");
                bVar8.c = response;
                this.c = null;
                this.e = null;
                this.f510b = 2;
                if (eVar3.d(this, obj2) == enumC1578a9) {
                    return enumC1578a9;
                }
                return Unit.f18162a;
        }
    }
}
