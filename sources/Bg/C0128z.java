package Bg;

import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: Bg.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0128z extends AbstractC1616j implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f567b;
    public /* synthetic */ Object c;
    public /* synthetic */ Throwable e;
    public final /* synthetic */ List f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0128z(List list, InterfaceC1526a interfaceC1526a, int i) {
        super(3, interfaceC1526a);
        this.f566a = i;
        this.f = list;
    }

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Jg.b bVar = (Jg.b) obj;
        Throwable th2 = (Throwable) obj2;
        InterfaceC1526a interfaceC1526a = (InterfaceC1526a) obj3;
        switch (this.f566a) {
            case 0:
                C0128z c0128z = new C0128z(this.f, interfaceC1526a, 0);
                c0128z.c = bVar;
                c0128z.e = th2;
                return c0128z.invokeSuspend(Unit.f18162a);
            default:
                C0128z c0128z2 = new C0128z(this.f, interfaceC1526a, 1);
                c0128z2.c = bVar;
                c0128z2.e = th2;
                return c0128z2.invokeSuspend(Unit.f18162a);
        }
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        switch (this.f566a) {
            case 0:
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                int i = this.f567b;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th2 = (Throwable) this.c;
                    AbstractC1039j.b(obj);
                    return th2;
                }
                AbstractC1039j.b(obj);
                Jg.b bVar = (Jg.b) this.c;
                Throwable thA = Lg.a.a(this.e);
                this.c = thA;
                this.f567b = 1;
                return D.a(this.f, thA, bVar, this) == enumC1578a ? enumC1578a : thA;
            default:
                EnumC1578a enumC1578a2 = EnumC1578a.f17050a;
                int i4 = this.f567b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th3 = (Throwable) this.c;
                    AbstractC1039j.b(obj);
                    return th3;
                }
                AbstractC1039j.b(obj);
                Jg.b bVar2 = (Jg.b) this.c;
                Throwable thA2 = Lg.a.a(this.e);
                this.c = thA2;
                this.f567b = 1;
                return D.a(this.f, thA2, bVar2, this) == enumC1578a2 ? enumC1578a2 : thA2;
        }
    }
}
