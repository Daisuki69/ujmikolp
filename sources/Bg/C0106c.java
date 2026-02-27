package Bg;

import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;

/* JADX INFO: renamed from: Bg.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0106c extends AbstractC1616j implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f519b;
    public /* synthetic */ Vg.e c;
    public /* synthetic */ Object e;
    public final /* synthetic */ qj.n f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0106c(qj.n nVar, InterfaceC1526a interfaceC1526a, int i) {
        super(3, interfaceC1526a);
        this.f518a = i;
        this.f = nVar;
    }

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Vg.e eVar = (Vg.e) obj;
        InterfaceC1526a interfaceC1526a = (InterfaceC1526a) obj3;
        switch (this.f518a) {
            case 0:
                C0106c c0106c = new C0106c(this.f, interfaceC1526a, 0);
                c0106c.c = eVar;
                c0106c.e = obj2;
                return c0106c.invokeSuspend(Unit.f18162a);
            default:
                C0106c c0106c2 = new C0106c(this.f, interfaceC1526a, 1);
                c0106c2.c = eVar;
                c0106c2.e = obj2;
                return c0106c2.invokeSuspend(Unit.f18162a);
        }
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Vg.e eVar;
        Vg.e eVar2;
        switch (this.f518a) {
            case 0:
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                int i = this.f519b;
                if (i == 0) {
                    AbstractC1039j.b(obj);
                    eVar = this.c;
                    Object obj2 = this.e;
                    if (!(obj2 instanceof Og.f)) {
                        return Unit.f18162a;
                    }
                    Object obj3 = eVar.f6113a;
                    this.c = eVar;
                    this.f519b = 1;
                    obj = this.f.invoke(obj3, obj2, this);
                    if (obj == enumC1578a) {
                        return enumC1578a;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1039j.b(obj);
                        return Unit.f18162a;
                    }
                    eVar = this.c;
                    AbstractC1039j.b(obj);
                }
                Og.f fVar = (Og.f) obj;
                if (fVar == null) {
                    return Unit.f18162a;
                }
                this.c = null;
                this.f519b = 2;
                if (eVar.d(this, fVar) == enumC1578a) {
                    return enumC1578a;
                }
                return Unit.f18162a;
            default:
                EnumC1578a enumC1578a2 = EnumC1578a.f17050a;
                int i4 = this.f519b;
                if (i4 == 0) {
                    AbstractC1039j.b(obj);
                    eVar2 = this.c;
                    Object obj4 = this.e;
                    Object obj5 = eVar2.f6113a;
                    this.c = eVar2;
                    this.f519b = 1;
                    obj = this.f.invoke(obj5, obj4, this);
                    if (obj == enumC1578a2) {
                        return enumC1578a2;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1039j.b(obj);
                        return Unit.f18162a;
                    }
                    eVar2 = this.c;
                    AbstractC1039j.b(obj);
                }
                Og.f fVar2 = (Og.f) obj;
                if (fVar2 != null) {
                    this.c = null;
                    this.f519b = 2;
                    if (eVar2.d(this, fVar2) == enumC1578a2) {
                        return enumC1578a2;
                    }
                }
                return Unit.f18162a;
        }
    }
}
