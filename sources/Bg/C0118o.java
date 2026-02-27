package Bg;

import Ng.AbstractC0495c;
import Ng.C0496d;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import bj.AbstractC1039j;
import com.google.android.gms.internal.ads.AbstractC1173g;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Bg.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0118o extends AbstractC1616j implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f548b;
    public /* synthetic */ Vg.e c;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0118o(int i, InterfaceC1526a interfaceC1526a, int i4) {
        super(i, interfaceC1526a);
        this.f547a = i4;
    }

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Vg.e eVar = (Vg.e) obj;
        switch (this.f547a) {
            case 0:
                C0118o c0118o = new C0118o(3, (InterfaceC1526a) obj3, 0);
                c0118o.c = eVar;
                c0118o.e = obj2;
                return c0118o.invokeSuspend(Unit.f18162a);
            case 1:
                C0118o c0118o2 = new C0118o(3, (InterfaceC1526a) obj3, 1);
                c0118o2.c = eVar;
                c0118o2.e = (Kg.d) obj2;
                return c0118o2.invokeSuspend(Unit.f18162a);
            case 2:
                C0118o c0118o3 = new C0118o(3, (InterfaceC1526a) obj3, 2);
                c0118o3.c = eVar;
                c0118o3.e = (Kg.c) obj2;
                return c0118o3.invokeSuspend(Unit.f18162a);
            case 3:
                C0118o c0118o4 = new C0118o((qj.o) this.e, (InterfaceC1526a) obj3, 3);
                c0118o4.c = eVar;
                return c0118o4.invokeSuspend(Unit.f18162a);
            case 4:
                C0118o c0118o5 = new C0118o((Function2) this.e, (InterfaceC1526a) obj3, 4);
                c0118o5.c = eVar;
                return c0118o5.invokeSuspend(Unit.f18162a);
            case 5:
                C0118o c0118o6 = new C0118o((qj.p) this.e, (InterfaceC1526a) obj3, 5);
                c0118o6.c = eVar;
                return c0118o6.invokeSuspend(Unit.f18162a);
            default:
                C0118o c0118o7 = new C0118o((wg.c) this.e, (InterfaceC1526a) obj3, 6);
                c0118o7.c = eVar;
                return c0118o7.invokeSuspend(Unit.f18162a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [Vg.e] */
    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Og.f c0117n;
        Vg.e eVar;
        C0118o c0118o;
        int i = 1;
        switch (this.f547a) {
            case 0:
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                int i4 = this.f548b;
                if (i4 == 0) {
                    AbstractC1039j.b(obj);
                    Vg.e eVar2 = this.c;
                    Object body = this.e;
                    Ng.n nVar = ((Jg.c) eVar2.f6113a).c;
                    List list = Ng.q.f4436a;
                    String strN = nVar.n(RtspHeaders.ACCEPT);
                    Object obj2 = eVar2.f6113a;
                    if (strN == null) {
                        ((Jg.c) obj2).c.j(RtspHeaders.ACCEPT, "*/*");
                    }
                    C0496d c0496dH = S1.s.h((Ng.s) obj2);
                    if (body instanceof String) {
                        String str = (String) body;
                        if (c0496dH == null) {
                            c0496dH = AbstractC0495c.f4424a;
                        }
                        c0117n = new Og.i(str, c0496dH);
                    } else if (body instanceof byte[]) {
                        c0117n = new C0116m(c0496dH, body);
                    } else if (body instanceof io.ktor.utils.io.n) {
                        c0117n = new C0117n(eVar2, c0496dH, body);
                    } else if (body instanceof Og.f) {
                        c0117n = (Og.f) body;
                    } else {
                        Jg.c context = (Jg.c) obj2;
                        kotlin.jvm.internal.j.g(context, "context");
                        kotlin.jvm.internal.j.g(body, "body");
                        c0117n = body instanceof InputStream ? new C0117n(context, c0496dH, body) : null;
                    }
                    if ((c0117n != null ? c0117n.b() : null) != null) {
                        Jg.c cVar = (Jg.c) obj2;
                        ((Map) cVar.c.f5552b).remove(RtspHeaders.CONTENT_TYPE);
                        r.f554a.g("Transformed with default transformers request body for " + cVar.f2520a + " from " + kotlin.jvm.internal.z.a(body.getClass()));
                        this.c = null;
                        this.f548b = 1;
                        if (eVar2.d(this, c0117n) == enumC1578a) {
                            return enumC1578a;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1039j.b(obj);
                }
                return Unit.f18162a;
            case 1:
                EnumC1578a enumC1578a2 = EnumC1578a.f17050a;
                int i6 = this.f548b;
                if (i6 == 0) {
                    AbstractC1039j.b(obj);
                    Vg.e eVar3 = this.c;
                    Kg.d dVar = (Kg.d) this.e;
                    Wg.a aVar = dVar.f2663a;
                    Object obj3 = dVar.f2664b;
                    if (!(obj3 instanceof io.ktor.utils.io.n)) {
                        return Unit.f18162a;
                    }
                    if (aVar.f6433a.equals(kotlin.jvm.internal.z.a(InputStream.class))) {
                        io.ktor.utils.io.n nVar2 = (io.ktor.utils.io.n) obj3;
                        kotlin.jvm.internal.j.g(nVar2, "<this>");
                        Kg.d dVar2 = new Kg.d(aVar, new C0121s(new C0121s(nVar2, i), 0));
                        this.c = null;
                        this.f548b = 1;
                        if (eVar3.d(this, dVar2) == enumC1578a2) {
                            return enumC1578a2;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1039j.b(obj);
                }
                return Unit.f18162a;
            case 2:
                EnumC1578a enumC1578a3 = EnumC1578a.f17050a;
                int i10 = this.f548b;
                if (i10 == 0) {
                    AbstractC1039j.b(obj);
                    Vg.e eVar4 = this.c;
                    Kg.c cVar2 = (Kg.c) this.e;
                    if (cVar2.b().t().b(AbstractC0123u.f558a)) {
                        return Unit.f18162a;
                    }
                    Eg.d dVar3 = new Eg.d(cVar2.c());
                    xg.b bVarB = cVar2.b();
                    Ag.k kVar = new Ag.k(dVar3, 5);
                    kotlin.jvm.internal.j.g(bVarB, "<this>");
                    Gg.c cVar3 = new Gg.c(bVarB.f20990a, kVar, bVarB, bVarB.d().a());
                    cVar3.t().f(AbstractC0123u.f559b, Unit.f18162a);
                    Kg.c cVarD = cVar3.d();
                    this.c = null;
                    this.f548b = 1;
                    if (eVar4.d(this, cVarD) == enumC1578a3) {
                        return enumC1578a3;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1039j.b(obj);
                }
                return Unit.f18162a;
            case 3:
                EnumC1578a enumC1578a4 = EnumC1578a.f17050a;
                int i11 = this.f548b;
                if (i11 == 0) {
                    AbstractC1039j.b(obj);
                    Vg.e eVar5 = this.c;
                    Cg.f fVar = new Cg.f();
                    Object obj4 = eVar5.f6113a;
                    Object objB = eVar5.b();
                    this.f548b = 1;
                    if (((qj.o) this.e).invoke(fVar, obj4, objB, this) == enumC1578a4) {
                        return enumC1578a4;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1039j.b(obj);
                }
                return Unit.f18162a;
            case 4:
                EnumC1578a enumC1578a5 = EnumC1578a.f17050a;
                int i12 = this.f548b;
                if (i12 == 0) {
                    AbstractC1039j.b(obj);
                    Object obj5 = this.c.f6113a;
                    this.f548b = 1;
                    if (((Function2) this.e).invoke(obj5, this) == enumC1578a5) {
                        return enumC1578a5;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1039j.b(obj);
                }
                return Unit.f18162a;
            case 5:
                EnumC1578a enumC1578a6 = EnumC1578a.f17050a;
                int i13 = this.f548b;
                if (i13 == 0) {
                    AbstractC1039j.b(obj);
                    eVar = this.c;
                    Cg.i iVar = new Cg.i();
                    Object obj6 = eVar.f6113a;
                    Object objB2 = eVar.b();
                    Jg.c cVar4 = (Jg.c) eVar.f6113a;
                    cVar4.getClass();
                    Wg.a aVar2 = (Wg.a) cVar4.f.e(Jg.h.f2538a);
                    this.c = eVar;
                    this.f548b = 1;
                    c0118o = this;
                    obj = ((qj.p) this.e).c(iVar, obj6, objB2, aVar2, c0118o);
                    if (obj == enumC1578a6) {
                        return enumC1578a6;
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1039j.b(obj);
                        return Unit.f18162a;
                    }
                    eVar = this.c;
                    AbstractC1039j.b(obj);
                    c0118o = this;
                }
                Og.f fVar2 = (Og.f) obj;
                if (fVar2 != null) {
                    c0118o.c = null;
                    c0118o.f548b = 2;
                    if (eVar.d(this, fVar2) == enumC1578a6) {
                        return enumC1578a6;
                    }
                }
                return Unit.f18162a;
            default:
                EnumC1578a enumC1578a7 = EnumC1578a.f17050a;
                ?? r1 = this.f548b;
                try {
                    if (r1 == 0) {
                        AbstractC1039j.b(obj);
                        Vg.e eVar6 = this.c;
                        this.c = eVar6;
                        this.f548b = 1;
                        obj = eVar6.c(this);
                        r1 = eVar6;
                        if (obj == enumC1578a7) {
                            return enumC1578a7;
                        }
                    } else {
                        if (r1 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Vg.e eVar7 = this.c;
                        AbstractC1039j.b(obj);
                        r1 = eVar7;
                    }
                    return Unit.f18162a;
                } catch (Throwable th2) {
                    Gc.h hVar = ((wg.c) this.e).j;
                    z2.d dVar4 = Lg.a.f2984d;
                    ((xg.b) r1.f6113a).d();
                    hVar.getClass();
                    AbstractC1173g.w(((Sg.a) hVar.f1965b).a(dVar4));
                    throw th2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0118o(Object obj, InterfaceC1526a interfaceC1526a, int i) {
        super(3, interfaceC1526a);
        this.f547a = i;
        this.e = obj;
    }
}
