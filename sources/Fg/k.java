package Fg;

import Bj.H;
import bg.AbstractC0983W;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import k2.v0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends AbstractC1616j implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1614a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1615b;
    public Object c;
    public Object e;
    public /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1616g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Serializable i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(Cg.b bVar, Function2 function2, InterfaceC1526a interfaceC1526a) {
        super(3, interfaceC1526a);
        this.h = bVar;
        this.i = (AbstractC1616j) function2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [ij.j, kotlin.jvm.functions.Function2] */
    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f1614a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f;
                g gVar = (g) this.h;
                ArrayList arrayList2 = (ArrayList) this.f1616g;
                k kVar = new k(arrayList, gVar, (e) this.i, arrayList2, (InterfaceC1526a) obj3);
                kVar.c = (v) obj;
                kVar.e = (Jg.c) obj2;
                return kVar.invokeSuspend(Unit.f18162a);
            default:
                ?? r1 = (AbstractC1616j) this.i;
                k kVar2 = new k((Cg.b) this.h, r1, (InterfaceC1526a) obj3);
                kVar2.f = (Gg.a) obj;
                kVar2.f1616g = (Kg.c) obj2;
                return kVar2.invokeSuspend(Unit.f18162a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ij.j, kotlin.jvm.functions.Function2] */
    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Jg.c cVar;
        v vVar;
        Object obj2;
        Gg.a aVar;
        wg.c cVar2;
        Kg.c cVar3;
        Kg.c cVar4;
        Serializable serializable = this.i;
        Object obj3 = this.h;
        int i = 1;
        switch (this.f1614a) {
            case 0:
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                int i4 = this.f1615b;
                g gVar = (g) obj3;
                e eVar = (e) serializable;
                try {
                    if (i4 == 0) {
                        AbstractC1039j.b(obj);
                        v vVar2 = (v) this.c;
                        cVar = (Jg.c) this.e;
                        Rg.a aVar2 = n.f1622a;
                        ArrayList arrayList = (ArrayList) this.f;
                        if (!arrayList.isEmpty()) {
                            if (!arrayList.isEmpty()) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (!((Boolean) ((Function1) it.next()).invoke(cVar)).booleanValue()) {
                                    }
                                }
                            }
                            Rg.j jVar = cVar.f;
                            Rg.a aVar3 = n.f1623b;
                            Unit unit = Unit.f18162a;
                            jVar.f(aVar3, unit);
                            return unit;
                        }
                        try {
                            ArrayList arrayList2 = (ArrayList) this.f1616g;
                            this.c = vVar2;
                            this.e = cVar;
                            this.f1615b = 1;
                            Object objA = n.a(gVar, eVar, arrayList2, cVar, this);
                            if (objA == enumC1578a) {
                                return enumC1578a;
                            }
                            vVar = vVar2;
                            obj = objA;
                        } catch (Throwable unused) {
                            vVar = vVar2;
                            obj2 = null;
                        }
                    } else {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC1039j.b(obj);
                            return Unit.f18162a;
                        }
                        cVar = (Jg.c) this.e;
                        vVar = (v) this.c;
                        try {
                            AbstractC1039j.b(obj);
                        } catch (Throwable unused2) {
                            obj2 = null;
                        }
                    }
                    obj2 = (Og.f) obj;
                    if (obj2 == null) {
                        obj2 = cVar.f2522d;
                    }
                    this.c = cVar;
                    this.e = null;
                    this.f1615b = 2;
                    if (vVar.f1635a.d(this, obj2) == enumC1578a) {
                        return enumC1578a;
                    }
                    return Unit.f18162a;
                } catch (Throwable th2) {
                    Rg.a aVar4 = n.f1622a;
                    if (eVar.f1604a) {
                        gVar.log("REQUEST " + AbstractC0983W.a("call to 'resume' before 'invoke' with coroutine".f2520a) + " failed with exception: " + th2);
                    }
                    throw th2;
                }
            default:
                EnumC1578a enumC1578a2 = EnumC1578a.f17050a;
                int i6 = this.f1615b;
                if (i6 == 0) {
                    AbstractC1039j.b(obj);
                    aVar = (Gg.a) this.f;
                    Kg.c cVar5 = (Kg.c) this.f1616g;
                    io.ktor.utils.io.n nVarC = cVar5.c();
                    kotlin.jvm.internal.j.g(nVarC, "<this>");
                    io.ktor.utils.io.k kVar = new io.ktor.utils.io.k(true);
                    io.ktor.utils.io.k kVar2 = new io.ktor.utils.io.k(true);
                    H.w(cVar5, null, null, new Rg.f(nVarC, kVar, kVar2, null), 3).i(new Rg.b(kVar, kVar2, i));
                    Kg.c cVarD = v0.J(cVar5.b(), kVar2).d();
                    Kg.c cVarD2 = v0.J(cVar5.b(), kVar).d();
                    cVar2 = ((Cg.b) obj3).f764a;
                    this.f = aVar;
                    this.f1616g = cVarD;
                    this.c = cVarD2;
                    this.e = cVar2;
                    this.f1615b = 1;
                    Object obj4 = (Jj.a) getContext().get(Jj.a.f2543b);
                    if (obj4 == null) {
                        obj4 = kotlin.coroutines.g.f18170a;
                    }
                    if (obj4 == enumC1578a2) {
                        return enumC1578a2;
                    }
                    cVar3 = cVarD2;
                    obj = obj4;
                    cVar4 = cVarD;
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1039j.b(obj);
                        return Unit.f18162a;
                    }
                    cVar2 = (wg.c) this.e;
                    cVar3 = (Kg.c) this.c;
                    cVar4 = (Kg.c) this.f1616g;
                    aVar = (Gg.a) this.f;
                    AbstractC1039j.b(obj);
                }
                H.w(cVar2, (CoroutineContext) obj, null, new Gg.i(cVar3, (AbstractC1616j) serializable, null), 2);
                this.f = null;
                this.f1616g = null;
                this.c = null;
                this.e = null;
                this.f1615b = 2;
                if (aVar.f1970a.d(this, cVar4) == enumC1578a2) {
                    return enumC1578a2;
                }
                return Unit.f18162a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ArrayList arrayList, g gVar, e eVar, ArrayList arrayList2, InterfaceC1526a interfaceC1526a) {
        super(3, interfaceC1526a);
        this.f = arrayList;
        this.h = gVar;
        this.i = eVar;
        this.f1616g = arrayList2;
    }
}
