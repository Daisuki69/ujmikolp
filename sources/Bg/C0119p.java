package Bg;

import M8.T2;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Bg.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0119p extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f550b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Kg.c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0119p(Object obj, Kg.c cVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.c = obj;
        this.e = cVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        C0119p c0119p = new C0119p(this.c, this.e, interfaceC1526a);
        c0119p.f550b = obj;
        return c0119p;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0119p) create((io.ktor.utils.io.D) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f549a;
        Kg.c cVar = this.e;
        try {
            if (i == 0) {
                AbstractC1039j.b(obj);
                io.ktor.utils.io.D d10 = (io.ktor.utils.io.D) this.f550b;
                io.ktor.utils.io.n nVar = (io.ktor.utils.io.n) this.c;
                io.ktor.utils.io.w wVar = d10.f17517a;
                this.f549a = 1;
                obj = T2.g(nVar, wVar, Long.MAX_VALUE, this);
                if (obj == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            ((Number) obj).longValue();
            return Unit.f18162a;
        } catch (CancellationException e) {
            Bj.H.i(cVar, e);
            throw e;
        } catch (Throwable th2) {
            Bj.H.i(cVar, Bj.H.a("Receive failed", th2));
            throw th2;
        }
    }
}
