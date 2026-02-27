package Og;

import a.AbstractC0617a;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import io.ktor.utils.io.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends AbstractC1616j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Zg.f f4795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4796b;
    public final /* synthetic */ w c;
    public final /* synthetic */ h e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(w wVar, h hVar, InterfaceC1526a interfaceC1526a) {
        super(1, interfaceC1526a);
        this.c = wVar;
        this.e = hVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(InterfaceC1526a interfaceC1526a) {
        return new g(this.c, this.e, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((g) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Zg.f fVar;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f4796b;
        if (i == 0) {
            AbstractC1039j.b(obj);
            w wVar = this.c;
            j.g(wVar, "<this>");
            Zg.f fVar2 = new Zg.f(wVar);
            try {
                Qg.c cVar = this.e.f4797a;
                this.f4795a = fVar2;
                this.f4796b = 1;
                if (cVar.invoke(fVar2, this) == enumC1578a) {
                    return enumC1578a;
                }
                fVar = fVar2;
            } catch (Throwable th2) {
                th = th2;
                fVar = fVar2;
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = this.f4795a;
            try {
                AbstractC1039j.b(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    AbstractC0617a.p(fVar, th);
                    throw th4;
                }
            }
        }
        Unit unit = Unit.f18162a;
        AbstractC0617a.p(fVar, null);
        return Unit.f18162a;
    }
}
