package Bg;

import bj.AbstractC1039j;
import cj.C1110A;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import io.ktor.http.UnsafeHeaderException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.C1790e;
import wg.C2438a;
import zg.AbstractC2574i;
import zg.InterfaceC2568c;
import zg.InterfaceC2571f;

/* JADX INFO: loaded from: classes4.dex */
public final class V extends AbstractC1616j implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f502b;
    public final /* synthetic */ wg.c c;
    public /* synthetic */ Object e;
    public /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f503g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(Object obj, wg.c cVar, InterfaceC1526a interfaceC1526a, int i) {
        super(3, interfaceC1526a);
        this.f501a = i;
        this.f503g = obj;
        this.c = cVar;
    }

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f501a) {
            case 0:
                V v7 = new V((W) this.f503g, this.c, (InterfaceC1526a) obj3, 0);
                v7.e = (Vg.e) obj;
                v7.f = obj2;
                return v7.invokeSuspend(Unit.f18162a);
            case 1:
                V v8 = new V((qj.n) this.f503g, this.c, (InterfaceC1526a) obj3, 1);
                v8.e = (e0) obj;
                v8.f = (Jg.c) obj2;
                return v8.invokeSuspend(Unit.f18162a);
            default:
                V v10 = new V(this.c, (InterfaceC2568c) this.f503g, (InterfaceC1526a) obj3);
                v10.e = (Vg.e) obj;
                v10.f = obj2;
                return v10.invokeSuspend(Unit.f18162a);
        }
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Vg.e eVar;
        kotlin.jvm.internal.F fC;
        Object objA;
        kotlin.jvm.internal.F fC2;
        kotlin.jvm.internal.F fC3;
        InterfaceC2568c interfaceC2568c;
        Object objB;
        Vg.e eVar2;
        Jg.d requestData;
        InterfaceC2571f interfaceC2571f;
        kotlin.jvm.internal.F fC4;
        switch (this.f501a) {
            case 0:
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                int i = this.f502b;
                if (i == 0) {
                    AbstractC1039j.b(obj);
                    eVar = (Vg.e) this.e;
                    Object obj2 = this.f;
                    if (!(obj2 instanceof Og.f)) {
                        throw new IllegalStateException(zj.s.c("\n|Fail to prepare request body for sending. \n|The body type is: " + kotlin.jvm.internal.z.a(obj2.getClass()) + ", with Content-Type: " + S1.s.h((Ng.s) eVar.f6113a) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header.").toString());
                    }
                    Jg.c cVar = (Jg.c) eVar.f6113a;
                    if (obj2 == null) {
                        Og.c cVar2 = Og.c.f4794a;
                        cVar.getClass();
                        cVar.f2522d = cVar2;
                        C1790e c1790eA = kotlin.jvm.internal.z.a(Og.f.class);
                        try {
                            fC2 = kotlin.jvm.internal.z.c(Og.f.class);
                        } catch (Throwable unused) {
                            fC2 = null;
                        }
                        cVar.b(new Wg.a(c1790eA, fC2));
                    } else if (obj2 != null) {
                        cVar.getClass();
                        kotlin.jvm.internal.j.g(obj2, "<set-?>");
                        cVar.f2522d = obj2;
                        cVar.b(null);
                    } else {
                        cVar.getClass();
                        kotlin.jvm.internal.j.g(obj2, "<set-?>");
                        cVar.f2522d = obj2;
                        C1790e c1790eA2 = kotlin.jvm.internal.z.a(Og.f.class);
                        try {
                            fC = kotlin.jvm.internal.z.c(Og.f.class);
                        } catch (Throwable unused2) {
                            fC = null;
                        }
                        cVar.b(new Wg.a(c1790eA2, fC));
                    }
                    W w6 = (W) this.f503g;
                    w6.getClass();
                    e0 t5 = new T(this.c);
                    Iterator it = C1110A.O(w6.f505a).iterator();
                    while (it.hasNext()) {
                        t5 = new U((qj.n) it.next(), t5);
                    }
                    Jg.c cVar3 = (Jg.c) eVar.f6113a;
                    this.e = eVar;
                    this.f502b = 1;
                    objA = t5.a(cVar3, this);
                    if (objA == enumC1578a) {
                        return enumC1578a;
                    }
                    break;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1039j.b(obj);
                        return Unit.f18162a;
                    }
                    eVar = (Vg.e) this.e;
                    AbstractC1039j.b(obj);
                    objA = obj;
                }
                this.e = null;
                this.f502b = 2;
                if (eVar.d(this, (xg.b) objA) == enumC1578a) {
                    return enumC1578a;
                }
                return Unit.f18162a;
            case 1:
                EnumC1578a enumC1578a2 = EnumC1578a.f17050a;
                int i4 = this.f502b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1039j.b(obj);
                    return obj;
                }
                AbstractC1039j.b(obj);
                e0 e0Var = (e0) this.e;
                Jg.c cVar4 = (Jg.c) this.f;
                Cg.h hVar = new Cg.h(e0Var, this.c.f20789d);
                this.e = null;
                this.f502b = 1;
                Object objInvoke = ((qj.n) this.f503g).invoke(hVar, cVar4, this);
                return objInvoke == enumC1578a2 ? enumC1578a2 : objInvoke;
            default:
                EnumC1578a enumC1578a3 = EnumC1578a.f17050a;
                int i6 = this.f502b;
                wg.c client = this.c;
                if (i6 == 0) {
                    AbstractC1039j.b(obj);
                    Vg.e eVar3 = (Vg.e) this.e;
                    Object obj3 = this.f;
                    Jg.c cVar5 = new Jg.c();
                    cVar5.c((Jg.c) eVar3.f6113a);
                    if (obj3 != null) {
                        if (obj3 instanceof Og.f) {
                            cVar5.f2522d = obj3;
                            cVar5.b(null);
                        } else {
                            cVar5.f2522d = obj3;
                            C1790e c1790eA3 = kotlin.jvm.internal.z.a(Object.class);
                            try {
                                fC3 = kotlin.jvm.internal.z.c(Object.class);
                            } catch (Throwable unused3) {
                                fC3 = null;
                            }
                            cVar5.b(new Wg.a(c1790eA3, fC3));
                        }
                        break;
                    } else {
                        cVar5.f2522d = Og.c.f4794a;
                        C1790e c1790eA4 = kotlin.jvm.internal.z.a(Object.class);
                        try {
                            fC4 = kotlin.jvm.internal.z.c(Object.class);
                        } catch (Throwable unused4) {
                            fC4 = null;
                        }
                        cVar5.b(new Wg.a(c1790eA4, fC4));
                        break;
                    }
                    client.j.j(Lg.a.f2983b);
                    Ng.E eB = cVar5.f2520a.b();
                    Ng.t tVar = cVar5.f2521b;
                    Ng.o oVar = new Ng.o((Map) cVar5.c.f5552b);
                    Object obj4 = cVar5.f2522d;
                    Og.f fVar = obj4 instanceof Og.f ? (Og.f) obj4 : null;
                    if (fVar == null) {
                        throw new IllegalStateException(("No request transformation found: " + cVar5.f2522d).toString());
                    }
                    Jg.d dVar = new Jg.d(eB, tVar, oVar, fVar, cVar5.e, cVar5.f);
                    dVar.f.f(AbstractC2574i.f21435b, client.f20791k);
                    Set setKeySet = dVar.c.c.keySet();
                    kotlin.jvm.internal.j.g(setKeySet, "<this>");
                    Set setUnmodifiableSet = Collections.unmodifiableSet(setKeySet);
                    kotlin.jvm.internal.j.f(setUnmodifiableSet, "unmodifiableSet(...)");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : setUnmodifiableSet) {
                        if (Ng.q.f4436a.contains((String) obj5)) {
                            arrayList.add(obj5);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        String header = arrayList.toString();
                        kotlin.jvm.internal.j.g(header, "header");
                        throw new UnsafeHeaderException("Header(s) " + header + " are controlled by the engine and cannot be set explicitly");
                    }
                    Iterator it2 = dVar.f2526g.iterator();
                    do {
                        boolean zHasNext = it2.hasNext();
                        interfaceC2568c = (InterfaceC2568c) this.f503g;
                        if (zHasNext) {
                            interfaceC2571f = (InterfaceC2571f) it2.next();
                        } else {
                            this.e = eVar3;
                            this.f = dVar;
                            this.f502b = 1;
                            objB = E1.c.b(interfaceC2568c, dVar, this);
                            if (objB == enumC1578a3) {
                                return enumC1578a3;
                            }
                            eVar2 = eVar3;
                            requestData = dVar;
                        }
                    } while (interfaceC2568c.p().contains(interfaceC2571f));
                    throw new IllegalArgumentException(("Engine doesn't support " + interfaceC2571f).toString());
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1039j.b(obj);
                    return Unit.f18162a;
                }
                requestData = (Jg.d) this.f;
                Vg.e eVar4 = (Vg.e) this.e;
                AbstractC1039j.b(obj);
                eVar2 = eVar4;
                objB = obj;
                Jg.g responseData = (Jg.g) objB;
                kotlin.jvm.internal.j.g(client, "client");
                kotlin.jvm.internal.j.g(requestData, "requestData");
                kotlin.jvm.internal.j.g(responseData, "responseData");
                xg.b bVar = new xg.b(client);
                bVar.f20991b = new Jg.a(bVar, requestData);
                bVar.c = new Kg.a(bVar, responseData);
                Object obj6 = responseData.e;
                if (!(obj6 instanceof io.ktor.utils.io.n)) {
                    bVar.t().f(xg.b.e, obj6);
                }
                Kg.c cVarD = bVar.d();
                client.j.j(Lg.a.c);
                Bj.H.p(cVarD.getCoroutineContext()).i(new C2438a(client, cVarD));
                this.e = null;
                this.f = null;
                this.f502b = 2;
                if (eVar2.d(this, bVar) == enumC1578a3) {
                    return enumC1578a3;
                }
                return Unit.f18162a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(wg.c cVar, InterfaceC2568c interfaceC2568c, InterfaceC1526a interfaceC1526a) {
        super(3, interfaceC1526a);
        this.f501a = 2;
        this.c = cVar;
        this.f503g = interfaceC2568c;
    }
}
