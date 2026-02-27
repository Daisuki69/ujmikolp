package Bg;

import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Bg.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0108e extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f523a;

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        C0108e c0108e = new C0108e(2, interfaceC1526a);
        c0108e.f523a = obj;
        return c0108e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((C0108e) create((Kg.c) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
        return null;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        if (((Kg.c) this.f523a).b().c().t().e(AbstractC0109f.f525b) == null) {
            return null;
        }
        throw new ClassCastException();
    }
}
