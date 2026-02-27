package H4;

import Bj.E;
import M8.T2;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Kj.d f2100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f2101b;
    public T2 c;
    public int e;
    public final /* synthetic */ Kj.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f2102g;
    public final /* synthetic */ T2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Kj.d dVar, c cVar, T2 t22, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f = dVar;
        this.f2102g = cVar;
        this.h = t22;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new b(this.f, this.f2102g, this.h, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        c cVar;
        Kj.d dVar;
        T2 t22;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.e;
        if (i == 0) {
            AbstractC1039j.b(obj);
            Kj.d dVar2 = this.f;
            this.f2100a = dVar2;
            cVar = this.f2102g;
            this.f2101b = cVar;
            T2 t23 = this.h;
            this.c = t23;
            this.e = 1;
            if (dVar2.d(this) == enumC1578a) {
                return enumC1578a;
            }
            dVar = dVar2;
            t22 = t23;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t22 = this.c;
            cVar = this.f2101b;
            dVar = this.f2100a;
            AbstractC1039j.b(obj);
        }
        try {
            c.d(cVar, t22);
            c.c(cVar);
            Unit unit = Unit.f18162a;
            dVar.f(null);
            return Unit.f18162a;
        } catch (Throwable th2) {
            dVar.f(null);
            throw th2;
        }
    }
}
