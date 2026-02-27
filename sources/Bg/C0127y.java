package Bg;

import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Bg.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0127y extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f565b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0127y(boolean z4, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f565b = z4;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        C0127y c0127y = new C0127y(this.f565b, interfaceC1526a);
        c0127y.f564a = obj;
        return c0127y;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0127y) create((Jg.c) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        Rg.j jVar = ((Jg.c) this.f564a).f;
        Rg.a aVar = D.c;
        final boolean z4 = this.f565b;
        jVar.a(aVar, new Function0() { // from class: Bg.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(z4);
            }
        });
        return Unit.f18162a;
    }
}
